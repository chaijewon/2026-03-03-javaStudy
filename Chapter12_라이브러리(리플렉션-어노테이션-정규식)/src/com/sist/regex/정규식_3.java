package com.sist.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

// 1번이상 반복 => +   ==> \\+   \\*   \\|
// 기호 => 기호로 사용하지 않고 기호 자체 ==> \\
public class 정규식_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("heeeeeeeeeeeello".matches("he+llo"));
        // e가 한번이상 반복하고 있는지 ...
        System.out.println("he".matches(".."));
        System.out.println("he".matches("h*."));
        System.out.println("he".matches("he*"));
        System.out.println("he".matches("h+e+"));
        // /watch\\?v=[^가-힣]+
        // /watch\\?v= => 특수문자 / 알파벳 / 숫자 
        /*try
        {
        	// "/watch?v=zhHB4dZTChw\u0026list=RDEMx7c7aUeA3pXjMUyyYhSJQg\u0026start_radio=1"
        	Document doc=
        			Jsoup.connect("https://www.youtube.com/results?search_query=%ED%82%A4%ED%82%A4").get();
        	Pattern p=Pattern.compile("/watch\\?v=[^가-힣]+");
        	Matcher m=p.matcher(doc.toString());
        	while(m.find())
        	{
        		String s=m.group();
        		s=s.substring(s.indexOf("=")+1,s.indexOf("\""));
        		System.out.println(s);
        	}
        }catch(Exception ex){}*/
	}

}
