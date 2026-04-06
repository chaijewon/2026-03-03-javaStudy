package com.sist.lambda;
/*
 *   1. 람다식이란?
 *      1) 람다식 = 익염명의 함수 
 *      2) 메소드처리 매개변수 전달이 가능 
 *      3) 코드 간결화 
 *      4) 함수형 프로그램 스타일 
 *   2. 기본문법 
 *      (매개변수) -> {실행문}
 *      public 리턴형 매소드명(매개변수)
 *      {
 *          실행문 
 *      }
 *   3. 규칙이 존재한다 
 *      데이터형을 생략한다 
 *      (int a,int b)(X) => (a,b)
 *      리턴형 {return a} => {a} => 자동으로 리턴 인식
 *   4. 인터페이스로 제작 
 *      ------------- 사용자 정의 보다는 스트림을 주로 사용 
 *   5. 사용위치 
 *      => 메소드 => 한번만 사용하고 버리는 경우 
 *         재사용이 없는 경우
 *         List에 저장된 데이터 변환이 많은 경우 
 *         ------------------------------
 *         데이터베이스 : 출연 
 *         A , B , C , D 
 *         A , B 
 *         
 *         A, B , C
 *      => 메소드 구현시 10줄이상 => 메소드 구현이 편리 (가독성(X))
 */
// => 이미 만들어진 라이브러리 사용이 많다 => 사용자 정의
@FunctionalInterface // 람다용으로 사용하겠다 
interface Calc
{
	// 반드시 메소드는 한개만 선언 : 추상메소드는 한개
	// 사용자에 따라서 달라질 수 있다 
	int calc(int a, int b);
	// => default는 가능 => 재사용 
	default int sum(int a,int b)
	{
		return a+b;
	}
}
/*
 *   속도가 빠르다 => C언어 도입 
 *   클래스                   람다 
 *     => .class파일 생성     .class를 생성하지 않는다 (즉석)
 *     => 메모리가 커진다       메모리가 적다 
 *     => this 참조          외부 클래스참조 
 *     => 재사용              재사용이 불가능 
 *     
 *     람다는 객체 생성은 가능 => 클래스 파일은 생성 할 수 없다 
 *     
 *   매개변수가 없는 경우 
 *    () -> {}
 *   매개변수가 있는 경우 
 *    (a,b) -> {
 *       여러개의 실행문장이 있을 수 있다 
 *    }
 *    
 *   리턴형 
 *    () -> {return 값}
 *    () -> {값}
 *   외부 메소드 이용 
 *    (a)->{Math.random()*a}
 *    
 *   default메소드 / static메소드는 구현이 가능 
 *   구현이 없는 메소드 (추상메소드) 한개만 설정 
 */
public class Lambda_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Calc add=(a,b)->a+b;
        //      calc(a,b){}
        Calc minus=(a,b)->a-b;
        Calc gop=(a,b)->a*b;
        Calc div=(a,b)->a/b;
        
        System.out.println(add.calc(10, 20));
        System.out.println(minus.calc(100, 20));
        System.out.println(gop.calc(10, 20));
        System.out.println(div.calc(10, 3));
	}

}
