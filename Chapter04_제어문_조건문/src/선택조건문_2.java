/*
 *    윤년 처리  => 년도 입력 => 윤년(O)/윤년(X)
 *    로마시대 => 윤년 / 암호화 
 *    윤년 조건 
 *     1. 4년마다 
 *     2. 100년마다 제외
 *     3. 400년마다 
 *     --------------
 *     (year%4==0)&&(year%100!=0) || (year%400==0)
 *        4년마다      100년마다 제외     400년마다
 *     
 */
import java.util.Scanner; //키보드 입력을 받는 경우 사용 
public class 선택조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        // 키보드 입력값을 받아서 메모리(변수)에 저장 
        // System.in => 입력한 키보드값 ==> 저장 시점은 엔터 
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        System.out.println("입력된 년도:"+year);
        
        // 윤년 여부 확인 
        if((year%4==0 && year%100!=0) || (year%400==0))
        {
        	System.out.println(year+"년도는 윤년입니다");
        }
        else
        {
        	System.out.println(year+"년도는 윤년이 아닙니다");
        }
        
	}

}


