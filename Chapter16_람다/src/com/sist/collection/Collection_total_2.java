package com.sist.collection;
import java.util.*;
/*
 *   사용자 요청 ======= 오라클 ====== List/Set ====> 브라우저 전송
 *                                ---------
 *   => 데이터를 모아서 순차적으로 출력할 목적 
 *   ListIterator : List전용 
 *     | 양반향 
 *     | hasNext() / next() => 처음 - 마지막
 *       hasPrevious() / previous() => 마지막 - 처음 
 *       add() , set() , remove()
 *       ------------------------- 같은 구조 : JDBC
 *     | 인덱스 위치 확인이 가능 
 *       nextIndex / previousIndex()
 *       
 */
import java.util.*;
public class Collection_total_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> list=
        	new ArrayList<String>(List.of("A","B","C","D","E"));
        ListIterator<String> it=list.listIterator();
        // 순서
        while(it.hasNext())
        {
        	System.out.println(it.next());
        }
        System.out.println("===== 역순 =====");
        while(it.hasPrevious())
        {
        	System.out.println(it.previous());
        }
        // => 오라클에서 실제 데이터 => ASC / DESC
        // => 순수한 자바
        
        // List 전용 
	}

}
