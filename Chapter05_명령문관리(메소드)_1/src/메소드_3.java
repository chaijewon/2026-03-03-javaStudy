/*
 *    int total=kor+eng+math
 *              ------------ 매개변수
 *          |
 *        리턴형
 *    ---------------------- 메소드
 *                           => 매개변수
 *    static int totalScore(int kor,int eng,int math)
 *    {
 *        return kor+eng+math;
 *    }
 *                           => 인자 
 *    => int total=totalScore(90,90,90)
 *                            |   |  |
 *                           kor eng math
 *    => 매개변수가 적게 만든다 
 *       ----------------- 배열 / 클래스
 *       
 *    리턴형 메소드명(매개변수...)
 *    {
 *       리턴형이 void가 아닐 경우 => return 값
 *       리턴형이 void일 경우 => 메소드 자체 처리
 *    }
 *    
 *    프로그램 
 *    ------
 *      => 벤치마킹 
 *      => 메소드 : 기능 설정 ==> 기능에 들어가 있는 데이터 추출 
 *         --------------- 기능 ==> 어떤 데이터 필요  
 *    메소드 (1) / 변수 (2) / 클래스 (3) 
 *    ------------------------------ 객체 지향이 가능 
 *    => 유지보수 : 메소드 기능 변경 
 *    ------------------------------
 *    
 *    static int method(int a , int b)
 *    {
 *       return a+b;
 *    }
 *    
 *    int add=method(10,20);
 *            ------------- 호출 
 *            1. 10 => a
 *            2. 20 => b
 *            3. {안으로 진입 ==> return값을 add에 전송} 
 *    ==> 매개변수 / 지역변수 
 *        ---------------> 지역변수 => 메소드 안에서만 사용되는 변수
 *       
 *           
 *         메소드 
 *          1. 형식 
 *             리턴형 / 매개변수 / 메소드명 
 *             ----------------------
 *          2. 호출 
 *             메소드명(실제값) => 매개변수가 있는 경우 
 *             메소드명() => 매개변수가 없는 상태 
 *          3. 메소드 안에 선언된 지역변수의 생명주기 
 *          4. 저장위치 
 *             -----------------
 *                  methodarea => 메소드 저장 
 *             -----------------
 *                  stack => 매개변수,지역변수 
 *             -----------------
 *                  heap => 멤버변수 => 클래스 영역에 선언
 *             -----------------
 *          5. 목적 
 *             1) 재사용 : 다른 클래스 연결 
 *                       -------------
 *                       소프트웨어 : 메세지 
 *                       A ====== B
 *                        메소드 호출
 *             2) 반복 제거 : 공통 모듈 
 *                          ------- 최근 방문 : Cookie 
 *             3) 유지보수가 편리 
 *                ------ 수정 , 추가 
 *             4) 기능별로 나눠서 작업 
 *                분리 => 여러명이 동시 작업이 가능 
 *                ===> 분업화 
 *             5) 가독성이 좋다 => 에러 잡기
 *                
 *        객체 지향 프로그램 
 *        => 메소드 / 변수 => 자바 포기 
 *        
 *        ----------------------------
 *        Option 
 *        React / TypeScript / NodeJS / TanStack-Query 
 *        --------------------------------------------
 *        Vue / Pinia 
 *        SpringFrameWork / Spring-Boot(ThymeLeaf)
 *            | JSP
 *        Spring AI
 *        
 *        ------------------------------------------
 *             
 *       
 */
public class 메소드_3 {
    static void display()
    {
        System.out.println("display() 진입...");
        System.out.println("기능 처리");
        System.out.println("display() 종료...");
    }
    static void increment()
    {
    	int a=10;// 새롭게 생성 => {}안에서만 사용 => 지역변수
    	System.out.println("a="+a);
    	a++;
    }//  => a는 메모리에서 사라진다 
    /*
     *   increment() a=10
     *   increment() a=10
     *   increment() a=10
     */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        display(); // 종료하면 다음 문장으로 넘어간다 
        
        display();
        display();
        display();
        display();
        // 메소드는 호출시마다 처음부터 실행
        // 선언된 변수가 있는 경우에는 종료하면 사라진다 
        
	}

}
