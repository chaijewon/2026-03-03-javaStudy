package com.sist.lang;
import java.util.*;
/*
 *   Date 
 *     : 운영체제의 날짜와 시간 => 기능은 없다 
 *     : 많이 사용되는 클래스 
 *     : 데이터베이스 호환 (***) 
 *   Calendar : 날짜 , 시간에 대한 처리 기능 
 *              Date에 없는 기능을 첨부 
 *               
 *   LocalDateTime  => LocalDate , LocalTime 
 *   **SimpleDateFormat : 날짜 / 시간 => 출력 형식 
 *   **DecimalFormat : 숫자 출력 형식 
 *   ------------------------ 웹 출력시 
 *   MessageFormat : 문자열 출력 형식 
 *   ------------- SQL을 사용시 주로 사용 => 오라클 
 *   
 *   String id,name,sex,address,phone;
 *   int age
 *   
 *   => String sql="INSERT INTO member VALUES('"+id+"','"
 *             +name+"','"+sex+"','"+address+"','"+
 *             phone+"',"+age+")"
 *      String sql="INSERT INTO member VALUES(?,?,?,?,?,?,?)"
 */
public class 날짜_시간_형식클래스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Date date=new Date(); // 일반 클래스 
        System.out.println(date);
        
        Calendar cal=Calendar.getInstance();//추상클래스 
        int week=cal.get(Calendar.DAY_OF_WEEK);
        // 요일 읽기 => 1번부터 시작 
        String[] strWeek={"","일","월","화","수","목","금","토"};
        System.out.println("오늘은 "+strWeek[week]+"요일입니다");
        int last=cal.getActualMaximum(Calendar.DATE);
        System.out.println("이번달 마지막 날?"+last); 
        
        int year=cal.get(Calendar.YEAR);
        int month=cal.get(Calendar.MONTH)+1;// month는 0부터 시작
        // cal.set(Calendar.MONTH,month-1)
        int day=cal.get(Calendar.DATE);
        System.out.println(year+"년도 "+month+"월 "+day+"일");
	}

}
