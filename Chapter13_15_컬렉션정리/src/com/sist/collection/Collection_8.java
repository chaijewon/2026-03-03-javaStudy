package com.sist.collection;
import java.util.*;
/*
 *   웹 
 *    => ~ 예외처리 : 기본 문법 
 *    => 라이브러리 
 *       | java.lang 
 *         => Object : toString() 
 *         => String (********) 
 *            StringBuffer => append
 *         => Math : ceil() 
 *         => Wrapper 
 *             Integer / Double / Boolean 
 *               | 
 *             parseInt  parseDouble parseBoolean
 *       | java.util 
 *         => StringTokenizer 
 *              => counterTokens , hasMoreTokens , nextToken
 *         => Random => nextInt
 *         => Date / Calendar 
 *                   set / get 
 *         => SimpleDateFormat : 날짜 변환 
 *         => DecimalFormat : 숫자 변환 
 *            => toLocaleString() => 자바스크립트 
 *       | Collection
 *         List 
 *           add / get / size / isEmpty / clear
 *         Set 
 *           add / remove / isEmpty
 *         Map 
 *           put / get 
 *           
 *       --------------> 9장 , 12장 , 13장 , 15장
 */
public class Collection_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet<String> set=new TreeSet<>();
//        set.add("apple");
//        set.add("banana");
//        set.add("grape");
//        System.out.println(set.ceiling("blue"));
//        System.out.println(set.floor("blue"));
        set.add("박문수");
        set.add("홍길동");
        set.add("심청이");
        set.add("춘향이");
        set.add("이순신");
        set.add("강감찬");
        set.add("김두한");
        set.add("이산");
        // => AI 
        for(String name:set)
        {
        	System.out.println(name);
        }
        System.out.println("===============");
        System.out.println(set.ceiling("이순호"));
        System.out.println(set.floor("이순호"));
        
        // ceiling / floor 
        // 오라클 
	}

}
