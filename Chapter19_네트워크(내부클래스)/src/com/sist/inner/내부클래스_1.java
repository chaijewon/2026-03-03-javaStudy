package com.sist.inner;
/*
 *   내부클래스의 종류 / 형식 => 윈도우 , 빅데이터 , Spring AI
 *   --------
 *     멤버클래스 : 공동으로 사용되는 변수 , 메소드가 있는 경우 
 *     장점 : 다른 클래스와 연결해서 사용하기 쉽다 
 *           코드의 복잡성을 줄일 수 있다 
 *           ---------- 게임 
 *     class A
 *     {
 *        A,B,C
 *        class B
 *        {
 *          A,B,C
 *        }
 *     }
 *     ==> 네트워크 (서버) , Thread(자원=>윈도우에 있는 기능을 바로 활용)
 *     class Server
 *     {
 *        => 사용자 정보 : 공유 => static 
 *        class 통신
 *        {
 *           
 *        }
 *     }
 *     class MyWindow
 *     {
 *        => 버튼 ... => private까지 접근이 가능
 *        class Thread
 *        {
 *        }
 *     }
 *     class MyWindow
 *     {
 *         버튼 .,..
 *     }
 *     class Thread
 *     {
 *        myWindow m=new MyWindow()
 *     }
 *     익명의 클래스 : extends를 사용하지 않고 오버라이딩을 하는 경우
 *                  윈도우 => 버튼 extends JFrame
 *                  -----------
 *     class A extends C
 *     {
 *        B b=new B()
 *        {
 *           void disp(){}
 *        }
 *     }
 *     class B
 *     {
 *        void disp(){}
 *     }
 *     지역 클래스 : 메소드안에 클래스 정의 => 사용빈도는 없다 
 *     class A
 *     {
 *        public void disp()
 *        {
 *           class B
 *           {
 *           }
 *        }
 *     }
 *     
 *     ==> 멤버클래스 / 익명의 클래스 => 윈도우 개발 , AI 
 *     ==> AI (데이터 수집 = 데이터분석 = 예측 => 학습)
 *     class A
 *     {
 *        class B
 *        class C
 *        class D
 *     }
 *     
 *     자동차 == 엔진 
 *     서버  == 클라이언트 
 *     윈도우 == 쓰레드 
 *     ------------------ 웹 : 독립적 
 */
class Outer{
	private String name="홍길동";
	class Inner
	{
		int a=10;
		public void print()
		{
			
			System.out.println("Inner:Call..:name="+name);
		}
	}
	public void display()
	{
		Inner in=new Inner();
		in.print();
	}
}
// static 
class Outer2{
	static class Inner
	{
		public void print()
		{
			System.out.println("Inner:print() Call...");
		}
	}
}
// 익명의 클래스 : 한번 사용후 버린다 
class Outer3{
	Inner in=new Inner() {
		public void print() {
			System.out.println("Outer3에서 Inner:print()오버라이딩...");
		}
	};
}
class Inner{
	public void print()
	{
		System.out.println("Inner:print() Call...");
	}
}
// 지역 클래스 
class Outer4{
	public void print()
	{
		class Inner{
			public void print()
			{
				System.out.println("지역클래스:Inner.print() Call...");
			}
		}
		
		Inner i=new Inner();
		i.print();
	}
}
public class 내부클래스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("===== 멤버 클래스 =====");
		Outer p=new Outer();
        //Outer.Inner c=p.new Inner();
        //c.print();
        p.display();
        System.out.println("===== static 클래스 =====");
        Outer2.Inner c1=new Outer2.Inner();
        c1.print();
        System.out.println("===== 지역클래스 =====");
        Outer4 c2=new Outer4();
        c2.print(); // 클래스 캡슐화 
        System.out.println("===== 익명 클래스 =====");
        Inner i1=new Inner();
        i1.print();
        Outer3 i2=new Outer3();
        i2.in.print();
	}

}
