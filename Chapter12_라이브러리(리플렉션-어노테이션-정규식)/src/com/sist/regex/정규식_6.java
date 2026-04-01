package com.sist.regex;
// 문자 집합 [] [abc] => a|b|c [(abc)]
/*
 *   [abdef]  => 그대로 
 *   [abcdef] => [a-f]
 *   
 *   => 알파벳 [A-Z] [a-z]  [A-Za-z]
 *   => 숫자 [0-9] 
 *   => 한글 [가-힣] ==> 한글자 => 글자수 {5}
 *      => 3 , 4, 5, => {3,5}
 *   127.0.0.1
 *   238.124.63.89
 *   255.255.255.255  8.8.8.8
 *   [0-9]{1,3}
 *   
 *   이름 
 *   [가-힣]{2,17} => 51 => 오라클은 한글 3
 */
public class 정규식_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("dat".matches("[abc]at"));
        // aat bat cat
        System.out.println("a".matches("[a-z]"));
        System.out.println("A".matches("[A-Z]"));
        System.out.println("1".matches("[0-9]"));
        System.out.println("홍".matches("[가-힣]"));
        // "코메디"
        System.out.println("코메디".matches("^코[가-힣]*"));
        
	}

}
