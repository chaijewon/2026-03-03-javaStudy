package com.sist.lambda;
import java.io.FileReader;
/*
 *    stream() : 내부 반복자 => 전체 데이터 수집 
 *    filter() : if => 조건 검색 => 데이터 추출 
 *    forEach => 반복 출력 (추출된 데이터 출력)
 *    ===> sort / min , max / sum / avg ...
 *    1|
 *    아름드리카페|
 *    카페/주점-카페|
 *    (070) 8872-4418|
 *    강원 동해시 평릉동 487-1|
 *    0.0|
 *    10대, 주차방법: 무료, 주차장소: 업소앞|
 *    /restaurant/restimg/002/zzmenuimg/d20034222_z.jpg|
 *    10:30 ~ 22:00|
 *    펜션과 함께 운영하고 있는 아름드리 커피숍을 소개한다. 깔끔하고 넓은 매장 내부는 탁 트인 주변 경치도 구경할 수 있게 되어 있어서 좋은 곳이다. 비영리 봉사단체에서 운영하는 곳으로 여러 사람들의 정성을 모아 이웃들에게 함께 나누는 착한 카페이다. 예쁜 그릇에 담긴 팥빙수와 진한 향의 페퍼민트, 그리고 너무 예쁜 카페라떼까지 분위기 좋은 곳에서 함께 즐기기 좋은 카페이다.|
 *    일상데이트 , 더운날 , 야외테라스 , 포장 가능|
 *    5,000원미만

 */
import java.util.*;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
class Food{
	private int no;
	private String name;
	private String type;
	private String phone;
	private String address;
	private double score;
	private String parking;
	private String poster;
	private String time;
	private String content;
	private String theme;
	private String price;
}
class FoodManager
{
	// 맛집 전체의 데이터는 공유 => static 
	// 오라클 데이터 => static (공유를 목적으로 한다) 
	public static List<Food> fList=
			     new ArrayList<Food>();
	// 메모리 할당 없이 초기화 
	static 
	{
		// 파일 => CheckedException => 반드시 예외처리 
		try
		{
			FileReader fr=
				new FileReader("c:\\javaDev\\food.txt");
			StringBuffer sb=new StringBuffer();
			// => 파일읽는 경우 => 1글자 
			// => 한줄씩 읽을 수 있다 
			// BufferedReader => IO
			int i=0; // 읽은 char 
			while((i=fr.read())!=-1)
			{
				sb.append((char)i);
			}
			fr.close(); // => try~with~resource 
			// 맛집별로 나눠서 저장 
			String[] datas=sb.toString().split("\n");
			// 변수로 나눠서 저장 
			for(String food:datas)
			{
				Food f=new Food();
				StringTokenizer st=
						new StringTokenizer(food,"|");
				f.setNo(Integer.parseInt(st.nextToken()));
				f.setName(st.nextToken());
				f.setType(st.nextToken());
				f.setPhone(st.nextToken());
				f.setAddress(st.nextToken());
				f.setScore(Double.parseDouble(st.nextToken()));
				f.setParking(st.nextToken());
				f.setPoster(st.nextToken());
				f.setTime(st.nextToken());
				f.setContent(st.nextToken());
				f.setTheme(st.nextToken());
				f.setPrice(st.nextToken());
				
				fList.add(f);
			}
			
		}catch(Exception ex) {}
	}
	/*
	 *   1. 정적 변수 : static {}
	 *   2. 인스턴스 변수 : 생성자를 통해 초기화 
	 *   3. 사용자 정의 데이터형 => 데이터를 모아서 한번 브라우저에 전송할 목적 
	 *      DTO (Data Transfor Object)
	 *      --------- 한개에 대한 정보 
	 *                학생 1명 / 맛집 1개 ...
	 */
}
public class Lambda_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FoodManager fm=new FoodManager();
        //1. 전체 출력 
        /*
         *   fm.fList.forEach(food=>Callback)
         *   --------
         *   for(Food food:fm.fList)
         *   {
         *   }
         */
        fm.fList.forEach(food->System.out.println(food.getNo()
        		   +"."+food.getName()));
        System.out.println("===========================");
        
        // 평점이 4.0이상 
        for(Food food:fm.fList) // stream()
        {
        	if(food.getScore()>=4.0) // filter
        	{
        		System.out.println(food.getName()+":"
        				+food.getScore()); // forEach
        	}
        }
        
        System.out.println("========================");
        fm.fList.stream() // 데이터 읽기 
          .filter(food->food.getScore()>=4.0) // 조건 
          .forEach(food->System.out.println(food.getName()+":"
        				+food.getScore())); // 조건에 맞는 데이터만 출력 
        // 정렬 
        // 가격 기준 정렬 
        // 카테고리별 그룹핑 / 평점별 그룹핑 
        // 그룹핑 정렬 
	}

}
