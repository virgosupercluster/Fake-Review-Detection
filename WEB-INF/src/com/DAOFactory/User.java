/**
 * 
 */
package com.DAOFactory;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Vector;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.concurrent.TimeUnit;

import com.database.Database;
import com.util.Utility;


public class User extends DAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	public  boolean loginCHK(String name, String pass) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			System.out.println("select * from userlogin where userid='"+name+"' and password='"+pass+"'");
			resultSet = statement.executeQuery("select * from userlogin where userid='"+name+"' and password='"+pass+"'");
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("User Login Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-loginCHK()....."+e);
		}
		return flag;
	}
	
	public static boolean setIP(String ip) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql = "update m_process_server set server_ip='"+ip+"'";
			//System.out.println("*********** Getting The Processing Server No Of Req ***********");
			System.out.println(sql);
		
	    	int i=statement.executeUpdate(sql);
	    	
	    	if(i>0)
	    	{
			flag=true;
			System.out.println("IP Changed Successfully");
	    	}
	    	else
	    	{
	    		System.out.println("Problem in IP Changed");
	    	}
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-setIp()(Connection con,int serverId) : ");
			e.printStackTrace();
		}
		return flag;
	}
	public static boolean checkUserID(String userid)
	{
		boolean flag=false;
		try
		{
				Database database=Database.getInstance();
				connection=database.connector();
			statement=connection.createStatement();
			String sql="select * from userlogin where userid='"+userid+"'";
			System.out.println("sql  -->"+sql);
			resultSet =statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("Flag value for new user check-->"+flag);
		}
		
		catch (Exception e) {
			System.out.println("Exception in USERDAO checkUSerID");
		}
		return flag;
	}
	public static boolean register(String id, String pass, String name,String email, String phone) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="insert into userlogin (userid,password,username,email,phone) values('"+id+"','"+pass+"','"+name+"','"+email+"','"+phone+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Registeration Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-register()....."+e);
		}
		return flag;
	}

	public static boolean CHKMD(String md) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select * from m_file_upload where f_mac='"+md+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("MD Check Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-CHKMD()....."+e);
		}
		return flag;
	}
	
	public static int getDataOwnerId(String userid) 
	{
	  int id=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id from userlogin where userid='"+userid+"'");
			while(resultSet.next())
			{
				id=resultSet.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in getDataOwnerId....."+e);
		}
		return id;
	}
	
	public static String getFileName(int fileid) 
	{
	  String fileName="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select f_name from m_file_upload where f_code='"+fileid+"'");
			while(resultSet.next())
			{
				fileName=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in getDataOwnerId....."+e);
		}
		return fileName;
	}
	
	
	public static boolean isFilePresent(String fileName) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select f_name from m_file_upload where f_name='"+fileName+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in isFilePresent....."+e);
		}
		return flag;
	}
	
	
	public static boolean isFilePresentOnUsaServer(String fileName) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select f_name from m_server2 where f_name='"+fileName+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in isFilePresentOnUsaServer....."+e);
		}
		return flag;
	}
	
	
	public static boolean isFilePresentServer(String fileName) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select f_name from m_file_upload where f_name='"+fileName+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				flag=true;
			}
			System.out.println("File Present Status--->"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in isFilePresentOnIndiaServer....."+e);
		}
		return flag;
	}
	
	public static boolean updateTemp(String fileName,String Date,String interval) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="insert into m_temp (f_name,f_upload_date,f_interval) values ('"+fileName+"','"+Date+"','"+interval+"') ";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			System.out.println("Update Temp Status--->"+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in updateTemp....."+e);
		}
		return flag;
	}
	
	public static String getInterval(String file_name,String date) 
	{
	  String diffHours="0";
		try
		{
			String previous_time="";
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="select f_upload_date from m_file_upload where f_name='"+file_name+"'";
			resultSet=statement.executeQuery(sql);
			
			if(resultSet.next())
			{
				previous_time=resultSet.getString(1);
				diffHours=Utility.getHours(previous_time, date);
				System.out.println("+++++++++++++++++diffHours++++++++++++++"+diffHours);
				
				
			}
			System.out.println("Previous Time is---->"+previous_time+"----diffHours time is :------"+diffHours );
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in isFilePresentOnUsaServer....."+e);
		}
		return diffHours;
	}
	
	public static boolean updateGlobalMac(String md,String date,String file_name,String interval) 
	{
	  boolean flag=false;
	 
	 
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
			System.out.println("f_name:"+file_name);
			System.out.println("f_mac:"+md);
			System.out.println("f_upload_date:"+date);
			System.out.println("f_Interval_time_out:"+interval);
			String sql="update m_file_upload set f_mac='"+md+"',f_upload_date='"+date+"',Interval_time_out='"+interval+"' where f_name='"+file_name+"'";
			System.out.println("@"+sql);
			int i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			
			}
			System.out.println("updateGlobalMac====>Interval time updating in database status :"+flag);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in isFilePresent....."+e);
		}
		return flag;
	}
	
	
	public static boolean updateIndiaMac(String md,String date,int owner_id,String file_name) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="update m_server1 set f_mac='"+md+"',f_date='"+date+"',user_id='"+owner_id+"' where f_name='"+file_name+"'";
			System.out.println(sql);
			int i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in updateIndiaMac....."+e);
		}
		return flag;
	}
	
	public static boolean updateUsaMac(String md,String date,int owner_id,String file_name) 
	{
	  boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="update m_server2 set f_mac='"+md+"',f_date='"+date+"',user_id='"+owner_id+"' where f_name='"+file_name+"'";
			System.out.println(sql);
			int i = statement.executeUpdate(sql);
			if(i>0)
			{
				flag=true;
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in updateUsaMac....."+e);
		}
		return flag;
	}
	
