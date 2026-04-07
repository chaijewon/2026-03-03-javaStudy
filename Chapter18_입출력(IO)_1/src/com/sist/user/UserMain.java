package com.sist.user;
import java.util.*;
import com.sist.service.*;
import com.sist.vo.FoodVO;
public class UserMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        FoodService fService=new FoodService();
        while(true)
        {
        	System.out.println("===== Menu =====");
        	System.out.println("1. 목록");
        	System.out.println("2. 상세보기");
        	System.out.println("3. 검색(음식종류)");
        	System.out.println("4. 검색(주소)");
        	System.out.println("5. 종료");
        	System.out.println("=================");
        	System.out.print("메뉴 선택:");
        	int menu=scan.nextInt();
        	switch(menu)
        	{
	        	case 5 -> {
	        		System.out.println("프로그램 종료");
	        		System.exit(0);
	        	}
	        	case 1 -> {
	        		System.out.print("페이지 입력:");
	        		int page=scan.nextInt();
	        		List<Optional<FoodVO>> fList=fService.food_list(page);
//	        		Optional<String> ff=fList.stream()
//	        				.flatMap(Optional::stream)
//	        				.map(v->v.getNo()+"."+v.getName())
//	        				.findAny();
//	        		System.out.println(ff.orElse("데이터가 없음"));
	        		List<FoodVO> foods=fList.stream()
	        				           .flatMap(Optional::stream)
	        				           .toList(); 
	        		// List<Optional<FoodVO>> ==> List<FoodVO>
	        		if(foods.isEmpty())
	        		{
	        			System.out.println("데이터 없음");
	        		}
	        		else
	        		{
	        			foods.forEach(f->System.err.println(f.getNo()+"."
	        					+f.getName()));
	        		}
	        		//System.out.println(result);
	        				 
	        		/*if(fList!=null)
	        		{
	        		  fList.stream()
	        		     .forEach(food->System.out.println(
	        		    		 food.getNo()+"."+food.getName()));
	        		}
	        		else
	        		{
	        			System.out.println("데이터가 없습니다");
	        		}*/
	        	}
	        	case 2 -> {
	        		System.out.print("상세볼 맛집 번호:");
	        		int no=scan.nextInt();
	        		FoodVO vo=fService.food_detail(no);
	        		System.out.println(vo);
	        	}
	        	default -> System.out.println("메뉴가 없습니다");
        	}
        }
	}

}
