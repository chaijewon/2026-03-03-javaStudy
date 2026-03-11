/*
 *    1. 형식 
 *       초기값 ------------ 1
 *       do
 *       {
 *           실행문장 ------- 2 ==> 한번은 반드시 실행 
 *           증가식  -------- 3
 *       }while(조건식);----- 4 
 *       
 *       int i=1
 *       do
 *       {
 *          System.out.println(i) 1 2 3 4 5
 *          i++; ==> i=2 i=3 i=4 i=5 i=6=>false종료
 *       }while(i<=5); => 증가후에 조건 검색 
 *       // 자바 웹에서 거의 사용 빈도가 적다 
 *       // 비트이동연산자 / 비트연산자 / do~while => 웹에서는 사용하지 않는다
 *       
 *       
 *       continue : 조건식으로 이동 
 *                  ------------
 *                  while , do~while => 무한루프에 빠진다 
 *       int i=1;
 *       while(i<=10)
 *       {
 *          if(i==2)
 *            continue;
 *          System.out.println(i);  1
 *          i++;
 *       }
 */

import javax.swing.JOptionPane;
/*
 *   초기값 
 *     => 지역변수 (반드시 초기화) 
 *        = Scanner 
 *        = 명시적 처리 
 *        = JOptionPane 
 *        = Random
 *   연산처리 
 *   프로그램 제어
 *   결과값 출력 ******
 */
public class 제어문_반복문_dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        int i=1;
//        while(i<=10)
//        {
//        	if(i==2)
//        		continue;
//        	System.out.println(i);
//        	i++;
//        }
//        System.out.println("종료");
		// 1~10까지 
		int i=1; // 초기값 => while,do~while문은 초기값이 외부에 있다 
		do
		{
			System.out.print(i+" ");//반복문장
			i++; // 증가식 
		}while(i<=10); //조건식 
		System.out.println();
		char c='A';
		do
		{
			System.out.print(c+" ");
			c++;
		}while(c<='Z');
		System.out.println();
		c='0';
		do
		{
			System.out.print(c+" ");
			c++;
		}while(c<='9');
		
		System.out.println();
		
		String s=JOptionPane.showInputDialog("문자열 입력");
		// 글자수 
		System.out.println("입력된 문자열:"+s);
		System.out.println("글자수:"+s.length());
		// A,a가 몇개인지 확인 
		int count=0;
		i=0;
		do
		{
		   	char d=s.charAt(i);
		   	if(d=='A' || d=='a')
		   		count++;
		   	
		   	i++;
		}while(i<s.length());
		
		System.out.println("A,a는 총갯수:"+count);
		
	}

}
