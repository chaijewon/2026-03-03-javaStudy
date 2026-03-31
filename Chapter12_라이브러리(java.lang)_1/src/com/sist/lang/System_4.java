package com.sist.lang;

public class System_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        long start=System.currentTimeMillis();// 1/1000
        
        for(int i=1;i<=10000000;i++)
        {
        	System.out.println(i);
        }
        
        long end=System.currentTimeMillis();
        System.out.println("걸린 시간:"+(end-start));
        // 데이터베이스 SQL => 데이터 검색 
        // => Spring : AOP
	}

}
