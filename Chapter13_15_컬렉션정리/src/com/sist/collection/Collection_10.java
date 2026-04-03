package com.sist.collection;
/*
 *  Map 
 *   = Iterator : 단방향 
 *   = ListIterator : 양방향 
 *   ------------------------> for-each => 대신 사용 
 */
import java.util.*;
public class Collection_10 {
    /*
     *   메소드 정리 
     *    1. 데이터 추가 / 수정 
     *       put(키,값) => 같은 키가 있는 경우에는 수정이 된다 
     *    2. 값 읽기 
     *       get(키) => 키에 해당되는 값을 가지고 온다 
     *    3. 삭제 
     *       remove(키) => Set:remove(실제 데이터)
             List:remove(int index)
          4. 키 존재 확인 
             boolean containsKey(키) => if에서 사용 
          5. 값 존재 확인 
             boolean containsValue(값) 
          6. 전체 삭제 
             clear() 
          7. 키 전체 가지고 오기 
             keySet() ==> 반복문 
             
          8. 값 전체 가지고 오기 
             values()
             
          9. 키+값 
             entrySet()
             
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,Integer> map=
        		new HashMap<String,Integer>();
        // key : String , value : Integer
        // 1. 값 주입 => put(key,value)
        map.put("사과", 100);
        map.put("바나나", 200);
        map.put("포도", 300);
        // 2. 값 읽기 => get(key)
        System.out.println("사과 갯수:"+map.get("사과"));
        System.out.println("바나나 갯수:"+map.get("바나나"));
        System.out.println("포도 갯수:"+map.get("포도"));
        // 3. 전체 출력 
        System.out.println("전체 데이터:"+map);
        // 4. 키 존재 => boolean containskey(키)
        if(map.containsKey("바나나"))
        {
        	System.out.println("바나나가 있음");
        }
        // 5. 값 수정 => 키는 중복할 수 없다 
        // 키가 중복되면 덮어쓴다 
        map.put("사과", 1000);
        System.out.println("전체 데이터:"+map);
        // 순서가 없다 (Set) 
        // 6. 삭제 
        map.remove("포도");
        System.out.println("전체 데이터:"+map);
        
        // 7. 반복문 사용 => 데이터 출력 
        // key 전체 읽기 ==> keySet()
        for(String key:map.keySet())
        {
        	System.out.println(key+":"+map.get(key));
        }
        
        // 8. 값 전체 읽기 
        for(int i:map.values())
        {
        	System.out.println(i);
        }
        
        // 9. 키 + 값을 동시에 
        for(Map.Entry<String, Integer> e:map.entrySet())
        {
        	System.out.println(e.getKey()+":"+e.getValue());
        }
        /*
         *   HashMap : 가장 많이 사용 
         *   키 : 중복(X)
         *   값 : 중복이 가능 
         *   순서는 없다 => List , LinkedHashMap
         */
        
	}

}
