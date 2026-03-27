package com.sist.exception;
/*
 *   예외처리 
 *     => 프로그램 실행중에 발생하는 오류 (예외)
 *                      ----------
 *                      => 처리 : 예외처리 
 *                      => 회피 / 복구 
 *     예외 복구
 *       try~catch => 직접 처리 
 *     예외 회피 
 *       throws => 간접 처리
 *     --------------------- 예외처리가 안된 상태 : 에러위치에서 종료
 *     강제 종료를 방지 ... / 정상 수행 유지 
 *     
 *     try
 *     {
 *         정상 수행문장 => 예측 
 *         => 전송
 *     }catch(Excepton e)
 *     {
 *         예측된 에러 처리 => 확인 / 복구
 *         => 전송 => 팝업
 *     }
 *     ==> 웹은 무조건 데이터 전송 
 *     
 *     ==> 0으로 나누기 / 배열 범위 초과 / 정수 변환 / 파일 못찾는다
 *         IP가 틀려서 네트워크 오류 / URL
 *     기타 
 *     finally : 서버,파일 => 닫기 => 생략이 가능 
 *     --------- try/catch 관련없이 무조건 수행 
 *     
 *     ==> throws 
 *     위치 => 메소드 뒤에 
 *     예) 
 *         void display() throws Exception : 선언
 *         {
 *            
 *         }
 *         
 *         display()호출시에 이런 에러 예측 => 
 *                  사용시에는 반드시 예외처리해서 사용해라
 *         try ~ catch / throws 
 *         
 *         => 보통 라이브러리 
 */
// ==> try : 자동으로 닫기 / 멀티 catch 
import java.io.*;
public class 예외처리_1 {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
//        FileReader in=null;
//        try
//        {
//        	in=new FileReader("C:\\Users\\sist\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
//        	int i=0; // 문자 읽기 
//        	while((i=in.read())!=-1)
//        	{
//        		System.out.print((char)i);
//        	}
//        }catch(Exception ex)
//        {
//        	ex.printStackTrace();
//        }
//        finally
//        {
//        	try
//        	{
//        		in.close();
//        	}catch(Exception ex) {}
//        }
		// try-with-resource => Auto Close 1.7 => 사용
		// close가 자동으로 호출 => 파일에서 주로 사용 
		// 소스가 간결하다 : IO시 많이 코드 
		try (FileReader in=new FileReader("C:\\Users\\sist\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java"))
		{
			int i=0;
			while((i=in.read())!=-1)
			{
				System.out.print((char)i);
			}
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}

}
