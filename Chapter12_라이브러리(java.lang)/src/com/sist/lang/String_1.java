package com.sist.lang;
// 문자열을 저장하는 클래스 
/*
 *   데이터형 / 클래스형으로 사용이 가능 
 *            ------- 지원하는 메소드 
 *   1. 문자열 생성 
 *      ***String s="Hello";
 *      String s=new String("Hello")
 *   2. 주로 사용 => 웹 / 모바일 / 윈도우 
 *                 ---------------- 전송 / 값 받기 => String 
 *                 정수 / 실수 => Wrapper 
 *   3. 주요 기능 
 *      = 비교 
 *        ***equals() : 문자열 자체를 비교 
 *        compare() : 문자열 크기 => 문자열 정렬 
 *      = 검색
 *        ***startsWith() : 시작문자열 같은지 => 쿠키에 저장된 데이터
 *        endsWith(): 끝 문자열이 같은 지 => 확장자 => 다운로드 / 파일 첨부 
 *        ***contains() : 포함 문자열인지  => 실제 검색 
 *      = 변환 
 *        toUpperCase() : 대문자 변환 
 *        toLowerCase() : 소문자 변환
 *        ***replace() : 문자열 / 문자 변경 
 *        ***replaceAll() : 정규식을 이용한 변환  
 *      = 문자열 제어 
 *        **length() : 문자 갯수 
 *        **trim() : 공백 제거 
 *        ***substring() => 원하는 위치에서 문자를 자르는 경우 
 *        ***indexOf() => 문자,문자열 위치 찾는 경우 (앞에서...) 
 *        ***lastIndexOf() => (뒤에서) 
 *      = 모든 데이터형을 문자열로 변환 
 *        => static => ***valueOf()
 *     --------------------------------------------------
 *     불변 => 변경되지 않는다 => 변환 => String 리턴형 
 *     
 *     String s="Hello"
 *     String ss=s.replace('l','k') => Hekko
 *     
 *     ==> s=s.replace('l','k')
 *     ==> 문자열은 원본은 가급적이면 유지 
 *     ==> String 객체에는 문자열이 저장된 것이 아니라 주소가 저장됨 
 *         "" => 자체가 주소 
 *         "Hello".substring()
 *         --------
 *           char[] a={'H','e','l','l','o'};
 *     ==> String 클래스 
 *         클래스 / 배열 => 참조변수(메모리 주소를 이용하는 프로그램)
 *         ---------- | Call By Reference 
 *         => String은 Call By Value만 사용 
 */
class A
{
	int aa=100;
}
class B
{
	public void setAA(A a)
	{
		a.aa=1000;
	}
	public void setStr(String s)
	{
		s="홍길동";
	}
}
public class String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        A a=new A();
        System.out.println(a.aa);
        B b=new B();
        b.setAA(a);
        System.out.println(a.aa);
        
        String name="심청이";
        System.out.println(name);
        b.setStr(name);
        System.out.println(name); // Call By Value
        // 일반 변수 ...
	}

}
