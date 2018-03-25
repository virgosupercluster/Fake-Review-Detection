package com.user;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;


import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;







public class AdminDAO
{
	
	public static boolean checkUser(String user, String pass) throws SQLException
	{
		
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select * from user where username='"+user+"' and password='"+pass+"'";
		ResultSet rs;
		Connection c1 = null;
		DataBaseConnectionPool dbConnectionPool = null;
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				flg = true;
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	}
	
	
	
	
	
	public static boolean check(String wor) throws SQLException
	{
		
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select * from t_word where f_word='"+wor+"'";
		ResultSet rs;
		Connection c1 = null;
		DataBaseConnectionPool dbConnectionPool = null;
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				flg = true;
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	}
	
	public static boolean  storeintodatabaseapple(String part1,String part3, String part4, String s) 
	
	{
			java.sql.PreparedStatement pstmt = null;
			
			String select_sql = "insert into applefilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
			
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				dbConnectionPool.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;

}
	
	public static boolean storeintodatabasetwitter(String part1,String part3, String part4, String s) 
	{
			java.sql.PreparedStatement pstmt= null;
			
			String select_sql ="insert into tweeterfilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				// release resources
				dbConnectionPool.destroy();
				
				
				System.out.println("Admin Login Status : " + flg);
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;
			
}
	public static boolean storeintodatabasemicrosoft(String part1,String part3, String part4, String s) 
	
	{

		java.sql.PreparedStatement pstmt = null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into microsoftfilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
			
		}finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;

}
	public static boolean storeintodatabasegoogle(String part1,String part3, String part4, String s) 
	
	{
		
		java.sql.PreparedStatement pstmt= null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into googlefilter(topic,tweet_id,tweet_date,filtered_tweet_text) values('"+part1+"','"+part3+"','"+part4+"','"+s+"')";

		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("Admin Login Status : " + flg);
		} catch (Exception e) {
			
			e.printStackTrace();
			
					}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
	

}





	public static boolean storeoriginalcontents(String part1, String part2,
			String part3, String part4, String part5)
{
		
		java.sql.PreparedStatement pstmt= null;
		//String select_sql = "select * from m_admin where username='" + username+ "' and password='" + password + "'";
		
		String select_sql ="insert into m_tweets(topic,sentiment,tweetId,tweetdate,tweettext) values('"+part1+"','"+part2+"','"+part3+"','"+part4+"','"+part5+"')";
		System.out.println("insert query is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+select_sql);

		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
			
			
			System.out.println("tweets inserted is true : " + flg);
		} catch (Exception e) {
			
			e.printStackTrace();
			
					}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
	
}

	public static HashMap<Integer, ArrayList<String>> getm_tweets(String preprocessdata)
	{

		
		java.sql.PreparedStatement pstmt;
		//String select_sql = "select topic,sentiment,tweetId,tweetdate,tweettext from m_tweets where topic='"+preprocessdata+"' limit 15";
		
		String sql2="select id,topic,sentiment,tweetId,tweetdate,tweettext from m_tweets where topic='"+preprocessdata+"'";
		System.out.println("sql :"+sql2);
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;

		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  
				 
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			 System.out.println("row count is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+rowcount);
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					//String list1="list"+i;
					ArrayList<String> list =new ArrayList<String>();
					
					list.add(rs.getInt(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6));
					
					
					
					
					map.put(i, list);
					i=i+1;
					
					
				}
				
				
				
				
			}
			int j=1;
			
			
			while(j<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				
				
				
				
				
				map.get(j);
				System.out.println("Get Value>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map.get(j));
				j=j+1;
				
				
			}
			
			System.out.println("i is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+i);
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			System.out.println("Exception in AdminDAO ==> getPayType() : ");
			e.printStackTrace();
		}

		return map;
	}





















public static boolean  storefiltereddata(String part1,String part2,String part3, String part4,String part5,String s) 
	
	{
			java.sql.PreparedStatement pstmt = null;
			
			String select_sql = "insert into m_tweet_keywords(id,topic,sentiment,tweetId,tweetdate,tweettext) values('"+part1+"','"+part2+"','"+part3+"','"+part4+"','"+part5+"','"+s+"')";
			ResultSet rs = null;
			Connection c1= null;
			DataBaseConnectionPool dbConnectionPool;
			boolean flg = false;
			try
			{
	          
			 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

				c1 = dbConnectionPool.getConnection();
			
				pstmt = c1.prepareStatement(select_sql);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
				//rs.close();
				pstmt.close();
				c1.setAutoCommit(true);

				dbConnectionPool.freeConnection(c1);
				dbConnectionPool.destroy();
			} catch (Exception e) {
				e.printStackTrace();
			}
			finally
			{
				try 
				{
					
					if(pstmt!=null)
					pstmt.close();
					if(c1!=null)
					c1.close();
				} catch (SQLException e)
				{e.printStackTrace();
				}
			}
			return flg;

}



