package com.sist.lang;
// 복제 => clone() 
/*
 *   얕은 복사 => Call By Reference 
 *              같은 메모리 주소 사용해서 => 별칭 
 *              class A
 *              A a=new A()
 *              A b=a;
 *              => 매개변수 
 *   깊는 복사 => 새로운 메모리 생성 
 */
class Member implements Cloneable
{
	String name="홍길동";
	public void display()
	{
		System.out.println("이름:"+name);
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
}
class CallByReferernce
{
	public void change(Member m)// m=m1
	{
		m.name="박문수";
	}
}
public class Object_2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//        // 객체 생성 
//		Member m1=new Member();
//		m1.display();
//		// 객체 주소를 복사 
//		Member m2=m1; // 별칭 => Call By Reference 
//		// 매개변수에 주소를 넘겨주는 방식 
//		// 주소 같은 경우에는 m1,m2 => 같은 메모리 주소 제어 
//		m2.name="심청이";
//		m1.display();
//		System.out.println("m1="+m1);
//		System.out.println("m2="+m2);
//		
//		CallByReferernce c=new CallByReferernce();
//		c.change(m1);
//		m1.display();
		// 게임 => 아바타 => Adapter 패턴 
		Member m1=new Member();
		m1.name="이순신";
		Member m2=(Member)m1.clone();
		System.out.println("m1="+m1);
		System.out.println("m2="+m2);
		System.out.println("m1.name="+m1.name);
		System.out.println("m2.name="+m2.name);
		// git clone
		// => 기존에 있는 모든 데이터를 복사해서 
		// 새로운 메모리에 저장 
	}

}
