package com.sist.lang;
// 포장 클래스 => 데이터형을 쉽게 다르기 위해서 만들어진 클래스 
//             => 제네릭에서 사용이 가능하게 만든 클래스 
// <클래스> : 데이터형 통일  <int> (X) , <Integer> (O)
/*
 *   기본형 : 클래스화 
 *   -------------
 *   byte => Byte
 *   short => Short
 *   **int  => Integer
 *   **long => Long
 *   ---------------
 *   문자형 
 *    char => Character
 *   실수형 
 *    float => Float
 *    **double => Double
 *   논리 
 *    **boolean => Boolean 
 *   문자배열 
 *    **char[] => String 
 *    
 *   양쪽의 호환성 
 *   ----------
 *   AutoBoxing / UnBoxing 
 *   
 *   Integer i=new Integer(10)
 *   int ii=i.value()
 *   
 *   int ii=i;
 *   -------------------------
 *   Integer i=10; // 클래스에 실제 값을 주입 => 오토박싱  
 *   int ii=i; // 기본형에 클래스 객체 주입 => 언박싱 
 */
public class Wrapper_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        /*Integer i=10;
        Integer j=20;
        System.out.println(i+j);
        
        int k=10;
        int m=20;
        System.out.println(k+m);*/
        
        // 주요 메소드 
        // => 웹 / 윈도우 => 넘어오는 모든 값 => String
        // String page=request.getParameter("page")
        // => 정수형으로 변경 
        // => 네트워크 => 정수(X),문자열 전송 
        //int page="1";
        /*
         *    값을 받는 경우 
         *    parseXxx() 
         *    정수형변환 : Integer.parseInt("10") => 10
         *    실수형변환 : Double.parseDouble("10.5") => 10.5
         *    논리형변환 : Boolean.parseBoolean("true") => true
         *    
         *    값을 전송 경우 
         *    String.valueOf() 
         *    
         *    int no;
         *    
         */
		int a=10;
		System.out.println(Integer.toBinaryString(a));
		// 2진법 => 반드시 기억 
		System.out.println(0b1010);
		// 우분투 
		/*
		 *    --- --- ---
		 *     0   0   0
		 *    rwx w-x x-w
		 *     4   4   4   chmod 755
		 */
		System.out.println(Integer.toHexString(a));
		// 16진법 => 0x
		System.out.println(Integer.toOctalString(a));
		// 8진법 => 0
		
	}

}
