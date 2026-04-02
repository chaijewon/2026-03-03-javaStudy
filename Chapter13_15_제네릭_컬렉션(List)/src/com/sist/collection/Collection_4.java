package com.sist.collection;
/*
 *   제네릭 (13장) 
 *   -----------
 *   1. 정의 
 *      = 클래스나 메소드를 정의 할때 상용할 데이터형을 표준화해서 사용 
 *      = 데이터형의 안정성 , 가독성 
 *      ArrayList<String> list=new ArrayList()
 *      list.add("홍길동");
 *      => let a=10
 *         a=10.5
 *         a=""
 *         a={}
 *         a=[]
 *      = 재사용성 
 *      = 데이터형을 통일화 시킨다 
 *      = 소스가 간결해 진다 => 형변환없이 사용이 가능 => 가독성 
 *   2. 사용법 
 *      <클래스만 사용이 가능>
 *       -----
 *       <int> <double> (X) 
 *       <Integer> <Double> => Wrapper 
 *   3. 메소드 (매개변수,리턴형) , 변수 => 전체가 한번에 변경이 된다 
 *   
 *   Box box=new Box() => T:Object
 *   Box<String> => T:String
 */
class Box<T>
{
	T t;
	public void setT(T t)
	{
		this.t=t;
	}
	public T getT()
	{
		return t;
	}
}
public class Collection_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Box box=new Box();
        Box<String> box1=new Box<String>();
        /*
         *   T : Type (클래스형)
         *   E : Element
         *   ---------------- 
         *   K : Key
         *   V : Value 
         *   ---------------- Map Map<String,String>
         *   
         *   Object => 프로그램에 필요한 데이터형으로 변환 
         *   
         *   1차 : 문법 / 라이브러리 
         *   2차 : 오라클 연동 (JDBC)
         *   3차 : 웹 연동 (JSP)
         *   4차 : 스프링 / 부트 
         */
	}

}
