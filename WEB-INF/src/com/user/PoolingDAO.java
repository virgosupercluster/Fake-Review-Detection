package com.user;

import java.sql.Connection;
import java.sql.ResultSet;



public class PoolingDAO 
{

	private static PoolingDAO PoolingDAO = null;

	private PoolingDAO() {
	}

	public static PoolingDAO initialize() {
		if (PoolingDAO == null) {
			PoolingDAO = new PoolingDAO();
		}
		return PoolingDAO;
	}
	
	
	public static boolean insertcontents(String shanu,String sharu) {
		boolean flag = false;
		
		String sql = "";
		
		
		try
		{
			
		
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "insert into m_user1(m_user,m_pass) values('"+shanu+"','"+sharu+"') ";


		
		c1 = dbConnectionPool.getConnection();
		
		pstmt = c1.prepareStatement(sql);
		int i = pstmt.executeUpdate();
		

		if (i > 0) {
			flag = true;
		}
		  
		
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
		//System.out.println("Exception in AdminDAO ==> getPayType() : ");
		e.printStackTrace();
	}
		return flag;

	

	
		
		
	}
	
	

	public static boolean checkuser(String user,String pass) {
		boolean flag = false;
		
		String sql = "";
		
		
		try
		{
			
		
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "select * from user where username='"+user+"' and password='"+pass+"'";


		
		c1 = dbConnectionPool.getConnection();
		
		pstmt = c1.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
   while(rs.next())
   {
	flag=true;
    }
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
		//System.out.println("Exception in AdminDAO ==> getPayType() : ");
		e.printStackTrace();
	}
		return flag;

	

	
		
		
	}
	
	public static boolean loginCheck(String user, String pass) {
		boolean flag = false;
		
		System.out.println("its came inside pooling dao");
		java.sql.PreparedStatement pstmt;
		
		
	  
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		
		String select_sql = "select * from user where username='"+user+"' and password='"+pass+"'";
		try {
			
			
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver,
					Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				flag = true;

			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("Admin Login Status : " + flag);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return flag;
	}
	
	
	
	public static boolean Changepass(String userid, String oldpass,String newpass,String conpass) {
		boolean flag = false;
		
		System.out.println("its came inside pooling dao");
		java.sql.PreparedStatement pstmt;
		
		
	  
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		
		String select_sql = "update user set password='"+newpass+"' where username='"+userid+"'";
		try {
			
			
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver,
					Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i =0;
			i=pstmt.executeUpdate();
			if(i!=0)
			{
				flag=true;
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("Admin Login Status : " + flag);
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return flag;
	}

	public static int getpositivecount(String topic, String pos) {
		int postivecount=0;
		
		String sql = "";
		
		
		try
		{
			
		
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "SELECT COUNT(*) FROM m_tweets where topic='"+topic+"' and our_detectedsentiment='"+pos+"'";


		
		c1 = dbConnectionPool.getConnection();
		
		pstmt = c1.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
   while(rs.next())
   {
	 postivecount=rs.getInt(1);
    }
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
		//System.out.println("Exception in AdminDAO ==> getPayType() : ");
		e.printStackTrace();
	}
		return postivecount;

	
}

	public static int getnegativecount(String topic, String neg) {
    int negcount=0;
		
		String sql = "";
		
		
		try
		{
			
		
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "SELECT COUNT(*) FROM m_tweets where topic='"+topic+"' and our_detectedsentiment='"+neg+"'";


		
		c1 = dbConnectionPool.getConnection();
		
		pstmt = c1.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
   while(rs.next())
   {
	 negcount=rs.getInt(1);
    }
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
		//System.out.println("Exception in AdminDAO ==> getPayType() : ");
		e.printStackTrace();
	}
		return negcount;

	
}

	public static int getneuralcount(String topic, String neu) {
      int neucount=0;
		
		String sql = "";
		
		
		try
		{
			
		
		java.sql.PreparedStatement pstmt;
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		sql = "SELECT COUNT(*) FROM m_tweets where topic='"+topic+"' and our_detectedsentiment='"+neu+"'";


		
		c1 = dbConnectionPool.getConnection();
		
		pstmt = c1.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
   while(rs.next())
   {
	   neucount=rs.getInt(1);
    }
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();


	}
	catch (Exception e)
	{
		//System.out.println("Exception in AdminDAO ==> getPayType() : ");
		e.printStackTrace();
	}
		return neucount;

}
}