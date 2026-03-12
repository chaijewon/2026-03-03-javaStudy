// 이차 for ==> 배열에서 주로 사용 
/*
 *      *
 *     **
 *    ***
 *   ****
 *-----------------  
 *             i    j     k     i/j   i/k
 *            줄수  공백   별표
 *             1    3     1
 *             2    2     2
 *             3    1     3
 *             4    0     4
 *             
 *            i+j=4  ==> j=4-i 
 *            i=k    ==> k=i
 *            
 *             
 *   ****
 *    ***
 *     **
 *      *
 *--------------------------------
 *               i   j   k
 *              줄수 공백 별표
 *              1    0   4
 *              2    1   3
 *              3    2   2
 *              4    3   1
 *              
 *              j=i-1   i+k=5  ==> k=5-i
 *    *
 *   ***
 *  *****
 * *******
 */
public class 제어문_중첩반복문_6 {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
//        for(int i=1;i<=6;i++)
//        {
//        	int lotto=(int)(Math.random()*45)+1;
//        	Thread.sleep(1000);
//        	System.err.print(lotto+" ");
//        }
		for(int i=1;i<=4;i++)
		{
			// 공백
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			// 별표
			for(int k=1;k<=5-i;k++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
