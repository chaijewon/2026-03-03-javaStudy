package com.sist.io;
import java.io.*;
public class Buffered_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileReader fr=null;
        try
        {
        	long start=System.currentTimeMillis();
        	fr=new FileReader("c:\\javaDev\\movie.txt");
        	int i=0;
        	StringBuilder sb=
        			new StringBuilder();
        	while((i=fr.read())!=-1)
        	{
        		sb.append((char)i);
        	}
        	long end=System.currentTimeMillis();
        	System.out.println(sb.toString());
        	System.out.println("수행시간:"+(end-start)+"MS");
        }catch(Exception ex)
        {
        	ex.printStackTrace();
        }
        finally
        {
        	try
        	{
        		fr.close();
        	}catch(Exception ex) {}
        }
	}

}
