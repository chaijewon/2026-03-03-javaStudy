import java.util.*;
public class 문제13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		for(int i=1;i<=30;i++)
//        {
//        	if(i%2==0) // 짝수
//        	{
//        		
//        		System.out.printf("%2d\t",i);
//        		if(i%3==0)// 3개 출력후에 다음에 내린다
//        		{
//        			System.out.println();
//        		}
//        	}
//        }
//		for(int i=1;i<=10;i++)
//        {
//        	if(i%3==0)
//        		continue;// 제외 
//        	System.out.print(i+" ");
//        }
//		System.out.println();
//		Scanner scan=new Scanner(System.in);
//		int num=0;
//		while(true)
//		{
//			System.out.print("10~99 사이의 정수 입력:");
//			num=scan.nextInt();
//			if(num<10 || num>99)
//				continue;// 처음으로 다시 수행
//			break; // 10~99 입력이 된 경우
//		}
//		// 35
//		int a=num/10; // 3
//		int b=num%10; // 5
//		
//		//if(num%11==0)
//		if(a==b)
//		{
//			System.out.println("10의자리와 1의 자리가 같습니다.");
//		}
//		else
//		{
//			System.out.println("10의자리와 1의 자리가 같지않습니다.");
//		}
//		
		Scanner scan=new Scanner(System.in);
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		switch(month) {
		case 12,1,2->System.out.println("겨울");
		case 3,4,5->System.out.println("봄");
		case 6,7,8->System.out.println("여름");
		case 9,10,11->System.out.println("가을");
		default->System.out.println("없는 달입니다");
		}
		
		int sum=0,i=1;
		while (true) {
		if(i>50) break;
		sum+=i;
		i++;  
		} 
		System.out.println(sum);
	}

}
