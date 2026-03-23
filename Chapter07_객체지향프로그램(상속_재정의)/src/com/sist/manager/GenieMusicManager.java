package com.sist.manager;
/*
 *   공통으로 적용되는 메소드 / 변수 
 *   ------------------------ static 
 *   | => 상속 
 *     코딩을 줄일 수 있다 
 *     필요시에 변경헤서 사용이 가능 : 오버라이딩 
 *   | => 추상클래스 / 인터페이스 => 상속 / 오버라이딩 
 *   
 *   286 ~ 290 생성자 호출 
 *   => 상속 내리는 클래스 => 생성자 (매개변수가 있는 경우)
 *      => 상속 받는 클래스에서는 반드시 super(매개변수..)
 */
public class GenieMusicManager {
    public static Music[] musics=new Music[100];
    // static {} , 생성자 
    public void init()// 크롤링후 배열에 저장 
    {
    	
    }
    // 목록 출력
    public Music[] musicAllData()
    {
    	return musics;
    }
    // 상세 보기
    public Music musicDetail(int mno)
    {
    	Music m=new Music();
    	for(Music mm:musics)
    	{
    		if(mm.getMno()==mno)
    		{
    			m=mm;
    			break;
    		}
    	}
    	return m;
    }
    // 검색 
    public Music[] musicFind(String type,String fd)
    {
    	return musics;
    }
    // 동영상 
    public String musicKey(String title)
    {
    	String key="";
    	return key;
    }
}
