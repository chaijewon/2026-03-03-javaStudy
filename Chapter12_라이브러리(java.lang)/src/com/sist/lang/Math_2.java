package com.sist.lang;
import static java.lang.Math.*;
import static java.lang.String.*;
// 클래스명 없이 사용이 가능하다 => static 메소드인 경우에만 가능 
// Math => static이라 사용하기 편리하다 
// ceil / random => 오라클에 존재 
// toString , hashCode , equals / clone / getClass 
public class Math_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println((int)ceil(10/3));
        System.out.println(random());
        
        System.out.println(valueOf(10));
	}

}
