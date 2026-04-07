package com.sist.io;
/*     ---------------------------- (X)
 *     |                          |
 *    브라우저  ======  자바 ====== 오라클
 *    ------                     -----SQL
 *    HTML/XML (자바는 일반 텍스트) 
 *      |
 *    처리 : 자바스크립트  VueJS 
 *    
 *    ---------------
 *    1. CRUD 
 *       회원가입 / 로그인 / 회원 수정 / 회원 탈퇴 
 *       ---------------------------------
 *       게시판 
 *       검색 / 상세보기 / 사원,관리자 
 *    2. 네트워크 : 채팅 
 *    ------------------------------------                
 */
import java.io.*;
public class IO_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	//1. 파일 목록 
        	File dir=new File("c:\\javaDev");
        	File[] list=dir.listFiles();
        	for(File f:list)
        	{
        		if(f.isFile()) // 파일이면 
        		{
        		   String len=f.length()/1024>0?
        				     (f.length()/1024)+"KB":f.length()+"Bytes";
        		   System.out.println(f.getName()+" "
        				   +len);
        		}
        		if(f.isDirectory()) // 디렉토리면 
        		{
        			System.out.println(f.getName()+" DIR");
        		}
        	}
        }catch(Exception ex){}
	}

}
