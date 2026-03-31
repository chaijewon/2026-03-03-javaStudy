package com.sist.lang;
/*
 *   LocalDateTime 
 *   => 날짜 + 시간 
 *   => LocalDate : 날짜 , LocalTime : 시간 
 *   // 1. 현재 날짜+시간 
 */
import java.time.*;
import java.time.format.DateTimeFormatter;
public class 시간{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. 현재 날짜+시간 
		LocalDateTime now=LocalDateTime.now();
		// final 클래스 => 상속할 수 없다 => 오버라이딩 불가능 
		// 있는 그대로 사용한다 
		// Math , String , StringBuffer , System..
		System.out.println(now);
		// timezone이 없다 
		// 2. 특정 날짜.시간 생성 
		LocalDateTime dateTime=
				LocalDateTime.of(2026,3,30,14,30,30);
		System.out.println(dateTime);
		// 3. 날짜/시간 더하기 / 빼기 
		LocalDateTime f=now.plusDays(4).plusHours(3);
		System.out.println(f);
		LocalDateTime p=now.minusMonths(1);
		System.out.println(p);
		
		// 값 추출 
		int year=now.getYear();
		int month=now.getMonthValue();
		int day=now.getDayOfMonth();
		int hour=now.getHour();
		
		System.out.println(year+"-"+month+"-"+day+"-"+hour );
		
		// 문자열 => 날짜형으로 변환
		// 오라클 => DATE => 시간 , VARCHAR => 시간 
		String str="2026-03-31 15:47:40";
		// => 가끔 사용 
		DateTimeFormatter ff=DateTimeFormatter.
				   ofPattern("yyyy-MM-dd HH:mm:ss");
		//MM/월 mm/분  hh(1~12) / HH(1~24)
		LocalDateTime t=LocalDateTime.parse(str,ff);
		
		String fff=dateTime.format(ff);
		System.out.println(fff);
		
		
		
	}

}
