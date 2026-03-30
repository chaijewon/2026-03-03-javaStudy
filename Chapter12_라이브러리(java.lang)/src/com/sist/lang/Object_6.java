package com.sist.lang;
/*
 *   clone / toString / hashCode / equals 
 *   ------------------------------------
 *   => record 
 *   class record Sawon
 *   {
 *      => 변수 설정 => getter : Spring AI => 전송 
 *   }
 */
// 508page 
// 보안 => 데이터를 모아서 브라우저 전송할 목적 .. => VO(getter/setter)
record Person(String name,int age)
{
	
}
public class Object_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Person p=new Person("홍길동", 20);
        System.out.println("이름:"+p.name()); // getter
        System.out.println("나이:"+p.age());
	}

}
