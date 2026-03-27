package com.sist.exception;
// 에러메세지 => 에러 확인 
/*
 *    public class ArithmeticException extends Exception
 *    {
 *        private String message="/ by zero";
 *        public ArithmeticException(String message)
 *        {
 *           this.message=message;
 *        }
 *        public String getMessage()
 *        {
 *           return message;
 *        }
 *    }
 */
public class 예외처리_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // printStackTrace
		// getMessage
		try
		{
			int a=10; // 
			int b=0;
			if(b==0)
			{
				throw new ArithmeticException("0으로 나눌수 없습니다");
			}
			else
			{
			   System.out.println(a/b);
			}
		}catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
			System.out.println("타입:"+ex.getClass());
			ex.printStackTrace();
		}
	}

}
