package com.sist.io;
/*
 *   객체 단위 저장 
 *   ObjectInputStream / ObjectOutputStream 
 *        | 읽기           | 쓰기 
 *        
 *    1) 직렬화 이용 
 *       --------------
 *         |   |   |  
 *       --------------
 *    2) 역직렬화 이용 
 *       -------
 *       
 *       -------
 *       
 *       -------
 *       
 *       -------
 */
import java.io.*;
// json => 파일 , 업로드 , 다운로드 
// json , properties , xml 
class Student implements Serializable{
	private int hakbun;
	private String name;
	private int kor,eng,math;
	public int getHakbun() {
		return hakbun;
	}
	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
}
public class Object_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student std=new Student();
        std.setHakbun(1);
        std.setName("홍길동");
        std.setKor(90);
        std.setEng(80);
        std.setMath(90);
        
        // 저장  1|홍길동|90|80|90....
        ObjectOutputStream oos=null;
        FileOutputStream fis=null;
        try
        {
        	fis=new FileOutputStream("c:\\java_data\\student.txt");
        	oos=new ObjectOutputStream(fis);
        	oos.writeObject(std);
        	System.out.println("객체단위 저장 완료!!");
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fis.close();
        		oos.close();
        	}catch(Exception ex) {}
        }
        
	}

}
