package com.sist.inter;
/*
 *    기본
 *     = 클래스 : 설계 도구 
 *     = 객체 : 실제로 만들어진 것 => 사용 
 *     = 인스턴스: 객체가 만들어질때 생기는 하나의 실체 
 *               ----------------------------
 *                 메모리에 저장된 상태 
 *       클래스 =======  메모리 
 *             인스턴스화 ----- 인스턴스 
 *                             |
 *                           A a
 *     = 예
 *       스마트폰 설계  => 클래스 : 어떻게 만들지  
 *         모델명 
 *         색상 
 *         저장용량
 *         카메라 
 *       ---------- 메모리에 저장 : 만든것 
 *         색상 : 빨간색 
 *         모델명 : S-26
 *         저장용량 : 126GB
 *         카메라 : 12MP
 *       ---------------- 인스턴스 
 *         스마트폰 구매 
 *         ---------- 사용 : 객체 : 실제 사용 
 *         
 *     1. 인터페이스 / 추상클래스
 *                   |=> 일부만 개발자에게 맡긴다 
 *        |=> 개발자에게 맡기는 것 
 *         => 구현도 가능 
 *         
 *        예) 버튼 클릭 / 마우스 클릭 => 프로그램에 맞게 구현 요청 
 *           윈도우 => 인터페이스 => 부품 업체가 여러곳 
 *                   마우스 / 키보드 ....
 *           ---------------- 
 *       => 추상클래스의 일종 
 *          : 미완성된 클래스 => 직접사용은 불가능 
 *                           => 상속 내려서 구현후에 사용 
 *                                       ---
 *                                       implements
 *       => 자바는 모든클래스 단일상속 
 *          -------------------- 기능 추가 (다중 상속)
 *                                       ---------
 *                                       interface 
 *                                       => 클래스 : 상위 클래스
 *       => 추상클래스의 단점을 보완 
 *          --------
 *          | 구현이 된 메소드  ===> 많다 
 *          | 구현이 안된 메소드 ===> 적다 
 *          -------------------------- 구현이 안된 메소드가 더 많다
 *          default => change 
 *       => 윈도우 
 *          => 버튼 / 마우스 / 키보드 
 *          
 *          class A extends 버튼
 *          class B extends A
 *          class C extends 마우스 
 *          class D extends C
 *          ...
 *          class E implements 버튼 , 마우스 , 키보드 
 *       -----------------------------------------
 *       역할 
 *        1. 서로 다른 클래스를 연결해서 사용 : 결합성을 낮게 
 *        2. 관련 클래스를 모아서 한개의 이름으로 제어 
 *           => 웹,스프링 
 *        3. 설계와 관련 => 기능 설계
 *        4. 모든 개발자가 같은 메소드 구현 => 표준화 
 *           => 소스 통일화 
 *        5. 요구사항 분석 => 기능 
 *       ------------------------------------------
 *       => 표준화 
 *          ----- Framework
 *          ----- Ajax Framework
 *          ----- React / Vue / Collection
 *          
 *       구성요소 
 *       ------
 *       [접근지정어][제어어] class ClassName
 *       ----------------
 *                | static / abstract / final
 *       | public / default
 *       {
 *           
 *          생성자
 *          메소드
 *          변수
 *       }
 *       [접근지정어] interface interface명
 *       ---------
 *       | public / default
 *       {
 *          --------------------
 *          변수 => 상수형변수 
 *          (public static final) int a=10; => 값 설정 
 *          -------------------- 자동 추가
 *          --------------------
 *          구현안된 메소드 
 *          (public abstract) void display();
 *          --------------------
 *          구현된 메소드 
 *          (public) default void aaa(){}
 *          --------------------
 *          구현된 메소드 
 *          (public) static void bbb(){}
 *          --------------------
 *          => interface => 구성요소가 only public
 *          => 자체 처리 : private 메소드가 가능 
 *       }
 *       
 *       ==> new를 사용할 수 없다 
 *       ==> 사용이 가능 
 *       ==> 상속을 받아서 구현한 클래스를 이용한다 
 *       
 *       상속 
 *         interface ====== interface 
 *                 확장 : extends 
 *         ***interface ====== class
 *                 구현 : implements 
 *         class ======= interface 
 *                 에러 
 *                 
 *        class A
 *        class B extends A
 *        class C extends B  => C(A,B) 단일 상속
 *        
 *        interface A
 *        interface B extends A
 *        interface C extends B
 *        ---------------------
 *        interface C extends A,B => 다중상속 
 *        
 *        interface A
 *        interface B
 *        class C implements A,B
 *        
 *        class A
 *        interface C
 *        interface D
 *        class B extends A implements C,D
 *                --------- --------------- 
 *                | 클래스 상속 + 인터페이스 상속         
 *        => 인터페이스 : 오버라이딩 프로그램 (재정의)
 *           오버라이딩 (덮어쓴다)
 *             = 메소드명이 동일 
 *             = 상속인 상태 
 *             = 매개변수가 동일 
 *             = 리턴형이 동일 
 *             = 접근지정어 => 확대(O) , 축소(X)
 *                <-----------
 *             public > protected > default > private 
 *                -----------> 
 *             = 인터페이스는 public 
 *         interface A
 *         {
 *            (public) void aaa();
 *         }
 *         class B implements A
 *         {
 *             void aaa(){} => X =-> 접근지정어 축소 
 *             public void aaa(){}
 *             
 *         }
 *         
 *         오버라이딩 => 모든 메소드 public
 *                    --------- 다른 클래스와 연결 => public
 *                    
 *         클래스 ----- 다른 클래스 연결 => public
 *         메소드 ----- 다른 클래스 연결 => public
 *         변수 : private : getter/setter
 *                         ------------- 메소드 : public
 *         생성자 ----- 다른 클래스 연결 => public
 */
// = 특별한 경우가 아니면 => 거의 인터페이스는 라이브러리 
// => 계속 
interface 도형
{
	String COLOR="black";
	// public static final
	// 도형 그린다 
	public void draw(); // 
	// abstract
	//public abstract void draw();
	/*
	 *   abstract public void draw();
	 */
	
}
// 관련된 클래스 모아서 한개의 이름으로 제어 => 인터페이스 
// => 메모리 공간을 1개 사용 
// 웹 => 전송받는 메소드 / 브라우저 보내기 
//       request        response : 어떤 파일 실행 
class 선 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 선을 그린다");
	}
	
}
class 사각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 사각형을 그린다");
	}
	
}
// => 상속 / 구현 ==> 데이터형 2개 (도형,삼각형)
class 삼각형 implements 도형
{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println(COLOR+"를 이용해서 삼각형을 그린다");
	}
	
}
public class 인터페이스_1 {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a,b,c,d,e,f,g,h,i,j,k;
		//int[] arr= {};
        도형 a=new 선();
        a.draw();
        
        a=new 사각형();
        a.draw();
        
        a=new 삼각형();
        a.draw();
        
        // 클래스 모아서 관리 => 상속내리는 클래스 이용 
        //                           ----- 인터페이스 
	}

}
