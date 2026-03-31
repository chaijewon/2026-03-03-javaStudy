package com.sist.lang;

import java.util.StringTokenizer;

/*
 *   문자열 클래스 
 *   ----------
 *   StringBulider / **StringBuffer / **StringTokenizer
 *       |                 |
 *       -------------------
 *          | 문자를 모아서 관리 
 *       | 동기화      | 비동기화 
 *        ------       ------
 *        안정성         속도 
 *   => 521page 
 *   
 *   **StringTokenizer / split
 *   ---------------   ------
 *   | 간단한 문자 분리    데이터가 많거나 복잡한 문자가 있는 경우 
 *   | String          | String[]
 *   | 네트워크 / 크롤링 
 *     
 *   
 */
public class StringBuffer_StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String info="32,000원 | 2026년 4월 2일 발행 | 404쪽";
        long start=System.currentTimeMillis();
        String[] data=info.split("\\|");
        //  정규식 => | 기호 
        for(String s:data)
        {
        	System.out.println(s);
        }
        long end=System.currentTimeMillis();
        System.out.println("데이터 갯수:"+data.length);
        System.out.println("걸린 시간:"+(end-start));
        
        
        System.out.println("==== StringTokenizer ====");
        start=System.currentTimeMillis();
        StringTokenizer st=new StringTokenizer(info,"|");
        System.out.println("데이터 갯수:"+st.countTokens());
        while(st.hasMoreTokens())
        {
        	System.out.println(st.nextToken());
        }
        end=System.currentTimeMillis();
        System.out.println("걸린 시간:"+(end-start));
	}

}