public static ArrayList<String> getfilteddata(String id) throws SQLException
{
	ArrayList<String> data=new ArrayList<String>();
	//String data="";
	java.sql.PreparedStatement pstmt = null;
	String select_sql = "select tweettext from m_tweet_keywords where id='"+id+"'";
	ResultSet rs;
	Connection c1 = null;
	
	DataBaseConnectionPool dbConnectionPool = null;
	
	boolean flg = false;
	try
	{
		System.out.println(select_sql);
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	 c1 = dbConnectionPool.getConnection();
		
		if(c1==null)
		{
			c1 = dbConnectionPool.getConnection();
		}
		pstmt = c1.prepareStatement(select_sql);
		System.out.println("testomg pstmt");
		rs = pstmt.executeQuery();
		System.out.println("testomg rs");
		while (rs.next()) 
		{
			data.add(rs.getString(1));
		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return data;

}


public static boolean  checkNoun(String splitword) 

{
		java.sql.PreparedStatement pstmt = null;
		
		String select_sql = "select * from m_noun where noun_word='"+splitword+"'";
		
		System.out.println("=======NOUN=========="+select_sql);
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;

}





public static String checksensitivewords(String string,String datas) {
	
	{
		
		
		System.out.println("topic came inside the AdminDAO>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+datas);
		java.sql.PreparedStatement pstmt = null;
		String data="";
		String leftkeyword="";
		String select_sql = "select type from m_sensitive_keywords where keywords='"+string+"' AND   topic='"+datas+"' " ;
		
		
		String select_sql1 = "select * from m_sensitive_keywords where keywords='"+string+"'";
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			pstmt = c1.prepareStatement(select_sql1);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				k=1;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		StringBuffer sb=new StringBuffer();
		sb.append(data);
		sb.append("~~");
		sb.append(k);
		return sb.toString();

}



}





public static boolean insertSecondExpKeywordpositive(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int pos=1;
	int neg=0;int neu=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,positive,negative,neutral) values('"+string+"','"+topic+"','"+pos+"','"+neg+"','"+neu+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int positive=0;
			
			String select_sql3 = "select positive from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				positive=rs.getInt(1);

			}
			
			pstmt.close();
			positive++;
			
			String select_sql2 = "update m_expand_keywords set positive='"+positive+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}




public static boolean insertSecondExpKeywordnegative(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int neg=1; int pos=0;int nue=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,negative,positive,neutral) values('"+string+"','"+topic+"','"+neg+"','"+pos+"','"+nue+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int negative=0;
			
			String select_sql3 = "select negative from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				negative=rs.getInt(1);

			}
			
			pstmt.close();
			negative++;
			
			String select_sql2 = "update m_expand_keywords set negative='"+negative+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}




public static boolean insertSecondExpKeywordneutral(String string,String topic)
{
	java.sql.PreparedStatement pstmt = null;
	//String topic="apple";
	int neutral=1; int pos=0;int neg=0;
	
	String select_sql = "insert into m_expand_keywords(expand_keyword,topic,neutral,negative,positive) values('"+string+"','"+topic+"','"+neutral+"','"+pos+"','"+neg+"')";
	String select_sql1 = "select * from m_expand_keywords where expand_keyword='"+string+"'";
	System.out.println("===========SQL=========="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg1 = false;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg1 = true;

		}
		
		pstmt.close();
		
		
		if(!flg1)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		}
		
		if(flg1)
		{
			int neu=0;
			
			String select_sql3 = "select neutral from m_expand_keywords where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				neu=rs.getInt(1);

			}
			
			pstmt.close();
			neu++;
			
			String select_sql2 = "update m_expand_keywords set neutral='"+neu+"' where expand_keyword='"+string+"'";
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
		}
	
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}



public static ArrayList<String> secondexpansionpos_words(int thre) {
	
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where positive>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;

}



}





public static ArrayList<String> secondexpansionneg_words(int thre) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where negative>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;






	}





	}











public static ArrayList<String> secondexpansionneu_words(int thre) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select expand_keyword from m_expand_keywords where neutral>='"+thre+"'";
		
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				 data.add(rs.getString(1));

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return data;



	}


}





