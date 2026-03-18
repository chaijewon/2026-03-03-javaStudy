// 액션 클래스 ==> 기능 수행 (메소드)
// MovieDAO / MovieManager / MovieService=>SpringAI
//    | DB연동   | 크롤링       | 브라우저에 전송 

import java.io.FileReader;

public class MovieSystem {
   // 데이터를 여러명이 동시에 접속 => 같은 영화 정보 => 공유 
   static Movie[] movies=new Movie[1938];
   // 초기화 => 파일을 읽어서 데이터를 저장 
   static 
   {
	   // 자동으로 인식 ==> 파일 예외처리 
	   try
	   {
		   StringBuffer sb=new StringBuffer();
		   // 파일 전체의 문자 저장 
		   // 1. 파일 읽기 
		   FileReader in=new FileReader("c:\\javaDev\\movie.txt");
		   int i=0; // 한글자 읽기 => 리턴형 => int => (char)변환 
		   while((i=in.read())!=-1) // -1 EOF(파일의 끝)
		   {
			   sb.append((char)i);
		   }
		   in.close();
		   
		   String strMovie=sb.toString();
		   // 문자열로 변환 
		   
		   String[] datas=strMovie.split("\n");
		   i=0;
		   for(String m:datas)
		   {
			   String[] mm=m.split("\\|");
			   movies[i]=new Movie();
			   movies[i].mno=Integer.parseInt(mm[0]);
			   //          문자열 => 정수형 변경 
			   movies[i].title=mm[1];
			   movies[i].genre=mm[2];
			   movies[i].poster=mm[3];
			   movies[i].actor=mm[4];
			   movies[i].regdate=mm[5];
			   movies[i].grade=mm[6];
			   movies[i].director=mm[7];
			   
			   i++;
		   }
		   
	   }catch(Exception ex) {}
	   
   }
}





