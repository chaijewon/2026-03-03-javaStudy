package com.sist.list;
/*
 *   ArrayList / Vector / LinkedList
 *   => 주요 메소드 
 *   => 데이터 저장 공간 : 효율적으로 사용할 수 있게 만든 자료 구조
 *   => 표준화 : 모든 개발자가 동일 
 *   => 라이브러리 : 변수(X) , 메소드(O)
 *                         --------
 *      add(Object o) 추가 
 *         <String>  제네릭 => 데이터형 통일화 
 *      set / remove
 *      ------------
 *      isEmpty() : 비어있는지 확인 
 *      clear() : 장바구니 
 *      size() : 갯수 
 *      get() : 데이터 읽기 
 *      ----------------------------------
 *      subList() : 원한는 갯수만큼 저장 
 *      retainAll() : 교집합 
 *      addAll() : 전체 데이터 
 *      
 *      List === Set  === Map(key,value)
 *        |       |
 *        ---------
 *           | 호환 
 *           
 *      
 */
import java.util.*;
public class List_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] arr={"aaa","bbb","ccc","ddd","aaa","bbb"};
        List<String> list=Arrays.asList(arr);
        
        Set<String> set=new HashSet(list);
        
        for(String s:set)
        {
        	System.out.println(s);
        }
        
	}

}
