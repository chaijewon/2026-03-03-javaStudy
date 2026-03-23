package com.sist.main;
/*
 *   상속 => 다른 클래스의 변수 / 메소드는 사용이 가능 
 *                          ------
 *                          | 프로그램에 맞지 않는다 
 *                          | 변경해서 사용 : 오버라이딩 
 *   오버라이딩 : 변경해서 덮어쓴다 
 *     1. 상속이 존재 
 *     2. 메소드명 동일 
 *     3. 매개변수 동일 
 *     4. 리턴형 동일 
 *     5. 접근지정어 => 확대 (O) , 축소 (X)
 *           <===== 확대
 *        public > protected > default > private
 *           =====> 축소 
 *     void aaa()
 *       |
 *    private void aaa() 
 *    
 *    void aaa()
 *      |
 *   protected void aaa() 
 *   public void aaa()
 *   void aaa()
 */
//class A
//{
//	void disp() {}
//}
//class B extends A
//{
//	//void disp() {}
//    //protected void disp() {}
//	//public void disp() {}
//	//private void disp() {}; // 오류
//}
/*
 *     --------------------------------
 *                 오버로딩       오버라이딩 
 *     --------------------------------
 *     메소드명       동일          동일 
 *     --------------------------------
 *     상태        같은 클래스내    상속이 된 상태
 *     --------------------------------
 *     매개변수     갯수 , 데이터형이  동일  
 *                다르다 
 *     --------------------------------
 *     리턴형       관계없다         동일 
 *     --------------------------------
 *     접근지정어    관계없다         확대만 가능 / 동일 / 축소(X)
 *     --------------------------------
 *     
 *     오버로딩 => 같은 메소드를 이용해서 새로운 기능 생성 
 *     오버라이딩 => 상속해서 받은 기능 변경하는 역할 
 *     상속 => 오버라이딩 (변경해서 사용이 가능)
 *     
 *     상속을 내리면 복사(메소드,변수) => X
 *     따로 메모리에 저장후에 사용이 가능하게 연결만 시킨다 
 *     --------- super / this 
 *     
 *     class A
 *     {
 *        int a,b;
 *     }
 *     class B extends A
 *     {
 *        int c;
 *     }
 *     
 *     B b=new B()
 *     
 *     ------- super
 *       a,b   <----------
 *         | 200
 *       |100
 *     -------           |
 *                       | 연결이 가능하게 만들어 준다 
 *     ------- this -----
 *        c
 *        super.a=100 , super.b=200
 *        this.a=1000 , this.b=2000
 *        a,b
 *     -------
 *     
 */
class Animal
{
	public void run(int a) {
		System.out.println("두발로 걷는다");
	}
	public void eat() {
		System.out.println("수저로 먹는다");
	}
	
}
class Dog extends Animal
{

	
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("네발로 걷는다");
	}

	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("개같이 먹는다");
	}
	
}
class Pig extends Animal
{

	/*
	 * public void run(int a) { System.out.println("두발로 걷는다"); }
	 */
	// 오버로딩 => 새로운 기능 추가 
	public void run() {
		// TODO Auto-generated method stub
		
	}
	// 지존의 기능 변경 => 오버라이딩 
	public void run(int a) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
	}
	
}
class Super
{
	int a,b;// super
	public void display()
	{
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
class Sub extends Super
{
	int c;
	int a,b;//this => 변수 오버라이딩 => this/super를 따로 제어
	// 초기화 
	public Sub()
	{
		super.a=100;
		super.b=200;
	}
	public void print()
	{
		super.display();
		System.out.println("a="+this.a);
		System.out.println("b="+this.b);
	}
}
public class 상속_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Dog dog=new Dog();
//        dog.run();
//        dog.eat();
//        
//        Pig pig=new Pig();
//        pig.run(10);
//        pig.eat();
		Sub sub=new Sub();
		sub.print();
	}

}
