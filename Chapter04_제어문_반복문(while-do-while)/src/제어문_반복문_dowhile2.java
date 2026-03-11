// 난수 => 1~100 사이의 수를 임의로 추출 
// => 맞추는 게임 
// => 힌트 (UP/DOWN)
import java.util.*; 
// => Random / Scanner 
public class 제어문_반복문_dowhile2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 컴퓨터 난수 
		Random r=new Random();
		int com=r.nextInt(100)+1; // 변경해서 사용 : 오버라이딩
		//       100 => 0~99 ==> 1~100
		// 1,5 ==> 1 2 3 4 
		Scanner scan=new Scanner(System.in);
		do{
			
			System.out.print("1~100사이의 정수 입력:");
			int user=scan.nextInt();
			
			// 사용자가 잘못 입력한 경우 => if
			if(user<1 || user>100)
			{
				System.out.println("잘못된 입력입니다!!");
				continue; // 처음으로 이동 
			}
			
			// 결과 비교
			if(com>user)
				System.out.println("입력값보다 큰 값 입력");
			else if(com<user)
				System.out.println("입력값보다 작은 값 입력");
			else
			{
				System.out.println("Game Over!!");
				break;
				// break,continue => 밑에 코딩하면 오류 
			}
			
		}while(true);
	}

}
