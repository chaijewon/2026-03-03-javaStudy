package com.sist.server;
import java.util.*; // 접속자의 정보 => IP/PORT 

import com.sist.commons.Function;

// => Vector : 동기화 
import java.io.*; // 클라이언트와 통신 
/*
 *   데이터 송신 : OutputStream => 1byte
 *   데이터 수신 : BufferedReader => InputStreamReader 
 *                                 1byte=>2byte 
 *                                 한글깨짐 방지 
 *          
 */
import java.net.*;
/*
 *   ServerSocket : 고정 port => 대기소켓 
 *                  => 접속을 받는 경우 
 *   Socket : 클라이언트와 통신 
 *   ------ IP / PORT 
 *         => 클라이언트 소켓은 port (고정이 아니라 유동)
 *         
 *   1. 서버구동 
 *   2. 접속자를 받아서 => Vector에 저장
 *   3. 접속을 받으면 통신을 따로 할 수 연결 => 쓰레드 
 *      서버 
 *        A ----- A
 *        B ----- B
 *        C ----- C  => 멀티 쓰레드 
 *   4. 통신이 종료되면 (나가기 버튼) => 쓰레드 종료 
 */
public class Server implements Runnable{
    /*
     *   네트워크에 필요한 클래스 선언
     */
	private Vector<Client> waitVc=
			      new Vector<Client>();
	// 접속자 정보 저장 
	private ServerSocket ss;
	// 서버 구동 
	private final int PORT=3355;
	
	public Server()
	{
		try
		{
			ss=new ServerSocket(PORT); // IP는 자동 인식
			/*
			 *   1. bind
			 *      => 핸드폰 개통 
			 *      => 전화번호 + 전화선 => 유심
			 *   2. listen
			 *      => 접속자 기다리고 있다 
			 */
			System.out.println("Server Start...");
		}catch(Exception ex) 
		{
			ex.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Server server=new Server(); // 서버구동 
        new Thread(server).start(); // run()
	}
    // 접속자를 받아서 정보 저장 => 쓰레드 한개 배정 
	// new Thread() => 교환소켓 
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
		{
			while(true)
			{
				Socket s=ss.accept(); // 전화가 걸렸다 (접속시에만 호출이 되는 특수메소드)
				             // 발신자 정보 => IP / PORT
				// s=> 클라이언트 
				System.out.println("접속자의 연결 번호:"+s.getPort());
				System.out.println("IP:"+s.getInetAddress().getHostAddress());
				// 통신할 쓰레드 배정 
				Client client=new Client(s);
				// socket 주인과 통신할 수 있게 연결 
				client.start(); // 통신을 시작한다 => run() 
			}
		}catch(Exception ex) {}
	}
	// 통신만 담당 (사용자 요청 === 결과값 응답)
	class Client extends Thread
	{
		String id,name,sex;
		Socket s; // 클라이언트 정보
		// 통신 => 읽기 / 쓰기 
		BufferedReader in; // 요청 받기 
		OutputStream out; // 응답 하기 
		public Client(Socket s)
		{
			this.s=s;
			try
			{
				// 위치 확인 
				out=s.getOutputStream(); // 클라이언트가 읽어가는 곳
				in=new BufferedReader(
						new InputStreamReader(
								s.getInputStream()));
				// 클라이언트가 요청보낸 값을 가지고 온다 
			}catch(Exception ex) {}
		}
		// 통신 
		public void run()
		{
			try
			{
				while(true)
				{
					// 접속자 요청 받기 
					String msg=in.readLine();
					// \n까지 읽는다 
					System.out.println("client 요청:"+msg);
					StringTokenizer st=
							new StringTokenizer(msg,"|");
					int protocol=Integer.parseInt(st.nextToken());
					// 100|id|name|sex\n
					// aaa/bbb/ccc
					// aaa/bbb/ccc
					switch(protocol)
					{
					  case Function.LOGIN -> {
						  // 로그인 처리 
						  id=st.nextToken();
						  name=st.nextToken();
						  sex=st.nextToken();
						  // 사용자 보내준 데이터를 받는다 
						  // 이미 접속자에 메세지를 보낸다
						  messageAll(Function.CHAT+"|[알림 ⏩] "
								+name+"님 입장하셨습니다");
						  messageAll(Function.LOGIN+"|"
								 +id+"|"+name+"|"+sex);
						  
						  // 로그인된 사람 처리
						  messageTo(Function.MYLOG+"|"+name);
						  // => 로그인창 종료 => 대기실창을 보여준다 
						  waitVc.add(this);
						  // 이미 접속된 사람의 정보를 한번에 전송 
						  for(Client c:waitVc)
						  {
							  messageTo(Function.LOGIN+"|"
								 +c.id+"|"+c.name+"|"+c.sex);
						  }
						  
					  }
					}
				}
			}catch(Exception ex) {}
		}
		// 공통 사용 
		// synchronized => 원래 쓰레드는 비동기 => 동기화 
		// => 개인적으로 보내는 메소드 
		public synchronized void messageTo(String msg)
		{
			try
			{
				out.write((msg+"\n").getBytes());
			}catch(Exception ex) {}
		}
		// => 전체적으로 보내는 메소드 
		public synchronized void messageAll(String msg)
		{
			try
			{
				for(Client c:waitVc)
				{
					c.messageTo(msg);
				}
			}catch(Exception ex) {}
		}
		
	}

}
