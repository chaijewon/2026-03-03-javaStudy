package com.sist.collection;
/*
 *          Map : 독립적 
 *           |
 *      -------------
 *      |           | 구현된 클래스
 *    HashMap      Hashtable 
 *      비동기         동기 ==> Hashtable의 단점을 보완 : HashMap
 *      
 *    List / Set => Collection  
 *    
 *    특징 
 *      두개를 동시에 저장 (key , value) 
 *                      | key 를 가지고 value를 얻어 온다 
 *                      | key: 중복허용(X)
 *                        value: 중복허용 
 *                        같은 키 => 덮어쓴다 
 *                      => 응용 : Spring / MyBatis / 웹 라이브러리
 *                                        | SQL (id, "SQL문장")
 *                               | 클래스찾기 (id , 클래스 주소) 
 *                         => Session / Cookie / Request / Response
 *     사용처 : 클래스 관리 
 *            메모리 할당후 관리 
 *            -------------- 메모리 주소
 *     map.put("a",new A())
 *                 --------- 한번 메모리 할당 (싱글턴)
 *                         
 */
import java.util.*;
class AA
{
	public void disp()
	{
		System.out.println("AA:disp() Call");
	}
}
public class Collection_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Map<String,AA> map=new HashMap<String,AA>();
        map.put("aa", new AA());
        
        AA a=new AA();
        
        AA b=new AA();
        
        AA c=new AA();
        
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
        
	}

}
