package com.sist.exception;

import java.lang.reflect.Method;
import java.util.Scanner;

/*
 *    에러가 나는 경우 
 *      => 컴파일시 에러 / 실행시 에러 => JavaScript연동 
 *                      파일이동?page=1
 *                      <a href="파일이동?page=1">
 *         => javac     java
 *      => 1.사용자 입력 => 유효성 검사 => if
 *           => 예외처리 => 선택 
 *           => UnCheckException 
 *         2.개발자 실수 : 예외처리 => 필수
 *           ip(네트워크) , URL , 데이터베이스 연결 
 *           파일명 ...
 *           => CheckException : 컴파일러가 검사 
 *         -------------------------수정이 가능 : 예외 
 *         3.생각하지 못한 에러 
 *         -------------------------에러
 *    예외처리 
 *      => 소스상에서 수정이 가능한 에러 
 *    예외처리 범위 (상속도) 
 *    위로 갈수록 범위가 커진다 
 *    
 *             Object 
 *               |
 *          Throwable : 예외처리의 최상위 
 *               |
 *     -----------------------------
 *     |                           |
 *    Error                      Exception
 *                                 |
 *              --------------------------------------
 *              |                                    |
 *            IOException : 
 *               입출력 = 메모리 , 네트워크 , 파일 
 *                       | 표준 
 *                         System.out
 *                                ----
 *                         System.in
 *            ClassNotFoundException 
 *               리플렉션 : 클래스 정보를 읽어서 
 *                       메모리 할당 / 메소드 호출 / 변수값 지정
 *                       new없이 메모리 할당이 가능 
 *            MalformedURLException : URL주소 
 *            InterrupedException : Thread => 충돌 
 *            => Thread.sleep()
 *            SQLException 
 *            -------------------- 무조건 예외처리를 한다 
 *            -------------------- CheckException
 *     UnCheckException : 선택 조건 
 *          |
 *      RuntimeException
 *      ----------------
 *            |
 *      ArrayIndexOutOfBoundsException : 배열 범위 초과 
 *      NullPointerException : 객체 => null인 경우
 *      ClassCastException : 형변환 
 *      NumberFormatException : 숫자 변환이 안되는 경우 
 *      ArithmaticException : 0으로 나누는 경우
 *      -------------- 1개만 처리 
 *      
 *     ----------------------------------------
 *     2. 예외처리 방법 
 *        1) 직접 처리 => 에러 복구 
 *           try~catch~finally : 가장 많이 사용 
 *        2) 에러 떠맡기기 : 에러 회피 
 *           throws
 *           선언 => 메소드 호출시에 처리해서 사용 
 *           -----------------------------
 *           소스가 완성이 된 상태 => throws
 *        3) 임의 발생 : 테스트 (견고한 프로그램)
 *           throw 
 *        4) 사용자 정의 예외처리 
 *           class My extends Exception
 *           {
 *           }
 *           => throw를 이용해서 호출 
 *       ------------------------------------
 *       = 직접처리 
 *         try
 *         {
 *            // 정상으로 수행하는 문장 
 *            // 일반 => 처리 문장 
 *            // => 예상 : 에러 발생에 대한 
 *            
 *            => 사용자로부터 문자열 정수를 받아서 
 *                         -------- NumberFormatException
 *               배열에 저장 
 *               --------- ArrayIndexOutOfBoundsException
 *               나누기한 값을 출력 
 *               ----- ArithmaticException
 *         }
 *         catch(Exception)
 *         {
 *              기타 (알 수없는 예외가 있는 경우) 
 *         }
 *         catch(NumberFormatException)
 *         {
 *            정수변환 => 
 *         }
 *         catch(ArrayIndexOutOfBoundsException)
 *         {
 *            배열의 범위 초과
 *         }
 *         catch(ArithmaticException)
 *         {
 *             0으로 나눈 경우 
 *         }
 *         ------------ 상위클래스가 항상 밑에 있는다
 *                      순서 
 *         finally
 *         {
 *             무조건 수행하는 문장 
 *             닫기 (파일 , 오라클 , 서버)
 *                  -----------
 *         }
 *          
 *         
 *            
 *            
 *            
 *         
 */
class MyException
{
	public void aaa()
	{
		System.out.println("MyException:aaa() Call");
		//Thread.sleep(100);
	}
	public void bbb()
	{
		System.out.println("MyException:bbb() Call");
	}
	public void ccc()
	{
		System.out.println("MyException:ccc() Call");
	}
}
public class 예외처리_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        try
//        {
//        	Scanner scan=new Scanner(System.in);
//        	System.out.print("입력:aaa,bbb,ccc>>");
//        	String m=scan.next();
//        	Class className=
//        		Class.forName("com.sist.exception.MyException");
//        Object obj=
//         className.getDeclaredConstructor().newInstance();
//          // new MyException()
//          Method[] methods=className.getDeclaredMethods();
//          for(Method mm:methods)
//          {
//        	  if(mm.getName().equals(m))
//        	  {
//        		  mm.invoke(obj, null);// 메소드 호출
//        	  }
//          }
//        	
//        }catch(Exception ex){}
		try
		{
			//Integer.parseInt("10 ");
			int a=10/0;
		}catch(Throwable e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}

}
