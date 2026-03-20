package com.sist.music;

import java.util.Scanner;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
/*
 *   자바 코딩 
 *       package 
 *       import 
 *       public class ClassName
 *       {
 *          ----------------
 *          변수 설정 
 *            => 공통 변수 ==> static 
 *            => 따라 사용하는 변수 ==> instance 
 *          ----------------
 *          생성자 / 초기화 블록
 *          변수 = 초기화 = 프로그램의 처음 대입되는 값 
 *          기본값 => 자동 
 *          int a; => a=0
 *          명시적 초기화 : int page=1
 *          ----------------------- 
 *          클래스 => 선언만 가능 , 파일 읽기 / 크롤링 
 *                             ---------------
 *                             초기화 블록 
 *                             인스턴스 초기화
 *                             {
 *                                인스턴스/static => 초기화
 *                             } 
 *                             static 초기화
 *                             static
 *                             {
 *                                static만 초기화 
 *                             }
 *          => 생성자 
 *          ** 초기화 : static => static블록 
 *                    => MyBatis 
 *                    인스턴스 => 생성자 
 *          ** 변수에 대한 초기화는 많이 없다 
 *             -----------------------
 *             | 생성자 : 화면 UI / 쿠키 설정 
 *                      환경 설정 => 오라클 드라이버 설정 
 *                      SpringAI => 모델명 / 키
 *          ----------------
 *          메소드 : 
 *            사용자가 데이터를 사용할 수 있게 기능 부여 
 *            => 모든 메소드는 public 
 *               => 다른 클래스와 연결 
 *                  --------
 *                   요청 => 결과값
 *                          --리턴값 ==> 브라우저로 전송 
 *                   ---매개변수 
 *               => 웹 , 윈도우 => 입력하시오 
 *                    요청값
 *               자바 ====== 브라우저
 *                    결과값 
 *               Client/Server  
 *          ----------------
 *       }
 *   1. 패키지 만드는 방법 : 보관 
 *      => 관련된 클래스 모음 
 *      => 패키지 => 폴더
 *      => com(org).업체명.요약 
 *                       ---- 한글(X)
 *                       ---- 키워드(X)
 *         com.sist.server
 *         com.sist.client
 *      => 라이브러리 
 *         java.util => 사용이 많은 클래스 모음 
 *         java.io   => 입출력 관련 
 *         java.net  => 네트워크 관련 
 *         java.awt  => 윈도우 관련 
 *         ---- jdk1.0
 *              jdk1.2
 *         javax.swing 
 *         javax.xml ...
 *         -----
 *              jdk17
 *         jakarata. ==> apache (오픈 소스 그룹)
 *         ==> 찾기 (유지보수)
 *         
 *   2. 패키지에 있는 클래스 가지고 오기 
 *      => 다른 패키지에 있는 클래스는 인식을 못한다 
 *      => import 패키지.* : 패키지안에 있는 모든 클래스
 *           => 패키지에 있는 클래스를 여러개 사용시  
 *         import 패키지.클래스명 : 지정된 클래스 1개 가지고 온다 
 *         ------------------- 권장 
 *   3. 접근지정어 
 *      ------------------------------
 *       private : 데이터 은닉화 
 *                 => 변수 (노출 안되는 데이터가 있는 경우)
 *                 => 자신의 클래스에서만 사용이 가능 
 *                 => 제한 허용 
 *                    getter / setter :  캡슐화 
 *      ------------------------------
 *       default : 같은 패키지까지 접근 
 *       ------- window : Button , TextFiled...
 *      ------------------------------
 *       protected : 같은 패키지까지 접근, 상속 받는 경우
 *                                    다른 패키지에 접근이 가능
 *                   사용 빈도가 거의 없다
 *      ------------------------------
 *       public : 모든 클래스에 접근이 가능 => 공개 
 *      ------------------------------
 *      
 *      1) 인스턴스 변수 : private (4개 사용이 가능) 
 *           => 데이터 노출 (X) 
 *           => 웹 : 노출 
 *                  POST==> login.jsp
 *                  GET ==> login.jsp?id=hong&pwd=1234
 *           
 *      2) 클래스 : default , public (O)
 *      3) 메소드 : 가급적이면 public / 다른 클래스와 연결 
 *      4) 생성자 : public / 다른 클래스 연결
 *   4. 제어어 
 *      static : 공통의..
 *      final : 마지막인..
 *      abstract : 추상적인 ... => 메소드가 선언 
 *      --------
 *        윈도우: 버튼 / 텍스트 .... => 미완성 
 *        => 추상클래스 / ***인터페이스(스프링) 
 *   
 */
