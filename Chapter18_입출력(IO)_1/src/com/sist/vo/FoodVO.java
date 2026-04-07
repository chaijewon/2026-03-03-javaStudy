package com.sist.vo;

import lombok.Getter;
import lombok.Setter;

/*
 *   1|
 *   아름드리카페|
 *   카페/주점-카페|
 *   (070) 8872-4418|
 *   강원 동해시 평릉동 487-1|0.0|10대, 주차방법: 무료, 주차장소: 업소앞|
 *   /restaurant/restimg/002/zzmenuimg/d20034222_z.jpg|
 *   10:30 ~ 22:00|
 *   펜션과 함께 운영하고 있는 아름드리 커피숍을 소개한다. 깔끔하고 넓은 매장 내부는 탁 트인 주변 경치도 구경할 수 있게 되어 있어서 좋은 곳이다. 비영리 봉사단체에서 운영하는 곳으로 여러 사람들의 정성을 모아 이웃들에게 함께 나누는 착한 카페이다. 예쁜 그릇에 담긴 팥빙수와 진한 향의 페퍼민트, 그리고 너무 예쁜 카페라떼까지 분위기 좋은 곳에서 함께 즐기기 좋은 카페이다.|
 *   일상데이트 , 더운날 , 야외테라스 , 포장 가능|
 *   5,000원미만

 */
// => 데이터를 저장한후에 전송하는 목적 => 윈도우 / 웹
// => Spring : VO , MyBatis : DTO , JSP : BEAN
@Getter
@Setter
public class FoodVO {
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
   @Override
   public String toString() {
	// TODO Auto-generated method stub
	return "번호:"+no+"\n"
		  +"업체명:"+name+"\n"
		  +"전화:"+phone+"\n"
		  +"주소:"+address+"\n"
		  +"평점:"+score+"\n"
		  +"가격대:"+price+"\n"
		  +"영업시간:"+time+"\n"
		  +"주차:"+parking+"\n"
		  +"테마:"+theme+"\n"
		  +"소개:"+content;
   }
   
}
