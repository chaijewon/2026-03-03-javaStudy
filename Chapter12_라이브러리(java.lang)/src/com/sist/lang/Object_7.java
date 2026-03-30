package com.sist.lang;

import java.lang.reflect.Method;

// 클래스 정보 얻기 => Class.forName() / .getClass / .class
// 리플렉션 => 클래스 정보를 얻어서 => 객체 생성 / 생성자 호출 / 변수 값 지정 
// 스프링은 거의 리플렉션응 이용한다 
// => 클래스를 넘겨주면 => 생성 => 관리
// getClass 
// => 솔루션 => SM/SI/SE(CI/CD) 
public class Object_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Hello";
        Class clsName=str.getClass();
        System.out.println(clsName.getName());
        // 데이터 타입 
        Object obj=new String("Hello");
        System.out.println(obj.getClass());
        // 객체 타입 => 데이터형 => 어떤 클래스 
        
        clsName=String.class;
        System.out.println(clsName.getName());
        Method[] methods=clsName.getDeclaredMethods();
        for(Method m:methods)
        {
        	System.out.println(m.getName());
        }
	}

}
