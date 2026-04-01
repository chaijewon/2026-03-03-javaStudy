package com.sist.regex;
// ^ and $  => ^ 시작 , $ 끝
public class 정규식_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("hello".matches("^h.*o$"));
        System.out.println("hello".matches("^h.*"));
        System.out.println("hello".matches(".*o$"));
        // hhhhh hdasda hadadad h8888y89
        // czzczco  zczco cxzczc%%%%o
        // 오라클 => CSS
	}

}
