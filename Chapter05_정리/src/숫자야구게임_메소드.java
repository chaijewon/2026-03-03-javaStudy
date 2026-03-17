import java.util.Arrays;
import java.util.Scanner;

public class 숫자야구게임_메소드 {
    static int[] getRand()
    {
    	int[] com=new int[3];
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1; // 1~9
			// 중복 체크 
			for(int j=0;j<i;j++) // 첫번째는 검사하지 않는다
			{
				if(com[j]==com[i])
				{
					// com[j] => 기존의 저장된 데이터 
					// com[i] => 지금 발생한 난수 
					i--; // 원상복귀 => 해당 위치의 데이터 다시 저장
					break;
				}
			}
		}
		return com;
    }
    // 사용자 입력 
    static int[] userInput()
    {
    	Scanner scan=new Scanner(System.in);
    	int[] user=new int[3];
    	while(true)
		{
			System.out.print("세자리 정수 입력:");
			int input=scan.nextInt();
			
			// 정상 입력인지 확인 
			if(input<100 || input>999)
			{
				System.err.println("세자리 정수만 입력해야 됩니다");
				// 처음으로 돌아가라
				continue; // while => 조건식으로 이동
			}
			
			// 배열에 저장  => 369/100  369%100 => 69/10 
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			// 같은 수 (X) , 0(X)
			if(user[0]==user[1]|| user[1]==user[2]
					||user[0]==user[2])
			{
				System.err.println("같은 수는 사용할 수 없습니다");
				// 처음으로 돌아가라
				continue; // while => 조건식으로 이동
			}
			
			if(user[0]==0||user[1]==0||user[2]==0)
			{
				System.err.println("0은 사용할 수 없습니다");
				// 처음으로 돌아가라
				continue; // while => 조건식으로 이동
			}
			
			break;// 정상 입력 
		}
    	
    	return user;
    }
    static void compare(int[] com,int[] user)
    {
    	int s=0,b=0;
		for(int i=0;i<3;i++) // com
		{
			for(int j=0;j<3;j++) // user
			{
				if(com[i]==user[j])// 같은 수 찾기
				{
					if(i==j)
						s++; // 같은 자리에 있는 경우
					else
						b++; // 다른 자리에 있는 경우
				}
			}
		}
		hint(s,b,user);
		if(isEnd(s))
		{
			System.out.println("Game Over!!");
			System.exit(0);
		}
    }
    static void hint(int s, int b, int[] user)
    {
    	System.out.print("S:");
		for(int i=0;i<s;i++)
		{
			System.out.print("●");
		}
		System.out.print("\nB:");
		for(int i=0;i<b;i++)
		{
			System.out.print("○");
		}
		System.out.println();
    }
    static boolean isEnd(int s)
    {
    	if(s==3)
    		return true;
    	else
    		return false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] com=getRand();
        //System.out.println(Arrays.toString(com));
        int[] user=new int[3];
        while(true)
        {
        	user=userInput();
        	compare(com, user);
        }
	}

}
