package com.sist.collection;
// TreeSet : 검색속도가 빠르다 => 코딩테스트  
import java.util.*;
public class Collection_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Set<Integer> set=new HashSet<Integer>();
        Random r=new Random();
        for(int i=0;i<10;i++)
        {
        	int k=r.nextInt(100)+1;
        	//    0~99 => 1~100
        	set.add(k); // 오토박싱 Integer i=10
        	//System.out.println(k+" ");
        }
        System.out.println("실제 저장된 갯수:"+set.size());
        for(Integer i:set)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        // => TreeSet에 저장 
        TreeSet<Integer> set2=new TreeSet<Integer>();
        set2.addAll(set);
        for(Integer i:set2)
        {
        	System.out.print(i+" ");
        }
        System.out.println();
        
        System.out.println("===== 50 이상 =====");
        /*for(Integer i:set2)
        {
        	if(i>=50)
        		System.out.print(i+" ");
        }*/
        /*
         *  tailSet(50)
         *  headSet(50) 
         *  ==> 자음
         */
        System.out.println(set2.tailSet(50));
        System.out.println("===== 50 이하 ======");
        System.out.println(set2.headSet(50));
        
        System.out.println("===== 바로 위에 값 =====");
        System.out.println(set2.higher(30));
        
        System.out.println("===== 같거나 큰 값======");
        System.out.println(set2.ceiling(50));
        
        System.out.println("===== 바로 아래에 값 =====");
        System.out.println(set2.lower(50));
        
        System.out.println("===== 같거나 작은 값======");
        System.out.println(set2.floor(50));
        
        System.out.println(set2.first());
        System.out.println(set2.last());
        
        
	}

}