/*	public static String getServer(String ip) 
	{
	  String server_id="1";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select server_id from m_lookup where ip_address='"+ip+"'");
			while(resultSet.next())
			{
				server_id=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in getServer()....."+e);
		}
		return server_id;
	}
	*/
	public static ArrayList<String> getAddress(int server_id)
	{
		ArrayList<String> list = new ArrayList<String>();
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_process_server where server_id='"+server_id+"'");
		
			while(resultSet.next())
			{
				list.add(resultSet.getString(2));
				list.add(resultSet.getString(3));
				list.add(resultSet.getString(4));
				
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserProcess-->getAddress: "+ e);
		}
		finally
		{
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}	
	
	
	
	public static int getFileId() 
	{
	 int fileId=1;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select max(f_code) from m_file_upload ");
			if(resultSet.next())
			{
				fileId=resultSet.getInt(1);
			}
			System.out.println("select max(f_code) from m_file_upload"+fileId);
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in getAddress()....."+e);
		}
		return fileId;
	}
	
	
	public static boolean  addDownloadTransaction(int userId,int fileId,String transactionStatus) 
	{
		boolean flag=false;
		String sql="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql="insert into m_transaction(u_code,f_code,t_status) values('"+userId+"','"+fileId+"','"+transactionStatus+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Download Transaction Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-addDownloadTransaction(): ");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean addUploadTransaction(String ufileName,String ufileType, String udate,int cloudId,String md) 
	{
		String upload="Uploaded";
		boolean flag=false;
		String sql="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql="insert into m_file_upload (f_name,f_type,f_upload_date,cloud_id,f_mac,status) values('"+ufileName+"','"+ufileType+"','"+udate+"','"+cloudId+"','"+md+"','"+upload+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Upload Transaction Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-addUploadTransaction.....");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static boolean addIndianServerTransaction(String ufileName,String ufileType,String udate,String md ,int file_code,int owner_id) 
	{
		boolean flag=false;
		String sql="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql="insert into m_server1 (f_name,f_ext,f_date,f_mac,file_code,user_id) values('"+ufileName+"','"+ufileType+"','"+udate+"','"+md+"','"+file_code+"','"+owner_id+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Upload Transaction Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-addUploadTransaction.....");
			e.printStackTrace();
		}
		return flag;
	}
	
	
	public static boolean addUsaServerTransaction(String ufileName,String ufileType,String udate,String md ,int file_code,int owner_id) 
	{
		boolean flag=false;
		String sql="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			sql="insert into m_server2 (f_name,f_ext,f_date,f_mac,file_code,user_id) values('"+ufileName+"','"+ufileType+"','"+udate+"','"+md+"','"+file_code+"','"+owner_id+"')";
			System.out.println(sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Upload Transaction Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-addUploadTransaction.....");
			e.printStackTrace();
		}
		return flag;
	}
	
	public static ArrayList<String> getCloud()
	{
		ArrayList<String> list = new ArrayList<String>();
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_cloud where c_id='3'");
		
			while(resultSet.next())
			{
				list.add(resultSet.getString(2));
				list.add(resultSet.getString(3));
				list.add(resultSet.getString(4));
				list.add(resultSet.getString(5));
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserProcess-->getFiles(String userid): "+ e);
		}
		finally
		{
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}
	
	public static ArrayList<String> getCloudByServerID( int server_id)
	{
		ArrayList<String> list = new ArrayList<String>();
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_cloud where c_id='"+server_id+"'");
		
			while(resultSet.next())
			{
				list.add(resultSet.getString(2));//ftp.drivehq.com
				list.add(resultSet.getString(3));//Cloud_user_name
				list.add(resultSet.getString(4));//Cloud_password
				list.add(resultSet.getString(5));//cloud_directory
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Exception in UserProcess-->getFiles(String userid): "+ e);
		}
		finally
		{
			try {
				resultSet.close();
				statement.close();
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		return list;
	}
	
	
	public static boolean downloadFile(String ip,String user,String pass,String fileName,String directory)
	{
		boolean flag=false;
		try
		{
			/*File f=new File(root);
			if(!f.exists())
				f.mkdir();*/
			StringBuffer sb = new StringBuffer( "ftp://" );
			sb.append( user );
            sb.append( ':' );
            sb.append( pass );
            sb.append( '@' );
            sb.append( ip );
	        sb.append( '/' );
	        String a=directory;
	        sb.append( a );
	        sb.append( '/' );
	        sb.append( fileName );
	        System.out.println("in utility file name value is  "+fileName);
	        sb.append( ";type=i" );
	        System.out.println("sb value-->"+sb);
	        BufferedInputStream bis = null;
	        BufferedOutputStream bos = null;
	        URL url = new URL( sb.toString() );
	        System.out.println("in download url value is  "+url);
            URLConnection urlc = url.openConnection();
            bis = new BufferedInputStream( urlc.getInputStream());
            bos = new BufferedOutputStream( new FileOutputStream(fileName) );
            int i;
            while ((i = bis.read()) != -1)
            {
               bos.write( i );
               flag=true;
            }
            bis.close();
            bos.close();
        }
		catch(Exception e)
		{
			System.out.println("OPP's Error is in downloadFile "+e);
		}
		return flag;
	}
	public static String getMDGlobal(String filename) 
	{
	String md="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select f_mac from m_file_upload where f_name='"+filename+"'");
			while(resultSet.next())
			{
				md=resultSet.getString(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in User-getMDGlobal()....."+e);
		}
		return md;
	}
	public ResultSet getProfile(String id)
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from userlogin where userid='"+id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getProfile()....."+e);
		}
		return resultSet;
	}
	
	public static ResultSet getFiles()
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_file_upload");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-getFiles()....."+e);
		}
		return resultSet;
	}
	
	public boolean editProfile(String [] s) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			String sql="update userlogin set username='"+s[1]+"',email='"+s[2]+"',phone='"+s[3]+"' where id='"+s[0]+"'";
			
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Edit Profile Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-editProfile()....."+e);
		}
		return flag;
	}
	
	
	
	
	public boolean chnagePass(int id, String cpass)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i=statement.executeUpdate("update userlogin set password='"+cpass+"' where id='"+id+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("User Change Pass Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in UserDAO-chnagePass()....."+e);
		}
		return flag;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getUsers()
	 */
	@Override
	public ResultSet getUsers() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#deleteUser(java.lang.String)
	 */
	@Override
	public boolean deleteUser(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getUsers(java.lang.String)
	 */
	@Override
	public ResultSet getUsers(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#editUser(java.lang.String[])
	 */
	@Override
	public boolean editUser(String[] s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getAuditors()
	 */
	@Override
	public boolean editCloud(String[] s) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getAuditors()
	 */
	@Override
	public ResultSet getClouds() {
		// TODO Auto-generated method stub
		return null;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getAuditors()
	 */
	
	
	@Override
	public boolean CHKCloud(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getAuditors()
	 */
	@Override
	public boolean deleteCloud(String id) {
		// TODO Auto-generated method stub
		return false;
	}
	/* (non-Javadoc)
	 * @see com.rajat.DAOFactory.DAO#getAuditors()
	 */
	
	public boolean deleteKeys(String id) 
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			int i=statement.executeUpdate("delete from digkey where userid='"+id+"'");
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Admin delete user Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in AdminDAO-deleteUser()....."+e);
		}
		return flag;
	}
	@Override
	public ResultSet getClouds(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