public static boolean insertsensitivepositive(String expan_key,String topic) {
	{
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		//String topic="apple";
		String pos="positive";
		String iteration="expansion";
		
		
		String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+pos+"','"+expan_key+"','"+iteration+"')";
		
		int i=0;
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			 i=pstmt.executeUpdate();
			if(i>0)
			{
				flg=true;
			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return flg;



	}

}





public static boolean insertsensitivenegative(String expan_key,String topic) {
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	//String topic="apple";
	String neg="negative";
	String iteration="expansion";
	
	
	String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+neg+"','"+expan_key+"','"+iteration+"')";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;

}





public static boolean insertsensitiveneural(String expan_key,String topic) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	//String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "insert into m_sensitive_keywords(topic,type,keywords,iteration) values('"+topic+"','"+neu+"','"+expan_key+"','"+iteration+"')";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}





public static boolean deleteposexkeywords(String expan_key) {
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "delete from m_expand_keywords where expand_keyword='"+expan_key+"'";
	
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}





public static boolean insertmtweets(String pos,String id) {
	
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String topic="apple";
	String neu="neutral";
	String iteration="expansion";
	
	
	String select_sql = "update m_tweets set our_detectedsentiment='"+pos+"' where id='"+id+"'";	
	System.out.println("UPDATE============="+select_sql);
	int i=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		 i=pstmt.executeUpdate();
		if(i>0)
		{
			flg=true;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
	
	
	
	
}





public static ArrayList<String> gettweetsid(String stmntprcs)
{
	ArrayList<String> data=new ArrayList<String>();
	//String data="";
	java.sql.PreparedStatement pstmt = null;
	String select_sql = "select id from m_tweet_keywords where topic='"+stmntprcs+"'";
	ResultSet rs;
	Connection c1 = null;
	
	DataBaseConnectionPool dbConnectionPool = null;
	
	boolean flg = false;
	try
	{
		System.out.println(select_sql);
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	 c1 = dbConnectionPool.getConnection();
		
		if(c1==null)
		{
			c1 = dbConnectionPool.getConnection();
		}
		pstmt = c1.prepareStatement(select_sql);
		System.out.println("testomg pstmt");
		rs = pstmt.executeQuery();
		System.out.println("testomg rs");
		while (rs.next()) 
		{
			data.add(rs.getString(1));
		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();
	} catch (Exception e) 
	{
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return data;
}



	public static HashMap<Integer, ArrayList<String>> getdetectedsentiment(String topic)
	{

		
		java.sql.PreparedStatement pstmt;
		String select_sql = "select * from m_tweets where topic='"+topic+"'";
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;

		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					//String list1="list"+i;
					ArrayList<String> list =new ArrayList<String>();
					
					list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7));
					
					
					
					
					map.put(i, list);
					i=i+1;
				}
				
				
			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return map;
	}





	public static String gettopic(String string) {
		String datas="";
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select topic from m_tweet_keywords where id='"+string+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;


}





	public static String fetchkeywords(String sentype) {
		String datas="";
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select keywords from m_sensitive_keywords where type='"+sentype+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;

}





	public static ArrayList<String> checkw_words() {
		ArrayList<String> datas =new ArrayList<String>();
		//String data="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select w_words from m_word";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datas.add(rs.getString(1));
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datas;

}





	public static String getparticularw_word(String string) {
		
		
		
		System.out.println("remaining word is >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+string);
		
		ArrayList<String> datas =new ArrayList<String>();
		String datass="";
		java.sql.PreparedStatement pstmt = null;
		String select_sql = "select w_word from m_word where w_words='"+string+"'";
		ResultSet rs;
		Connection c1 = null;
		
		DataBaseConnectionPool dbConnectionPool = null;
		
		boolean flg = false;
		try
		{
			System.out.println(select_sql);
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		 c1 = dbConnectionPool.getConnection();
			
			if(c1==null)
			{
				c1 = dbConnectionPool.getConnection();
			}
			pstmt = c1.prepareStatement(select_sql);
			System.out.println("testomg pstmt");
			rs = pstmt.executeQuery();
			System.out.println("testomg rs");
			while (rs.next()) 
			{
				datass=rs.getString(1);
			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();
		} catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return datass;

	}
	
	
	
	

//-----------------------------------------------------manu---------------------------------------------



	public static boolean inserttoDB(String part1, String part2, String part3,
			String part4, String part5,String part6,String review,String uid,String fileowner) 
	{
		
		java.sql.PreparedStatement pstmt = null;
		
		
		
		String select_sql = "insert into m_reviews(sl_no,filename,ip_address,m_date,m_time,product,reviews,userid,file_owner) values('"+part1+"','"+part2+"','"+part3+"','"+part4+"','"+part5+"','"+part6+"','"+review+"','"+uid+"','"+fileowner+"')";
	
		int i=0;
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
	      
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			 i=pstmt.executeUpdate();
			if(i>0)
			{
				flg=true;
			}
			
			
			/*pstmt = c1.prepareStatement(select_sql1);
			 i=pstmt.executeUpdate();
			if(i>0)
			{
				flg=true;
			}
			//rs.close();
			pstmt.close();*/
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return flg;
		
	}





	/*public static int gettotalCount() 
	{
		
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select count(*) from m_temp";
		int count=0;
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				count=rs.getInt(1);

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return count;
	}*/





	/*public static HashMap<Integer, ArrayList<String>> getunchecked() {
		
		java.sql.PreparedStatement pstmt;
		String select_sql = "SELECT * FROM m_temp where status='uncheck' ORDER BY id ASC LIMIT 5 ";
		ResultSet rs;
		Connection c1;
		DataBaseConnectionPool dbConnectionPool;

		HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
		
		try {
			dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
			
			c1 = dbConnectionPool.getConnection();
			pstmt = c1.prepareStatement(select_sql);
			rs = pstmt.executeQuery();
			int rowcount=0;
			if (rs.last()) {
				  rowcount = rs.getRow();
				  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
				}
			
			int i=1;
			
			while (rs.next()) 
			{
				if(i<=rowcount)
				{
					//String list1="list"+i;
					ArrayList<String> list =new ArrayList<String>();
					
					list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(10));
					
					
					
					
					map.put(i, list);
					i=i+1;
				}
				
				
			}
			rs.close();
			pstmt.close();
			c1.setAutoCommit(true);
			
			dbConnectionPool.freeConnection(c1);
			// release resources
			dbConnectionPool.destroy();

		}
		catch (Exception e)
		{
			e.printStackTrace();
		}

		return map;
	}*/





/*	public static boolean updateStatus(String part1) {
java.sql.PreparedStatement pstmt = null;
		
		
		
		String select_sql = "update m_temp set status='checked' where id='"+part1+"'";
		
		int i=0;
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
	      
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			 i=pstmt.executeUpdate();
			if(i>0)
			{
				flg=true;
			}
			
			
			
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return flg;
	}
	*/
	
	
	
	
	
	public static boolean updateStatus2(String part1) {
		java.sql.PreparedStatement pstmt = null;
				
				
				
				String select_sql = "update m_reviews set status='fake' where id='"+part1+"'";
			
				
				int i=0;
				
				ResultSet rs = null;
				Connection c1= null;
				DataBaseConnectionPool dbConnectionPool;
				boolean flg=false;
				int k=0;
				try
				{
			      
				 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

					c1 = dbConnectionPool.getConnection();
				
					pstmt = c1.prepareStatement(select_sql);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}
					
					
					/*pstmt = c1.prepareStatement(select_sql2);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}*/
					
					
					
					pstmt.close();
					
					
					c1.setAutoCommit(true);

					dbConnectionPool.freeConnection(c1);
					dbConnectionPool.destroy();
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally
				{
					try 
					{
						
						if(pstmt!=null)
						pstmt.close();
						if(c1!=null)
						c1.close();
					} catch (SQLException e)
					{e.printStackTrace();
					}
				}
				
				return flg;
			}
	
	
	public static boolean updateStatus3(String part1) {
		java.sql.PreparedStatement pstmt = null;
				
				
				
				String select_sql = "update m_reviews set status='real'  where id='"+part1+"' and status!='fake'";
								
				int i=0;
				
				ResultSet rs = null;
				Connection c1= null;
				DataBaseConnectionPool dbConnectionPool;
				boolean flg=false;
				int k=0;
				try
				{
			      
				 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

					c1 = dbConnectionPool.getConnection();
				
					pstmt = c1.prepareStatement(select_sql);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}
					
					/*pstmt = c1.prepareStatement(select_sql2);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}
					*/
					
					
					pstmt.close();
					
					
					c1.setAutoCommit(true);

					dbConnectionPool.freeConnection(c1);
					dbConnectionPool.destroy();
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally
				{
					try 
					{
						
						if(pstmt!=null)
						pstmt.close();
						if(c1!=null)
						c1.close();
					} catch (SQLException e)
					{e.printStackTrace();
					}
				}
				
				return flg;
			}
	
	
	
	
	public static boolean updateStatus4(String id) {
		java.sql.PreparedStatement pstmt = null;
				
				
				
				String select_sql = "update m_reviews set status='real' where id='"+id+"'";
				//String select_sql2 = "update m_temp set status2='real' where id='"+part1+"'";
				
				int i=0;
				
				ResultSet rs = null;
				Connection c1= null;
				DataBaseConnectionPool dbConnectionPool;
				boolean flg=false;
				int k=0;
				try
				{
			      
				 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

					c1 = dbConnectionPool.getConnection();
				
					pstmt = c1.prepareStatement(select_sql);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}
					
					/*pstmt = c1.prepareStatement(select_sql2);
					 i=pstmt.executeUpdate();
					if(i>0)
					{
						flg=true;
					}
					*/
					
					
					pstmt.close();
					
					
					c1.setAutoCommit(true);

					dbConnectionPool.freeConnection(c1);
					dbConnectionPool.destroy();
				} catch (Exception e) {
					e.printStackTrace();
				}
				finally
				{
					try 
					{
						
						if(pstmt!=null)
						pstmt.close();
						if(c1!=null)
						c1.close();
					} catch (SQLException e)
					{e.printStackTrace();
					}
				}
				
				return flg;
			}
	
	
	public static String getFilename(String id) 
	{
		
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select filename from m_reviews where id='"+id+"'";
		String filename="";
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				filename=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return filename;
	}
	
	
	public static String getFilename1(String userid) 
	{
		
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select filename from m_reviews where userid='"+userid+"'";
		String filename="";
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				filename=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return filename;
	}
	
	
	public static String getFilename3(String ipaddress) 
	{
		
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select filename from m_reviews where ip_address='"+ipaddress+"'";
		String filename="";
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				filename=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return filename;
	}
	
	
	


	
	public static String getFilename2(String id) 
	{
		
		ArrayList< String> data=new ArrayList<String>();
		java.sql.PreparedStatement pstmt = null;
		String positivewords="";
		String leftkeyword="";
		String select_sql = "select filename from m_reviews where id='"+id+"'";
		String filename="";
		
		
		ResultSet rs = null;
		Connection c1= null;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg=false;
		int k=0;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while (rs.next()) 
			{
				filename=rs.getString(1);

			}
			//rs.close();
			pstmt.close();
			
			
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		
		return filename;
	}




	public static boolean inserttorealtable(String string,String line) {
		
		java.sql.PreparedStatement pstmt = null;
		
		
		String select_sql = "select * from m_reviews where filename='"+ string+"'";
		System.out.println("========????????????????????????????====SQL========"+select_sql);
		ResultSet rs = null;
		Connection c1= null;
		String filename="",ip_address="",date="",time="",product="",status="",userid="";
		int sl_no=0;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				sl_no=rs.getInt(2);
				filename=rs.getString(3);
				ip_address=rs.getString(4);
				date=rs.getString(5);
				time=rs.getString(6);
				product=rs.getString(7);
				status=rs.getString(8);
				userid=rs.getString(9);
			}
			String select_sql2 = "insert into m_review_real(sl_no,filename,ip_address,m_date,m_time,product,review,status,userid) values('"+sl_no+"','"+filename+"','"+ip_address+"','"+date+"','"+time+"','"+product+"','"+line+"','real','"+userid+"')";
			System.out.println("===============SQL+++++++++++++++++++++++++????????????"+select_sql2);
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
		
		
		
	}
	
public static boolean inserttofaketable(String string,String line) {
		
		java.sql.PreparedStatement pstmt = null;
		
		
		String select_sql = "select * from m_reviews where filename='"+ string+"'";
		System.out.println("========???????????MMMMMMMMMMMMMMMMMMMMMM?????????????????====SQL========"+select_sql);
		ResultSet rs = null;
		Connection c1= null;
		String filename="",ip_address="",date="",time="",product="",status="",userid="";
		int sl_no=0;
		DataBaseConnectionPool dbConnectionPool;
		boolean flg = false;
		boolean flg7=false;
		try
		{
          
		 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

			c1 = dbConnectionPool.getConnection();
		
			pstmt = c1.prepareStatement(select_sql);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				sl_no=rs.getInt(2);
				filename=rs.getString(3);
				ip_address=rs.getString(4);
				date=rs.getString(5);
				time=rs.getString(6);
				product=rs.getString(7);
				status=rs.getString(8);
				userid=rs.getString(9);
				
			}
			boolean flg77=false;
			String select_sql3="select * from m_fake_ipaddress where ip_address='"+ip_address+"'";
			pstmt = c1.prepareStatement(select_sql3);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				flg77=true;
				
			}
			if(!flg77)
			{
				String select_sql4 = "insert into m_fake_ipaddress(ip_address) values('"+ip_address+"')";
				System.out.println("===============SQL+++++++++++++++++++++++++????????????"+select_sql4);
				pstmt = c1.prepareStatement(select_sql4);
				int i=pstmt.executeUpdate();
				if (i>0) 
				{
					flg = true;

				}
			}
		
			
			
			
			
			
			
			String select_sql2 = "insert into m_review_fake(sl_no,filename,ip_address,m_date,m_time,product,review,status,userid) values('"+sl_no+"','"+filename+"','"+ip_address+"','"+date+"','"+time+"','"+product+"','"+line+"','fake','"+userid+"')";
			System.out.println("===============SQL+++++++++++++++++++++++++????????????"+select_sql2);
			pstmt = c1.prepareStatement(select_sql2);
			int i=pstmt.executeUpdate();
			if (i>0) 
			{
				flg = true;

			}
		
		
			//rs.close();
			pstmt.close();
			c1.setAutoCommit(true);

			dbConnectionPool.freeConnection(c1);
			dbConnectionPool.destroy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				
				if(pstmt!=null)
				pstmt.close();
				if(c1!=null)
				c1.close();
			} catch (SQLException e)
			{e.printStackTrace();
			}
		}
		return flg;
				
	}





