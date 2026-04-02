package com.sist.list;
/*
 *      ==================> 순서(인덱스) 존재 , 중복 데이터 허용
 *      
 *      List ---> 인터페이스 
 *       |
 *      구현한 클래스 
 *      Full Stack 개발자 => 웹 => 데이터베이스 
 *      ArrayList : 비동기적 => 데이터베이스에서 값을 가지고 와서 저장 
 *      LinkedList : 파일 관리
 *      Vector:네트워크 유저 관리 
 *      
 *      => ArrayList / Vector 
 *          => 접근 속도 / 검색이 빠르다  => 80%
 *          => SELECT 
 *      => LinkedList => 구조가 다르다 
 *           
 *      => 데이터를 인덱스로 관리 
 *      => 데이터 중복 허용 
 *      => 저장 순서 유지
 *      
 *      ===== 프로그램의 단점 : 정답 
 *            ====== 요구한 결과값
 *      
 *      List list=new ArrayList();
 *                ---------------
 *                new LinkedList()
 *                ----------------
 *                new Vector()
 *      
 */
import java.util.*;
public class List_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // System.out.println(1+2+3+4+5+6+7+8+9+10);
		//List<String> list=new ArrayList<String>();
		//List<String> list=new Vector<String>();
		List<String> list=new LinkedList<String>();
		// 뒤에 있는 데이터베이스 => 리턴형 : List 
		list.add("1");
		list.add("2");
		list.add("3");
		for(String s:list)
		{
			System.out.println(s);
		}
		
	}

}
