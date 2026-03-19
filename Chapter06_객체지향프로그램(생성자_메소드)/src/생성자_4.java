/*
 *   생성자 => 229page
 *     => 자신의 생성자를 호출이 가능하다 
 *     => this()=>자신의 생성자 => 상속 super()  
 *     => this=>객체(자신) => 상속 내린 클래스 : super 
 *    
 *    class A
 *    {
 *       int a,b,c,d,e,f
 *       A(){
 *         a=1;
 *         b=2;
 *         c=3;
 *         d=4;
 *         e=5;
 *         f=6
 *       }
 *       A(int k)
 *       {
 *          this()
 *          e=k
 *         
 *       }
 *       A(int m int n)
 *       {
 *           this()
 *           a=m;
 *           b=n;
 *       }
 *    }
 *    
 *    =====> 1. 반복 제거 => for/ 메소드 / 생성자 
 *           -------------------------------
 *           공통모듈 => 수정 편리 
 *           
 *    class A
 *    {
 *       void aaa()
 *       {
 *          a=1
 *       }
 *       void bbb(int a)
 *       {
 *          a=a
 *       }
 *       void bbb()
 *       {
 *          a=1
 *       }
 *       void ddd()
 *       {
 *          a=1
 *       }
 *       void eee()
 *       {
 *          a=1
 *       }
 *       void fff()
 *       {
 *          a=1
 *       }
 *       void eee()
 *       {
 *          a=1
 *       }
 *       void kkk()
 *       {
 *          a=1
 *       }
 *       void mmm()
 *       {
 *          a=1
 *       }
 *    }
 *           
 */
class Member2
{
	int mno;
	String name;
	String address;
	//  사용이 안되는 곳 
	// static {}  , static메소드안에서는 사용이 불가능 
	// static => 모든 곳에서 사용이 가능 
	// ctrl+클릭 => 현재 선언된 메소드 위치로 이동 
	Member2() {
		mno=1;
		name="홍길동";
		address="서울";
	}
	Member2(String n)
	{
		this();// 생성자안에서만 사용이 가능 
		       // 중복코딩이 많은 경우 
		       // 반드시 첫번째줄에서 사용
		name=n;
	}
	Member2(String n , String a)
	{
		this(n);// 현재 클래스의 생성자를 호출 
		name=n;
		address=a;
		
	}
	
}
public class 생성자_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member2 m1=new Member2();
        System.out.println("회원번호:"+m1.mno);// 1
        System.out.println("이름:"+m1.name); // 홍길동
        System.out.println("주소:"+m1.address); // 서울 
        Member2 m2=new Member2("심청이");
        System.out.println("회원번호:"+m2.mno);// 0
        System.out.println("이름:"+m2.name); // 심청이
        System.out.println("주소:"+m2.address); // null
        Member2 m3=new Member2("박문수","부산");
        System.out.println("회원번호:"+m3.mno);// 0
        System.out.println("이름:"+m3.name); // 박문수
        System.out.println("주소:"+m3.address); // 부산
        
        
	}

}
