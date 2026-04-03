package com.sist.collection;
/*
 *   컬렉션 프레임워크 
 *        ---------
 *           데이터 관리 , 기본 틀 => 표준화 , 라이브러리 
 *   ----- 다수의 데이터의 모음 
 *   
 *         Collection ---- interface 
 *            |
 *      --------------         독립적 
 *      |            |          Map
 *    List          Set ---------------------- 인터페이스
 *      |
 *   ------------------------
 *   |        |             |
 * ArrayList LinkedList  Vector ===> 구현된 클래스
 *                       | ArrayList와 유사 
 *                       | 동기적인 프로그램 => 속도가 늦다
 *                       | 신뢰성이 뛰어나다 => 네트워크 
 *           | 접근 속도가 늦다 
 *           | 삭제,추가시 속도가 빠르다
 *           | 댓글 , 게시판 
 * | 접근속도가 빠르다 
 *   검색 => 웹 개발 => 검색 (대부분 사용) 
 *   자동 인덱스가 부여 => 수시로 변경 
 *                     삭제 / 추가 => 속도 느리다
 *                     
 *  특징 
 *    데이터 중복 허용 => 인덱스를 이용해서 데이터 제어 
 *    ------------
 *    순서가 존재 (인덱스) 
 *    
 *    활용
 *      ArrayList => 데이터에서 값을 저장 => 브라우저로 전송 
 *                   목록 (웹)
 *      Vector => 네트워크의 유저 (접속자) 관리 
 *      
 *      LinkedList => 파일로 프로그램 제작 
 *      --------------------------------------------
 *  제네릭 : 반드시 클래스형만 지원한다 
 *         형식 <클래스만 사용>
 *             ------------ 기본형을 설정 => Wrapper
 *                          | int => Integer 
 *                            double => Double 
 *                            boolean => Boolean 
 *                            long => Long => 언박싱/오토박싱 지원
 *                  | 사용자 정의 클래스도 가능 
 *          ArrayList<Movie> 
 *          Movie[]
 *          => 가독성이 좋다 / 제어하는 데이터를 알 수 있다 
 *          => 라이브러리 => Object => 형변환 처리 (보완)
 *          => 모든 Object로 된 내용 => 한번 변경이 가능 
 *                 ------ 변수 / 매개변수 / 리턴형 
 *              => 데이터형의 통일화 
 *          => Wrapper 클래스 사용 
 *             ArrayList<Integer> 
 *             ---------------------------
 *               Integer(10) Integer(20) ==> 오토박싱
 *             ---------------------------
 *                   |          |
 *                 int a=10   int a=20  ==> 언박싱 
 *          정리 => 제네릭은 데이터형 통일 , 누구나 알아보기 쉽게 만든 
 *                 데이터 구조에 사용 
 *          ----------------------------------------
 *          List (ArrayList,Vector,LinkedList) 
 *           |
 *          주요 기능 (고정 = 가변) => CRUD 
 *          add() : 데이터 추가 : 동적으로 생성 => 유연성 
 *                  INSERT (Create)
 *          get() : 데이터 읽기
 *                  SELECT (Read)
 *          set() : 데이터 수정
 *                  UPDATE (Update)
 *          remove() : 데이터 삭제
 *                  DELETE (Delete)
 *          size() : 갯수 => length()
 *          isEmpty() : 데이터 존재여부 
 *          clear() : 전체 삭제 
 *          -------------------------------------
 *          java.util 
 *          ---------- 유용하게 사용이 가능 라이브러리 
 *          = Date 
 *          = Calendar 
 *          = Random
 *          = Collection : ArrayList , HashSet , HashMap 
 *          = StringTokenizer 
 *                            
 */
import java.util.*; // import 생략 => java.lang
class A
{
	public void display()
	{
		System.out.println("A:display() Call...");
	}
}
class B
{
	public void display()
	{
		System.out.println("B:display() Call...");
	}
}
class C
{
	public void display()
	{
		System.out.println("C:display() Call...");
	}
}
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] n={"홍길동","심청이","박문수","이순신","강감찬"};
        List<String> names=new Vector<String>();
        names=Arrays.asList(n);
        /*names.add("홍길동");
        names.add("심청이");
        names.add("박문수");
        names.add("이순신");
        names.add("강감찬");*/
        // 출력 => for-each
        for(String name:names)
        {
        	System.out.println(name);
        }
        System.out.println("인원:"+names.size());
        System.out.println("인원 존재 여부 확인");
        names.clear();
        if(names.isEmpty())
        {
        	System.out.println("인원이 없습니다");
        }
        else
        {
        	System.out.println("인원이 "+names.size()+"명 있습니다");
        }
        // => add(Object o) => add(String s)
        // => 데이터 통일 
        //names.add
        /*names.add(new A());
        names.add(new A());
        names.add(new B());
        names.add(new A());
        names.add(new C());
        names.add(new A());
        names.add(new A());
        names.add(new B());
        names.add(new A());
        names.add(new C());
        names.add(new A());
        names.add(new A());
        names.add(new B());
        names.add(new A());
        names.add(new C());
        A a=null;
        B b=null;
        C c=null;
        for(Object o:names)
        {
        	
        	if(o instanceof A)
        	{
        		a=(A)o;
        		a.display();
        	}
        	if(o instanceof B)
        	{
        		b=(B)o;
        		b.display();
        	}
        	if(o instanceof C)
        	{
        		c=(C)o;
        		c.display();
        	}
        	
        	
        }*/
        
	}

}
