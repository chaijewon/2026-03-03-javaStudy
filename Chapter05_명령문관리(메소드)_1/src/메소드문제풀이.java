/*
 *   사용자로부터 아이디를 받아서 중복체크하는 메소드 원형을 작성하시오
 *   static boolean idCheck(String id)
     우편번호를 검색하는 메소드 원형을 작성하시오
     static String[] postFind(String dong)
     static void postFind(String dong)
     2단에서 9단까지 구구단을 출력하는 메소드 원형을 작성하시오
     static void gugudan()
 */

import java.util.Arrays;
import java.util.Scanner;

public class 메소드문제풀이 {
//	1. 1~10까지 출력하는 메소드 구현 => 출력 (void)
	static void print()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
	}
//	2. 1~10까지 합을 구하는 메소드 구현 => 리턴형이 존재 
	static int print2()
	{
		int sum=0;
		for(int i=1;i<=10;i++)
		{
			sum+=i;
		}
		return sum;
	}
//	3. 1~n까지 합을 구하는 메소드 구현 ==> n 매개변수 
	static int print3(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum+=i;
		}
		return sum;
	}
//	4. 두 정수를 나눗셈 결과를 구해주는 메소드 구현 
	// => 매개변수 2 / 리턴형 String
	static String print4(int a,int b)
	{
		// 나누기 => 예외처리 => 0으로 나누기 
		String result="";
		if(b==0)
			result="0으로 나눌 수 없습니다";
		else
			result=a+"/"+b+"="+(a/(double)b);
		return result;
	}
//	5. 문자열의 소문자를 대문자로 바꿔주는 메소드 구현
	static char change(char c)
	{
		//
		//Character.toUpperCase(c); // 대문자 
		//Character.toLowerCase(c); // 소문자
		// 라이브러리 + 사용자 정의 = 조립
		//           ---------  ----
		return (char)(c-32); // 97-32 = 65
		// 차이가 32
	}
//	6. 문자열을 거꾸로 출력하는 메소드 구현
	// 그림을 거꾸로 출력하는 프로그램을 출력하시오 : 코딩 테스트 
	/*
	 *    FileInputStream fis=
	 *        new FileInputStream("파일의 경로명")
	 *    byte[] buffer=new byte[4096];
	 *    
	 *    for(int i=buffer.lenght-1;i>=0;i--)
	 *    {
	 *       System.out.println(buffer[i])
	 *    }
	 */
    static void change(String msg)
    {
    	// 문자열을 뒤에서부터 읽기 
    	for(int i=msg.length()-1;i>=0;i--)
    	{
    		System.out.print(msg.charAt(i));
    	}
    }
//	정수를 입력 받아서 이진법을 출력하는 메소드 작성(3개의 메소드)
//	정수 입력 
//	이진법 처리
    // 입력받는 메소드
    static int input()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("정수 입력(0~32767);");
    	return scan.nextInt();
    }
    static int[] binary(int num)
    {
    	int[] b=new int[16];
    	int index=15;
    	while(true)
    	{
    		b[index]=num%2;
    		num/=2;
    		if(num==0) break;
    		index--;
    	}
    	return b; // 배열명
    }
//	출력 
    static void print5(int[] arr)
    {
    	for(int i=0;i<arr.length;i++)
    	{
    		if(i%4==0 && i!=0)
    			System.out.print(" ");
    		System.out.print(arr[i]);
    	}
    }
//	임의의 정수를 배열로 생성해서 입력하고 정렬하는 프로그램 작성
//	임의의 정수 입력 (배열 생성후)
    static int[] init()
    {
    	int[] arr=new int[5];
    	for(int i=0;i<arr.length;i++)
    	{
    		arr[i]=(int)(Math.random()*100)+1;
    	}
    	return arr;
    }
//	정렬 처리
    static int[] sort(int[] arr)
    {
    	for(int i=0;i<arr.length-1;i++)
    	{
    		for(int j=i+1;j<arr.length;j++)
    		{
    			if(arr[i]>arr[j])
    			{
    				int temp=arr[i];
    				arr[i]=arr[j];
    				arr[j]=temp;
    			}
    		}
    	}
    	return arr;
    }
//	출력 
    static void print6(int[] arr)
    {
    	System.out.println(Arrays.toString(arr));
    }
//	년도를 입력 받아 윤년여부를 확인하는 프로그램 작성
//	년도 입력 메소드
    static int inputYear()
    {
    	Scanner scan=new Scanner(System.in);
    	System.out.println("년도 입력:");
    	return scan.nextInt();
    }
//	윤년 처리 
    static boolean isYear(int year)
    {
    	if((year%4==0 && year%100!=0)||(year%400==0))
    		return true;
    	else 
    		return false;
    }
//	출력 
    static void print7(boolean b)
    {
    	if(b==true)
    		System.out.println("윤년입니다");
    	else
    		System.out.println("윤년이 아닙니다");
    }

    // 1. 사용자 입력 
    // 2. 기능처리 
    // 3. 화면 출력 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=inputYear();
		boolean b=isYear(year);
		print7(b);
        // print();
		//int sum=print2();
		//System.out.println("sum="+sum);
		//int sum=print3(100);
		//System.out.println("sum="+sum);
		//change("Hello Java!!");
		//int num=input();
		//int[] arr=binary(num);
		//print5(arr);
		//int[] arr=init();
		//int[] arr2=sort(arr);
		//print6(arr2);
		
	}

}
