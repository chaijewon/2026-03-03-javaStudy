// 국어 영어 수학 입력 => 총점 / 평균 / 학점 
/*
 *   입력 
 *   --------
 *   ----
 *   총점 
 *   평균 
 *   학점 
 *   ---- Back-End 
 *   출력 
 *   -------- Front
 */
import java.util.Scanner;
public class 메소드_2 {
    // 반복 제거 => 유사한 경우에  
	static int input(String subject)
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(subject+" 입력:");
		return scan.nextInt();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=input("국어");
		int eng=input("영어");
		int math=input("수학");
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		
		String score=switch((int)(avg/10))
		{
		case 10,9->"A";
		case 8->"B";
		case 7->"C";
		case 6->"D";
		default->"F";
		};
		
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);
		System.out.println("학점:"+score);
//        Scanner scan=new Scanner(System.in);
//        
//        System.out.print("국어 입력:");
//        int kor=scan.nextInt();
//        
//        System.out.print("영어 입력:");
//        int eng=scan.nextInt();
//        
//        System.out.print("수학 입력:");
//        int math=scan.nextInt();
	}

}
