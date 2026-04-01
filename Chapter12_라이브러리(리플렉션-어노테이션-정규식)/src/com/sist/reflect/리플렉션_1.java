package com.sist.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/*
 *   리플렉션 => 동적제어 
 *      => 현재 실행중 프로그램을 제어 
 *                  -------
 *                   클래스 : 멤버변수 / 생성자 / 메소드
 *      => 클래스명을 이용 
 *         반드시 => 패키지명부터 설정한다 
 *      => 메소드 제어(호출) , 변수값을 변경 
 *                         ----------- private 접근이 가능 
 *                                     OOP가 깨진다 (보안)
 *      => 객체 생성 
 *      => 어노테이션 확인 
 *      --------------------------> Spring (자동화)
 *      => 리플렉션 + 어노테이션 : 프레임워크 개발
 *      => 자바스크립트 
 *      JSP  =  MVC  = **Spring 
 *      Vue     Vuex   Pinia ==> **Nust
 *      React   Redux  **Next 
 *      NodeJS => Nest
 *      -------------------------------
 *      
 *      
 *      1. 클래스 정보 얻기 (멤버변수 , 메소드 , 생성자) 
 *         => 객체 생성 / 멤버변수 주입 / 메소드 호출 => 자동화 처리 
 *      2. 프레임워크 (솔루션) => 개발자 
 *         
 *         프레임워크 사용 (SI/SM) => 프로그래머 
 */
class Sawon
{
	private String name;
	public Sawon() {}
	public Sawon(String name)
	{
		this.name=name;
	}
	public void info()
	{
		System.out.println("Sawon:info() Call.."+name);
	}
}
public class 리플렉션_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // Sawon sa=new Sawon(); // 결합성이 강한 프로그램 
		// 객체 생성 => ClassNotFoundException => CheckedException 
		try
		{
			// => 클래스 정보 읽기 
			Class clsName=Class.forName("com.sist.reflect.Sawon");
			// 클래스 정보에 생성자를 가지고 온다 
			Constructor con=clsName.getConstructor();
			// 디폴트 생성자 
			// 메모리 할당 
			Object obj=con.newInstance();
			// Method 읽기 
			Method m=clsName.getMethod("info");// 메소드 정보
			m.invoke(obj); // 실제 메소드 호출 
			
		}catch(Exception ex){}
	}

}
