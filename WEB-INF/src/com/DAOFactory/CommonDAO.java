/**
 * 
 */
package com.DAOFactory;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.crypto.Cipher;

import com.database.Database;
import com.util.Utility;


public class CommonDAO
{
	private static Connection connection = null;
	private static Statement statement = null;
	private static ResultSet resultSet = null;
	
	public static ResultSet getFiles() 
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_trans");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getUsers()....."+e);
		}
		return resultSet;
	}
	
	public static ResultSet getFiles(int user_id) 
	{
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select * from m_trans where user_id='"+user_id+"'");
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getUsers()....."+e);
		}
		return resultSet;
	}
	public static int getUserID(String userid) 
	{
		int id=0;
		try  
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			
			String sql = "select id from userlogin where userid='"+userid+"'";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				id=resultSet.getInt(1);
			}
			System.out.println("User ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getUserID()....."+e);
		}
		return id;
	}
	
	
	public static int getRank(String userid) 
	{
		int rank=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			
			String sql = "select rank from userlogin where userid='"+userid+"'";
			//System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				rank=resultSet.getInt(1);
			}
			
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getRank()....."+e);
		}
		return rank;
	}
	
	public static int getFileId() 
	{
		int file_id=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			
			String sql = "select id from m_trans ";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				file_id=resultSet.getInt(1);
			}
			System.out.println("User File_id to return : "+file_id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getRank()....."+e);
		}
		return file_id;
	}
	
	
	public static int getFileId(String filename) 
	{
		int file_id=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			
			String sql = "select id from m_trans where file_name='"+filename+"' ";
			System.out.println(sql);
			resultSet = statement.executeQuery(sql);
			while(resultSet.next())
			{
				file_id=resultSet.getInt(1);
			}
			System.out.println("User File_id to return : "+file_id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getRank()....."+e);
		}
		return file_id;
	}
	
	public static int getTransID() 
	{
		int id=1000;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id from m_trans");
			while(resultSet.next())
			{
				id=resultSet.getInt(1);
			}
			System.out.println("Trans ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getTransID()....."+e);
		}
		return id;
	}
	
	public static int getTransIDGlobal() 
	{
		int id=1000;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id from m_trans1");
			while(resultSet.next())
			{
				id=resultSet.getInt(1);
			}
			//System.out.println("Trans ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getTransIDGlobal()....."+e);
		}
		return id;
	}
	
	
	public static String getDedupAccess(int file_code) 
	{
		String dedup_acess="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select dedup_access from m_file_access where file_code='"+file_code+"'");
			while(resultSet.next())
			{
				dedup_acess=resultSet.getString(1);
			}
			//System.out.println("Trans ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getTransIDGlobal()....."+e);
		}
		return dedup_acess;
	}
	
	

	public static String getReadAccess(int file_code) 
	{
		String read_access="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select read_access from m_file_access where file_code='"+file_code+"'");
			while(resultSet.next())
			{
				read_access=resultSet.getString(1);
			}
			//System.out.println("Trans ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getTransIDGlobal()....."+e);
		}
		return read_access;
	}
	
	public static int getFile_Code(String hash_code) 
	{
		int file_code=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select id from m_trans where file_md='"+hash_code+"'");
			while(resultSet.next())
			{
				file_code=resultSet.getInt(1);
			}
			//System.out.println("Trans ID to return : "+id);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getTransIDGlobal()....."+e);
		}
		return file_code;
	}
	
	
	public static boolean makeTrans(int id,String fileName,String type,String md,int rank)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			String sql="insert into m_trans values (?,?,?,?,?,?,?,?,?,?)";
			//System.out.println("trans value is"+sql);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, getTransID()+1);
			ps.setInt(2,id);
			ps.setString(3,getTransID()+1+fileName);
			ps.setString(4, type);
			ps.setString(5, md.toString());
			ps.setString(6, Utility.getDate());
			ps.setString(7, Utility.getTime());
			ps.setString(8, Utility.getDay());
			ps.setInt(9,1);
			ps.setInt(10, rank);
			//ps.setString(11,"single");
			int i=ps.executeUpdate();
			if(i!=0)
			{
				flag=true;
			}
			System.out.println("Upload File Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-makeTrans()....."+e);
		}
		return flag;
	}
	
