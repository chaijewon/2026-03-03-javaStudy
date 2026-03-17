// trim() => 좌우의 공백 제거 

import java.util.Scanner;

public class String_7_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg=" Hello Java ";
        System.out.println("문자의 갯수:"+msg.length());
        System.out.println("문자의 갯수:"+msg.trim().length());
        // 공백만 제거가 가능
        // "Hello" " Hello " => 공백도 문자 1개 
        // 좌우의 공백만 제거 
        // 아이디 입력 / 비밀번호 입력 
        String id="admin";
        Scanner scan=new Scanner(System.in);
        System.out.print("아이디 입력:");
        String mid=scan.nextLine();
        if(id.equals(mid.trim()))
        {
        	System.out.println("로그인 성공");
        }
        else
        {
        	System.out.println("로그인 실패");
        }
	}

}
