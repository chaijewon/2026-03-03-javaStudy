package com.sist.collection;
// 실제 사용 
import java.util.*;
public class Collection_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String[] names= {
        	"홍길동","심청이","춘향이","박문수",	
        	"강감찬","을지문덕","이순신","김두한",
        	"홍길동","박문수"
        };
        // 제어 => ArrayList
        List<String> list=Arrays.asList(names);
        System.out.println("====== 전체 사원 목록 =======");
        for(String name:list)
        {
        	System.out.println(name);
        }
        // 중복을 제거 
        Set<String> set=new HashSet<String>();
        set.addAll(list);
        System.out.println("======= 중복 제거 ========");
        for(String name:set)
        {
        	System.out.println(name);
        }
        System.out.println("==== 중복 제거후 리스트로 전송====");
        List<String> list2=new ArrayList<String>();
        list2.addAll(set);
        for(String name:list2)
        {
        	System.out.println(name);
        }
        // List:제어 => 중복을 제거 => Set을 이용해서 제거 
        // 자바 => 오라클 연동 : DISTINCT 
        // 장바구니 / 웹채팅 => 저장시 => Set
        // 네트워크 => Vector => Set
        
	}

}
