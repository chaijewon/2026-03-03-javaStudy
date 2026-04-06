package com.sist.collection;
/*
 *   1. 목록 출력 => 데이터 수집 
 *      1) 표준화 
 *      2) 기능에 따라 분리 
 *         List / Map  / Set 
 *          |      |      |
 *                      HashSet 
 *                HashMap (라이브러리 => Spring / MyBatis)
 *        ArrayList(******)
 *      => 실무 
 *         List -> Map (조회 = 최적화)
 *         List -> Set (중복 제거)
 *         Map + Set (중복없는 그룹핑)
 *         Map => 캐시구조 => 로그 파일 
 *         
 *     순서 중요 (순위 : 인기 검색어 , 노래 순위) => List
 *     중복 없는 데이터 (장르 , 부서 ...) => Set
 *     빠른 조회 / 조건문 없이 사용 => Map 
 *     그룹처리 (채팅 : 방개설 , 1:1 채팅) => Map
 *     중복 체크 => Set
 *     
 *     Iterator / ***ListIterator
 *                | 양방향 
 *     | 단반향  
 *     
 *     Iterator 
 *      = 컬렉션의 데이터를 순차적 접근하기 위한 인터페이스 
 *      = 주요 메소드 
 *        => hasNext() : while => 데이터가 존재할때까지 수행
 *                       => 데이터가 존재 : true / false 
 *        => next() : 실제 데이터 읽기 
 *        => remove() 삭제 
 *      = 단반향 : 위 => 아래로 
 *      = List / Set 주로 사용 
 *      = 컬렉션을 안정하게 만든다 
 *      = 복잡한 크롤링이 있는 경우 (한번에 데이터 모아서 처리)
 */
import java.util.*;
public class Collection_total {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> names=
        	new ArrayList<String>(List.of("홍길동","이순신",
        			   "박문수","심청이","춘향이"));
        // 한번에 모아서 출력 
        Iterator<String> it=names.iterator();
        
        // 출력 => 마지막 데이터를 추출 => 종료 (다시 사용이 불가능)
        // 불필요한 데이터를 삭제 => 안정성이 있다 
        while(it.hasNext())
        {
        	String name=it.next(); // 값 읽기 
        	System.out.println(name);
        }
        
        System.out.println("========");
        
        System.out.println("======= for-each =====");
//        for(String name:names)
//        {
//        	names.remove(name);
//        }
//        for(String name:names)
//        {
//        	System.out.println(name);
//        }
        
	}

}
