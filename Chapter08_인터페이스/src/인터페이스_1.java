/*
 *   인터페이스 
 *   1. 기능(메소드) 정해둔다 
 *      => 모든 개발자 동일한 메소드를 구현 => 표준화
 *                  ---------- 분석
 *   2. 인터페이스 사용? 
 *      1) 이미 어떤 걸 구현해야 되는지 알고 있다 (규격화)
 *      2) 여러 개발자 동시에 개발 
 *         => 이 기능은 반드시 구현
 *            ------
 *            1. 웹 
 *               --
 *               1) main
 *               2) 게시판 
 *               3) 공지사항 : 관리자 모드 
 *               4) 회원가입 = 로그인 
 *               => 메뉴얼 => 인터페이스 
 *      3) 내부 구현이 변경 => 메소드는 그대로 유지 
 *      4) 유지보수가 편리하다 
 *      
 *      ---------------------------
 *            인터페이스     클래스 
 *      ---------------------------
 *            기능 설정      규현 
 *      ---------------------------
 *            메소드 선언    메소드 구현 
 *      ---------------------------
 *            상속(다중)     단일 
 *      ---------------------------
 *         class => class 
 *              extends 
 *              
 *         interface => interface
 *                 extends 
 *         interface => class
 *                 implements
 *         class => interface(X)
 *         
 *      ---------------------------
 *      class A
 *      class B
 *      class C extends A,B => (X)
 *      
 *      => class B extends A
 *         class C extends B
 *      
 *      => interface A
 *         interface B extends A
 *         interface C extends B
 *         
 *         => interface C extends A,B
 *         
 *      => interface => class
 *               implements 
 *               
 *      인터페이스 
 *       => 추상클래스의 일종 
 *       => 추상클래스의 단점을 보완 => 다중 상속 
 *       => 장점
 *          1. 기능 설계 (메소드 선언) 
 *             = 개발시간을 단축 
 *             = 표준화가 가능 => 라이브러리
 *              
 *               -----프로그램은 정답이 없다 => 요구:결과물 
 *             예)
 *                 for(int i=1;i<=100;i++)
 *                 {
 *                    for(int j=1;j<=i;j++)
 *                    {
 *                       System.out.print("*");
 *                    }
 *                    System.out.println();
 *                 }  
 *                 *
 *                 **
 *                 ***
 *                 ****
 *                 
 *                 System.out.println("*");
 *                 System.out.println("**");
 *                 System.out.println("***");
 *                 System.out.println("****");
 *           2. 결합도가 낮다 (수정시에 다른 클래스의 영향이 없다) 
 *              스프링 : 결합성이 낮은 프로그램으로 만들어져 있다
 *                     ** 로드 존슨 
 *           3. 소스의 통일화 => 분석이 가능 
 *           4. 서로 다른 클래스 연결해서 사용이 가능 (리모콘)
 *           5. 관련된 클래스를 모아서 한개의 이름로 제어가 가능 
 *           6. 유지 보수가 쉽다 
 *           7. 독립적으로 사용이 가능 
 *           
 *           라이브러리 
 *                     List => 인터페이스
 *                      |
 *              -------------------- 구현된 클래스
 *              |         |       |
 *            ArrayList  Vector LinkedList
 *                          |       |
 *                         중심     C개발자
 *               |
 *             자바개발자 
 *             
 *      -----------------------------------
 *      인터페이스의 구성요소 
 *      public interface InterfaceName 
 *                       -------------- 변수 식별자와 동일 
 *                       -------------- 첫자는 대문자 
 *      ------ public / default 
 *      {
 *          ----------------------
 *           변수
 *             => 상수형 변수만 저장 
 *             private int a=10;
 *             -------(X)  ---- 반드시 값을 지정  
 *          ----------------------
 *           선언된 메소드
 *             => 추상 메소드 
 *             public abstract void display();
 *             --------------- 자동 추가
 *             공통으로 구현을 해야 되는 부분을 설정 
 *             => 회원가입 
 *                아이디 중복체크 
 *                비밀번호 규칙
 *                우편번호 검색 
 *                이메일 출돌방지 
 *                전화번호가 동일(X)
 *          ----------------------
 *           구현된 메소드
 *             default
 *             ==> 최근에 추가 (JDK 1.8) 
 *             
 *             (public) default 리턴형 메소드(매개변수)
 *             {
 *                 
 *             }
 *          ----------------------
 *             static 
 *             public static 리턴형 메소드명()
 *             {
 *             }
 *             public을 생략이 가능
 *          ----------------------
 *          
 *          ==> public만 사용이 가능
 *      }
 *                     
 *      클래스는 접근지정어 선택적 
 *      인터페이스 접근지정어 => 필수 (public)
 *      
 *      추상클래스 / 인터페이스 
 *                 | 무엇을 해야한지 알려준다 => 완전한 미완성 클래스
 *      | 기본은 만들어준다 / 나머지 개발자에 맡긴다
 *      | 프랜차이즈 메뉴 (기본 레시피 => 매장 독자적 개발) 
 *        -------------  ------------------ 반쪽 미완성 클래스 
 *        버튼 
 *      => 객체 생성이 안된다 (new(X))
 *      => 상속 => 구현해서 사용이 가능 
 *      
 *      요구사항 => 사이트 벤치마킹 
 *                ------------ 어떤 기능이 필요한지 설계 
 *                자바 => 인터페이스 
 *                문제 => 인터페이스 
 *      -------------------------------------------
 *      
 *                     인터페이스  추상클래스 (면접 98%)
 *      --------------------------------------------
 *      개념           설계중심      기본+규칙(재사용 중심)
 *                    규칙   
 *      --------------------------------------------
 *      구현코드        거의 없다      실제구현+구현 없음 
 *                    선언만 
 *                    => 경우수가 많은 경우
 *      --------------------------------------------
 *      상속           다중 상속        단일 상속 
 *      --------------------------------------------
 *      사용 목적       강제 / 수정 유연성   공통기능 재사용
 *      --------------------------------------------
 *      => 기능 설정 => 개발시간 단축 
 *         -------    소스가 통일화 
 *      => 상속        implements         extends 
 *      
 *      ** 인터페이스도 구현된 메소드가 가능 
 *                   ---------- default / static 
 *      ** 인터페이스는 모든 요소가 public 
 *         ** 변수는 상수형만 사용이 가능 
 *                 ----- 반드시 초기화값을 설정한다 
 *      ** public 
 *         1) 다른 클래스와 통신 
 *         2) 어떤 위치든 접근이 가능 
 *            public 없는 경우에는 자동으로 public을 추가해 준다 
 *      ** 사용처 
 *         1) 윈도우의 이벤트 처리 
 *            JButton / JTextField / Mouse Click ....
 *            => interface 
 *         2) 결합성이 낮은 프로그램 : 스프링 
 *         3) 여러개 있는 경우 => 인터페이스 
 *            ------------
 *            | 데이터베이스 / 파일 / 네트워크 
 *         ---------------------------------------------
 */
import java.awt.event.MouseListener;
import java.awt.event.WindowListener;
import java.util.*;
interface I
{
	int a=100;
	// public static final => 자동 첨부 
	void display();
	// public abstract
	default void aaa() {
		
	}
	// public 
}
interface II
{
	void display();
	default void aaa() {}// 선택적 오버라이딩
}
class A implements II
{
	public void display() {}
}
class B implements II
{
	public void display() {}
	public void aaa() {}
}
class C implements II
{
	public void display() {}
}

public class 인터페이스_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //List<String> list=new ArrayList<String>();
        List<String> list=new LinkedList<String>();
        list.add("홍길동");
        list.add("이순신");
        list.add("심청이");
        for(String name:list)
        {
        	System.out.println(name);
        }
	}

}
