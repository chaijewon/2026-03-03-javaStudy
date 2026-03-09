// main=> 프로그램 시작점 => 프로그램안에는 반드시 main이 한개 이상 
public class 선택조건문_1 {
   public static void main(String[] args) {
	  String id="admin";
	  String pwd="1234";
	  
	  // id와 pwd가 같은 경우 => if수행
	  // hover
	  if(id.equals("admin") && pwd.equals("1234"))
	  {
		  System.out.println("로그인 성공"); // if문에 조건 true
	  }
	  else // id와 pwd가 다른 경우 
	  {
		  System.out.println("로그인 실패"); // if문의 조건 false
	  }
	  
	  // 계속해서 반복적으로 나온다 ...
	  // => 사용처 
   }
}
