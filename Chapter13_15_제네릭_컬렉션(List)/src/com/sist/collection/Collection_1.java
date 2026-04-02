package com.sist.collection;
/*
 *   1. 컬렉션이란? 
 *      ----- 데이터(값)를 담아두는 상자(메모리)들 모음
 *      예) 친구 이름 / 전화 번호 / 맛집 정보...
 *      => 쉽게 관리하기 위헤 만들어 준 것 
 *         (컬렉션 프레임워크) 
 *               ---------> 표준화 (통일화)
 *               ---------> 기본 틀 
 *   2. 사용하는 이유 
 *      = 배열 
 *        1) 크기 고정 (늘리기,줄이기 => 어렵다) 고정적 
 *           일반 목록 출력 => 검색이 어렵다 
 *        2) 기능 부족 (정렬 / 검색 직접 구현)
 *      = 배열 보완 (단점) 
 *        1) 크기 자동 조절
 *        2) 정렬 , 검색 기능 제공 
 *        3) 모든 개발자가 동일하게 사용 (소스) => 표준화 
 *   3. 컬렉션 종류 
 *          Collection --- interface 
 *              |
 *     ---------------------
 *     |        |          |
 *   List      Set        Map ----- interface
 *              |          |
 *           --------    --------
 *           |      |    |       |
 *                     Hashtable **HashMap 
 *         **HashSet TreeSet 
 *     | 구현된 클래스 
 *   ----------------
 *   |      |       |
 *        Vector  LinkedList => Queue
 *  **ArrayList
 *  
 *  ==> 기준점 
 *      List : 순서가 있다 (추가시마다 자동으로 인덱스번호 부여)
 *             데이터 중복을 허용 
 *             대표적 : ArrayList
 *      Set : 순서는 없고 데이터 중복이 없다
 *             대표적 : HashSet 
 *             => DISTINCT => 영화등록 => 장르
 *      Map : 목차 => 키,값 => 동시에 저장 
 *            대표적 : HashMap 
 *             => 클래스 관리 , SQL 
 *             => 스프링 / MyBatis 
 *     ----------------------------------
 *      List  순서 O , 중복 O => 목록 / 전화번호 
 *     ----------------------------------
 *      Set   순서 X , 중복 X => 로또번호 / 수험번호 
 *                             파일
 *     ----------------------------------
 *      Map   key-value    => 전화번호 
 *     ----------------------------------
 *     
 *     => 데이터를 편하게 저장해서 관리하기 위한 목적 (표준화)
 *     => 프로그램에서 가장 중요한 것 
 *        변수 : 데이터 관리 
 *        --------------- React / Vue : 증권 
 *        
 *     List 
 *       사용처 : 순차적으로 데이터 저장 
 *              인덱스 통해서 접근이 필요한 경우 
 *              ---- 게시판 / 예약정보 / 장바구니 
 *       구현된 클래스 
 *       ArrayList : 데이터베이스 (웹 핵심)
 *                   => 비동기 
 *       Vector : 네트워크 => 접속자 관리 
 *                  => 동기화
 *       LinkedList : 파일 관리 => C언어
 *       
 *    -----------------------------------------
 *    ArrayList 
 *        배열 기반 / 검색 속도가 빠르다 
 *        순차적으로 저장 / 조회 위주 / 접근 속도가 빠르다 
 *        => 추가/삭제시에 속도가 늦다 
 *    -----------------------------------------
 *    LinkedList 
 *        노드기반 / 추가/삭제시에 속도가 빠르다 
 *        파일 기반 => 접근 속도가 늦다 
 *        => 추가/수정이 많은 경우 
 *    -----------------------------------------
 *    Vector 
 *          동기화 : 멀티쓰레드 (네트워크 , 게임) 
 *          Vector를 보완 => ArrayList
 *    -----------------------------------------
 *    회원 관리 시스템 
 *      회원 ID 저장 =======> Set
 *      회원 정보 저장 ======> (id,정보) => Map
 *    게시판 
 *      목록 ========> ArrayList
 *      댓글 순서 관리  => LinkedList
 *    검색엔진 : HashMap 
 *    랭크 시스템 : TreeSet => 자동 정렬 
 *    
 *    모든 프로그램 => 데이터 관리
 */
// ArrayList 
import java.util.*;
/*
 *    순서를 가지고 있다 (추가시마다 => 자동 인덱스) => 배열기반 
 *    // ==> 인덱스번호는 0부터 
 *    저장된 데이터 중복 허용 
 *    메모리상에 저장 => CRUD
 *    비동기적 => 데이터베이스 연결 => 최적화 
 *    주요 기능 
 *      추가 : add(데이터) : 맨뒤에 추가 ***
 *            add(int index,데이터) : 지정된 위치에 추가 
 *            0 1 2 3 4 5
 *                |
 *            0 1 2 3 4 5 6 => 항상 순차적 => for 
 *      삭제 : remove(int index) 
 *            0 1 2 3 4 5
 *                -
 *                2 3 4
 *      수정 : set(int index,변경될 데이터)
 *      읽기 : get(int index)
 *      갯수 : size() 
 *      전체 삭제 : clear() 
 *      데이터 존재 여부 : isEmpty()  => List
 *      
 *      주로 사용처 
 *          오라클 데이터를 읽어서 => 브라우저에 전송 
 *          쿠키를 읽어서 브라우저에 전송 
 */
public class Collection_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 저장 공간을 만든다 
		ArrayList list=new ArrayList();
		// 추가 
		list.add("홍길동"); // 0
		list.add("심청이"); // 1
		list.add("박문수"); // 3
		// 김두한 
		list.add("춘향이"); // 4
		list.add("이순신"); // 5
		// 저장된 데이터 출력 
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 저장 
		System.out.println("==== 지정된 위치에 저장 =====");
		list.add(2,"김두한");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		// 삭제  : remove(int index)
		list.remove(3);
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		// 수정 : set(int index,값)
		list.set(2, "강감찬");
		for(int i=0;i<list.size();i++)
		{
			System.out.println(i+"."+list.get(i));
		}
		
		// 인원 몇명 : size
		System.out.println("현재 인원:"+list.size());
		// 전체 인원 삭제 
		list.clear();
		System.out.println("현재 인원:"+list.size());
		
		if(list.isEmpty())
		{
			System.out.println("저장된 데이터가 없습니다");
		}
		else
		{
			System.out.println("저장된 데이터가 존재합니다");
		}
		
	}

}
