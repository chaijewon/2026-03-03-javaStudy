package com.sist.stream;
// FileOutputStream // 쓰기 
// close() , write()
import java.io.*;
public class Stream_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileInputStream fis=null;
        FileOutputStream fos=null;
        try
        {
        	// 저장 폴더 
        	File dir=new File("c:\\java_data");
        	if(!dir.exists()) // java_data폴더가 있는지 
        	{
        		dir.mkdir();
        	}
        	File file=new File("c:\\java_data\\sawon.txt");
        	if(!file.exists())
        	{
        		file.createNewFile();
        	}
        	fis=new FileInputStream(file);
        	// 자바응용프로그램 <=====> sawon.txt : 읽기
//        	fos=new FileOutputStream(file,true);
//        	// 자바응용프로그램 <=====> sawon.txt : 쓰기
//        	/*fos.write('H');
//        	fos.write('e');
//        	fos.write('l');
//        	fos.write('l');
//        	fos.write('o');*/
//        	String info="홍길동|남자|개발부|서울|대리|4000\n";
//        	fos.write(info.getBytes()); // String => byte[]
//        	// getBytes() 
//        	//          ----- byte
//        	// 클라이언트 ------- 서버
//        	System.out.println("파일 저장 완료!!");
//        	/*
//        	 *  https://www.google.com/search?q=%EC%9E%90%EB%B0%94&oq=%EC%9E%90%EB%B0%94&gs_lcrp=EgZjaHJvbWUyDAgAEEUYORixAxiABDINCAEQABiDARixAxiABDINCAIQABiDARixAxiABDINCAMQABiDARixAxiABDIKCAQQABixAxiABDIHCAUQABiABDIHCAYQABiABDIHCAcQABiABDIHCAgQABiABDIHCAkQABiABNIBCTI0MTVqMGoxNagCArACAQ&sourceid=chrome&ie=UTF-8
//        	 *  자바=%EC%9E%90%EB%B0%94
//        	 */
        	int i=0;
        	while((i=fis.read())!=-1)
        	{
        		System.out.print((char)i);
        	}
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fis.close();
        		fos.close();
        	}catch(Exception ex) {}
        }
	}

}
