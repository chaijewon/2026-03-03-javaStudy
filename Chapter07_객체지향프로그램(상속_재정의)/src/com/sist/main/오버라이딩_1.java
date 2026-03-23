package com.sist.main;
// => 객체가 생성이 되면 
//    --- 사용할 메모리 주소 설정 
//    객체는 자신의 메모리 주소만 접근이 가능 
//    공통으로 사용할 수 있는 메모리가 필요 => static
// 다른 클래스 메모리에 접근시 => 메소드를 이용해서 접근 => 상속 
// 객체. => 메모리 주소 접근 연산자 
// 100번지 => . 
// => 액터 (Actor) 
// 자판기 = 사람  
class Parent
{
	int a=10;
	public void display()
	{
		System.out.println("Parent:display() Call..");
	}
}
class Child extends Parent
{
	int a=100;
	public void display()
	{
		System.out.println("Child:display() Call..");
	}
}
public class 오버라이딩_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Parent p=new Parent();
        System.out.println("p.a="+p.a);
        p.display();
        
        Child c=new Child();
        System.out.println("c.a="+c.a);
        c.display();
        
        Parent pp=new Child();
        // 변수:parent        메소드 : child
        System.out.println("pp.a="+pp.a);//Parent
        pp.display();//Child
        
        // 변수 => 클래스에 존재하는 변수 
        // 메소드 => 생성자타입 
        // 상속 => 기본 목적 => 객체 1개 생성 => 여러개의 클래스를 모아서 관리
        // A~Z => Object
	}

}
