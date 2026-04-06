package com.sist.lambda;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
 *    람다 : 익명의 함수 => 코드블록으로 값처럼 전달할 수 있게 만들어 준것 
 *    ----
 *    1) 기본 문법 
 *       () -> {실행문}
 *             --------> 1개면 {}은 생략이 가능 
 *       (a,b) -> {실행문}
 *       ----- 데이터형없이 변수명만 사용이 가능 
 *       ----- 자바스크립트는 대부분이 지금처럼 사용 (=>:화살표 함수)
 *       1. 메소드명이 생략 
 *       2. 매개변수의 데이터형 생략 
 *       3. 리턴형의 생략 
 *       ----------------------> 일반 개발자 (어려워한다) 
 *    2) 람다를 사용하는 목적 
 *       코드가 짧고 사용이 편리 
 *       함수형 프로그래밍 스타일 가능 
 *       => 독립적으로 사용이 가능 => 메소드 (클래스내에서 사용)
 *          ----- 클래스외에서 선언이 가능
 *          
 *       기존의 방식 => 익명의 클래스 (extends,implements가 없이 
 *                   메소드 재정의가 가능)
 *       // 인터페이스 
 *       Runnable r=new Runnable(){
 *          public void run(){
 *             System.out.println("Hello");
 *          }
 *       }
 *       람다 
 *       Runnable r=()->System.out.println("Hello");
 */
@FunctionalInterface // 람다형이다
// 사용자 정의는 거의 빈도수가 없다 
// 라이브러리에서 제공하는 것이 많다 
interface Calc
{
	public int calc(int a,int b);// 추상메소드 
	default void display() {
		System.out.println("aaa");
	}
	static void aaa()
	{
		System.out.println("bbb");
	}
}
public class Lambda_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Runnable r=new Runnable() {
//			
//			@Override
//			public void run() {
//				// TODO Auto-generated method stub
//				System.out.println("쓰레드 구동!!");
//			}
//		};
		
//		Runnable r=()->System.out.println("쓰레드 구동!!");
//		new Thread(r).start();
		
		// 람다는 혼자서 사용할 수 없고 반드시 인터페이스와 함께 사용 
		// 조건 => 인터페이스에 구현이 안된 메소드(추상메소드) 
		// 1개만 존재 
		// 단 default / static=> 구현된 메소드는 존재 가능 
		Calc add=(a,b)-> a+b;
		//       메소드   리턴
		Calc minus=(a,b)->a-b;
		
		System.out.println(add.calc(10, 20));
		System.out.println(minus.calc(20, 10));
	}

}
