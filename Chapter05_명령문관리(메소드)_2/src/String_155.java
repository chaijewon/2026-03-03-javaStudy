/*
 *   웹 개발 
 *   ------ String / ArrayList / Integer
 *          ------ 자바에서 자원하는 메소드 => 리턴형/매개변수/어떤 값 읽기
 *   게임개발 / 네트워크 => 5000
 *   웹개발 : 데이터베이스 : 입문 
 *          ---------- 
 *   비교 
 *    equals / equalslgnoreCase
 *             | 검색 => 대소문자 구분이 없다 
 *               JAVA / Java / java ...
 *    | ID/PWD => 대소문자 구분
 *   
 */
// 157page
public class String_155 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String hong="admin";
         String shim="admin";
         String park=new String("admin");
         String lee="Admin";
         // new는 새로운 메모리에 저장 사용
         if(hong==shim)
         {
        	System.out.println("hong과 shim은 같다"); 
         }
         else
         {
        	 System.out.println("hong과 shim은 같지 않다"); 
         }
         // hong 주소안에 있는 문자열 / park안에 저장된 문자열이 같은지
         if(hong.equals(park))
         {
        	System.out.println("hong과 park은 같다"); 
         }
         else
         {
        	 System.out.println("hong과 park은 같지 않다"); 
         }
         // 가급적이면 => ==보다 equals를 많이 사용 
         // => 상세보기 / 아이디 찾기 / 비밀번호 찾기 / 로그인 
         // equals => 대소문자를 구분해서 비교 
         if(hong.equals(lee))
         {
        	 System.out.println("hong과 lee은 같다");  
         }
         else
         {
        	 System.out.println("hong과 lee은 같지 않다");  
         }
         // 대소문자 구분없이 비교 equalsIgnoreCase
         // 검색 
         /*
          *   boolean equalsIgnoreCase(String s)
          *   boolean equals(String s)
          *   ------> 조건문에서 주로 사용 
          * 
          */
         if(hong.equalsIgnoreCase(lee))
         {
        	 System.out.println("hong과 lee은 같다");  
         }
         else
         {
        	 System.out.println("hong과 lee은 같지 않다");  
         }
	}

}
