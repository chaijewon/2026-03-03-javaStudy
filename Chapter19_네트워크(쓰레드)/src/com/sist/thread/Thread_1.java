package com.sist.thread;
/*
 *    프로세스 : 한개의 프로그램  
 *    쓰레드 : 한개의 프로세스안에서 여러개의 기능을 동시에 수행 
 *           게임 (슛팅) 
 *           --------- 프로세스 
 *           = 비행기
 *           = 총알 
 *           ----- 쓰레드
 *           = 아바타 => 게이머 조절 
 *    메소드 호출 : 동시성 , 시분할 
 *    -------------------------
 *    게임 / 서버 (여러명이 동시에 접속) 
 *         ----------------------- 웹서버 / 디비서버 
 *                                 -----  -------- 오라클 
 *                                 | tomcat 
 *    쓰레드 구현 
 *      = Thread  클래스 상속 
 *        class A extends Thread 
 *        {
 *        }
 *      = Runnable 구현 ===> 표준화 
 *        class A implments Runnable
 *        {
 *        }
 *      = ExecutorService => 쓰레드 풀 (관리) => 현업에서는 가장 많이 사용
 *        => 쓰레드를 미리 생성 => 사용 => 반환 
 *                                    |
 *                                   재사용 
 *    쓰레드의 생명주기 
 *                                      === Blocked (일시정지)
 *    new ========= Runnable ======== Running 
 *    생성                               === Dead (메모리 해제)
 *    
 *    1. new : 생성
 *       Thread t=new Thread()
 *       => JVM 
 *          이름 부여 => 변경 
 *                     Thread-0
 *          => getName() / setName()
 *          우선 순위 부여(1~10)
 *          1. MIN_PRIORITY => GC
 *          5. NORM_PRIPRITY : 생성 
 *          10. MAX_PRIORITY => main => 쓰레드
 *          
 *       == 기준 (작업기준) 
 *       == 쓰레드는 한가지 일만 수행 
 *          총알 / 비행기 ...
 *    2. Runnable 
 *       대기상태 => 자원 공유 
 *                 (CPU가 메모리 공간) 
 *       start()
 *    3. Running 
 *       쓰레드 실행 => 쓰레드가 어떻게 동작할지 
 *       run() : 동작 코딩 
 *    4. 일시정지 : sleep() , wait()...
 *    5. 종료 : 쓰레드 해제 
 *       interrupt()
 *       
 *    ---------------- 시분할 : 쓰레드,네트워크 : 서버에서 필수 
 *        
 */
// 1. Thread 상속 => 시분할 : 한번씩 나눠서 작업 
class MyThread extends Thread
{
	// 동작 
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(getName()+":"+i);
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}
		}
	}
}
public class Thread_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();
        
        t1.setName("말");
        t2.setName("소");
        t3.setName("돼지");
        
        // 우선 순위 변경 
        t1.setPriority(10);// 가장 빠른 속도
        t2.setPriority(3);
        t3.setPriority(1);
        
        t1.start(); // run()
        t2.start();
        t3.start();
        
	}

}
