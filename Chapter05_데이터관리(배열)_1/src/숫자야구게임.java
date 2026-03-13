/*
 *    3개의 숫자를 난수 
 *    -------------
 *    사용자 3개 입력 
 *    ------------- 힌트 
 *    
 *    힌트 
 *    자리수+숫자 => S
 *    숫자 => B
 *    
 *    1. 난수 발생 
 *    ------------------
 *    2. 사용자 입력 
 *    3. 비교 
 *    4. 힌트
 *    5. 정답 => 종료 
 *    ------------------ 반복문 
 */
import java.util.*;
public class 숫자야구게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 난수
        int[] com=new int[3]; // 컴퓨터가 난수값 저장 
        int[] user=new int[3];// 사용자 입력시 
        
        // 난수 발생 => 초기화 
        for(int i=0;i<3;i++)
        {
        	com[i]=(int)(Math.random()*9)+1;//1~9사이의 정수 
        	for(int j=0;j<i;j++)
        	{
        		// j는 이미 배열에 저장된 값
        		// i는 현재 난수값
        		if(com[j]==com[i])
        		{
        			i--;
        			break;
        		}
        	}
        	
        }
        
        // 사용자 입력 받기 
        while(true) // 횟수가 지정안됨 
        {
        	System.out.print("세자리 정수를 입력하세요>>");
        	int input=scan.nextInt();
        	// 잘못된 입력인지 
        	if(input<100 || input>999)
        	{
        		System.out.println("😣 잘못된 입력입니다!!");
        		// 처음으로 이동 
        		continue; // while=>조건식 , for=>증가식
        	}
        	// 배열에 저장 
        	user[0]=input/100;
        	user[1]=(input%100)/10;
        	user[2]=input%10;
        	
        	// 잘못된 입력 => 같은 수를 입력하면 안된다 , 0을 입력하면 안된다
        	if(user[0]==user[1] || user[0]==user[2]
        			|| user[1]==user[2])
        	{
        		System.out.println("😣 같은 수는 사용할 수 없습니다");
        		continue;
        	}
        	if(user[0]==0 || user[1]==0|| user[2]==0)
        	{
        		System.out.println("😣 0은 사용할 수 없습니다");
        		continue;
        	}
        	// 유효성 검사 => 프로그램에 필요한 값이 입력되었는지 확인 
        	// 비교 
        	int s=0,b=0;
        	for(int i=0;i<3;i++)
        	{
        		for(int j=0;j<3;j++)
        		{
        			if(com[i]==user[j]) //같은 수가 있는지 확인
        			{
        				if(i==j)
        					s++;
        				else
        					b++;
        			}
        		}
        	}
        	// 힌트 
        	System.out.printf("Input Number:%d,Result:%dS-%dB\n",
        			input,s,b);
        	if(s==3)
        	{
        		System.out.println("🍾 Game Over!!");
        		break; // while 종료
        	}
        }
        
	}

}
