/*
 *    ===> 2차 for의 조건
 *    *
 *    **
 *    ***
 *    ****
 *    -------------------------
 *               i     j
 *              줄수   별표
 *               1     1
 *               2     2
 *               3     3
 *               4     4  ===> j=i
 *              
 *    ****
 *    ***
 *    **
 *    *
 *    -----------------------
 *        줄수   별표
 *        1      4
 *        2      3
 *        3      2
 *        4      1   i+j=5  ==> j=5-i
 *   
 */
public class 제어문_중첩반복문_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=4;i++)
        {
        	// * 출력 
        	for(int j=1;j<=5-i;j++)
        	{
        		System.out.print("*");
        	}
        	System.out.println();
        }
	}

}
