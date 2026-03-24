package com.sist.back;
// 추상 클래스 
/*
 *   1. Genie
 *      1) 데이터가 50개 
 *      2) 기능 
 *         ***크롤링 
 *         목록 
 *         상세보기 
 *         검색 => 가수명,곡명 , 앨범 
 *         동영상 보기 
 *   2. Melon
 *      1) 데이터가 50개 
 *      2) 기능 
 *         ***크롤링 
 *         목록 
 *         상세보기 
 *         검색 => 가수명,곡명 , 앨범 
 *         동영상 보기 
 */

import com.sist.vo.Music;

public abstract class CommonsMusic {
    public static Music[] musics=new Music[50];
    // 데이터 수집 
    public abstract void init();//genie/melon
    // 목록 출력 
    public Music[] musicAllData() 
    {
    	return musics;
    }
    // 상세보기 
    // 검색 
    // 동영화 
    
}
