package com.sist.exception;
import java.io.*;
import java.sql.SQLException;
// IOException => Exception => Throwable
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileReader in=null;
        try
        {
            in=
             new FileReader("C:\\Users\\sist\\git\\java-study\\Chapter11_예외처리_1\\src\\com\\sist\\exception\\예외처리_1.java");
            //
            int i=0;
            while((i=in.read())!=-1)
            {
            	
            	System.out.print((char)i);
            }
        }catch(IOException e)
        {
        	e.printStackTrace();// 에러 위치 확인 
        	// getMessage()
        }
        finally// 생략이 가능 
        {
        	try
        	{
        	  in.close();
        	}catch(Exception e) {}
        }
        /*
         *   try-resource : 자동 닫기 
         *   throws 
         *   throw 
         *   사용자 정의 
         *   --------------------------
         *   
         */
	}

}
