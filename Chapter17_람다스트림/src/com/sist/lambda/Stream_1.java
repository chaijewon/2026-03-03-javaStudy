package com.sist.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// 활용 => 실제 프로젝트 
public class Stream_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 데이터 => 짝수면 제곱을 출력 
		//         ----- ---------
		//         filter  map
		List<Integer> list=Arrays.asList(1,2,3,4,5);
		// List.of() , Arrays.asList(1,2,3,4,5)
		// 데이터를 이동하는 통로 
		list.stream()
		   .filter(n->n%2==0)
		   .map(n->n*n)
		   .forEach(System.out::println);
		
		for(int i:list) // stream
		{
			if(i%2==0) // filter
			{
				i=i*i; // map 
				System.out.println(i); // forEach
			}
		}
		
		System.out.println("====== 문자열 대문자로 변환 =====");
		// map만 이용 => forEach이용 
		List<String> names=Arrays.asList("king","scott","clerk");
		names.stream()
		     .map(name->name.toUpperCase())// String::toUpperCase()
		     .forEach(name->System.out.println(name));
		      //System.out::println
		names.stream()
		     .map(String::toUpperCase)
		     .forEach(System.out::println);
		
		System.out.println("========= for ======");
		for(String name:names)
		{
			name=name.toUpperCase();
			System.out.println(name);
		}
	}

}