/*	public static boolean f_status(String md)
	{
		boolean flag=false;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			String sql="update m_trans set f_status='Deduplicated' where file_md='"+md+"'";
			System.out.println("Update file status---"+sql);
			int i=statement.executeUpdate(sql);
			if(i!=0)
			{
				flag=true;
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return flag;
		
	}
	*/
	
	public static boolean makeTrans1(int id,String fileName,String type,String md,int rank)
	{
		boolean flag=false;
		String s="_";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			String sql="insert into m_trans1 values (?,?,?,?,?,?,?,?,?,?)";
			System.out.println("trans1 value is"+md);
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, getTransIDGlobal()+1);
			ps.setInt(2,id);
			ps.setString(3, getTransID()+1+s+fileName);
			ps.setString(4, type);
			ps.setString(5, md.toString());
			ps.setString(6, Utility.getDate());
			ps.setString(7, Utility.getTime());
			ps.setString(8, Utility.getDay());
			ps.setInt(9,2);
			
			ps.setInt(10, rank);
			int i=ps.executeUpdate();
			if(i!=0)
			{
				
				flag=true;
				//flag=f_status(md);
			}
			System.out.println("Upload File Status : "+flag);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-makeTrans()....."+e);
		}
		return flag;
	}
	
	
	public static int getCloudNo(String id) 
	{
		int num=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select cloud from m_trans where id='"+id+"'");
			while(resultSet.next())
			{
				num=resultSet.getInt(1);
			}
			System.out.println("Cloud Number to return : "+num);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getCloudNo()....."+e);
		}
		return num;
	}

	public static String getFileName(String id) 
	{
		String fname="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select file_name from m_trans where id='"+id+"'");
			while(resultSet.next())
			{
				fname=resultSet.getString(1);
			}
			System.out.println("File Name to return : "+fname);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getFileName()....."+e);
		}
		return fname;
	}
	
	public static int getFileRank(String id) 
	{
		int rank=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select Rank from m_trans where id='"+id+"'");
			while(resultSet.next())
			{
				rank=resultSet.getInt(1);
			}
			System.out.println("File Name to return : "+rank);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getFileRank()....."+e);
		}
		return rank;
	}
	
	
	public static String getMD(String id) 
	{
		String md="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select file_md from m_trans where id='"+id+"'");
			while(resultSet.next())
			{
				md=resultSet.getString(1);
			}
			System.out.println("File MD to return : "+md);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getMD()....."+e);
		}
		return md;
	}
	public static int getUserId(String id) 
	{
		int id1=0;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select user_id from m_trans where id='"+id+"'");
			while(resultSet.next())
			{
				id1=resultSet.getInt(1);
			}
			System.out.println("User ID to return : "+id1);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getUserId()....."+e);
		}
		return id1;
	}
	public static String getUserName(int id) 
	{
		String uname="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select userid from userlogin where id='"+id+"'");
			while(resultSet.next())
			{
				uname=resultSet.getString(1);
			}
			System.out.println("User Name to return : "+uname);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getUserName()....."+e);
		}
		return uname;
	}
	public static byte[] getPubKey(int Rank)throws Exception
	{
		byte pubKey[]=null;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select pubkey from digkey where Rank='"+Rank+"'");
			while(resultSet.next())
			{
				pubKey=resultSet.getBytes(1);
			}
			System.out.println("User pubKey to return : "+pubKey);
		}
		catch(Exception e)
		{
			System.out.println("Unable to process file for getPubKey :"+e);
		}
		return pubKey;
	}
	
	
	
	
	public static byte[] getPvtKey(int Rank)throws Exception
	{
		byte pvtKey[]=null;
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select pvtkey from digkey where Rank='"+Rank+"'");
			while(resultSet.next())
			{
				pvtKey=resultSet.getBytes(1);
			}
			System.out.println("User pvtKey to return : "+pvtKey);
		}
		catch(Exception e)
		{
			System.out.println("Unable to process file for getPvtKey :"+e);
		}
		return pvtKey;
	}
	
	public static String getMailID(String userid) 
	{
		String email="";
		try
		{
			Database database=Database.getInstance();
			connection=database.connector();
			statement = connection.createStatement();
			resultSet = statement.executeQuery("select email from userlogin where userid='"+userid+"'");
			while(resultSet.next())
			{
				email=resultSet.getString(1);
			}
			System.out.println("email to return : "+email);
		}
		catch(Exception e)
		{
			System.out.println("Opp's Error is in CommonDAO-getMailID()....."+e);
		}
		return email;
	}
	
	
	
	
	
	
	
	public static boolean encryptDecryptFile(File srcFileName, File destFileName, Key key, int cipherMode) throws Exception
	{
		OutputStream outputWriter = null;
		InputStream inputReader = null;
		System.out.println("srcFileName ----- "+srcFileName);
		System.out.println("destFileName ----- "+destFileName);
		try
		{
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			
			
			byte[] buf = cipherMode == Cipher.ENCRYPT_MODE? new byte[100] : new byte[128];
			int bufl;
			// init the Cipher object for Encryption...
			cipher.init(cipherMode, key);
			
			// start FileIO
			outputWriter = new FileOutputStream(destFileName);
			inputReader = new FileInputStream(srcFileName);
			while ( (bufl = inputReader.read(buf)) != -1)
			{
				//System.out.println("Hi,Mr. Kumar");
				byte[] encText = null;
				if (cipherMode == Cipher.ENCRYPT_MODE)
					encText = encrypt(copyBytes(buf,bufl),(PrivateKey)key);
				else
					encText = decrypt(copyBytes(buf,bufl),(PublicKey)key);
				//System.out.println("encText ----------- "+encText);
				outputWriter.write(encText);
			}
			outputWriter.flush();
		}
		catch (Exception e)
		{
			throw e;
		}
		finally
		{
			try
			{
				if (outputWriter != null)
					outputWriter.close();
				if (inputReader != null)
					inputReader.close();
			}
			catch (Exception e)
			{} 
		}
		return true;
	}
	public static byte[] copyBytes(byte[] arr, int length)
	{
		byte[] newArr = null;
		if (arr.length == length)
			newArr = arr;
		else
		{
			newArr = new byte[length];
			for (int i = 0; i < length; i++)
			{
				newArr[i] = (byte) arr[i];
			}
		}
		//System.out.println("newArr -- "+new String(newArr));
		return newArr;
	}
	
	
	public static boolean encryptFile(File srcFileName, File destFileName, PrivateKey key) throws Exception
	{
		encryptDecryptFile(srcFileName,destFileName, key, Cipher.ENCRYPT_MODE);
		System.out.println("Encryptttttttttttttiiiing");
		
		return true;
	}
	

	public static boolean decryptFile(File srcFileName, File destFileName,	PublicKey key) throws Exception 
	{
		return encryptDecryptFile(srcFileName, destFileName, key,
				Cipher.DECRYPT_MODE);
	}
	
	
	public static byte[] encrypt(byte[] text, PrivateKey key) throws Exception
	{
		byte[] cipherText = null;
		try
		{
			// get an RSA cipher object and print the provider
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			
			// encrypt the plaintext using the public key
			cipher.init(Cipher.ENCRYPT_MODE, key );
			cipherText = cipher.doFinal(text);
		}
		catch (Exception e)
		{
			throw e;
		}
		return cipherText;
	}
	public static byte[] decrypt(byte[] text, PublicKey key) throws Exception
	{
		byte[] dectyptedText = null;
		try
		{
			// decrypt the text using the private key
			Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
			cipher.init(Cipher.DECRYPT_MODE, key);
			try {
				dectyptedText = cipher.doFinal(text);
			} catch (Exception e) {
				System.out.println("Exception ======== "+e);
				e.printStackTrace();
			}
			
			//System.out.println("dectyptedText ----------- "+dectyptedText);
		}
		catch (Exception e)
		{
			throw e;
		}
		return dectyptedText;
	}
	
	
	public static void main(String[] args) {
		
		int num=getTransID();
		System.out.println("Num value--->"+num);
	}
	 
}
