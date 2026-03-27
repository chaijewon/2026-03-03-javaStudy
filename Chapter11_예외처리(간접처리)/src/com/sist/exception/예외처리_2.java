package com.sist.exception;
// 멀티 catch => 다중 예외처리 
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        try
        {
        	String n1="10";
        	String n2="3";
        	int[] arr={
        		Integer.parseInt(n1),
        		Integer.parseInt(n2)
        	};
        	
        	int res=arr[0]/arr[2];
        	System.out.println(res);
        	// ==> else if : 한개만 수행 
        }catch(NumberFormatException
        		  |ArrayIndexOutOfBoundsException
        		  |ArithmeticException e)
        {
        	e.printStackTrace();
        }
        // => 기본 => catch(Exception e)
//        catch(NumberFormatException e)
//        {
//        	e.printStackTrace();
//        	// NumberFormatException : 정수변환이 안되는 경우
//        }catch(ArrayIndexOutOfBoundsException e)
//        {
//        	e.printStackTrace();
//        	// ArrayIndexOutOfBoundsException 배열범위
//        }catch(ArithmeticException e)
//        {
//        	e.printStackTrace();
//        	//ArithmeticException 0으로 나누는 경우
//        }catch(Exception e) // else
//        {
//        	e.printStackTrace();
//        }
	}

}