public static boolean check_fake_ip_address(String ip) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select * from m_fake_ipaddress where ip_address = '"+ip+"'";
	String filename="";
	
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg=true;

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}






public static boolean check_fake_userid(String uid) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select * from m_fake_userid where userid = '"+uid+"'";
	String filename="";
	
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg=true;

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}




public static int getfakecount(String uid)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where userid='"+uid+"' and status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}




public static int getfakecountofProduct(String product)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where product='"+product+"' and status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}

public static int getrealcountofProduct(String product)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where product='"+product+"' and status='real'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}

public static int getfakecountbymetauserid(String product)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews m , m_fake_userid u where m.userid=u.userid and m.product='"+product+"' and m.status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static int getfakecountbymetaip(String product)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select * from m_reviews m , m_fake_ipaddress u where m.ip_address=u.ip_address and m.product='"+product+"' and m.status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}



public static boolean insertfakeUser(String uid) 
{java.sql.PreparedStatement pstmt = null;

String select_sql = "insert into m_fake_userid(userid) values('"+uid+"')";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}





public static boolean resetTable() {
	java.sql.PreparedStatement pstmt = null;

	String select_sql = "TRUNCATE TABLE  m_reviews";
	
	String select_sql2 = "TRUNCATE TABLE  m_review_real";
	String select_sql3 = "TRUNCATE TABLE  m_review_fake";
	String select_sql4 = "TRUNCATE TABLE  m_temp2";
	String select_sql5 = "TRUNCATE TABLE  m_temp3";
	String select_sql6 = "TRUNCATE TABLE  m_review_content_similar";
	String select_sql7 = "TRUNCATE TABLE  m_bar_graph";
	
	String select_sql8 = "TRUNCATE TABLE  graph_data";
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;
		}
		
		
		
		pstmt = c1.prepareStatement(select_sql2);
		int k=pstmt.executeUpdate();
		if (k>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql3);
		int l=pstmt.executeUpdate();
		if (l>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql4);
		int m=pstmt.executeUpdate();
		if (m>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql5);
		int n=pstmt.executeUpdate();
		if (n>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql6);
		int o=pstmt.executeUpdate();
		if (o>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql7);
		int p=pstmt.executeUpdate();
		if (p>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql8);
		int q=pstmt.executeUpdate();
		if (q>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}

	

