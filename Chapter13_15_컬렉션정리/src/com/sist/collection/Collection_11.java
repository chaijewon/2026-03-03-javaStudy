package com.sist.collection;
import java.util.*;
import java.io.*;
class Data
{
    static Map<String,String> fData=new HashMap<String,String>();
    static 
    {
    	try
    	{
    		FileReader fr=
    				new FileReader("c:\\javaDev\\string.txt");
    		String data="";
    		int i=0;
    		while((i=fr.read())!=-1)
    		{
    			data+=(char)i;
    		}
    		fr.close();
    		//System.out.println(data);
    		String[] datas=data.split("\n");
    		for(String s:datas)
    		{
    			StringTokenizer st=new StringTokenizer(s,":");
    			fData.put(st.nextToken(), st.nextToken());
    		}
    	}catch(Exception ex){}
    }
}
public class Collection_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Data d=new Data();
         Scanner scan=new Scanner(System.in);
         System.out.print("과일명 입력:");
         String f=scan.next();
         if(Data.fData.containsKey(f))
         {
        	 String en=Data.fData.get(f);
        	 System.out.println(f+"에 대한 영어는 "+en);
         }
         else
         {
            System.out.println("영어 사전에 존재하지 않습니다");
         }
	}

}