// 사용자 요청 => 기능 => 메소드
public class GenieMusicSystem {
   // 공개 =>  공유 
   public static Music[] music=new Music[50];
   // 초기화 => 객체 생성없이 초기화 
  
   static  // 자동으로 호출 => 상속 예외 
   {
	   
	   try
	   {
		   Document doc=Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
		   Elements title=doc.select("table.list-wrap a.title");
		   Elements singer=doc.select("table.list-wrap a.artist");
		   Elements album=doc.select("table.list-wrap a.albumtitle");
		   //System.out.println(title);
		   Elements etc=doc.select("table.list-wrap span.rank");
		   
		   for(int i=0;i<title.size();i++)
		   {
			   Music m=new Music();
			   m.setNo(i+1);
			   m.setTitle(title.get(i).text());
			   m.setSinger(singer.get(i).text());
			   m.setAlbum(album.get(i).text());
			   System.out.println(i+1);
			   System.out.println(title.get(i).text());
			   System.out.println(singer.get(i).text());
			   System.out.println(album.get(i).text());
			   //System.out.println(etc.get(i).text());
			   String temp=etc.get(i).text();
			   String state="";
			   String id="";
			   if(temp.equals("유지"))
			   {
				   state="유지";
				   id="0";
			   }
			   else
			   {
				   state=temp.replaceAll("[^가-힣]", "");
				   id=temp.replaceAll("[^0-9]", "");
			   }
			   m.setState(state);
			   m.setIdcrement(Integer.parseInt(id));
			   music[i]=m;
			   System.out.println("상태:"+state);
			   System.out.println("등폭:"+id);
			   System.out.println("============================");
		   }
	   }catch(Exception ex){}
   }
   
   // 기능 메소드  
   // 0. 메뉴
   public int menu() 
   {
	   System.out.println("===== 메뉴 =====");
	   System.out.println("1. 뮤직 목록");
	   System.out.println("2. 상세 보기");
	   System.out.println("3. 곡명 찾기");
	   System.out.println("4. 가수 찾기");
	   System.out.println("5. 종료");
	   System.out.println("===============");
	   Scanner scan=new Scanner(System.in);
	   System.out.print("메뉴 선택:");
	   int m=scan.nextInt();
	   return m;
   }
   // 1. 목록 출력 
   public void musicList()
   {
	   for(Music m:music)
	   {
		   System.out.println(m.getNo()+"."+m.getTitle());
	   }
		   
   }
   // 2. 상세보기 
   public void musicDetail(int no)
   {
	   for(Music m:music)
	   {
		   if(m.getNo()==no)
		   {
			   System.out.println("순위:"+m.getNo());
			   System.out.println("곡명:"+m.getTitle());
			   System.out.println("가수명:"+m.getSinger());
			   System.out.println("앨범:"+m.getAlbum());
			   System.out.println("상태:"+m.getState());
			   String s=m.getState();
			   if(s.equals("유지"))
			   {
				   System.out.println("등폭:-");
			   }
			   else if(s.equals("상승"))
			   {
				   System.out.println("등폭:▲");
			   }
			   else if(s.equals("하강"))
			   {
				   System.out.println("등폭:▽");
			   }
			   
			   break;
		   }
	   }
   }
   // 3. 검색 => 가수,곡명 
   public void titleFind(String fd)
   {
	   for(Music m:music)
	   {
		   if(m.getTitle().contains(fd))
		   {
			   System.out.println(m.getNo()+"."
					   +m.getTitle()+" "+m.getSinger());
		   }
	   }
   }
   public void singerFind(String fd)
   {
	   for(Music m:music)
	   {
		   if(m.getSinger().contains(fd))
		   {
			   System.out.println(m.getNo()+"."
					   +m.getTitle()+" "+m.getSinger());
		   }
	   }
   }
   
}