//========================Fake2===================================


public static HashMap<Integer, ArrayList<String>> getuserslist() {
	
	java.sql.PreparedStatement pstmt;
	String select_sql = "SELECT * FROM m_review_real ";
	//String select_sql = "SELECT * FROM m_review_real";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(8)+"~~"+rs.getString(10)+"~~"+rs.getInt(1));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}
















public static boolean checkUnneccessary(String wor,String review_slno) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select *from m_unnes where f_word='"+wor+"'";
	String review="";
	
	String select_sql2 = "select * from m_firstperson_pronoun where pronoun='"+wor+"'";
	
	String select_sql3 = "update m_review_real set no_frst_prsn_prnoun=no_frst_prsn_prnoun+1 where id='"+review_slno+"' ";
	String select_sql4 = "update m_review_real set no_exclamatory=no_exclamatory+1 where id='"+review_slno+"' ";
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	boolean flg2=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg=true;

		}
		
		
		
		pstmt = c1.prepareStatement(select_sql2);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg2=true;

		}
		
		if(flg2)
		{
			pstmt = c1.prepareStatement(select_sql3);
			int i=pstmt.executeUpdate();
			
		}
		
		if(wor.equals("!"))
		{
			pstmt = c1.prepareStatement(select_sql4);
			int i=pstmt.executeUpdate();
		}
		
		
		
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}

public static boolean checkPositive(String keyword) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select * from m_positive_review where positive_word='"+keyword+"'";
	String filename="";
	
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg=true;

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}




public static boolean checkNegative(String keyword) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select negative_review from m_negetive_review where negative_review='"+keyword+"'";
	
	
	System.out.println("==============SQQQQQQQL============"+select_sql);
	String filename="";
	
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			flg=true;

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	return flg;
}


public static boolean insertNoun(int id,String noun) 
{java.sql.PreparedStatement pstmt = null;
String desc="noun";
String select_sql = "insert into m_desc(file_id,filtered_words,desc_words) values('"+id+"','"+noun+"','"+desc+"')";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}


public static boolean insertAdject(int id,String adj) 
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_desc(file_id,filtered_words,desc_words) values('"+id+"','"+adj+"','"+desc+"')";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}



public static boolean insertNadjective(int id,String special) 
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_desc(file_id,filtered_words,desc_words) values('"+id+"','"+special+"','"+desc+"')";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}



