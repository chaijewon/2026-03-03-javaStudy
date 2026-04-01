package com.sist.regex;
// ? => 0회 - 1회가 있는 경우
// color => colou?r
public class 정규식_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("color".matches("colou?r"));
        System.out.println("colour".matches("colou?r"));
        System.out.println("colouur".matches("colou?.r"));
        System.out.println("cat".matches("c?a?t?"));
        System.out.println("".matches("c?a?t?"));
	}

}
