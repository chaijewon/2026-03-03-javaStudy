package com.sist.inter;
import java.util.Random;
import java.util.Scanner;
interface Game{
	public void start();
}
class MoleGame implements Game{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random rand=new Random(); // 난수 발생 1~3 => 두더지
		// 점수 계산 
		int score=0;
		// 게임 => 5번 : 1~3 => 선택 입력 => 
		System.out.println("👾 두더지 게임 시작!!");
		System.out.println("1~3사이의 두더지가 나오면 위치를 맞추세요");
		for(int i=1;i<=5;i++)
		{
			int mole=rand.nextInt(3)+1; // nextInt(3) => 0~2
			// => 1~3            --- 3-1 => 0~2
			System.out.println("\n[라운드 "+i+"]");
			System.out.println("두더지가 나타났다!(1~3):");
			long startTime=System.currentTimeMillis();
			// 시작 시간 
			int input=scan.nextInt();
			long endTime=System.currentTimeMillis();
			
			// 걸린 시간 
			long time=endTime-startTime;
			
			if(time>2000)
			{
				System.out.println("⏰ 너무 느림! 실패");
				continue; // i++ 
			}
			
			if(input==mole)
			{
				System.out.println("🍾 정답!!");
				score++;
			}
			else
			{
				System.out.println("😖 오답!!");
			}
			
		}
		System.out.println("🎶 당신의 점수는 "+(score*20)+"점입니다");
	}
	
}
class SpeedGame implements Game{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Random rand=new Random();
		System.out.println("⚡순발력 게임 시작!!");
		System.out.println("👍 지금! 이 뜨면 Enter를 누르세요!!");
		System.out.println("🤦‍♂️ 빨리 누르면 실패!!");
		try
		{
			//CheckException => 반드시 예외처리가 존재 
			System.out.println("\n 👻준비...");
			Thread.sleep(rand.nextInt(3000)+2000);// 2~5초 
			
		}catch(Exception ex) {}
		long startTime=System.currentTimeMillis();
		System.out.println("👍 지금!");
		scan.nextLine();
		long endTime=System.currentTimeMillis();
		
		long time=endTime-startTime;
		if(time<100)
		{
			System.out.println("☠️반칙! 너무 빨랐어요!!");
		}
		else if(time<300)
		{
			System.out.println("엄청 빠름:["+time+"ms]");
		}
		else if(time<700)
		{
			System.out.println("보통 속도:["+time+"ms]");
		}
		else
		{
			System.out.println("엄청 느림:["+time+"ms]");
		}
		
	}
	
}
/*
 *    class A
 *    {
 *       int a=10;
 *       void display(){}
 *    }
 *    class B extends A
 *    {
 *       int a=20;
 *       void display(){}
 *    }
 *    
 *    A a=new A(); 
 *    B b=new B();
 *    A c=new B(); => 동적 바인딩 
 *        --------- c.display => B:display
 *    ---c.a
 *    10 => 변수는 A클래스 변수 
 */
public class 인터페이스_응용 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Scanner scan=new Scanner(System.in);
        System.out.print("게임 선택[두더지 게임(1),순발력(2)]:");
        int menu=scan.nextInt();
        Game game=null;
        if(menu==1)
        {
        	game=new MoleGame();
        	// 오버라이딩 => 메소드 호출시에 덮어쓰기 
        }
        else if(menu==2)
        {
        	game=new SpeedGame();
        	// 변수 => 클래스명 
        	// 메소드 => 생성자 타입 
        }
        
        game.start();*/
		MoleGame mole=new MoleGame();
		SpeedGame speed=new SpeedGame();
		// 객체 비교 
		/*if(mole instanceof Game)
		{
			System.out.println("mole<Game");
		}
		else
		{
			System.out.println("mole>Game");
		}
		
		if(speed instanceof Game)
		{
			System.out.println("speed<Game");
		}
		else
		{
			System.out.println("speed>Game");
		}*/
		Object obj=new Object();
		String str=new String();
		StringBuffer sb=new StringBuffer();
		/*
		 *     Object 
		 *       |
		 *   ----------------
		 *   |              |
		 *  String      StringBuffer
		 */
		if(str instanceof Object)
		{
			System.out.println("String<Object");
		}
		
		if(obj instanceof Object)
		{
			System.out.println("Object<String");
		}
		/*
		 *   일반 기본형 =>  == !=
		 *   문자열     => equals
		 *   객체      => instanceof ==> 객체 찾기 
		 *   @Autowired => 자동화 
		 */
		
	}

}
