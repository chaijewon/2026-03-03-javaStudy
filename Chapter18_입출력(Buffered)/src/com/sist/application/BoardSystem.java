package com.sist.application;
import java.io.*;
import java.util.*;
public class BoardSystem {
   // 게시판마다 공통 사용되는 데이터 => static
   private static List<BoardVO> list=
		         new ArrayList<BoardVO>();
   private static final String FILE_NAME="c:\\java_data\\board.txt";
   // list에 초기화 
   public BoardSystem()
   {
	   boardGetData();
   }
   // 공통기반
   // 1. 파일 읽기 
   public void boardGetData()
   {
	   ObjectInputStream ois=null;
	   try
	   {
		   FileInputStream fis=
				   new FileInputStream(FILE_NAME);
		   ois=new ObjectInputStream(fis);
		   list=(List<BoardVO>)ois.readObject();
		   // 제네릭까지 => 데이터형 
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(ois!=null) ois.close();
		   }catch(Exception ex) {}
	   }
   }
   // 2. 파일 저장 
   public void boardSave()
   {
	   ObjectOutputStream oos=null;
	   try
	   {
		   FileOutputStream fos=
				  new FileOutputStream(FILE_NAME);
		   oos=new ObjectOutputStream(fos);
		   oos.writeObject(list);
	   }catch(Exception ex)
	   {
		   ex.printStackTrace();
	   }
	   finally
	   {
		   try
		   {
			   if(oos!=null) oos.close();
		   }catch(Exception ex) {}
	   }
   }
   // 기능 처리 
   // 1. 글쓰기 
   public void boardInsert(BoardVO vo)
   {
	   vo.setNo(boardSequence()+1);
	   vo.setHit(0);
	   vo.setRegdate(new Date());
	   list.add(vo);
	   boardSave();
   }
   // 2. 목록 
   public List<BoardVO> boardList(int page)
   {
	   List<BoardVO> bList=new ArrayList<BoardVO>();
	   int rowSize=10;
	   int start=(page*rowSize)-rowSize;
	   int end=page*rowSize;
	   // 0~9  10~19 20~29
	   bList=list.subList(start, end);//end-1
	   return bList;
   }
   // 2-1 총페이지
   public int boardTotalPage()
   {
	   int total=0;
	   total=(int)(Math.ceil(list.size()/10.0));
	   return total;
   }
   // 3. 상세보기 
   // 4. 수정 
   // 5. 삭제 
   // 6. 시퀀스 : 자동 증가 
   public int boardSequence()
   {
	   int max=0;
	   try
	   {
		   for(BoardVO vo:list)
		   {
			   if(vo.getNo()>max)
				   max=vo.getNo();
		   }
	   }catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   
	   return max;
   }
   
   public static void main(String[] args) {
	  List<Integer> list=new ArrayList<Integer>();
	  for(int i=0;i<5;i++)
	  {
		  list.add(i);
	  }
	  
	  list.subList(0, 10)
	      .forEach(n->System.out.println(n));
	  
   }

}
