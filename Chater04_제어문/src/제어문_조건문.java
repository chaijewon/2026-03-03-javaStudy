// 1. 월을 입력 => 계절확인 
// 12 1 2 겨울 
// 3 4 5 봄
// 6 7 8 여름 
// 9 10 11 가을 
import java.util.*;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("월 입력:");
        int no=scan.nextInt();
        // switch => 다중조건문과 동일 
        // => 
        if(no>=1 && no<=12)
        {
	        if(no>=3 && no<=5)
	        	System.out.println("계절은 봄입니다!!");
	        else if(no>=6 && no<=8)
	        	System.out.println("계절은 여름입니다!!");
	        else if(no>=9 && no<=11)
	        	System.out.println("계절은 가을입니다!!");
	        else
	        	System.out.println("계절은 겨울입니다!!");
        }
        else
        {
        	System.out.println("없는 달입니다!!");
        }
	}

}
