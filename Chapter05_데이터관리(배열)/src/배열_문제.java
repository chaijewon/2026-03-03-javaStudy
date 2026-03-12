/*
 *   배열 : 같은 유형 데이터를 여러개 모아서 관리할 목적 
 *         => 가변형 / 필요 데이터 저장이 가능 => 컬렉션
 *            ArrayList / LinkedList / Vector / Map / Set
 *     1) 특징 
 *         = 연속적인 메모리 할당 => 인덱스를 이용한 접근 
 *         = 고정된 크기 
 *           배열 크기는 선언시에 정해진다 
 *           한번 선언하면 변경이 불가능 하다 
 *           1) 선언 
 *              데이터형[] 배열명={값....} 선언과 동시에 초기화 
 *              데이터형[] 배열명=new 데이터형[갯수]
 *                   ---- 빈 괄호
 *              -------- 데이터형 
 *         = 동일한 데이터 타입(가급적이면) 
 *           int[] arr={'A','B'...}
 *           
 *     2) 장점 
 *         = 빠른 접근 속도 => 인덱스번호를 이용하기 
 *           원래 => CPU자주사용시 데이터를 cache에 저장후 사용 
 *         = 간단한 구현 : 배열의 데이터 저장 구조 => 단순하다 
 *         = 고정된 크기 : 메모리의 사용량을 예측 => 메모리 관리가 쉽다 
 *           
 *     3) 단점 
 *         = 고정된 크기 : 추가,삭제시에 어렵다 (비용이 많이 들어간다)
 *         = 메모리 낭비 : 크게 만들면(사용이 없는 메모리) 
 *                      적게 만들면 데이터 추가 저장이 어렵다 
 *         = 같은 데이터형만 저장 => 유연성이 떨어진다 
 *     4) 배열선언 
 *         데이터형[] 배열명 
 *            |       |
 *                   식별자 
 *         저장할 데이터형
 *        
 *     5) 초기화
 *         선언과 동시에 초기화
 *         데이터형[] 배열명={값,값....} => 명시적 초기화 
 *         디폴트 생성  
 *         데이터형[] 배열명=new 데이터형[갯수]
 *                 int => 0
 *                 long => 0L
 *                 double => 0.0 
 *                 boolean => false
 *                 String => null
 *     6) 반복문을 이용 출력 방법 
 *        => for-each (향상된 for) => 브라우저 화면 UI
 *           for(변수선언:배열명)
 *                      저장 위치 
 *               ------ 배열에 실제 저장된 값을 받는다 
 *               ------ 인덱스를 이용하지 않고 실제 저장된 값 이용 
 *               ------ 자동으로 종료
 *               ------ 배열범위 초과시에 오류 발생 
 *     7) 저장 위치가 다르다 
 *        int[] arr={10,20,30}
 *          stack               heap
 *        ---arr---         ----------------
 *          0x100             10   20    30
 *        ---------    0x100----------------
 *                            |    arr[1] arr[2]
 *                           arr[0]
 *                           --------------------
 *                           | 일반 변수와 동일 
 *                             -------
 *                             | 읽기/쓰기
 *                               => getter / setter
 *        실제 저장된 메모리 주소를 이용한 데이터형 => 참조 데이터형 
 *                 ---------
 *                 1. 배열
 *                 2. 클래스 ==> 여러개의 데이터를 참조
 */

import java.util.Arrays;

public class 배열_문제 {
   public static void main(String[] args) {
	  /*
	   *    1. 
	   *        1) int[] n = {1, 2, 3, 4, 5};
				2) int n[] = {0}; // 변수
				3) int[] n = new int[3];
				4) int n[3] = new int[3];
				-------------------------
	  */
	  /*
		    1) 10개의 문자를 가지는 배열 c를 생성하는 코드를 한 줄로 쓰라.
​               char[] c=new char[10];
			2) 0에서 5까지 정수 값으로 초기화된 정수 배열 n을 선언하라.
			   int[] n={0,1,2,3,4,5}​
			3) '일', '월', '화', '수', '목', '금', '토'로 초기화된 배열 day를 선언하라.
			    char[] day={'일', '월', '화', '수', '목', '금', '토'};​
			4) 4개의 논리 값을 가진 배열 bool을 선언하고 true, false, false, true로 선언하라
		        boolean[] bool={true, false, false, true}
			char[] alpha = {'a', 'b', 'c', 'd'};

			for(int i=0;i<alpha.length;i++)
			              ------------ 
			     System.out.print(alpha[i]);
			     
      */
	   /*
            양의 정수 10개 입력받아 배열에 저장하고, 
            배열에 있는 정수 중에서 3의 배수만 출력하는 프로그램을 작성하라
       */
	   int[] arr=new int[10];
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=(int)(Math.random()*100)+1;//1~100
		   if(arr[i]%3==0)
			   System.out.print(arr[i]+" ");
	   }
	   System.out.println();
	   /*
            정수를 10개 저장하는 배열을 만들고 1에서 10까지 범위의 정수를 랜덤하게 생성하여 배열에 저장하라. 
            그리고 배열에 든 숫자들과 평균을 출력하라.
       */
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=(int)(Math.random()*10)+1;
	   }
	   int sum=0;
	   for(int i:arr)
	   {
		   sum+=i;
	   }
	   System.out.println(Arrays.toString(arr));
	   System.out.printf("평균:%.2f\n",sum/10.0);
	   /*
            5개 정수를 입력받은 후 차례로 출력하는 프로그램 
			입력예) 5 10 9 3 2
			출력예) 5 10 9 3 2
	   */
	   int[] arr2=new int[5];
	   for(int i=0;i<arr2.length;i++)
	   {
		   arr2[i]=(int)(Math.random()*10)+1;
	   }
	   for(int i:arr2)
	   {
		   System.out.print(i+" ");
	   }
	   System.out.println();
	   /*
			문자 10개를 저장할 수 있는 배열을 선언하고 
			10개의 문자를 입력받아 입력받은 문자를 이어서 출력하는 프로그램 
			입력예) A B C D E F G H I J
			출력예) ABCDEFGHIJ
	    */
	   char[] arr3=new char[10];
	   for(int i=0;i<arr3.length;i++)
	   {
		   arr3[i]=(char)(i+65);
	   }
	   for(char c:arr3)
		   System.out.print(c);
	   
	   System.out.println();
	   /*
			정수 10개를 입력받은 후 세번째, 다섯번쨰와 
			마지막으로 입력받은 정수를 차례로 출력하는 프로그램 
			입력예) 5 3 9 6 8 4 2 8 10 1
			출력예) 9 8 1
	     */
	   for(int i=0;i<arr.length;i++)
	   {
		   arr[i]=(int)(Math.random()*10)+1;
	   }
	   System.out.println(Arrays.toString(arr));
	   System.out.println(arr[2]);
	   System.out.println(arr[4]);
	   System.out.println(arr[arr.length-1]);
	   /* 
			10개의 정수를 입력받아 그 중 가장 큰 수를 출력하는 프로그램
			입력예) 5 10 8 55 6 31 12 24 61 2
			출력예) 61
	   */
	   int max=arr[0];
	   for(int i:arr)
	   {
		   if(max<i)
			   max=i;
	   }
	   System.out.println("최대값:"+max);
	   /*
			10명의 컴퓨터 정수를 입력받아 배열에 저장하고 
			총점과 평균을 구하여 출력하는 프로그램을 작성
	   */
	   sum=0;
	   for(int i:arr)
	   {
		   sum+=i;
	   }
	   System.out.println("sum="+sum);
	   System.out.printf("평균:%.2f\n",sum/10.0);
   }
}
