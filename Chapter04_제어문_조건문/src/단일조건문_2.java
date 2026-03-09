/*
 *   메뉴처리 
 */

import java.util.Scanner;

public class 단일조건문_2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        System.out.println("====== 메뉴 ======");
        System.out.println("1. 영화 목록");
        System.out.println("2. 뮤직 목록");
        System.out.println("3. 맛집 목록");
        System.out.println("4. 레시피 목록");
        System.out.println("=================");
        System.out.print("메뉴 선택:");
        Scanner scan=new Scanner(System.in);
        int menu=scan.nextInt();
        // 버전 상승 => 경고 (17버전) => 21버전 
        if(menu==1)
        {
        	Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://cgv.co.kr");
        	
        }
        if(menu==2)
        {
        	Runtime.getRuntime().exec("C:\\Program Files\\Google\\Chrome\\Application\\chrome.exe http://genie.co.kr");
        }
	}

}
