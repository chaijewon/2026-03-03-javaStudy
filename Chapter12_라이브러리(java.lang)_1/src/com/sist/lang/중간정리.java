package com.sist.lang;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
 *   java.lang => 기본 클래스가 저장
 *    => 라이브러리 => 메소드  
 *   Object : 최상위 클래스 / 모든 클래스의 상위 / 가장 큰 데이터형
 *     데이터가 여러개 있는 경우 => 배열 
 *     Object[] obj={10,10.5,"aaa",'A', new A()}; 
 *     = String toString() => 객체 메모리 주소를 문자열 리턴 
 *              ---------- 오버라이딩 => 변수값 출력 
 *              ---------- 생략이 가능 
 *              A a=new A()
 *              System.out.println(a)
 *              System.out.println(a.toString())
 *              
 *     = boolean equals(Object o) : 객체 비교 => (주소값 비교)
 *                 => 실제 값을 비교할때 오버라이딩 
 *     = Object clone(): 복제 => 같은 값을 가지고 새로운 메모리 생성 
 *                 => Spring : prototype 
 *                 => Git Clone => 그대로 저장 
 *     = int hashCode() : 구분자 (객체)
 *   String : 문자열 
 *     = int length() : 문자의 갯수 가지고 오기
 *     = boolean equals(String s) : 문자값을 비교
 *         => 로그인 / 상세보기 / 아이디 중복 
 *     = boolean startsWith(String s) : 시각문자열이 같은 경우
 *         => 쿠키 찾기 / 자동 완성기
 *     = boolean contains(String s) : 포함된 문자열 
 *         => 검색 
 *     = int indexOf(문자,문자열) : 앞에서부터 문자 찾기 
 *     = int lastIndexOf(문자,문자열) : 뒤에서부터 문자 찾기
 *     = String replace(문자,문자열) : 변환 
 *                      old new 
 *     = String replaceAll(문자열,변경될 문자열);
 *                        ------- 정규식 : 패턴 
 *     = String valueOf(Object o) : 모든 데이터형 => 문자열화 
 *     = String substring(int b)
 *              substring(int b,int e) : 자르기 
 *     = String[] split(String rex) : 문자 분리 
 *   StringBuffer/StringBuilder
 *   Wrapper 
 *     = Integer : parseInt()
 *     = Double : parseDouble()
 *     = Boolean : parseBoolean()
 *     = Long : parseLong()
 *   Math
 *     = ceil() / random()
 *   System 
 *     = gc() currentTimeMills() , exit()
 *   
 */
public class 중간정리 {
  public static void main(String[] args) {
		String s=
				"""
		211.238.142.21,
		211.238.142.22,
		211.238.142.23,
		211.238.142.24,
		211.238.142.25,
		211.238.142.26,
		211.238.142.27,
		211.238.142.28,
		010.1111.1111,
		211.238.142.29""";
		// [가-힣] : 한글전체 , [A-Za-z]+ , [0-9]*
		//System.out.println(s);
		//웹 사용(X) => 크롤링 
	 Pattern p=Pattern.compile("[0-9]{3}\\.[0-9]{3}\\.[0-9]{3}\\.[0-9]{2}");
	 Matcher m=p.matcher(s);
	 while(m.find())
	 {
		 System.out.println(m.group());
	 }
  }
}
