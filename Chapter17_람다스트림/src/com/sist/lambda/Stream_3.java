package com.sist.lambda;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

// 회원 + 주문 => 관리자 통계
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class User
{
	private String name;
	private int age;
}
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Order
{
	private String userName;
	private int price;
}
public class Stream_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<User> users=Arrays.asList(
           new User("홍길동",25),
           new User("이순신",17),
           new User("박문수",30),
           new User("김두한",27),
           new User("강감찬",22)
        );
        // for => 5 , for => if
        List<Order> orders=Arrays.asList(
           new Order("홍길동", 20000),
           new Order("이순신", 25000),
           new Order("박문수", 30000),
           new Order("김두한", 55000),
           new Order("강감찬", 15000),
           new Order("홍길동", 10000),
           new Order("이순신", 35000),
           new Order("박문수", 33000),
           new Order("홍길동", 27000),
           new Order("이순신", 45000),
           new Order("박문수", 38000)
        );
        
        // 1. 성인 회원만 출력 
        System.out.println("=== 성인 회원 ===");
        List<User> adults=users.stream()
        		          .filter(u->u.getAge()>=18)
        		          .collect(Collectors.toList());
        // List에 조건에 맞는 회원만 담어준다 => toList()
        // 브라우저 , 윈도우로 전송 
        adults.stream()
           .forEach(u->System.out.println(
        		   u.getName()+"("+u.getAge()+")"));
        /*adults.stream()
        .forEach(System.out::println);*/
        
        System.out.println("=== 회원 이름만 추출 ===");
        List<String> names=users.stream()
        		         .map(User::getName) // String
        		         .collect(Collectors.toList());
        names.stream()
           .forEach(System.out::println);
        
        System.out.println("===== 특정 회원의 주문만 조회 ====");
        Scanner scan=new Scanner(System.in);
        System.out.print("이름 입력:");
        String n=scan.next();
        List<Order> kims=orders.stream()
        		     .filter(o->o.getUserName().equals(n))
        		     .collect(Collectors.toList());
        kims.stream()
         .forEach(k->System.out.println(k.getUserName()+","+k.getPrice()));
        
        System.out.println("===== 총 주문 금액 계산 =====");
        int total=
        		orders.stream()
        		.map(Order::getPrice) // 처리할 데이터가 뭐냐
        		.reduce(0, Integer::sum);
        DecimalFormat df=new DecimalFormat("#,###,###,###");
        // 변환하는 클래스 사용 
        // 숫자: DecimalFormat , 날짜: SimpleDateFormat
        System.out.println("총금액:"+df.format(total)+"원");
        // 매출 통계 
        
        // 사용자별로 
        int hong=0,kim=0,lee=0,kang=0,park=0;
        for(Order o:orders)
        {
        	if(o.getUserName().equals("홍길동"))
        		hong+=o.getPrice();
        	if(o.getUserName().equals("이순신"))
        		lee+=o.getPrice();
        	if(o.getUserName().equals("김두한"))
        		kim+=o.getPrice();
        	if(o.getUserName().equals("박문수"))
        		park+=o.getPrice();
        	if(o.getUserName().equals("강감찬"))
        		kang+=o.getPrice();
        }
        System.out.println("홍길동->"+hong);
        System.out.println("이순신->"+lee);
        System.out.println("박문수->"+park);
        System.out.println("강감찬->"+kang);
        System.out.println("김두한->"+kim);
        
        System.out.println("===== stream() 람다 ====");
        Map<String,Integer> result=
        		 orders.stream()
        		 .collect(Collectors.groupingBy(Order::getUserName,
        				 Collectors.summingInt(Order::getPrice)));
        //System.out.println("홍길동->"+result.get("홍길동"));
        Set<String> set=result.keySet();
        // Map에 있는 키를 읽어 온다 
        // 값 => values() => websocket => id 
        // groupingBy + summingInt : 실무에서 많이 등장 
        // => 개발자 : ERP(관리) => 관리자 모드 
        // 756page
        for(String s:set)
        {
        	System.out.println(s+"->"+result.get(s));
        }
        
        System.out.println("===== 가장 많이 주문한 금액 찾기 ====");
        Optional<Order> maxOrder=
        		orders.stream()
        		.max(Comparator.comparing(Order::getPrice));
        
        maxOrder.ifPresent(order->System.out.println(order.getPrice()));
        // => filter / map / reduce / forEach / groupby 
	}

}
