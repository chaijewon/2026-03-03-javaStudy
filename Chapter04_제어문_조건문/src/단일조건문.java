/*
 *    제어문 : 프로그램을 제어할때 사용 
 *           -------------------
 *           => 건너뛰기 , 원하는 데이터만 출력 
 *           => 반복적으로 수행 
 *           => 반복을 제어 
 *           => 프로그램의 흐름 
 *     1) 제어문의 종류 
 *           단일/선택/for/while/break
 *        1. 조건문 ==> 회원가입 : 아이디중복 / 비밀번호 확인 / 아이디찾기 / 비밀번호 찾기
 *                    로그인 처리 / ID저장 / 자동 로그인 
 *                    에러처리 
 *           단일조건문 
 *              형식) 
 *                   if(조건) ==> 조건은 무조건 true/false만 사용이 가능 
 *                                         -----------
 *                                         | 부정연산자 , 비교연산자 , 논리연산자
 *                   {
 *                      명령문;
 *                      명령문;
 *                   }
 *                   
 *                   => 1.조건 결과가 false면 건너뛴다
 *                   => 2.조건 결과가 true일때 {}안에 있는 명령문을 수행 
 *                   => 3.독립적으로 => 모든 if의 조건을 검색한다 
 *                        ------------------------------- 속도가 늦다 
 *           선택조건문 
 *           다중조건문 
 *        2. 선택문 
 *           선택문 : 다중조건문을 단순화 => 메뉴처리 / 네트워크 / 게임 
 *        3. 반복문 
 *           for문 ==> 반복횟수 지정 
 *           while문 ==> 반복횟수 지정이 없는 경우 => 선 조건 검색 
 *           
 *           do~while문 ==> 반복횟수 지정이 없는 경우 => 반드시 한번이상 수행 
 *        4. 반복제어문
 *           break : 반복 문장 중단 
 *           continue : 특정 부분을 제외  
 *        5. 혼합 
 *           => for => if 
 *           => while => if 
 *    ---------------------------- 기본 문법 
 *     관련된 데이터 묶기 : 배열 / 클래스 
 *     관련된 명령문 묶기 : 메소드 
 *    ---------------- + 묶기 (객체지향)
 */
public class 단일조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 단일 조건문 
		int num=15;
		if(num%3==0) // 조건 => 비교연산자 / 논리연산자 / 부정연산자 
		{
			System.out.println(num+"는 3의 배수입니다");
		}
		///////////////// 1문장 
	    if(num%5==0)
		{
			System.out.println(num+"는 5의 배수입니다");
		}
		///////////////// 1문장 
		if(num%7==0)
		{
			System.out.println(num+"는 7의 배수입니다");
		}
		////////////////// 1문장 
		// 범위/기간 => 논리연산자 
		char c='8';
		if(c>='A' && c<='Z')
		{
			System.out.println(c+"는 대문자입니다");
		}
		if(c>='a' && c<='z')
		{
			System.out.println(c+"는 소문자입니다");// 명령문 
		}
		if(c>='0' && c<='9')
		{
			System.out.println(c+"는 숫자입니다");
		}
		// 맛있는 맛있고 맛있게 맛있는데 ....  맛있+ 
		
		String id=new String("admin");
		String pwd="1234";
		
		
		// 문자열 비교 ==> equals를 사용
		/*if(id.equals("admin") && pwd.equals("1234"))
		{
			System.out.println("로그인되었습니다");
		}
		if(!(id.equals("admin") && pwd.equals("1234")))
		{
			System.out.println("아이디나 비밀번호가 틀립니다");
		}*/
		/*if(id=="admin" && pwd=="1234")
		{
			System.out.println("로그인되었습니다");
		}*/
		// 에러 처리 
		int a=10;
		int b=0;
		
		if(b==0)
		{
			System.out.println("0으로 나눌 수 없습니다");
		}
		if(b!=0)
		{
			System.out.println(a/(double)b);
		}
	}

}
