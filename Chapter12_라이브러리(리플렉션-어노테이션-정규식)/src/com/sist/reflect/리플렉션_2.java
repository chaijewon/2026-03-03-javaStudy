package com.sist.reflect;

import java.lang.reflect.Field;

/*
 *   자바는 시점 
 *     = 컴파일 시점 (javac) 
 *     = 실행 시점 (java)
 *     = 리플렉션 실행시점에 클래스의 모든 정보를 읽어서 조작이 가능 
 *       ------
 *       Spring / MyBatis / Hibernate 
 *           => 동적 객체 생성 / 어노테이션 처리 
 *           => 메소드를 자동 호출하게 만드는 
 *     = 클래스 정보 
 *       클래스 구조 
 *       class ClassName
 *       {
 *         --------
 *         변수
 *         --------
 *         생성자
 *         --------
 *         메소드
 *         --------
 *       }
 *       
 *     1) 주요클래스 / 메소드
 *       = Class : 클래스 자체 저장
 *       = 변수 => Field
 *       = 메소드 => Method
 *       = 생성자 => Constructor
 *     2) Class 객체 얻기 
 *       = Class cls=String.class
 *       = String str=""
 *         Class cls=str.getClass()
 *       ***= Class cls=Class.forName("java.lang.String")
 *     3) 장점 
 *        = 프레임워크 개발시 사용 
 *          코드 재사용 / 유연성 (수시로 수정 / 추가 / 삭제)
 *                     유지보수
 *     4) 단점 
 *        = 직접 호출보다 속도가 늦다 (성능 저하) 
 *        = 보안 문제 => private에 접근이 가능 
 *        = 코드 가독성이 떨어진다
 *      
 */
class Student
{
	private String name="홍길동";
}
public class 리플렉션_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	Student std=new Student();
        	Class cls=std.getClass();
        	Field f=cls.getDeclaredField("name");
        	f.setAccessible(true);// private변수 접근이 가능 
        	System.out.println(f.get(std));
        	f.set(std, "박문수");// 변수 변경
        	System.out.println(f.get(std));
        }catch(Exception ex){}
	}

}
