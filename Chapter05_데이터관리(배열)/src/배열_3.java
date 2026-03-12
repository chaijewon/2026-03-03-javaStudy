// 실제 데이터값을 나중에 대입 

import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[5];
        /*
         *   ==> 일반적으로 가장 많이 사용한 선언 형식 
         *   new 사용
         *   int => 0
         *   double => 0.0
         *   boolean => false 
         *   String =>  null
         *   char => '\0'
         *   ==> 자동으로 초기화
         *   ==> 반드시 사용 
         *       -------- 메모리 생성 갯수 
         */
        /*
         *    ---arr---          ---------------------
         *      0x100              0   0   0   0   0
         *    ---------     0x100---------------------
         *    
         */
        // 프로그램에 필요한 데이터를 초기화 
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=(int)(Math.random()*100)+1;
        }
        // 출력 
        /*for(int a:arr)
        {
        	System.out.println(a);
        }*/
        System.out.println(Arrays.toString(arr));
        //Arrays.sort(arr);
        //System.out.println(Arrays.toString(arr));
        // 배열 => 기능별로 묶는다 
        /*
         *   문자열 
         *     이름 / 성별 / 주소 
         *     Sting[] names
         *     String[] sexs
         *     String[] address
         *     ----------------
         *     //String[10][3] info
         */
	}

}
