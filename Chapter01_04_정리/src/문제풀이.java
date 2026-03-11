import java.util.Scanner;
public class 문제풀이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	 1) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 양수인지 음수인지 판별하여 출력하라
	 // if~else 
	 /*
	  *   if(양수면)
	  *   {
	  *   }
	  *   else
	  *   {
	  *      음수 
	  *   }
	  */
	   Scanner scan=new Scanner(System.in);
	   System.out.print("정수 입력:");
	   int num=scan.nextInt();
	   // 조건을 만든다 
	   /*
	    *   비교 연산자 
	    *   => 포함 여부 ===> &&
	    *   => 미포함 여부 ==> ||
	    *   
	    *   if => 원하는 데이터 : 유효성 검사 
	    *         프로그램의 필요한 데이터 
	    */
	   if(num>0)
	   {
		   System.out.println(num+"는 양수입니다");
	   }
	   else if(num<0)
	   {
		   System.out.println(num+"는 음수입니다");
	   }
	   else
	   {
		   System.out.println(num+"는 0입니다");
	   }
//	 2) 한 개의 정수를 입력 받아 3의 배수인지 판별하여 출력하라

//	  => 3의 배수인 경우
	 

//	  => 3의 배수가 아닌 경우
	  System.out.print("정수 입력:");
	  num=scan.nextInt();
	  
	  if(num%3==0)
	  {
		  System.out.println("3의 배수입니다");
	  }
	  else
	  {
		  System.out.println("3의 배수가 아닙니다");
	  }

//	3) Scanner 클래스를 이용하여 한 개의 정수를 입력 받아 정수의 절대값을 출력하라
      System.out.print("정수 입력:");
      num=scan.nextInt();
      if(num<0)
      {
    	  System.out.println(num*-1);
      }
      else
      {
    	  System.out.println(num);
      }
	  System.out.println(Math.abs(num));// 절대값을 가지고 오는 메소드
//	4) 년도를 입력 받아 윤년인지 아닌지를 판별하는 방법을 if~else문으로 사용하라
       // 1. 4년마다 => year%4==0
	   // 2. 100년마다 제외 => year%100!=0
	   // 3. 400년마다 => year%400==0
	   System.out.print("년도 입력:");
	   int year=scan.nextInt();
	   
	   if((year%4==0 && year%100!=0)||(year%400==0))
	   {
		   System.out.println("윤년");
	   }
	   else
	   {
		   System.out.println("평년");
	   }

	 

//	5) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//	   60점 이하면 F를 출력하라 (다중 if 사용)
	   System.out.print("점수 입력:");
	   int score=scan.nextInt();
	   if(score>=90)
		   System.out.println("A");
	   else if(score>=80)
		   System.out.println("B");
	   else if(score>=70)
		   System.out.println("C");
	   else if(score>=60)
		   System.out.println("D");
	   else
		   System.out.println("F");

//	6) 100점 만점으로 성적을 입력 받아 90~100이면 A,80~89이면 B,70~79이면 C, 60~69이면 D,
//	   60점 이하면 F를 출력하라 (switch~case 사용)
	   
	   String op=switch(score/10) {
	   case 9,10->"A";
	   case 8->"B";
	   case 7->"C";
	   case 6->"D";
	   default -> "F";
	   };
	   System.out.println(op);
//	7) 정수 2개와 연산자(+,-,*,/)를 입력 받아 사칙 연산하는 프로그램을 만들어라 
//	   (switch~case 사용) 
       System.out.print("첫번째 정수:");
       int num1=scan.nextInt();
       System.out.print("연산자 (+,-,*,/):");
       op=scan.next();
       System.out.print("두번째 정수:");
       int num2=scan.nextInt();
       
       //  => break포함 
       // 124page
       switch(op)
       {
       case "+"->System.out.println(num1+num2);
       case "-"->System.out.println(num1-num2);
       case "*"->System.out.println(num1-num2);
       case "/"->
          {
        	  if(num2==0)
        		  System.out.println("0으로 나눌 수 없습니다");
        	  else
        	      System.out.println(num1/num2);
          }
       default->System.out.println("연산자가 존재하지 않습니다");
       }
	 

//	8) 2+4+6+....100까지의 정수의 합을 구하고 출력하라 (for 사용)

	 int sum=0;
	 for(int i=2;i<=100;i+=2)
	 {
		 sum+=i;
	 }
	 System.out.println("sum="+sum);

//	9) 5,10,15,20,25,30,35,40,45,50을 출력하는 프로그램을 만들어라 (for 사용)
     for(int i=5;i<=5;i+=5)
     {
    	 System.out.println(i);
     }
     
     // i++ (1개) i+=2 (2개) i+=3
	 
//	10) B,D,F,H,J,L,N을 출력하는 프로그램을 작성하라 (for 사용)
	    for(char c='B';c<='N';c+=2)
	    {
	    	System.out.print(c+" ");
	    }
//	11) 한 개의 정수를 입력 받아 1부터 입력 받은 정수까지의 합을 출력하라
        sum=0;
        System.out.print("정수입력:");
        int val=scan.nextInt();
        
        for(int i=1;i<=val;i++)
        {
        	sum+=i;
        }
        System.out.println("sum="+sum);
	 

//	12) 1부터 30까지의 정수에서 짝수만 한 줄에 3개씩 출력하라
	 
        for(int i=1;i<=30;i++)
        {
        	if(i%2==0) // 짝수
        	{
        		if(i%3==0)
        		{
        			System.out.println();
        		}
        		System.out.print(i+" ");
        		
        	}
        }
        
//	13) 1-2+3-4+5-6+7-8+9-10 계산 값을 for문을 이용하여 출력하라 
        sum=0;
        for(int i=1;i<=10;i++)
        {
        	if(i%2==0)
        		sum-=i;
        	else
        		sum+=i;
        }
        System.out.println("sum="+sum);	 

//	14) 1~10 사이의 숫자 중 3의 배수를 제외하고 출력하라 (continue 사용)
        for(int i=1;i<=10;i++)
        {
        	if(i%3==0)
        		continue;
        	System.out.print(i+" ");
        }
	 

//	15)	Scanner 클래스를 이용하여 2자리의 정수(10~99사이)를 입력받고,
//	십의 자리와 1의 자리가 같은 지 판별하여 출력하는 프로그램을 작성하라.
    
//	결과)
//	2자리수정수입력(10~99) >> 77 
//	10의자리와 1의자리가같습니다.

//	16)	숫자를 입력받아 3~5는 봄, 6~8은 여름, 9~11은 가을, 12,1,2는 겨울, 그 외의 숫자를 입력한 경우 잘못입력을 출력하는 프로그램을 작성하라. if-else 문과 switch 둘 다 이용해 볼 것.
//
//	결과)
//	달을입력하세요(1~12) >> 9
//	가을


//	17)	1에서 100까지 3의 배수를 더하는 while 문의 빈칸에 적절한 코드를 삽입하라.
//	 
//	int sum=0, i=1;
//	while (i<100) {
//	if(i%3 != 0) {
//	i++;
//	        _continue________;
//	    }
//	else sum += i;
//	i++;
//	}
//	18)	1에서 50까지의 합을 더하는 while 문이다. 빈칸에 적절한 코드를 삽입하라.
//		publicstaticvoidmain(String[] args){
//			int sum=0,i=1;
//			while (true) {
//			if(_______) break;
//			sum+=i;
//			i++;  
//			} 
//			System.out.println(sum);
//		}
//
//
//
	}

}
