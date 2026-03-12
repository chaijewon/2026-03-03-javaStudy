import java.util.*;
public class 배열_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("년도 입력:");
        int year=scan.nextInt();
        
        System.out.print("월 입력:");
        int month=scan.nextInt();
        
        System.out.print("일 입력:");
        int day=scan.nextInt();
        
        System.out.println(year+"년도 "+month+"월");
        
        // 1년 1월 1일 ~ 전년도까지 총합 
        int total=(year-1)*365
        		  +(year-1)/4
        		  -(year-1)/100
        		  +(year-1)/400;
        
        // 입력된 년도의 전달까지 
        int[] lastday= {
           31,28,31,30,31,30,
           31,31,30,31,30,31
        };
        // 윤년 조건
        if((year%4==0 && year%100!=0)||(year%400==0))
        	lastday[1]=29;
        else
        	lastday[1]=28;
        
        
        for(int i=0;i<month-1;i++)
        {
        	total+=lastday[i];
        }
        // 입력된 날 
        total+=day;
        
        String[] strWeek= {"일","월","화","수","목","금","토"};
        //  요일 구하기 
        int week=total%7;
        
        System.out.println("입력된 날의 요일:"+strWeek[week]);
        
        // Calendar 
        
	}

}
