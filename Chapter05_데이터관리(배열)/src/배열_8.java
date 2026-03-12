// => 컴퓨터 => 가위바위보 10 => 10 => 2승 2무 6패 
import java.util.*;
public class 배열_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int win=0,lose=0,same=0;
        String[] res={"가위","바위","보"};
        Scanner scan=new Scanner(System.in);
        /*
         *    C     U
         *    0     0 => 0 비겼다
         *          1 => U (-1)
         *          2 => -2 => C
         *    1     0 => 1 => C
         *          1 => 0
         *          2 => -1 (U)
         *    2     0 => 2 (U)
         *          1 => 1 (C)
         *          2 => 0
         *          
         *          1 -2 => C
         *          -1 2 ==> U 
         */
        for(int i=0;i<10;i++)
        {
        	int com=(int)(Math.random()*3);
        	System.out.print("가위(0),바위(1),보(2):");
        	int user=scan.nextInt();
        	if(user<0 || user>2)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		i--; // 10게임 
        		continue; // i++ 증가식으로 이동 
        	}
        	System.out.println("컴퓨터:"+res[com]);
        	System.out.println("사용자:"+res[user]);
        	
        	int r=com-user;
        	if(r==-1 || r==2)
        	{
        	    System.out.println("승");
        		win++;
        	}
        	else if(r==1 || r==2)
        	{
        	    System.out.println("패");
        		lose++;
        	}
        	else
        	{
        		System.out.println("무");
        		same++;
        	}
        }
        System.out.printf("결과:%d승-%d무-%d패\n",win,same,lose);
//        int com=(int)(Math.random()*3); // 0 1 2
//        Scanner scan=new Scanner(System.in);
//        System.out.print("가위(0),바위(1),보(2):");
//        int user=scan.nextInt();
//        System.out.println("컴퓨터:"+res[com]);
//        System.out.println("사용자:"+res[user]);
//        if(com==0)
//        	System.out.print("가위");
//        else if(com==1)
//        	System.out.print("바위");
//        else if(com==2)
//        	System.out.print("보");
//        System.out.println("===== 결과값 ======");
//        int r=com-user;
//        if(r==-1 || r==2)
//        	System.out.println("User Win!!");
//        else if(r==1 || r==-2)
//        	System.out.println("Computer Win!!");
//        else
//        	System.out.println("비겼다!!");
	}

}
