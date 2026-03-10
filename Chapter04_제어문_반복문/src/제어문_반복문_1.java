/*
 *   사용자로부터 단을 받아서 구구단 
 *   5 
 *   5*1=5
 *   ..
 *   5*9=45 
 *   =======> 몇번 => 1차 for ==> 줄수 
 */
import java.util.Scanner;
public class 제어문_반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("단 입력:");
        int dan=scan.nextInt();
        
        // 구구단 처리
        for(int i=1;i<=9;i++)
        {
        	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
        
        System.out.println();// 다음줄에 출력 
        
        for(int i=9;i>=1;i--)
        {
        	System.out.printf("%d * %d = %d\n",dan,i,dan*i);
        }
        
        System.out.println();
        String str="Hello Java";
        //          0123456789 ==> 문자열은 0번부터 (인덱스)
        // 문자 갯수 : str.length()
        for(int i=0;i<str.length();i++)
        {
        	System.out.print(str.charAt(i));
        	//                   --------- 문자 한개 추출 
        }
        
        System.out.println();
        for(int i=str.length()-1;i>=0;i--)
        {
        	System.out.print(str.charAt(i));
        }
        
        System.out.println();
        
        // 변수 
        // 1 대문자 갯수 저장 
        int a=0;
        // 2 소문자 갯수 저장
        int b=0;
        
        for(int i=0;i<str.length();i++)
        {
        	char c=str.charAt(i);// 알파벳을 한개 읽기 
        	if(c>='A' && c<='Z')
        		a++;
        	//if(c>='a' && c<='z')
        	else
        		b++;
        }
        
        System.out.println("대문자:"+a);
        System.out.println("소문자:"+b);
	}

}
