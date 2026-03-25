/*
 *   예외처리 
 *    목적 : 비정상 종료를 방지하고 정상 수행 가능하게 만든다 
 *    정의 : 사전에 에러를 방지하는 프로그램 
 *    예외처리 => 에러가 발생하면 부분 제외하고 수행
 *                          -------- 건너뛴다 
 *    에러의 일종 (예외)
 *     사용자 : 입력 => 잘못 입력된 경우
 *             id중복 체크 => id입력후 회원 가입 버튼 클릭 
 *                          ----------------------
 *              
 *     개발자 : 실수 => 인덱스 번호 / 변환 (윈도우,웹 => 문자열)
 *     => page="123"....
 *     ----------------------------------------------
 *       에러 : 수정이 불가능  
 *       예외 : 소스상에서 수정이 가능한 에러 
 *     상속 과정 
 *     -------
 *                 Object 
 *                 ------
 *                    |
 *                Throwable : 에러 처리 
 *                    |
 *           ----------------------
 *           |                    |
 *         Error               Exception
 *                                |
 *                   -----------------------------
 *                   |  => 컴파일시              |=> 실행시
 *                      => 반드시 예외처리         |=> 상황에 따라
 *                 CheckException          UnCheckException
 *                 --------------
 *                 
 *                 IOException : File
 *                   => java.io
 *                 SQLException : Oracle 
 *                   => java.sql
 *                 MalformedURLException : 네트워크
 *                   => java.net 
 *                   => URL
 *                 ClassNotFoundException : 메모리 할당 
 *                   => java.lang 
 *                 InterruptedException : 쓰레드 관련
 *                   => java.lang 
 *                   ...
 *                   ...
 *          UnCheckException
 *              |
 *          RuntimeException
 *              |
 *          NumberFormatException : 정수 변환 
 *             => Integer.parseInt("A")
 *                Integer.parseInt("10 ")
 *             웹에서 다른 파일로 데이터 전송 
 *             -----------------------
 *             list.jsp
 *               |
 *             detail.jsp?no=100 
 *          ArrayIndexOutOfBoundsException 
 *            => 인덱스 번호 초과 
 *          NullPointerException 
 *          ClassCastException 
 *          ...
 *          
 *          => 메소드 : if : 예외처리
 *      => 에러 확인 
 *         -------
 *         catch절에서 주로 사용 
 *         getMessage() / printStackTrace()
 *                        -----------------
 */
class A
{
	
}
class B extends A
{
	
}
public class 예외처리_1 {
    String msg;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//예외처리_1 a=new 예외처리_1();
		//예외처리_1 a=null;
		//a.msg.substring(2);
		try
		{
		  A a=new A();
		  B b=(B)a;
		}catch(ClassCastException e)
		{
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		//Integer.parseInt("100 ".trim());
//		int[] arr=new int[2];
//		try
//		{
//		arr[0]=10;
//		arr[2]=20;
//		}catch(ArrayIndexOutOfBoundsException ex){
//			System.out.println(ex.getMessage());
//		}
//		System.out.println(arr[0]);
	}

}
