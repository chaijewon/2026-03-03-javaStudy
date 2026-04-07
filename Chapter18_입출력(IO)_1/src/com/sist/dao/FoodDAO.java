package com.sist.dao;
import java.io.FileReader;
import java.util.*;
// 파일 , 데이터베이스 연동 

import com.sist.vo.FoodVO;

import lombok.Getter;
// 실제 값을 채우는 경우 / 사용 => Getter/Setter
// 이미 데이터가 고정 => Getter

public class FoodDAO {
  private static List<FoodVO> fList=
		         new ArrayList<FoodVO>();
  static
  {
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
					FoodVO f=new FoodVO();
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
	  }catch(Exception ex){}
  }
  public static List<FoodVO> getfList() {
	return fList;
  }
  
}
