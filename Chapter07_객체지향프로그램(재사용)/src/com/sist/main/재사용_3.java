package com.sist.main;
/*
 *   7장 
 *   --- 상속 / this / super / this() / super() 
 *      ---- 메모리 할당 
 *   this : 자신의 객체 => 모든 클래스는 this를 가지고 있다 
 *          this는 객체 생성시에 주소값 저장 
 *          this => static으로 되어 있다 
 *          A a=new A();
 *          this=a ======> JVM에서 자동화 
 *   class A
 *   {
 *      1. this 사용처 => 클래스에서만 사용이 가능 
 *         생성자 
 *         인스턴스 메소드에서만 사용이 가능 
 *         static 메소드 , 블록에는 사용이 불가능 
 *      2. 보통 => 매개변수 / 인스턴스변수가 중복인 경우 => 구분을 위해서 사용
 *         private int a;
 *         public void display(int a)
 *         {
 *            a=a; ==> 매개변수 
 *            => this.a=a
 *            => 지역변수와 매개변수 우선순위 
 *         }
 *         public void display(int b)
 *         {
 *            a=b; this.생략이 가능 
 *            ==> 지역변수/매개변수 ==> 인스턴스 
 *            웹 => this : page 
 *         }
 *   }
 *   ===> 윈도우 : 자신의 윈도우 (this)
 *   접근지정어 
 *     => 사용자 정의는 없다 
 *     public : 모든 접근이 가능 
 *              클래스 / 생성자 /메소드 => 다른 클래스 연결 
 *     protected : 같은 패키지 / 상속받은 클래스 => 다른 패키지 접근
 *              상속이 많은 경우 : 변수
 *              => 거의 사용 빈도가 없다 
 *     default : 연습용 => 패키지가 없는 상태 
 *               같은 패키지안에서만 접근이 가능 
 *               => 윈도우 컴포넌트 
 *                       ------- 버튼 / 체크...
 *     private : 자신의 클래스에서만 사용이 가능 
 *               인스턴스변수 => 무조건 getter/setter
 *               ------------------------------- 캡슐화 
 *     메소드 / 클래스 / 인터페이스 / 생성자 => public 
 *     인스턴스 변수 => private 
 *     
 *     ==> 제어자 
 *         static / final / abstract 
 *         ------   ------  ---------
 *                          => 선언만 된 ... (미완성)
 *                          => 추상 클래스/ 인터페이스
 *                  => 상수 / 고정된 메소드 
 *         => 공통으로 사용
 *     재사용 기법 
 *     1. 상속 
 *         상속 키워드 extends => 라이브러리 상속 => 변경 
 *         단일 상속만 가능 
 *         클래스의 크기가 가능하다 
 *         ---------- 포함 
 *         class A
 *         class B extends A     A>B
 *         class A
 *         {
 *             B b=new B()  =>   A>B
 *         }
 *         class B
 *         {
 *         }
 *         ====> 형변환 : 
 *               상속을 내리는 클래스 : double
 *               상속을 받은 클래스 : int
 *         *** 모든 클래스는 Object상속이다 
 *                        ------ 최상위 클래스 
 *         => 이미 만들어진 클래스의 변수/메소드를 받아서
 *            새로운 기능의 확장된 클래스 만든다 
 *            예외) static / 생성자 / 초기화 블록 / private
 *         => 무조건 상속 ==> 필요한 경우에만 상속 
 *         예)
 *             CV
 *             class A
 *             {
 *                글쓰기 
 *                수정 
 *                상세보기
 *                삭제 
 *                목록 
 *                추가 
 *                검색 
 *             }
 *             class B
 *             {
 *                글쓰기 
 *                수정 
 *                상세보기
 *                삭제 
 *                목록 
 *                추가 
 *                검색 
 *                업로드 / 다운로드
 *             }
 *             class c
 *             {
 *                글쓰기 
 *                수정 
 *                상세보기
 *                삭제 
 *                목록 
 *                추가 
 *                검색 
 *                댓글 
 *             }
 *              class D
 *             {
 *                글쓰기 
 *                수정 
 *                상세보기
 *                삭제 
 *                목록 
 *                추가 
 *                검색 
 *                이미지
 *             }
 *             
 *             CGV 
 *              = 메가박스
 *              = 롯데시네마 
 *             지니뮤직
 *              = 멜론
 *              = Mnet
 *             쿠팡 
 *              =11번지
 *              =G마겟..
 *        목적
 *         => 코드 재사용 
 *         => 유지보수가 편리 : 기능을 미리 알고 있다 
 *         => 간결 
 *         => 반복 제거 
 *         => 가독성 / 재사용 / 수정용이 
 *         => 최적화(X) => 메모리 비대/상위클래스 => 속도가 느려진다 
 *            => 결합성 높아진다 / 제약 
 *         => 관련된 클래스를 모아서 한개의 객체명으로 관리 
 *         
 *     2. 추상클래스 
 *     3. 인터페이스 
 *     클래스간의 공통사용 
 *     1. 내부클래스
 *        --------
 *        = 멤버사용 : 공통사용 
 *        = 익명사용 : 오버라이딩 => 상속 
 *                   상속없이 오버라이딩이 가능 => 상속을 사용하지 않는다
 *     
 */
class Animal
{
	String name="동물";
	public void run() 
	{
		System.out.println("걷는다");
	}
	public void eat() 
	{
		System.out.println("먹는다");
	}
}
class Dog extends Animal
{
	/*
	 *  String name="동물";
		public void run() 
		{
			System.out.println("걷는다");
		}
		public void eat() 
		{
			System.out.println("먹는다");
		}
	 */
	public void eat() 
	{
		System.out.println("개가 먹는다");
	}
	int age=3;
}
class Cat extends Animal
{
	/*
	 *  String name="동물";
		public void run() 
		{
			System.out.println("걷는다");
		}
		public void eat() 
		{
			System.out.println("먹는다");
		}
	 */
	public void eat() 
	{
		System.out.println("고양이가 먹는다");
	}
	int age=3;
}
class Pig extends Animal
{
	/*
	 *  String name="동물";
		public void run() 
		{
			System.out.println("걷는다");
		}
		public void eat() 
		{
			System.out.println("먹는다");
		}
	 */
	public void eat() 
	{
		System.out.println("돼지가 먹는다");
	}
	int age=3;
}
// 100개 ==> 
/*
 *      Dog d=new Dog(); // Dog에 있는 데이터나 메소드
 *      Animal a=new Dog();
 *      // 변수(Animal) / 메소드(Dog)
 *      // 1. 변수 => 클래스형 
 *      // 2. 메소드 => 생성자 
 *      // 3. => 여러개의 클래스를 한개로 통합 
 *      Animal b=new Animal(); // Animal에 있는 데이터나 메소드
 *      
 */
public class 재사용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Dog dog=new Dog();
        dog.eat();
        Cat cat=new Cat();
        cat.eat();
        Pig pig=new Pig();
        pig.eat();
        System.out.println("========");
        Animal a=new Dog();
        a.eat();
        a=new Pig();
        a.eat();
        a=new Cat();
        a.eat();
	}

}
