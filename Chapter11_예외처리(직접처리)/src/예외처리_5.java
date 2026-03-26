/*
 *   1. 인터페이스 
 *      => 표준화 가능 
 *      => 소스의 통일화 
 *      => 다른 클래스와 연결시에 주로 사용 : 리모콘 
 *         -------------------------
 *         => 결합성이 낮아진다
 *         => client=|=server 
 *                 interface
 *         => 유지보수 
 *      => 관련된 여러개 클래스 모아서 한개의 이름로 관리하는 역할 
 */
interface Animal
{
	int a=100; // 상수형 => 반드시 초기화 
	// public static final int a=100;
	public void eat();
	// public abstract => interface는 무조건 only public 
	// private사용도 가능 => interface  자체에서만 사용
	private void display()
	{
		System.out.println("공통사용");
	}
	public default void aaa()
	{
		display();
	}
	public default void bbb()
	{
		display();
	}
	public default void ccc()
	{
		display();
	}
}

public class 예외처리_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
