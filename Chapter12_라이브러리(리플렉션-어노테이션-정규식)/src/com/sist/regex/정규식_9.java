package com.sist.regex;
// \d  \w  \s => 숫자[0-9] , 모든 문자  , 공백 
// + ==> '+'  \\+   \\|   \\?
public class 정규식_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("12345".matches("\\d+"));
        //  \\ => \
        System.out.println("abc123".matches("\\w+"));
        System.out.println(" ".matches("\\s"));
        
        System.out.println("1 2".matches("\\d\\s\\d"));
        
        System.out.println("a b".matches("\\w\\s\\w"));
	}
	

}
