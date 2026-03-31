package com.sist.lang;
import java.lang.reflect.Method;
import java.util.*;
class Controller
{ 
	@RequestMapping("1")
	public void aaa() {
		System.out.println("Controller:aaa() Call...");
	}
	@RequestMapping("2")
	public void bbb() {
		System.out.println("Controller:bbb() Call...");	
	}
	@RequestMapping("3")
	public void ccc() {
		System.out.println("Controller:ccc() Call...");
	}
	@RequestMapping("4")
	public void ddddgdgdg() {
		System.out.println("Controller:ddd() Call...");
	}
	@RequestMapping("5")
	public void eeeddgdgdg() {
		System.out.println("Controller:eee() Call...");
	}
}
public class Wrapper_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        //Controller c=new Controller();
        /*System.out.print("aaa(1),bbb(2),ccc(3),ddd(4),eee(5):");
        int no=scan.nextInt();
        if(no==1)
        	c.aaa();
        else if(no==2)
        	c.bbb();
        else if(no==3)
        	c.ccc();
        else if(no==4)
        	c.ddd();
        else if(no==5)
        	c.eee();*/
        try
        {
        	Class clsName=Class.forName("com.sist.lang.Controller");
        	Object obj=clsName.getDeclaredConstructor().newInstance();
        	
        	Method[] methods=clsName.getDeclaredMethods();
        	
        	System.out.println("1~5입력:");
        	String no=scan.next();
        	
        	for(Method m:methods)
        	{
        		RequestMapping rm=m.getAnnotation(RequestMapping.class);
        		if(rm.value().equals(no))
        		{
        			m.invoke(obj, null);
        		}
        	}
        	
        	
        }catch(Exception ex) {}
	}

}
