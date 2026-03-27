package com.sist.exception;
// finally => return 
public class 예외처리_4 {

	public static int test()
	{
		try
		{
			int a=10/0;
			return 1;
		}
		catch(Throwable ex) // Throwable ex 
		{
			return 2;
		}
		finally
		{
			return 3;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println(test());
	}

}
