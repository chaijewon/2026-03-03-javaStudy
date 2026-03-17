// 문자열 잘라내기 => 162page
/*
 *    Hello Java 
 *    0123456789
 *    
 *    원하는 위치부터 뒤에 전체
 *    substring(6) 
 *    부분적으로 자르기 
 *    substring(2,5)
 *    
 *    원형 
 *     String substring(int start)
 *     String substring(int start,int end)
 *                     -------------------
 *                                | end-1
 *     문자열을 자르는 경우 
 *     | 웹 ==> eqauls / substring / indexOf ,lastIndexOf
 *             trim() / split() / valueOf 
 *             ------------------------------------------
 *     
 */
public class String_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String msg="0123456789";
        // 3부터 전체를 가지고 온다 
        System.out.println(msg.substring(3));
        // 1~5까지 가지고 온다 
        System.out.println(msg.substring(1,6));
        // 우편번호 자르기 
        String post="100-111";
        System.out.println(post.substring(0,3));
        System.out.println(post.substring(4));
        
        String title="Hello Java,Oracle!!";
        String temp=title.substring(0,10)+"...";
        System.out.println(temp);
        // 화면 UI => HTML의 단점은 있는 그대로 출력 
        
	}

}
