/*
 *    if(조건문)
 *    {
 *       실행문장 => 조건이 true일때 수행문장 
 *    }
 *    
 *    난수 => 3개 
 *    --- 컴퓨터에서 임의로 추출하는 값 
 *    --- 최소값 / 최대값 
 *    
 *    난수 
 *      Math.random() => 0.0 ~ 0.99
 *                       ----------- *100 
 *                       0.0 ~ 99.0 => 정수 변환 0~99 +1  => 1~100
 *      Random r=new Random()
 *      r.nextInt(100) + 1
 *         => 0~99
 */
import java.util.Random; // 이미 만들진 클래스를 가지고 올때 => import
// 자바에서 제공하는 클래스 / 사용자 정의 클래스 
public class 단일조건문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random r=new Random();
        // new : 동적메모리 할당 => heap영역에 저장 => 클래스를 저장할때 사용 
        // 객체 지향 
        int num1=r.nextInt(100)+1;
        //       0~99   ==> +1 ==> 1~100
        int num2=r.nextInt(100)+1;
        int num3=r.nextInt(100)+1;
        // {} 같은 블록에서 변수명이 동일하면 안된다
        /*
         *   변수 => 반드시 초기값 설정 
         *   초기값 
         *    ***1. 명시적 초기값 
         *       int a=10;
         *    2. 입력을 받아서 저장 Scanner 
         *    3. 컴퓨터가 임의의 설정 ==> random 
         *    ***4. 파일 읽기 / 오라클 읽기 
         */
        System.out.println(num1+","+num2+","+num3);
        
        // 요청 처리 => 사용자 
        int max=num1;
        if(max<num2)
        	max=num2;
        if(max<num3)
        	max=num3;
        
        System.out.println("최대값:"+max);
        
        int min=num1;
        
        if(min>num2)
        	min=num2;
        if(min>num3)
        	min=num3;
        
        System.out.println("최소값:"+min);
        
        // 중간값 출력 
        int middle=num1+num2+num3-max-min;
        System.out.println("중간값:"+middle);
        
        // 최대값 / 최소값 => 비교하는 데이터를 대입 
        //  0 (작은 값)      100(가장 큰값)
        // => 빈도수 구하기 => point(등급)
	}

}
