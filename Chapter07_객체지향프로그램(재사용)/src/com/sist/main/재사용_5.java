package com.sist.main;
// 같은 파일에서 클래스 여러개 만드는 경우 => public class는 한번만 사용이 가능

/*
 *     Member m=new Member("홍길동", "남자");
 *     
 *     ------m--------
 *       -----------super
 *         name 
 *         sex
 *       -----------
 *       
 *       -----------this
 *        display
 *       -----------
 *    -----------------   
 *    
 *    ------m--------
 *       -----------super
 *         name 
 *         sex
 *       -----------
 *       
 *       -----------this
 *        display
 *        name
 *        sex
 *       -----------
 *    -----------------   
 *    
 *     
 *     
 */
class Saram{
	String name;
	String sex;
	static int age;
	public Saram(String name,String sex)
	{
		this.name=name;
		this.sex=sex;
		age=20; // => 인스턴스,static => 초기화 
	}
}
class Member extends Saram{
    /*
     *   상속 
     *   = 생성자 => default 생성자는 자동 호출 
     *   = 매개변수가 있는 경우에는 super()
     */
	String name,sex;
	public Member(String name, String sex) {
		super(name, sex);
		// TODO Auto-generated constructor stub
		this.name="박문수";
		this.sex="남자";
	}
	public void display()
	{
		
		System.out.println("이름:"+super.name);
		System.out.println("성별:"+super.sex);
		Member.age=25;// 변경이 가능 => 상속예외 => 사용은 가능
		System.out.println("나이:"+Member.age);
	}
	
}
/*
 *    1. 상속 내리는 클래스 => 매개변수가 있는 생성자가 있는 경우 
 *       => 상속받는 클래스에서 반드시 super(값...)
 *    2. 변수 상속시에 => super / this는 구분이 없다 
 *       => 구분 : 상속받은 클래스에서 변수를 다시 설정 
 *    
 */
public class 재사용_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Member m=new Member("홍길동", "남자");
        m.display();
	}

}
