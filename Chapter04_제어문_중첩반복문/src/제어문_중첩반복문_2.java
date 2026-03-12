/*
 *    1. 몇줄 출력 => 일차  
 *    2. 내용물 => 이차 
 *    3. 일차 종료 ==> for 종료
 *    
 *    Label:
 *    for()
 *    {
 *      for()
 *      {
 *         if()
 *         {
 *            break Label; ==> 2차만 종료 
 *         }
 *      }
 *      
 *    }
 *    
 *    break / continue => 자신의 반복문만 제어
 *    
 *    for(int i=1;i<=3;i++)
 *    {
 *       for(int j=1;j<=3;j++)
 *       {
 *          출력물
 *       }
 *       줄만들기 
 *    }
 *    
 *    i=1 i<=3 ==> 이차 for j=1 j=2 j=3 ==> i++
 *    i=2 i<=3 ==> 이차 for j=1 j=2 j=3 ==> i++
 *    i=3 i<=3 ==> 이차 for j=1 j=2 j=3 ==> i++
 *    i=4 ==> 종료
 */
public class 제어문_중첩반복문_2 {
    // 순서 => f6 => 실행과정을 멈춤
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int i=1;i<=3;i++)
        {
        	for(int j=1;j<=3;j++)
        	{
        		System.out.println("i="+i+",j="+j);
        	}
        }
	}

}
