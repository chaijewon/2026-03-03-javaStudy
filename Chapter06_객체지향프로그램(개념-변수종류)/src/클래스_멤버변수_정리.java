/*
 *    관련된 데이터를 모아서 관리 => 클래스 
 *    ---------- 데이터형이 다른 경우
 *    사용자 정의 데이터형 => 일반 변수와 동일 
 *                       ------------- 형변환 / 대입 
 *    1. 정적 변수 
 *       [접근지정어] static 데이터형 변수명;
 *    2. 인스턴스 변수
 *       [접근지정어] 데이터형 변수명 
 *    3. 정적변수 / 인스턴스 변수는 반드시 클래스 블록안에 설정 
 *       메소드 블록 : 지역변수 
 *    4. 정적변수 / MethodArea 
 *                모든 객체가 데이터를 공유할 수 있게 만든다 
 *                => 단 한개의 메모리 생성되는 공간 
 *                => 객체와 독립적인 생명주기
 *                   => 객체가 소멸 => 메모리 유지가 가능 
 *                => 공통 데이터 관리 영역 
 *    5. 인스턴스변수 / Heap 
 *                  ----- 실제 데이터가 저장 
 *                  ----- new를 이용한 경우에 저장공간을 생성 => 데이터저장
 *                        --- 객체는 자신의 영역만 접근이 가능 
 *    6. 지역변수 / Stack
 *               ------- 메모리 자체 관리 => {} 종료되면 자동으로 해제
 *               ------- return
 *    1) 변수 설정 => 데이터가 없는 프로그램은 없다 
 *       ------- 가공 (연산자/제어문)
 *       | 데이터베이스 => 50%
 *    ------------------------- 쌍용정보통신 => 신규사원 
 *    
 *    데이터저장 ===== 데이터 가공 ==== 가공된 데이터 출력 
 *      |              |               |
 *    기본형/참조형     연산자/제어문     System.out.println()
 *      |
 *    배열 
 *      |
 *     클래스 
 *     ------- 메모리 저장 
 *      |
 *     File
 *      |
 *     오라클 : static 
 *     
 *     ----------------> JSP => 클래스 / getter/setter
 *                              | => Bean
 *     7. 인스턴스 변수 / 정적 변수의 차이점 
 *     ----------------------------------
 *              인스턴스 변수      정적 변수
 *     ----------------------------------
 *     선언방식   클래스블록 선언    클래스 블록 선언 => static 
 *     ----------------------------------
 *     저장시점   new 연산자를 이용   컴파일시에 자동 저장 
 *              => 메모리 공간이 확보
 *     ----------------------------------
 *     저장위치   Heap             MethodArea => 메모리 공간 1개 생성 
 *              개발자가 정하는 메모리 공간 
 *              => 개발자 
 *                 new / delete
 *                       (자동 메모리 해제:GC)
 *     ----------------------------------
 *     공유여부   객체마다 독립적인 메모리 생성 모든 객체가 하나의 메모리를 공유 
 *              공유하지 않는다 
 *     ----------------------------------
 *     접근방법   객체.변수명       클래스명.변수명 
 *     ----------------------------------
 *     생명주기   객체가 메모리에 있는 동안 프로그램 종료시까지 사용이 가능 
 *     ----------------------------------
 *     
 *     static => 로그 / 회사명 , 나머지는 인스턴스  
 *     
 *     
 *     
 *     1. year / month 
 *     2. 윤년 
 *     3. 요일 구한다 
 *     4. 1일자부터 출력 
 *       
 */
import java.util.*;
class Diary
{
	int year,month,week,lastday;
	// => class에 있는 모든 영역에서 사용이 가능 
	void 사용자입력()
	{
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		year=scan.nextInt();
		System.out.println("월 입력:");
		month=scan.nextInt();
	}
	void 요일_마지막날_구하기()
	{
		Calendar cal=Calendar.getInstance();
		// 객체 생성 => 추상클래스는 new를 사용할 수 없다
		cal.set(Calendar.YEAR, year);
		cal.set(Calendar.MONDAY, month-1);
		cal.set(Calendar.DATE, 1);
		
		week=cal.get(Calendar.DAY_OF_WEEK);
		lastday=cal.getActualMaximum(Calendar.DATE);
		week=week-1;
	}
	
	void print()
	{
		System.out.println(year+"년도 "+month+"월\n");
		String[] strWeek={"일","월","화","수","목","금","토"};
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
		}
		System.out.println("\n");
		
		/*
		 *   Calendar => month=0,week=1
		 */
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					System.out.print("\t");
				}
			}
			System.out.printf("%02d\t",i);
			week++;
			if(week>6)
			{
				week=0;
				System.out.println();
			}
		}
	}
	
}
public class 클래스_멤버변수_정리 {
//    int a=10;
//    void increment()
//    {
//    	System.out.println("a="+a);
//    	a--;
//    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 클래스_멤버변수_정리 a=new 클래스_멤버변수_정리(); a.increment(); a.increment(); a.increment();
		 * a.increment(); a.increment();
		 */
		Diary d=new Diary();
		d.사용자입력();
		d.요일_마지막날_구하기();
		d.print();
	}

}


