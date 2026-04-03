package com.sist.collection;
/*
 *    retainAll : 교집합  ==> INTERSECT
 *    addAll() : 전체집합  ==> UNION ALL
 *    removeAll() : 차집합  ==> MINUS
 *    -------------------
 *    지니뮤직 / 멜론 
 *      |       |
 *      ---------
 *      | 50곡 => 같은 곡 
 *      | => 크롤링
 *      
 *    => Set / Map / => 응용 
 *    
 *    컬렉션 프레임워크 
 *      다수의 데이터를 쉽게 관리 할 수 있게 만든 라이브러리 
 *                  ----
 *                  데이터 관리 : 추가 , 수정 , 삭제  ,읽기 
 *                  -------------------------------- 자료구조 
 *                   | 메모리 , 파일 , 데이터베이스 
 *                                  | insert , update, delete,select
 *                            | read , write , delete
 *                     | add , set , remove , get
 *      동적 메모리 할당 (자동으로 크기가 조정) 
 *       | 배열:고정(크기지정) => 크기를 지정하지 않는다 
 *      자동으로 인덱스 번호 관리 => 빈공백이 없다 
 *           => 메모리 누수가 없다 
 *           => 인덱스는 항상 순차적이다 
 *           
 *       => 주요 메소드 (List)
 *          add(Object) :추가
 *          remove(int index) : 삭제 
 *          get(int index): 읽기
 *          isEmpty(): 값이 있는지 확인
 *          clear() : 전체 삭제 
 *          size() : 저장 갯수 
 *          -------------------
 *          두개의 데이터 
 *            retainAll() : 교집합 
 *            addAll() : 전체 데이터 
 *            removeAll() : 차집합 
 *          배열을 ArrayList
 *          Arrays.asList(배열명) 
 */
import java.util.*;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
public class Collection_3 {
    public List<String> genieData()
    {
    	List<String> list=new ArrayList<String>();
    	try
    	{
    		Document doc=
    				Jsoup.connect("https://www.genie.co.kr/chart/top200").get();
    		// 곡명 
    		Elements title=doc.select("table.list-wrap a.title");
    		for(int i=0;i<title.size();i++)
    		{
    			list.add(title.get(i).text());
    		}
    		
    	}catch(Exception ex){}
    	return list;
    }
    public List<String> melonData()
    {
    	List<String> list=new ArrayList<String>();
    	//https://www.melon.com/chart/index.htm
    	/*
    	 *   <div class="wrap_song_info">
				<div class="ellipsis rank01"><span>
				  <a href="javascript:melon.play.playSong('1000002721',601555642);" title="SWIM 재생">
				  SWIM</a>
    	 */
    	try
    	{
    		Document doc=
    				Jsoup.connect("https://www.melon.com/chart/index.htm").get();
    		// 곡명 
    		Elements title=doc.select("div.wrap_song_info div.rank01 a");
    		for(int i=0;i<title.size();i++)
    		{
    			list.add(title.get(i).text());
    		}
    		
    	}catch(Exception ex){}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Collection_3 co=new Collection_3();
        List<String> genie=co.genieData();
        System.out.println("======== 지니뮤직 =======");
        for(int i=0;i<genie.size();i++)
        {
        	System.out.println((i+1)+"."+genie.get(i));
        }
        
        List<String> melon=co.melonData();
        System.out.println("======== 멜론뮤직 =======");
        for(int i=0;i<melon.size();i++)
        {
        	System.out.println((i+1)+"."+melon.get(i));
        }
        // 지니뮤직에만 있는 노래 
        //System.out.println("======= 지니뮤직에 있는 곡명 =======");
        /*
        genie.removeAll(melon);
        // [1,2,3,4,5]-[1,2,3,6,7] ==> 4,5
        for(int i=0;i<genie.size();i++)
        {
        	System.out.println((i+1)+"."+genie.get(i));
        }
        */
        /*System.out.println("========== 멜론에 있는 곡명 =====");
        melon.removeAll(genie);
        // [1,2,3,4,5]-[1,2,3,6,7] ==> 4,5
        for(int i=0;i<melon.size();i++)
        {
        	System.out.println((i+1)+"."+melon.get(i));
        }*/
        // 공통으로 가지고 있는 곡명
        /*System.out.println("===== 공통으로 가지고 있는 곡명 ====");
        genie.retainAll(melon);// genie에 저장된 데이터가 변경
        System.out.println("공통 곡:"+genie.size());
        for(int i=0;i<genie.size();i++)
        {
        	System.out.println((i+1)+"."+genie.get(i));
        }*/
        // 지니뮤직+멜론 
        System.out.println("==== 멜론+지니뮤직 ====");
        List<String> list=new ArrayList<String>();
        list.addAll(genie);
        list.addAll(melon);
        for(int i=0;i<list.size();i++)
        {
        	System.out.println((i+1)+"."+list.get(i));
        }
        
        System.out.println("==== 멜론+지니뮤직 중복제거====");
        Set<String> set=new HashSet<String>();
        set.addAll(genie);
        set.addAll(melon);
        int k=1;
        for(String s:set)
        {
        	System.out.println(k+"."+s);
        	k++;
        }
	}

}
