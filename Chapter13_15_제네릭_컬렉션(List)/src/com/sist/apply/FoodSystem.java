package com.sist.apply;
import java.util.*;
import java.io.*;
// 데이터 설정 (변수) => 클래스로 필요한 변수 모우기 => 데이터 보호 (캡슐화)
// 데이터 수집 : 크롤링 / 파일 / 데이터베이스 
// 어떤 기능이 필요한지 : 사용자가 어떤 걸 요구 => 요구사항 
// 출력 => 명령프롬프트 / 윈도우 / 웹 
public class FoodSystem {
   private static ArrayList<Food> fList=
		              new ArrayList<Food>();
   /*
    *   <> : 데이터형 변경 
    *        형변환의 문제 발생 => 해결 
    *   데이터형을 모르는 경우 <?>
    *   ------------------------------
    *   1. 소스가 간결 
    *   2. 형변환이 없다 
    *   3. 가독성 => 어떤 데이터가 들어가는지 확인 가능 
    *   4. 컬렉션에서 데이터형 안정성을 가지고 있다
    *      => 컴파일시에 변경이 된다 
    *         변수 / 매개변수 / 리턴형 
    *      => 컬렉션 / 함수형 인터페이스 (람다)
    *      => 클래스에 있는 모든 데이터형을 통일 
    *      T => String
    *      -- Object => 모든 데이터가 가능 => 프로그램의 불안정하다
    *   
    */
   static 
   {
	   try
	   {
		   FileReader fr=new FileReader("c:\\javaDev\\food.txt");
		   int i=0;
		   StringBuffer sb=new StringBuffer();
		   while((i=fr.read())!=-1)
		   {
			   sb.append((char)i); // 파일에 있는 문자열 전체 저장 
		   }
		   fr.close();
		   String[] datas=sb.toString().split("\n");
		   
		   for(String food:datas)
		   {
			   Food f=new Food();
			   StringTokenizer st=new StringTokenizer(food,"|");
			   f.setNo(Integer.parseInt(st.nextToken()));
			   f.setName(st.nextToken());
			   f.setType(st.nextToken());
			   f.setPhone(st.nextToken());
			   f.setAddress(st.nextToken());
			   f.setScore(Double.parseDouble(st.nextToken()));
			   f.setParking(st.nextToken());
			   f.setPoster("http://menupan.com"+st.nextToken());
			   f.setTime(st.nextToken());
			   f.setContent(st.nextToken());
			   f.setTheme(st.nextToken());
			   f.setPrice(st.nextToken());
			   
			   fList.add(f);
		   }
	   }catch(Exception ex) {}
   }
   // 기능 
   // 1. 목록 => 페이지 subList(start, end) end-1
   public ArrayList<Food> food_list(int page)
   {
	   
	   final int ROWSIZE=12;
	   int start=(page*ROWSIZE)-ROWSIZE;
	   /*
	    *   0 - 11
	    *   12 - 23
	    *   24 
	    */
	   int end=page*ROWSIZE;
	   ArrayList<Food> list=
			     new ArrayList<Food>(fList.subList(start, end));
	   return list;
   }
   public int foodTotalPage()
   {
	   return (int)(Math.ceil(fList.size()/12.0));
   }
   // 2. 상세보기 
   public Food foodDetail(int no)
   {
	   return fList.get(no-1);
   }
   // 3. 검색 
   public ArrayList<Food> foodFind(String address)
   {
	   ArrayList<Food> list=
			   new ArrayList<Food>();
	   for(Food f:fList)
	   {
		   if(f.getAddress().contains(address))
		   {
			   list.add(f);
		   }
	   }
	   return list;
   }
   // => 출력 : main => 윈도우 => 브라우저 
   
}
