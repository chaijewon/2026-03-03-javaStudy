// 0~9난수 발생 ==> 100개 발생 
// AI 
// 빅데이터 ===> 예측 (AI)

import java.util.Arrays;

public class 빈도수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[45];
        
        // 초기화 
        for(int i=1;i<=1000;i++)
        {
        	int rand=(int)(Math.random()*45); // 0~9
        	arr[rand]++;
        }
        System.out.println(Arrays.toString(arr));
        // 실제 출력 
        for(int i=0;i<arr.length;i++)
        {
        	System.out.println((i+1)+"==>"+arr[i]);
        }
	}

}
