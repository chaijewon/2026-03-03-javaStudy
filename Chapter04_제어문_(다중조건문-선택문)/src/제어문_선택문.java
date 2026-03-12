/*
 *    선택문 => 다중 조건문을 단순화
 *            복잡한 소스코딩에서 주로 사용 
 *            -------- 게임 / 네트워크
 *                     |===> 복잡도 
 *    형식)
 *         switch(정수/문자/문자열)  ===> boolean / double (X)
 *         {
 *           case "+": => if
 *               처리문장 
 *               break; ===> 종료 
 *           case "-": => else if
 *               처리문장 
 *               break; ===> 종료 
 *           ...
 *           ...
 *           default: 처리 ===> else
 *         }
 *         
 *         switch(정수/문자/문자열)  ===> boolean / double (X)
 *         {
 *           case "+" -> 처리문장;  자동으로 break => break를 생략한다 
 *           case "-" -> 처리문장;
 *           ...
 *           ...
 *           default: 처리 ===> else
 *         }
 */
import java.util.Scanner;
public class 제어문_선택문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
        // 1. 입력받는 준비 
		Scanner scan=new Scanner(System.in);
		// System.in => 키보드 입력값 => 받아서 메모리에 저장하는 역할 
		// => API => 자바에서 제공 
		// 1.첫번째 숫자 
		System.out.print("첫번째 정수 입력:");
		int num1=scan.nextInt();
		// 2.연산자
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		// 자바에서 입력하는 모든 장치는 char(X) => String
		// Scanner => 단점은 엔터/공백 
		// aaa bbb ccc => enter => 결과값은 aaa => next()
		// => nextLine()
		// => 웹/window => 입력창 
		// 3.두번째 숫자 ===> 저장 ==> 결과값 출력시 읽기 
		System.out.print("두번째 정수 입력:");
		int num2=scan.nextInt();
		
		// 처리 => 다중조건문 => 선택문
//		switch(op)
//		{
//		case "+":
//			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
//			break; // switch 종료 
//		case "-":
//			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
//			break; // switch 종료
//		case "*":
//			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
//			break; // switch 종료
//		case "/":
//			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
//			break; // switch 종료
//		default: System.out.println("없는 연산자입니다");
//		}
		// : + break ===> -> 
		switch(op)
		{
		case "+","%" -> {
			System.out.printf("%d+%d=%d\n",num1,num2,num1+num2);
			System.out.println("프로그램 종료");}
		case "-" ->
			System.out.printf("%d-%d=%d\n",num1,num2,num1-num2);
			
		case "*" ->
			System.out.printf("%d*%d=%d\n",num1,num2,num1*num2);
			
		case "/" ->
			System.out.printf("%d/%d=%d\n",num1,num2,num1/num2);
			
		default -> System.out.println("없는 연산자입니다");
		}
	}

}