public static HashMap<Integer, ArrayList<String>> getworddiscription(int fno) {
	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_desc where file_id='"+fno+"'";
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getInt(1)+"~~"+rs.getInt(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}


public static int getRankValue(String word)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select t_count from m_positive_review where positive_word='"+word+"'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}



public static int getRankValue1(String word)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select n_count from m_negetive_review where negative_review='"+word+"'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}




public static boolean insertWordVal(String pairone,int weight,String pairtwo)
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_pairs (pair_one,pair_two,mark)values('"+pairone+"','"+pairtwo+"',"+weight+")";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}



public static boolean insertSpecial(String pairone)
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_pairs (pair_special)value('"+pairone+"')";
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}



public static  int getReviewFeedBackPositive()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_pairs where mark=1";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}



public static  int getReviewFeedBackNegative()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_pairs where mark=-1";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static  int getReviewFeedBackNeutral()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_pairs where mark=0";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static boolean insertintoTemp2(String review,String review_value,String userid)
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_temp2 (reviews,reviews_value,userid)value('"+review+"','"+review_value+"','"+userid+"')";
System.out.println("======================INSERT QUERY====="+select_sql);
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}

public static boolean truncateTable() {
	java.sql.PreparedStatement pstmt = null;
	


	String select_sql = "TRUNCATE TABLE  m_pairs";
	String select_sql1 = "TRUNCATE TABLE  m_desc";
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		
		pstmt = c1.prepareStatement(select_sql1);
		int j=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		
		
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}





public static int getCountofRevies(String userid) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_temp2 where userid='"+userid+"'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}



public static int getCountofPositivereviews(String userid) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_temp2 where userid='"+userid+"' and reviews_value='positive'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static int getCountofNegativereviews(String userid) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT COUNT(*) FROM m_temp2 where userid='"+userid+"' and reviews_value='negative'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}



public static boolean insertToPercentage(double count_of_reviews_of_user,double count_percentage,double positive_percentage,double twogramcontent_similarity_Percentage,double threegramcontent_similarity_Percentage, double total_percentage,String userid,double negratio)
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_temp3 (no_count,count_percent,positive_percent,two_gram_similarity_percent,three_gram_similarity_percent,total_percent,userid,negative_ratio)value('"+count_of_reviews_of_user+"','"+count_percentage+"','"+positive_percentage+"','"+twogramcontent_similarity_Percentage+"', '"+threegramcontent_similarity_Percentage+"', '"+total_percentage+"','"+userid+"','"+negratio+"')";
System.out.println("======select_sql???????????????================"+select_sql);
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}


public static  int auto_incr_count(String tablename)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "SELECT AUTO_INCREMENT FROM information_schema.tables WHERE table_name = '"+tablename+"' AND table_schema = DATABASE( ) ;";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static boolean insertintoNGram(int autoIncrCount,String userid, String ngramtype, String n_gram)
{java.sql.PreparedStatement pstmt = null;
String desc="adjective";
String select_sql = "insert into m_review_content_similar(review_id,userid,n_gram_type,n_gram)values('"+autoIncrCount+"','"+userid+"','"+ngramtype+"','"+n_gram+"')";
//System.out.println("======================INSERT QUERY====="+select_sql);
ResultSet rs = null;
Connection c1= null;
DataBaseConnectionPool dbConnectionPool;
boolean flg = false;
try
{
  
 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

	c1 = dbConnectionPool.getConnection();

	pstmt = c1.prepareStatement(select_sql);
	int i=pstmt.executeUpdate();
	if (i>0) 
	{
		flg = true;

	}
	//rs.close();
	pstmt.close();
	c1.setAutoCommit(true);

	dbConnectionPool.freeConnection(c1);
	dbConnectionPool.destroy();
} catch (Exception e) {
	e.printStackTrace();
}
finally
{
	try 
	{
		
		if(pstmt!=null)
		pstmt.close();
		if(c1!=null)
		c1.close();
	} catch (SQLException e)
	{e.printStackTrace();
	}
}
return flg;

}




public static double get2gramContentSimilaritypercent(String userid,double similar_threshold) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select n_gram, count(*) as tot, count(*) /25 as per  from m_review_content_similar where userid = '"+userid+"' and n_gram_type = 2  group by n_gram having count(*) /25 >= '"+similar_threshold+"'";
	String filename="";
	double count=0.0;
	double sum=0.0;
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		
		while (rs.next()) 
		{
			count=Double.parseDouble(rs.getString(3));
            sum=sum+count;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return sum;
}


public static double get3gramContentSimilaritypercent(String userid,double similar_threshold) 
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select n_gram, count(*) as tot, count(*) /25 as per  from m_review_content_similar where userid = '"+userid+"' and n_gram_type = 3  group by n_gram having count(*) /25 >= '"+similar_threshold+"'";
	
	System.out.println("===============3 N gram query==== "+select_sql);
	String filename="";
	double count=0.0;
	double sum=0.0;
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		
		while (rs.next()) 
		{
			count=Double.parseDouble(rs.getString(3));
            sum=sum+count;
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return sum;
}





public static String getcountofip(int threshold)
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	StringBuffer sb=new StringBuffer();
	//String select_sql = "select ip_address from m_reviews where status!='fake' and status!='real' group by ip_address having count(*) >= '"+threshold+"'";
	String select_sql = "select ip_address from m_reviews where status='unchecked'  group by ip_address having count(*) >= '"+threshold+"'";
	String ip=null;
	System.out.println("===============3 N gram query==== "+select_sql);
	String filename="";
	double count=0.0;
	double sum=0.0;
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		
		while (rs.next()) 
		{
			sb.append(rs.getString(1));
			sb.append("~~");
			
			//data.add(rs.getString(1));
			
			System.out.println("=============================MORE THRESHOLD IP==================="+ip);
		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return sb.toString();
}





