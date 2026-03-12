/*
 *   ★★★★★
 *   ★★★★★
 *   ★★★★★
 *   ★★★★★
 *   ★★★★★  => 줄수 5 / ★ => 5
 *   
 *   ABCD
 *   EFGH
 *   IJKL
 *   MNOP  줄수 = 4 출력 = 4 
 *   
 *   ABCD
 *   ABCD
 *   ABCD
 *   ABCD
 */
public class 제어문_중첩반복문_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        for(int i=1;i<=5;i++)
//        {
//        	for(int j=1;i<=5;j++)
//        	{
//        		System.out.print("★");
//        	}
//        	System.out.println();
//        }
		
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=4;j++)
			{
				char c='A';
				System.out.print(c++);
			}
			System.out.println();
		}
		  
	}

}
