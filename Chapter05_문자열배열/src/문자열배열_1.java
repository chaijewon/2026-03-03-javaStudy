/*
 *   배열 : 여러개의 같은 데이터형을 모아서 쉽게 관리 
 *         => 관리가 쉽다 / 고정적이다 => 한번 변경이 불가능 
 *    167page 
 *    1. 배열 선언 
 *       데이터형[] 배열명;
 *       ------ 기본형 / String / 사용자 정의 클래스 
 *    2. 배열 초기화 
 *       = 선언과 동시에 초기화 
 *       int[] arr={1,2,3,4,5} => 명시적 초기화 
 *             => 미리 값을 알고 있는 경우 
 *       String[] names={"홍길동","심청이","이순신","김두한","강감찬"};
 *       = 값을 모르는 경우 
 *         1) 파일 읽기 
 *         ***2) 데이터베이스 읽기 
 *         ***3) 크롤링 
 *         4) 임의로 추출 (random)
 *         5) 입력값
 *    3. 배열 출력 
 *       => 일반 for : 인덱스 번호를 이용 
 *       => for-each : 배열에 저장된 실제 데이터값 
 *       => Arrays.toString()
 *    4. 배열 데이터 변경 
 *       = 반드시 => 인덱스 번호를 이용한다 
 *    5. 배열 특징 
 *       = 변수: 한개의 데이터만 저장 
 *       = 변수를 여러개 묶어서 한번에 저장하는 공간 설정 => 배열 
 *       = 데이터 관리는 쉽다 => 인덱스번호 이용
 *       = 고정적 / 같은 데이터형만 묶을 수 있다
 *         | 컬렉션 | 클래스 
 *       = 프로그램은 익숙한 경우 => 반복 / 숙달
 *       = NCS(이론:80% 실습:20%) / KDT(이론:20%, 실습:80%) 
 *       ----------------------------------------------
 *       = 선언을 하면 => 연속적으로 메모리 공간 생성 
 *                     ------ 인덱스 번호 사용이 가능 
 *                     ------ 공간의 크기가 동일 => 같은 데이터형만 사용이 가능 
 *       = 배열명은 stack공간에 실제 데이터는 heap에 저장 
 *         int[] arr={1,2,3,4,5}
 *         --- arr --      ------------------
 *           100      ->    1  2   3  4  5
 *         ----------   100------------------
 *                            104 108 112 116
 *                         arr[0] arr[1] ....
 *                         ------------- for문과 관련 
 *          arr[0] => 주소가 100번지인 첫번째 값을 가지고 온다
 *       ----------------------------------------------------
 *    
 */

import java.util.Arrays;

public class 문자열배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String hong="홍길동";
        String shim="심청이";
        String kim="김두한";
        String lee="이순신";
        String kang="강감찬";
        
        // 1. 반복문 사용이 안된다 => 반복문은 변수명 1개일때 사용이 가능
        System.out.println(hong);
        System.out.println(shim);
        System.out.println(kim);
        System.out.println(lee);
        System.out.println(kang);
        // 2. 묶어서 사용 
        String[] names={hong,shim,kim,lee,kang};
        for(int i=0;i<names.length;i++)
        {
        	System.out.println(names[i]);
        }
        // 3. 인덱스보다 실제 데이터 읽기 
        for(String name:names)
        {
        	System.out.println(name);
        }
        // 4. 라이브러리 이용 => 출력 
        System.out.println(Arrays.toString(names));
        // 5 변경 => 인덱스를 이용해서 변경 
        names[0]="박문수";
        System.out.println(Arrays.toString(names));
        
        // main=>분업 => 나눠서 작업 => 메소드 
        
	}

}
