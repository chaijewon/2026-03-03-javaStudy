/*
 *    예외처리의 종류 
 *    -----------
 *    ***직접처리 : 에러 복구 => try ~ catch => 80%
 *    ***간접처리 : 에러 회피 => 19%
 *                에러 떠넘기기 => throws
 *    임의발생 : 테스트 , 견고한 프로그램 확인 : throw 
 *    사용자 정의 : 지원하지 않는 예외  => 1%
 *               class MyException extends Exception
 *               {
 *                  
 *               }
 *    1) 에러 복구 
 *       형식)
 *            try
 *            {
 *               정상 수행이 가능한 문장 
 *            }catch(예상되는 예외처리 클래스) => 여러개 사용이 가능 
 *            {                          => 순서가 존재
 *                에러가 발생시에 에러 복구 
 *                에러가 발생시에 어떤 에러가 발생했는지 
 *            }
 *            finally
 *            {
 *                생략이 가능 
 *                try절 / catch절 상관없이 무조건 수행 
 *                => 파일닫기 / 오라클연결 해제 
 *                => 서버 닫기 
 *            }
 */
public class 예외처리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        try
        {
        	System.out.println("1");
        	System.out.println("2");
        	System.out.println(10/0);// catch이동
        	System.out.println("4");
        }catch(Exception e)
        {
        	System.out.println("5");
        	
        }
        finally
        {
        	System.out.println("6");
        }
        
        
        //
	}

}
