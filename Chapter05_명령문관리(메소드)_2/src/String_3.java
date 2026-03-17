/*
 *   목표 
 *   1. 메소드 이해 
 *   2. String 클래스 이해 
 *   3. 객체 지향 개념 
 *   -------------------
 *   4. 상속 / 포함 
 *   5. 다형성 
 *   6. 클래스 설계 
 *   7. 인터페이스 
 *   -------------------
 *   8. 예외처리 
 *   9. java.util / java.lang => String 
 *   10. java.io / java.net 
 *   11. java.sql 
 *   ------------------------
 *   
 *   import java.lang.* => 자주 사용 => 생략이 가능 
 *          ----------- String / Math
 *          
 *   String => 주요 메소드 
 *      원하는 위치(인덱스번호 찾기) 
 *      
 *      indexOf / lastIndexOf
 *                | 뒤에서 찾기 경로 찾기 / 파일 찾기 
 *      | 앞에서 찾기 => 문자 찾는 경우 
 *      
 *      int indexOf(char c)
 *      int indexOf(String s)
 *      ===> -1일 경우 => 없는 경우 
 *      
 *      int lastIndexOf(char c)
 *      int lastIndexOf(String s)
 *      ===> 없는 경우의 값 => -1
 *      a.jpg => lastIndexOf 
 *        ---
 *      a.a.jpg
 *      ----
 *      c:\\javaDev\\javaStudy
 */
import java.io.*;
// 164page
public class String_3 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
//        File dir=new File("c:\\javaDev");
//        File[] files=dir.listFiles();
//        for(File f:files)
//        {
//        	if(f.isFile())// 파일인 경우에만 출력 
//        	{
//        	  String name=f.getName();
//        	  String ext=name.substring(name.lastIndexOf(".")+1);
//        	  System.out.println(ext);
//        	}
//        }
		String msg="Hello Java!!";
		//          01234567891011
		System.out.println("a의 위치:"+msg.indexOf("a"));
		// 일반 
		System.out.println("a의 위치:"+msg.lastIndexOf("a"));
		// 경로 / 확장자 
		System.out.println("b의 위치:"+msg.indexOf("b"));
		System.out.println("b의 위치:"+msg.lastIndexOf("b"));
		String ext=msg.substring(msg.lastIndexOf("b")+1);
		System.out.println(ext);
        // 문자열을 사용해서 제어 => 원본은 불변 
	}

}
