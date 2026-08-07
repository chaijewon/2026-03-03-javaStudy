package com.sist.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class RecipeDAO {
	   private Connection conn;
	   private PreparedStatement ps;
	   private final String URL="jdbc:oracle:thin:@localhost:1521:XE";
	   private static RecipeDAO dao;
	   // 드라이버 등록 
	   public RecipeDAO()
	   {
		   try
		   {
			   Class.forName("oracle.jdbc.driver.OracleDriver");
		   }catch(Exception ex){}
	   }
	   // 연결 
	   public void getConnection()
	   {
		   try
		   {
			   conn=DriverManager.getConnection(URL,"hr","happy");
		   }catch(Exception ex) {}
	   }
	   public void disConnection()
	   {
		   try
		   {
			   if(ps!=null) ps.close();
			   if(conn!=null) conn.close();
		   }catch(Exception ex) {}
	   }
	   // 싱글턴 => DAO를 한번만 사용이 가능 (메모리 공간을 1개만 생성) = 재사용
	   // 스프링에서는 기본 (싱글턴) => 필요시에는 여러개 객체 생성 => prototype
	   public static RecipeDAO newInstance()
	   {
		   if(dao==null)
			   dao=new RecipeDAO();
		   return dao;
	   }
	   /*
	    *   chef VARCHAR2(150),
		   poster VARCHAR2(300) CONSTRAINT chef_poster_nn NOT NULL,
		   mem_cont1 VARCHAR2(20),
		   mem_cont3 VARCHAR2(20),
		   mem_cont7 VARCHAR2(20),
		   mem_cont2 VARCHAR2(20),
	    */
	   public void chefInsert(ChefVO vo)
	   {
		   try
		   {
			   getConnection();
			   String sql="INSERT INTO chef VALUES("
					     +"?,?,?,?,?,?)";
			   ps=conn.prepareStatement(sql);
			   ps.setString(1, vo.getChef());
			   ps.setString(2, vo.getPoster());
			   ps.setString(3, vo.getMem_cont1());
			   ps.setString(4, vo.getMem_cont3());
			   ps.setString(5, vo.getMem_cont7());
			   ps.setString(6, vo.getMem_cont2());
			   ps.executeUpdate();
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   disConnection();
		   }
	   }
	   /*
	    *   no NUMBER,
		    title VARCHAR2(2000) CONSTRAINT r_title_nn NOT NULL,
		    poster VARCHAR2(300) CONSTRAINT r_poster_nn NOT NULL,
		    chef VARCHAR2(200) CONSTRAINT r_chef_nn NOT NULL,
		    link VARCHAR2(260),
		    hit NUMBER DEFAULT 0
	    */
	   public void recipeInsert(RecipeVO vo)
	   {
		   try
		   {
			   getConnection();
			   String sql="INSERT INTO recipe VALUES("
					     +"recipe_no_seq.nextval,?,?,?,?,0)";
			   ps=conn.prepareStatement(sql);
			   ps.setString(1, vo.getTitle());
			   ps.setString(2, vo.getPoster());
			   ps.setString(3, vo.getChef());
			   ps.setString(4, vo.getLink());
			   ps.executeUpdate();
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   disConnection();
		   }
	   }
	   public List<RecipeVO> recipeListData()
	   {
		   List<RecipeVO> list=new ArrayList<RecipeVO>();
		   try
		   {
			   getConnection();
			   String sql="SELECT no,link "
					     +"FROM recipe "
					     +"ORDER BY no";
			   ps=conn.prepareStatement(sql);
			   ResultSet rs=ps.executeQuery();
			   while(rs.next())
			   {
				   RecipeVO vo=new RecipeVO();
				   vo.setNo(rs.getInt(1));
				   vo.setLink(rs.getString(2));
				   list.add(vo);
			   }
		   }catch(Exception ex)
		   {
			   ex.printStackTrace();
		   }
		   finally
		   {
			   disConnection();
		   }
		   return list;
	   }
	   /*
	    *   NO              NUMBER         
			POSTER          VARCHAR2(500)  
			TITLE           VARCHAR2(1000) 
			CHEF            VARCHAR2(300)  
			CHEF_POSTER     VARCHAR2(500)  
			CHEF_PROFILE    VARCHAR2(500)  
			INFO1           VARCHAR2(100)  
			INFO2           VARCHAR2(100)  
			INFO3           VARCHAR2(100)  
			CONTENT         CLOB           
			FOODMAKE        CLOB   
			
			NO           NOT NULL NUMBER         
			POSTER       NOT NULL VARCHAR2(260)  
			TITLE        NOT NULL VARCHAR2(1000) 
			CHEF         NOT NULL VARCHAR2(200)  
			CHEF_POSTER           VARCHAR2(260)  
			CHEF_PROFILE          VARCHAR2(200)  
			INFO1        NOT NULL VARCHAR2(30)   
			INFO2        NOT NULL VARCHAR2(30)   
			INFO3        NOT NULL VARCHAR2(30)   
			CONTENT               CLOB           
			FOODMAKE     NOT NULL CLOB     
	    */
       public void recipeDetailInsert(RecipeDetailVO vo)
       {
    	   try
    	   {
    		   getConnection();
    		   String sql="INSERT INTO recipeDetail VALUES("
    				     +"?,?,?,?,?,?,?,?,?,?,?)";
    		   ps=conn.prepareStatement(sql);
    		   ps.setInt(1, vo.getNo());
    		   ps.setString(2, vo.getPoster());
    		   ps.setString(3, vo.getTitle());
    		   ps.setString(4, vo.getChef());
    		   ps.setString(5, vo.getChef_poster());
    		   ps.setString(6, vo.getChef_profile());
    		   ps.setString(7, vo.getInfo1());
    		   ps.setString(8, vo.getInfo2());
    		   ps.setString(9, vo.getInfo3());
    		   ps.setString(10, vo.getContent());
    		   ps.setString(11, vo.getFoodmake());
    		   System.out.println(sql);
    		   ps.executeUpdate();
    	   }catch(Exception ex)
    	   {
    		   ex.printStackTrace();
    	   }
    	   finally
    	   {
    		   disConnection();
    	   }
       }
}