public static HashMap<Integer, ArrayList<String>> getreviewsbasedonip(String ip)
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews  where ip_address='"+ip+"'";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
	
	
	
}





public static ArrayList<String> getiplist()
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select ip_address from m_reviews";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}


public static ArrayList<String> getuserslistforverify()
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select userid from m_reviews";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}


public static ArrayList<String> getUserslistforPercentageCalculation()
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select userid from m_temp2 group by userid";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}



public static boolean updatereviewstatus(String string) 
{
	java.sql.PreparedStatement pstmt = null;
	String desc="adjective";
	String select_sql = "update m_reviews set status='fake' where ip_address='"+string+"'";
	//System.out.println("======================INSERT QUERY====="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}

public static boolean updatereviewstatus2(String string) 
{
	java.sql.PreparedStatement pstmt = null;
	String desc="adjective";
	String select_sql = "update m_reviews set status='fake' where userid='"+string+"'";
	System.out.println("======================INSERT QUERY====="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}


public static HashMap<Integer, ArrayList<String>> getuserid()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select userid from m_reviews group by userid";

	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}

public static HashMap<Integer, ArrayList<String>> getproducts()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select product from m_reviews group by product";

	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}



public static ArrayList<String> getproductsinList()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select product from m_reviews group by product";

	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	ArrayList<String> list =new ArrayList<String>();
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
				
				
			
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}


public static HashMap<Integer, ArrayList<String>> getreport1(String userid,String product)
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews where userid='"+userid+"' and product='"+product+"'";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}


public static HashMap<Integer, ArrayList<String>> getreport2(String product)
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews where  product='"+product+"'";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}


public static HashMap<Integer, ArrayList<String>> getreport3(String userid)
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews where  userid='"+userid+"'";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}

public static HashMap<Integer, ArrayList<String>> getreport4()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews where  status='fake'";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}


public static HashMap<Integer, ArrayList<String>> getreport5()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews m, m_fake_userid u  where  m.userid=u.userid group by m.userid";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}

public static HashMap<Integer, ArrayList<String>> getreport6()
{

	
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews m, m_fake_ipaddress p where m.ip_address=p.ip_address group by m.ip_address";
	
	System.out.println("======SQL======="+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;

	HashMap<Integer, ArrayList<String>> map=new HashMap<Integer, ArrayList<String>>();
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				ArrayList<String> list =new ArrayList<String>();
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10));
				
				
				
				
				map.put(i, list);
				i=i+1;
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return map;
}

public static ArrayList<String> getuncheckediplist()
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select id from m_reviews where status='unchecked' and status!='fake'";
	
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}





public static boolean insertfakeuser(String userid)
{
	java.sql.PreparedStatement pstmt = null;
	
	String select_sql = "insert into m_fake_userid(userid)values('"+userid+"')";
	//System.out.println("======================INSERT QUERY====="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg7 = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		String select_sql1="select * from m_fake_userid where userid='"+userid+"'"; 
		pstmt = c1.prepareStatement(select_sql1);
		rs=pstmt.executeQuery();
		
		while (rs.next()) 
		{
			flg7=true;
			
		}
		
		
		if(!flg7)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		
		}
		
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;

}





public static boolean insertintobargraph_table(String string, int fakecount,int realcount, int metadata) 
{
	
java.sql.PreparedStatement pstmt = null;
	
	String select_sql = "insert into m_bar_graph(product,fake_reviews,real_reviews,fake_by_metadata)values('"+string+"','"+fakecount+"','"+realcount+"','"+metadata+"')";
	//System.out.println("======================INSERT QUERY====="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg7 = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		
		
		
		if(!flg7)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		
		}
		
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}





public static int gettotalCount()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews ";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static int getfaketotalCount()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}

public static int getrealtotalCount()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where status='real'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}


public static int getintersectioncount()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews where ip_address  IN(select ip_address from m_fake_ipaddress) and userid IN(select userid from m_fake_userid)";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}

public static int getmetatotalCountbyuid()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews m , m_fake_userid u where m.userid=u.userid  and m.status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}

public static int getmetatotalCountbyip()
{
	ArrayList< String> data=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select count(*) from m_reviews m , m_fake_ipaddress u where m.ip_address=u.ip_address  and m.status='fake'";
	String filename="";
	int count=0;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			count=rs.getInt(1);

		}
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return count;
}





