// => 10개의 정수를 임의로 추출 => 배열 
// => 최대값 / 최소값 구하기
// index => 위치 , 검색 
import java.util.*;
public class 배열_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr=new int[10];
        // 임의로 추출 (1~100)
        Random r=new Random();
        for(int i=0;i<arr.length;i++)
        {
        	arr[i]=r.nextInt(100)+1;
        }
        // 출력 
        for(int i:arr)
        {
        	System.out.print(i+" ");
        }
        // => 요청 구현 
        System.out.println("\n====== 결과값 =====");
        int max=arr[0];
        int min=arr[0];
        
        for(int i:arr)
        {
        	if(max<i)
        		max=i;
        	
        	if(min>i)
        		min=i;
        }
        
        System.out.println("최대값:"+max);
        System.out.println("최소값:"+min);
        
        // index
        for(int i=0;i<arr.length;i++)
        {
        	if(max==arr[i])
        	{
        		System.out.println("max값은 "+(i+1)+"번째 위치");
        	}
        	if(min==arr[i])
        	{
        		System.out.println("min값은 "+(i+1)+"번째 위치");
        	}
        }
        
	}

}
