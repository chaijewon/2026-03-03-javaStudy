package com.sist.collection;
/*
 *    제네릭(13장)
 *     => 코드 재사용 / 타입 안정성을 위한 도구 
 *     => 클래스<클래스타입>
 *     1. 제네릭을 사용하는 이유 
 *        ArrayList list=new ArrayList();
 *        --------- 모든 데이터가 저장 가능 => Object
 *        list.add("java");
 *        list.add(10);
 *        
 *        => String str=list.get(0); => 오류 발생 
 *                      Object get(int index)
 *                     =(String)list.get(0);
 *        => String a=(String)list.get(1); 
 *                 ------------
 *                 (Integer)list.get(1)
 *        => 어떤 데이터타입이 첨부되었는지 알 수 없다
 *        => 데이터 읽기마다 형변환 필요 
 *        => 잘못하면 ClassCastException
 *     -----------------------------------------
 *     2. 프로그램에서는 데이터타입(형)을 반드시 고정
 *        => 프로그램언어는 가능 => 자바스크립트는 고정 
 *           --------- 코틀린 제외 
 *                     var / val 
 *     3. 불필요한 형변환은 가급적이면 안하는 곳이 좋다 
 *     ----------------------- 제네릭 
 *     = 데이터형이 고정 => 데이터를 한가지만 설정이 가능
 *       가독성  
 *     = 컴파일 오류 방지 
 *     = 형변환 없이 사용 => 소스 간결해 진다 
 *     
 *     class Box<T>
 *     {
 *         T t;
 *         public void setT(T t)
 *         {
 *            this.t=t;
 *         }
 *         public T getT()
 *         {
 *            return t;
 *         }
 *     }
 *     
 *     Box box=new Box(); ==> T : Object
 *     Box<String> box=new Box<String>(); T:String
 *     => 클래스에 있는 데이터를 한번 통일화 
 *     
 *     class Pair<K,V> 
 *     {
 *         K key; => Object
 *         V value; => Object
 *     }
 *     
 *     Pair<String , Integer> p=new Pair<>();
 *     먼저 만들어 놓고 => 나중에 데이터형을 변경해서 사용  
 *     
 *     => 제네릭을 사용하지 않는면 경고가 있다 
 *     
 *     3. 제한된 제네릭 
 *        class Box<T extends Number>
 *                    -------
 *        {
 *            T value;
 *        }
 *        Box<Integer> 
 *        Box<Double>
 *        Box<Float> 
 *        ...
 *        Box<String> => 오류 
 *     4. 데이터형을 모르는 경우 : 와일드 카드 => ?
 *        ArrayList<?> => 경고가 없다 => Class<?>
 *        ArrayList => 경고를 받는다 
 *        => 모르겠다 
 *        => 읽기 전용 => get() => Object
 *        
 *     => extends 제한된 제네릭 => 꺼내기 전용 
 *        ?       타입을 모르는 경우  => only 읽기 
 *        ------- 자바 라이브러리에서 주로 나온다 
 *        
 */
import java.util.*;

import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
public class Collection_2 extends JFrame{
    public static void print(List<?> list)
    {
    	for(Object obj:list)
    	{
    		System.out.println(obj);
    	}
    }
    /*
     *             Number
     *               |
     *       --------------------------
     *       |       |     |    |     |
     *    Integer Double Float Long Byte 
     */
    public static double sum(List<? extends Number> list)
    {
    	double total=0;
    	for(Number n:list)
    	{
    		total+=n.doubleValue();
    	}
    	return total;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        print(List.of("A","B","C"));
        print(List.of(1,2,3));
        // 어떤 데이터형이든 관계없고 
        // 읽기만 가능 => 출력용 
        // add는 불가능 
        System.out.println(sum(List.of(10,20,30)));
        System.out.println(sum(List.of(10.5,20.5,30.5)));
        
        /*
         *    출력 => <?>
         *    계산 => extends 
         *    =================> 람다 (스트림)
         *    추가 => super
         *    
         *    람다 6 / 내부 , 쓰레드 , 네트워크 
         *            -------------------- 7,8,9 
         *    JDBC => 오라클 
         */
	}

}
