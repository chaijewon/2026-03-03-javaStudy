// 1~10 => for => 난수:0~2 사이의 난수 => / 
public class 예외처리_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  //try
	  //{
        for(int i=1;i<=10;i++)
        {
           try
           {
        	int no=(int)(Math.random()*3);
        	System.out.println(i+"."+(i/no));
           }catch(Exception e)
           {
        	   System.out.println(e.getMessage()); // i++
           }
        }
	  //}catch(ArithmeticException e)
	  //{
		  //System.out.println(e.getMessage());
	  //}
	}

}
