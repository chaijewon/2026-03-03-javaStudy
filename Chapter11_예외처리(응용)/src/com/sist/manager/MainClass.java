package com.sist.manager;

import java.util.Scanner;

import com.sist.vo.FoodVO;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //FoodManager fm=new FoodManager();
		//int data=29;
		/*int total=data/10;
		if(data%10>0)
			total++;
		System.out.println(total);*/
		//int total=(int)(Math.ceil(data/10.0));
		// round(반올림) ceil(올림)  
		// 10.2 ==> 10 10.5 => 11
		// 10.2 ==> 11 
		//System.out.println(total);
		FoodManager fm=new FoodManager();
		Scanner scan=new Scanner(System.in);
		int total=fm.food_total();
		System.out.print("페이지 입력(1~"+total+"):");
		int page=scan.nextInt();
		FoodVO[] food=fm.food_list(page);
		for(FoodVO vo:food)
		{
			System.out.println(vo.getNo()+"."+vo.getName());
		}
		System.out.print("상세볼 맛집의 번호 입력:");
		int no=scan.nextInt();
		FoodVO vo=fm.food_detail(no);
		System.out.println("맛집번호:"+vo.getNo());
		System.out.println("맛집명:"+vo.getName());
		System.out.println("주소:"+vo.getAddress());
		System.out.println("전화:"+vo.getPhone());
		System.out.println("음식종류:"+vo.getType());
		System.out.println("주차:"+vo.getParking());
		System.out.println("영업시간:"+vo.getTime());
		System.out.println("가격대:"+vo.getPrice());
		System.out.println("테마:"+vo.getTheme());
		System.out.println("소개:"+vo.getContent());
		
		FoodVO[] f=fm.food_filter("한식");
		System.out.println(f.length);
		
		
	}

}
