/*
 *   1. 경우의 수 
 *   예) 정수 입력 받아서 음수/양수 
 *                   --------  if~else 
 *      문자 입력 => 대문자 / 소문자 
 *                 ------------ if~else
 *      문자 입력 => 대문자 / 소문자 / 한글 / 숫자 
 *                 ------------------------  다중 if~~
 *      메뉴 선택시마다 => 처리 
 *      --------  switch 
 *      로그인 
 *        =아이디가 없는 경우
 *        =비밀번호가 틀린 경우 
 *        =로그인 
 *        -------------------> 다중 / switch
 *        사이트 => 벤치마킹 
 *    2. 문법사항 
 *       조건문 
 *       {
 *          
 *       }
 *    3. 어떤 조건 => 비교연산자 / 논리연산자 / 부정연산자 
 *       ------- 모든 연산이 true/false 
 *       
 *    4. 성적계산 90~100
 *              80~90
 *              70~80
 *              60~70
 *              60이하 
 *              -------- 다중 조건문
 *              case를 줄인다 /10 
 */
import java.util.Scanner;
public class 제어문_다중조건문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("점수 입력(0~100):");
        int score=scan.nextInt();
        
        // 처리 => 학점 ==> ChoiceFormat
        char c='A';
        /*if(score>=90)
        	c='A';
        else if(score>=80)
        	c='B';
        else if(score>=70)
        	c='C';
        else if(score>=60)
        	c='D';
        else
        	c='F';*/
        /*switch(score/10) // 정수/정수=정수
        {
        case 10: 
        case 9:
        	c='A';
        	break;
        case 8:
        	c='B';
        	break;
        case 7:
        	c='C';
        	break;
        case 6:
        	c='D';
        	break;
        default:
        	c='F';
        }*/
        String s=switch(score/10) {
        case 10,9->"A";
        case 8->"B";
        case 7->"C";
        case 6->"D";
        default->"F";
        };
        		
        
        System.out.println("학점:"+s);
        
	}

}