public static boolean inserttopietable(String string, int value)
{
java.sql.PreparedStatement pstmt = null;
	
	String select_sql = "insert into graph_data(status,count)values('"+string+"','"+value+"')";
	//System.out.println("======================INSERT QUERY====="+select_sql);
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg = false;
	boolean flg7 = false;
	try
	{
	  
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();

		
		
		
		if(!flg7)
		{
		
		pstmt = c1.prepareStatement(select_sql);
		int i=pstmt.executeUpdate();
		if (i>0) 
		{
			flg = true;

		}
		
		}
		
		//rs.close();
		pstmt.close();
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	return flg;
}





public static boolean Calculatecosinesimilarity()
{
	ArrayList< String> review_userid_list=new ArrayList<String>();
	java.sql.PreparedStatement pstmt = null;
	String positivewords="";
	String leftkeyword="";
	String select_sql = "select * from m_temp2";
	String filename="";
	int count=0;
	
	String userid=null;
	String review=null;
	
	ResultSet rs = null;
	Connection c1= null;
	DataBaseConnectionPool dbConnectionPool;
	boolean flg=false;
	int k=0;
	try
	{
      
	 dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

		c1 = dbConnectionPool.getConnection();
	
		pstmt = c1.prepareStatement(select_sql);
		rs=pstmt.executeQuery();
		while (rs.next()) 
		{
			userid=rs.getString(4);
			review=rs.getString(2);
			
			review_userid_list.add(userid+"~~"+review);

		}
		
		for(int i=0;i<review_userid_list.size();i++)
		{
			String data1=review_userid_list.get(i);
			String data2[]=data1.split("~~");
			String review1=data2[1];
			String tempreview1=review1;
			
			double highest_cosinevalue=0.0;
			String userid1=data2[0];
			String highestcosineuserid=null;
			double averagesim_score=0.0;
			int counter=0;
			
			for(int j=0;j<review_userid_list.size();j++)
			{
				String data11=review_userid_list.get(j);
				String data22[]=data11.split("~~");
				String review11=data22[1];
				String tempreview2=review11;
				
				
				 CosineSimilarityCalculation cs1 = new CosineSimilarityCalculation();
				 
				 
				  double sim_score = cs1.Cosine_Similarity_Score(review1, review11);
				  
				  System.out.println("Cosine similarity score = "+sim_score);
						  
				  if(sim_score>highest_cosinevalue && !userid1.trim().equals(data22[0].trim()) )	 
				  {
					  highest_cosinevalue=sim_score;
					  highest_cosinevalue=(double)Math.round(highest_cosinevalue*100)/100;
					  highestcosineuserid=data22[0];
				  }
				  
				  //====================AVERAGE content similarity of same user=======================
				  if(userid1.trim().equals(data22[0].trim()))
				  {
					  counter++;
					  CosineSimilarityCalculation cs2 = new CosineSimilarityCalculation();
						 
						 
					   averagesim_score = averagesim_score+cs2.Cosine_Similarity_Score(tempreview1, tempreview2);
					  
					  System.out.println("Average Cosine similarity score = "+averagesim_score);
					  
					  tempreview1=tempreview2;
					  averagesim_score=averagesim_score/counter;
					  System.out.println("=========AVG=====================con sim==="+averagesim_score);
					  
				  }
				  //==========================================================================
						  
		
			}
			
			if(counter==1)
			{
				averagesim_score=0;
			}
			
			averagesim_score=(double)Math.round(averagesim_score*100)/100;
			String sql="update m_temp3 set highest_cosine_similarity_value='"+highest_cosinevalue+"' , highest_cosine_similar_userid='"+highestcosineuserid+"' , avg_content_similarity='"+averagesim_score+"' where userid='"+userid1+"'";
			pstmt = c1.prepareStatement(sql);
			
			
			System.out.println("===SQL==="+sql);
			int s=pstmt.executeUpdate();
			if (s>0) 
			{
				flg = true;

			}
			
			
		}
		
		
		
		
		//rs.close();
		pstmt.close();
		
		
		c1.setAutoCommit(true);

		dbConnectionPool.freeConnection(c1);
		dbConnectionPool.destroy();
	} catch (Exception e) {
		e.printStackTrace();
	}
	finally
	{
		try 
		{
			
			if(pstmt!=null)
			pstmt.close();
			if(c1!=null)
			c1.close();
		} catch (SQLException e)
		{e.printStackTrace();
		}
	}
	
	
	return flg;
	
}





public static ArrayList<String> getuseridofcosinethreshold(double costhreshold,double avgcosinethreshold) 
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select userid from m_temp3 where highest_cosine_similarity_value>'"+costhreshold+"' or avg_content_similarity>'"+avgcosinethreshold+"' group by userid";
	String sql2="SELECT userid FROM m_temp3 WHERE negative_ratio IN ( SELECT negative_ratio FROM m_temp3 where negative_ratio!=0 GROUP BY negative_ratio HAVING COUNT(userid) > 1)";
	System.out.println("====select_sql================"+select_sql);
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		
		
		
		pstmt = c1.prepareStatement(sql2);
		rs = pstmt.executeQuery();
		int rowcount1=0;
		if (rs.last()) {
			  rowcount1 = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i1=1;
		
		while (rs.next()) 
		{
			if(i1<=rowcount1)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1));
				
					
				
				
			}
			
			
		}
		rs.close();
		
		
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;
}





public static ArrayList<String> getFinalResult(String uid)
{
	java.sql.PreparedStatement pstmt;
	String select_sql = "select * from m_reviews where file_owner='"+uid+"'";
	ResultSet rs;
	Connection c1;
	DataBaseConnectionPool dbConnectionPool;
	ArrayList<String> list =new ArrayList<String>();
	
	
	try {
		dbConnectionPool = new DataBaseConnectionPool(Global.Driver, Global.URL, Global.Uname,Global.Pass);
		
		c1 = dbConnectionPool.getConnection();
		pstmt = c1.prepareStatement(select_sql);
		rs = pstmt.executeQuery();
		int rowcount=0;
		if (rs.last()) {
			  rowcount = rs.getRow();
			  rs.beforeFirst(); // not rs.first() because the rs.next() below will move on, missing the first element
			}
		
		int i=1;
		
		while (rs.next()) 
		{
			if(i<=rowcount)
			{
				//String list1="list"+i;
				
				
				list.add(rs.getString(1)+"~~"+rs.getString(2)+"~~"+rs.getString(3)+"~~"+rs.getString(4)+"~~"+rs.getString(5)+"~~"+rs.getString(6)+"~~"+rs.getString(7)+"~~"+rs.getString(8)+"~~"+rs.getString(9)+"~~"+rs.getString(10)+"~~"+rs.getString(11));
				
					
				
				
			}
			
			
		}
		rs.close();
		
		pstmt.close();
		c1.setAutoCommit(true);
		
		dbConnectionPool.freeConnection(c1);
		// release resources
		dbConnectionPool.destroy();

	}
	catch (Exception e)
	{
		e.printStackTrace();
	}

	return list;

}

}