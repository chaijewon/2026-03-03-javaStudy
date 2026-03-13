/*
 *   1차 배열 
 *   -------
 *   1) 기능별 나눠서 저장 
 *   2) 데이터형 : 같은 데이터형만 저장 
 *               ---------- 작은 데이터형도 저장이 가능 
 *               int[] arr={'a','b','c'...};
 *               ----- 크거나 같다 (작은 경우에는 형변환)
 *   3) 선언 
 *      데이터형[] 배열명; // 데이터형 배열명[] 
 *      -------------- 권장 사항
 *   4) 초기값 
 *      명시적  int[] arr={1,2,3,4,5}
 *      ---- 
 *      난수   
 *      파일 
 *      ---- 먼저 선언 : 데이터형[] 배열명=new 데이터형[갯수] 
 *   5) 값 변경 
 *      ------ 전체 변경 for(int i=0;i<arr.length;i++)
 *      ------ 한개 변경 arr[0]=10
 *   6) 출력 
 *      for-each 
 *      for(변수선언:배열명) => 실제 배열에 저장된 값 읽기 
 *   7) 배열 참조 
 *      얕은 복사  : 별칭 => 참조 배열을 동시에 사용이 가능 
 *      깊은 복사  : 배열을 통째로 복사 
 *                 => 새로운 메모리에 저장 
 *   8) 배열 => 메모리 주소를 이용하는 프로그램 
 *             -------- 배열 / 클래스 
 *             Stack        Heap
 *              => 주소        => 실제 데이터 저장 
 *      
 *      int[] arr={10,20,30,40,50};
 *      
 *      stack        heap  : 연속적으로 메모리 할당 (반드시 동일한 크기) 
 *                    arr[0] [1] [2] [3] [4] => 일반 변수와 동일하게 사용
 *      -- arr --     ------------------------
 *        0x100   ->     10  20  30  40  50  참조 변수
 *      ---------    |------------------------
 *                  0x100    |    |   |   |
 *                                       0x116
 *                                   0x112
 *                              0x108
 *                           0x104
 *      String : 문자열을 저장하는 데이터형 + 클래스 
 *               ---------- char[]
 *         | char[]을 조작하는 클래스 (문자 인덱스 => 0)
 *     *** 인덱스번호는 0번부터 시작 
 *     *** length는 1개가 많다 
 *     *** 배열의 크기 => 배열명.length
 *     *** 한번 선언하면 => 고정 (크기 UP => 새로운 배열 생성)
 *                            크기 DOWN => 새로운 배열 생성 
 *   
 */

import java.util.Scanner;

public class 배열_정리 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        영화데이터 movie=new 영화데이터();
        while(true)
        {
        	System.out.println("====== 메뉴 =======");
        	System.out.println("1. 영화 목록");
        	System.out.println("2. 영화 상세보기");
        	System.out.println("3. 영화명 찾기");
        	System.out.println("4. 출연진으로 영화 찾기");
        	System.out.println("5. 장르별 찾기");
        	System.out.println("6. 종료");
            System.out.println("===================");
            System.out.print("메뉴 선택:");
            int menu=scan.nextInt();
            if(menu==6)
            {
            	System.out.println("프로그램 종료");
            	break;
            }
            else if(menu==1)
            {
            	for(int i=0;i<영화데이터.title.length;i++)
            	{
            		System.out.println((i+1)+"."
            			+영화데이터.title[i]);
            	}
            }
            else if(menu==2)
            {
            	System.out.print("상세볼 영화번호(1~1938):");
            	int no=scan.nextInt();
            	if(no<1 || no>1938)
            	{
            		System.out.println("없는 영화입니다!!");
            		continue;
            	}
            	System.out.println("===== 영화 상세 =====");
            	System.out.println("영화명:"+movie.title[no-1]);
            	System.out.println("장르:"+movie.genre[no-1]);
            	System.out.println("출연:"+movie.actor[no-1]);
            	System.out.println("감독:"+movie.director[no-1]);
            	System.out.println("개봉일:"+movie.regdate[no-1]);
            	System.out.println("등급:"+movie.grade[no-1]);
            }
            else if(menu==3)
            {
            	System.out.print("검색어 입력:");
            	String fd=scan.next();
            	for(String data:movie.title)
            	{
            		if(data.contains(fd))
            		{
            			System.out.println(data);
            		}
            	}
            }
            else if(menu==4)
            {
            	System.out.print("배우명:");
            	String fd=scan.next();
            	for(int i=0;i<movie.actor.length;i++)
            	{
            		if(movie.actor[i].contains(fd))
            		{
            			System.out.println(movie.title[i]
            					+"("+movie.actor[i]+")");
            		}
            	}
            }
            else if(menu==5)
            {
            	System.out.print("장르:");
            	String fd=scan.next();
            	for(int i=0;i<movie.genre.length;i++)
            	{
            		if(movie.genre[i].contains(fd))
            		{
            			System.out.println(movie.title[i]
            					+"("+movie.genre[i]+")");
            		}
            	}
            }
        }
	}

}
