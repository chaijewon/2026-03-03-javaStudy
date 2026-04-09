package com.sist.thread;
// 스프링에서 Task 사용 => 스케쥴러 (지정된 시간에 반복 수행)
// => BackUp , 실시간 , 뉴스 
// ExecutorService : 쓰레드 풀 : 쓰레드를 관리하는 영역 
// 쓰레드 생성 갯수를 제한 => 회수 => 재사용 
// => 실무 게임 => 총알 / 비행기 
// => ConnectionPool : 데이터베이스 
/*
 *    submit() => 작업 실행 
 *    shutdown() => 종료 
 *    invokeAll() => 여러 작업을 동시 
 *    get() => 결과받기 
 *    ----------------------- Spring 
 */
// 한번만 실행
import java.util.concurrent.*;
public class Service_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ExecutorService ex=Executors.newSingleThreadExecutor();
         ex.submit(()->System.out.println("실행1"));
         ex.submit(()->System.out.println("실행2"));
         ex.submit(()->System.out.println("실행3"));
         ex.shutdown();
	}

}
