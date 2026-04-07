package com.sist.service;
// => 사용자 요청 처리
import java.util.*;
import java.util.stream.Collectors;

import com.sist.dao.*;
import com.sist.vo.*;
public class FoodService {
   private List<FoodVO> fList;
   public FoodService()
   {
	   fList=FoodDAO.getfList();
	   //fList=new ArrayList<FoodVO>();
   }
   public List<Optional<FoodVO>> food_list(int page)
   {
	   List<FoodVO> list=new ArrayList<FoodVO>();
	   /*
	    *   1page => 0~9
	    *   2page => 10~19
	    *   3page => 20~29
	    */
	   int rowsize=10;
	   int start=(page*rowsize)-rowsize;
	   int end=page*rowsize;
//       list=fList.subList(start, end);//end-1
//       List<Optional<FoodVO>> result=
//    		   list.stream()
//    		   .collect(Collectors.toList());
       return fList.subList(start, end)
    		   .stream()
    		   .map(Optional::ofNullable)// Optional변경 
    		   .collect(Collectors.toList());
   }
   // 상세보기 
   public FoodVO food_detail(int no)
   {
	   return fList.get(no-1);
   }
   // 검색 
   public List<FoodVO> food_type_find(String type)
   {
	   return fList.stream()
			  .filter(food->food.getType().contains(type))
			  .collect(Collectors.toList());
   }
   public List<FoodVO> food_address_find(String addr)
   {
	   return fList.stream()
			  .filter(food->food.getAddress().contains(addr))
			  .collect(Collectors.toList());
   }
}
