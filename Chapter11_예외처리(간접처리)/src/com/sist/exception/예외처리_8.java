package com.sist.exception;
// 사용자 정의 예외처리 
class MyException extends Exception
{
	private String msg;
	public MyException(String msg)
	{
		super(msg);
	}
}
/*
 *    [0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}.[0-9]{1,3}
 *    127.0.0.1
 *    236.63
 */
public class 예외처리_8 {

	// 생성자  new 
	// catch => throw
	// 우선 => if~else => 정규식 
	// [0-9] [가-힣] [A-Za-z] 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        char c='A';
        try
        {
        	if(c>='A' && c<='Z')
        	{
        		throw new MyException("소문자만 입력이 가능합니다");
        	}
        }catch(MyException e)
        {
        	System.out.println(e.getMessage());
        }
	}

}
