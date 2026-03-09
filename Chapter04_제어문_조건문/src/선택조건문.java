/*
 *   프로그램에서는 가장 많이 사용되는 조건문 
 *   
 *   => 조건 : true / false 
 *      단일 조건문은 => true 수행 
 *                    false 건너뛴다 
 *   => 선택 조건문 
 *      true => 처리 
 *      false => 처리 
 *      
 *      형식)
 *           if(조건문)
 *           {
 *              조건 true일때  => 짝수 ,로그인,아이디중복
 *           }
 *           else
 *           {
 *              조건 false일때 => 홀수,로그아웃,아이디중복없음 
 *           }
 *           
 *           출력 : System.out.println() => 세로 (한줄씩)
 *                 System.out.print() => 가로 옆으로 출력 
 */
// => 짝수 / 홀수  => 1~100 
import java.util.Random;
public class 선택조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        int i=r.nextInt(100)+1; // 1~100사이의 정수 추출 
        //    -------------- 1~99
        System.out.println("정수값:"+i);
        
        if(i%2==0) // true 
        	System.out.println(i+"는 짝수입니다");
        else  // false
        	System.out.println(i+"는 홀수입니다");
        
        char c='A';
        if(c>='A' && c<='Z') // A~Z 포함 (&&=>포함) , || => 미포함
        	System.out.println(c+"는 대문자입니다");
        else
        	System.out.println(c+"는 소문자입니다");
        
        // 웹 => 로그인(O),로그인(X)
	}

}





