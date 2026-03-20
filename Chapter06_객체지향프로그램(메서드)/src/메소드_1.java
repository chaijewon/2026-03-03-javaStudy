// => 232page => 메소드 
/*
 *   모든 프로그램 : 데이터 + 메소드
 *               -------------
 *   
 *   메소드 
 *     역할 
 *       1) 클래스와 클래스의 연결 (통신) => 메세지 
 *          매개변수(주고) 리턴형(받고) 
 *       2) 반복 제거 
 *       3) 구조적인 프로그램 
 *          절차적언어 ===> 헌책방 
 *          객체지향  ==> 교보서적 
 *          ------------------
 *       4) 메소드는 호출시마다 {부터 }까지 ... => 호출한 위치 원상보귀
 *       5) 구성 요소 
 *          주고 받기 
 *          --- ---
 *              => 리턴형 
 *          => 매개변수
 *          매개변수 
 *            사용자 요청 => 여러개 , 한개 , 없을 수 있다 
 *                        -----------------------
 *                        => 최소화 : 3개이상 / 클래스 / 배열 
 *          리턴형 : 사용자 요청에 대한 처리값 
 *                 => 1개만 사용이 가능 
 *                 => 데이터값 여러개 : 배열 / 클래스 
 *          메소드명 => 구분자 => 소문자로 시작 => 식별자 
 *                 약간의 의미 
 *                 --------- 5~10
 *                 aaa() boardInsert()
 *                 bbb() join()
 *          구현부 
 *          {
 *             return; void => 생략이 가능 => 컴파일시에 자동 추가 
 *             return 값;
 *          }
 *          
 *          
 *          
 *          
 *          1. return 
 *          2. 생성자
 *          3. import java.lang
 *          4. 모든 클래스 => 상속 Object
 *          
 *          class A
 *          {
 *             int a;
 *             String name;
 *             A(int a,String n)
 *             {
 *                this.a=a;
 *                name=n
 *             }
 *          }
 *          
 *          A aa=new A(10,"aaa");
 *          A bb=new A(10,"aaa");
 *       
 *       = 형식)
 *          public  static/abstract
 *         [접근지정어][제어어] 리턴형 메소드명(매개변수...)
 *         {
 *             구현
 *             return 결과값
 *         }
 *         
 *         static 메소드 ===> 클래스명.메소드명(값)
 *          => 한개의 메모리안에 저장 => 공유 
 *         instance 메소드 == 객체명.메소드명(값...)
 *          => 객체마다 따로 저장 => 독립 
 *          => new마다 따로 저장 
 *          
 *         버스(좌석) 버스(입석) 버스(고속엔진) 버스(마을)
 *         => 버스(Object o)
 *         
 */
class Methods
{
	int a=10;
	String name="홍길동";
	static int b=20;// 컴파일시에 저장 
	
	static void display() // 컴파일시에 저장
	{
		System.out.println("Commons Methods");
	}
	void display(int a) {
		System.out.println("Instance Method");
	}
	/*
	 *   String 
	 *     length()
	 *     
	 *     String s="Hello"
	 *        s.length()
	 *     String s1="Java";
	 *        s1.length()
	 *        
	 *     String.valueOf(10) => "10"
	 *     String.valueOf(10.5) => "10.5"
	 *     
	 *     
	 */
}
public class 메소드_1{
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1. 메모리에 저장 
		// Methods m=new Methods();
		System.out.println("b="+Methods.b);
		Methods.display();
		// 목록 => 한번 저장 
		Methods m=new Methods();
		m.display(100);
		System.out.println("a="+m.a);
		/*
		 *     -----m--------
		 *       ---a-------
		 *           10
		 *       ---name----
		 *          "홍길동"
		 *       -----------
		 *       display(int)
		 *       -----------
		 *     -----------
		 *     
		 *     -----m1--------
		 *       ---a-------
		 *           10
		 *       ---name----
		 *          "홍길동"
		 *       -----------
		 *       display(int)
		 *       -----------
		 *     -----------
		 *     
		 */
	}

}
