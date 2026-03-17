/*
 *    메소드 : 한가지 기능을 수행하는 명령문의 집합 
 *                             -----
 *                             int a=10;
 *                             변수 / 연산 / 제어 
 *                             라이브러리 
 *    형식) 
 *          리턴형 메소드명(매개변수) 
 *          {
 *             기능을 수행하는 명령문 
 *          }
 *          
 *          1) 매개변수 => 여러개 사용이 가능 
 *                    => 사용자 요청값 
 *          2) 결과값 => 리턴형
 *             => 한개만 나온다 
 *             => 기본형 => boolean / int / String...
 *                                  ----------------
 *                                  경우의 수가 여러개인 경우 
 *                                  ID(X) / PWD(X) / OK
 *                        | 두가지 경우의 수 
 *                        | 로그인 S / F 
 *                        | 검색 Y / N 
 *          ---------------------------
 *          | 매개변수와 관련해서 처리 => 구현 
 *     3) 동작 
 *        | => 자동호출이 없다 (사용자 정의) 
 *        | => 호출해서 사용 => 여러번 호출이 가능 
 *        | => 메소드 생성 => 호출 => 결과값 받기 => 처리(출력)
 *                        ------
 *                        메소드명(값,값...)
 *                    리턴형값 
 *                    데이터형 변수=메소드(값) 
 *                            |     |
 *                            -------
 *    4) 호출시마다 처음부터 실행한다 { =====> }
 *       =>   끝나고 나면 => 호출된 위치로 돌아간다 
 *       
 *       int aaa(int a)
 *       {
 *          2 ---------------
 *       }                  |
 *                          |
 *       int a=aaa(10); 1<--- 수행후 원상복귀
 *       ----- 결과값을 받아서 저장 
 *       
 *   5) 필요시에는 변경이 가능 => 오버라이딩 
 *        
 *            
 */
import java.sql.*;
public class 메소드_분리 {
	//0. 드라이버 등록 
	static void init() throws Exception 
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
	}
    //1. 연결 
	static Connection getConnection() throws Exception
	{
		final String URL="jdbc:oracle:thin:@211.238.142.22:1521";
		final String USER="hr";
		final String PWD="happy";
		
		Connection conn=DriverManager.getConnection(URL,USER,PWD);
		return conn;
	}
	//2. 해제
	static void disConnection(Connection conn,
			PreparedStatement ps)throws Exception
	{
		if(ps!=null) ps.close();
		if(conn!=null) conn.close(); 
	}
	//3. 기능 수행 
	static void seoulTravel() throws Exception
	{
		init();
		Connection conn=getConnection();
		String sql="SELECT title,address FROM seoulTravel";
		PreparedStatement ps=conn.prepareStatement(sql);
		ResultSet rs=ps.executeQuery();
		while(rs.next())
		{
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
			System.out.println("==============================");
		}
		rs.close();
		disConnection(conn, ps);
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
        seoulTravel();
	}

}
