/*
 *   클래스 
 *     학생 => 한명에 대한 설명 
 *     맛집 => 맛집 한개에 대한 저장 
 *     레시피 => 레시피 한개에 대한 설계 
 *     -----
 *      => 100 => new
 *      => 설계 : 사이트의 상세보기 
 *      => 영화 => CGV / 롯데시네마 / 메가박스 
 *                ----------------------
 *                | 공통으로 사용되는 변수 
 *                  --- 추상화 
 *   -----------------------------------
 *   학생 => 국어 / 영어 / 수학 / 총점 / 평균 / 학점 / 이름 
 *   class Student
 *   {
 *      int kor,eng,math,total;
 *      double avg;
 *      char score;
 *      String name 
 *   }
 */
import java.util.*;
class Student
{
	int kor,eng,math,total;
	double avg;
	char score;
	String name; 
}
/*
 *   한명에 대한 모든 정보를 통합된 메모리에 저장이 된다 
 *            ------------------------- 객체(메모리 주소)
 *   => 여러명 => 인스턴스 
 *              ------- 중심 
 *   => 한개 => 정적변수 ==> 한번에 변경에 되게 만드는 것 
 *             ------ 거의 빈도수는 없다
 *             
 *   class ClassName
 *   {
 *      ------------
 *       변수 => 멤버변수 
 *      ------------
 *       초기화 => 생성자 
 *               ----- 클래스명과 동일 
 *               ----- 단독으로 호출이 불가능 
 *                     ----------------- 반드시 new를 사용해야 된다
 *                     생략이 되면 자동으로 컴파일시에 추가 
 *      ------------
 *       기능 설정 => 메소드 
 *      ------------
 *      변수 => 멤버변수 
 *      ------------
 *   }
 *            
 */
public class 클래스_변수_장점 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Student[] std=new Student[3];
        // 데이터형 => 사용자 정의 
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<3;i++)
        {
        	Student s=new Student();
        	
        	System.out.print("이름 입력:");
        	s.name=scan.next();
        	
        	System.out.print((i+1)+"번째 국어 점수:");
        	s.kor=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 영어 점수:");
        	s.kor=scan.nextInt();
        	
        	System.out.print((i+1)+"번째 수학 점수:");
        	s.kor=scan.nextInt();
        	
        	s.total=s.kor+s.eng+s.math;
        	s.avg=s.total/3.0;
        	
        	std[i]=s;
        }
        /*
         *   System.out.println(ss.name+" "+
         *        ss.kor+" "
         *        +ss.eng+" "
         *        +ss.math+" "
         *        +ss.total+" "
         *        +ss.avg);
         *        ----------
         *        
         *        ==> %7.2f ==> 자동 반올림 
         *            79.56
         *           
         */
        for(Student ss:std)
        {
        	System.out.printf("%5s%5d%5d%5d%7d%7.2f\n",
        			ss.name,ss.kor,ss.eng,ss.math,
        			ss.total,ss.avg);
        }
	}

}
