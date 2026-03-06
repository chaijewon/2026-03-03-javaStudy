import java.util.Scanner;
public class 제어문_선택문_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner scan=new Scanner(System.in);
         // 메뉴 선택 => switch 
         while(true)
         {
        	 System.out.println("1.가요");
        	 System.out.println("2.트롯");
        	 System.out.println("3.OST");
        	 System.out.println("4.JAZZ");
        	 System.out.println("5.POP");
        	 System.out.println("6.CLASSIC");
        	 System.out.println("7.종료");
        	 System.out.println("=================");
        	 System.out.print("메뉴 선택:");
        	 int menu=scan.nextInt();
        	 
        	 switch(menu)
        	 {
        	 case 7:
        		 System.out.println("프로그램 종료");
        		 System.exit(0);
        	 
        	 }
        	 
         }
         
	}

}
