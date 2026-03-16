/*
 *   프로그램 
 *   
 *      => 데이터 저장 : 관리 (묶어서 관리 => 배열) 
 *      => 명령문 : 명령어를 모아서 관리 => 메소드 
 *      ------------------------------------ + 객체지향 
 *      기능별 분리 
 *      
 *      => 선언부 : 리턴형 메소드명(매개변수)
 *                            | 사용자 입력값 
 *                | 처리 결과값 : 한개만 사용이 가능 => 배열/클래스 
 *         구현부 {구현}
 *         
 *      1) 난수를 발생 (1~100)
 *      2) 난수를 맞추기 
 *         1. 입력 
 *         2. 비교 
 *      3) 힌트 
 *      4) 종료
 *      기능 세분화 => 재사용 / 가독성 / 중복 제거 
 *      
 */
import java.util.*;
public class 메소드_1 {
    // 난수 
	static int rand()
	{
		int com=(int)(Math.random()*100)+1;
		return com;
	}
	// 사용자 입력 
	static int input()
	{
		Scanner scan=new Scanner(System.in);
		int user=0;
		while(true) 
        {
        	System.out.print("1~100 사이의 정수 입력:");
        	user=scan.nextInt();
        	
        	if(user<1 || user>100)
        	{
        		System.out.println("잘못된 입력입니다!!");
        		continue; 
        		// while => 조건식 이동 (처음부터 다시 시작)
        		// for => 증가식 => 제외 
        	}
        	break;
        }
		return user;
	}
	// 비교
	static void compare(int com,int user)
	{
		Scanner scan=new Scanner(System.in);
    	// 비교 
    	if(com>user)
    	{
    		System.err.println("입력값보다 높은 수를 입력하세요");
    	}
    	else if(com<user)
    	{
    		System.err.println("입력값보다 작은 수를 입력하세요!!");
    	}
    	else
    	{
    		
    		System.out.print("게임을 다시 할까요?(y/n):");
    		char c=scan.next().charAt(0);
    		if(c=='y'||c=='Y')
    		{
    			System.out.println("새로운 게임을 시작합니다");
    			process();
    		}
    		else
    		{
    		   System.out.println("Game Over!!");
    		   System.exit(0);// => 프로그램 자체 종료 
    		}
    	}
	}
	// 메소드는 호출했을 경우 => 메소드 처음부터 수행 
	static void process()
	{
		int com=rand();// 난수 
		while(true)
		{
			int user=input();
			compare(com, user);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		process();
//        Scanner scan=new Scanner(System.in);
//        int com=(int)(Math.random()*100)+1;
//        
//        while(true) 
//        {
//        	System.out.print("1~100 사이의 정수 입력:");
//        	int user=scan.nextInt();
//        	
//        	if(user<1 || user>100)
//        	{
//        		System.out.println("잘못된 입력입니다!!");
//        		continue; 
//        		// while => 조건식 이동 (처음부터 다시 시작)
//        		// for => 증가식 => 제외 
//        	}
//        	
//        	// 비교 
//        	if(com>user)
//        	{
//        		System.err.println("입력값보다 높은 수를 입력하세요");
//        	}
//        	else if(com<user)
//        	{
//        		System.err.println("입력값보다 작은 수를 입력하세요!!");
//        	}
//        	else
//        	{
//        		System.out.println("Game Over!!");
//        		break; // while 종료 
//        		// System.exit(0) => 프로그램 자체 종료 
//        	}
//        }
	}

}
