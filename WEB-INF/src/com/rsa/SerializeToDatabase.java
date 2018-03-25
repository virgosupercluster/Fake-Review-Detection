
package com.rsa;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import com.database.Database;


public class SerializeToDatabase
{
  
  public static Connection connection = null;
 
  
  private static final String SQL_SERIALIZE_OBJECT = "insert into m_keys(do_code,key_cls_no,encryption_key,decryption_key) values(?,?,?,?)";
 
  //update m_keys set encryption_key='"+pubKeyObj+"',decryption_key='"+prvKeyObj+"' where do_code='"+code+"' and key_cls_no='"+keyset+"'
	  
  private static final String SQL_SERIALIZE_OBJECT_Update = "update m_keys set encryption_key=?,decryption_key=? where do_code=? and  key_cls_no=? ";
  
  private static final String SQL_DESERIALIZE_OBJECT = "SELECT public_key FROM m_key";
  private static final String SQL_DESERIALIZE_OBJECT1 = "SELECT master_s_key FROM m_key";
 
  
 
  public static boolean serializeJavaObjectToDB(Object pubKeyObj,Object prvKeyObj,int code,int keyset) throws SQLException 
  {
	  boolean fl = false;
     try
     {
    	 Database database=Database.getInstance();
			connection=database.connector();
	PreparedStatement pstmt = connection.prepareStatement(SQL_SERIALIZE_OBJECT);
 
    // just setting the class name
   
	pstmt.setObject(1,code);
	pstmt.setObject(2,keyset);
    pstmt.setObject(3,pubKeyObj);
    pstmt.setObject(4,prvKeyObj);
    
    System.out.println(SQL_SERIALIZE_OBJECT);
    int i = pstmt.executeUpdate();
    
    System.out.println("Status :"+i);
    if(!(i==0))
    {
    	fl = true;
    	
    }
  
    pstmt.close();
     }catch (Exception e)
     {
		System.out.println(e.getStackTrace());
	}
   
	return fl;
    
  }
 
  public static boolean serializeJavaObjectToDBUpdate(Object pubKeyObj,Object prvKeyObj,int code,int keyset) throws SQLException 
  {
	  boolean fl = false;
     try
     {
    	 Database database=Database.getInstance();
			connection=database.connector();
	Statement st = connection.createStatement();
	String sql = "update m_keys set encryption_key='"+pubKeyObj+"',decryption_key='"+prvKeyObj+"' where do_code='"+code+"' and key_cls_no='"+keyset+"' ";
	System.out.println(sql);
	int i = st.executeUpdate(sql);
	
    
	PreparedStatement pstmt = connection.prepareStatement(SQL_SERIALIZE_OBJECT);
 
   /* // just setting the class name
   
	pstmt.setObject(1,code);
	pstmt.setObject(2,keyset);
    pstmt.setObject(3,pubKeyObj);
    pstmt.setObject(4,prvKeyObj);
    
    System.out.println(SQL_SERIALIZE_OBJECT);
    int i = pstmt.executeUpdate();*/
    
    System.out.println("Status :"+i);
    if(!(i==0))
    {
    	fl = true;
    	
    }
  
    pstmt.close();
     }catch (Exception e)
     {
		System.out.println(e.getStackTrace());
	}
   
	return fl;
    
  }
  public static boolean serializeJavaObjectToDBUpdate1(Object pubKeyObj,Object prvKeyObj,int code,int keyset) throws SQLException 
  {
	  boolean fl = false;
     try
     {
    	 Database database=Database.getInstance();
			connection=database.connector();
	
	/*Statement st = connection.createStatement();
	String sql = "update m_keys set encryption_key='"+pubKeyObj+"',decryption_key='"+prvKeyObj+"' where do_code='"+code+"' and key_cls_no='"+keyset+"' ";
	System.out.println(sql);
	int i = st.executeUpdate(sql);*/
	
    
	PreparedStatement pstmt = connection.prepareStatement(SQL_SERIALIZE_OBJECT_Update);
 
  // just setting the class name
   
	pstmt.setObject(1,pubKeyObj);
	pstmt.setObject(2,prvKeyObj);
    pstmt.setObject(3,code);
    pstmt.setObject(4,keyset);
    
    System.out.println(SQL_SERIALIZE_OBJECT_Update);
    int i = pstmt.executeUpdate();
    
    System.out.println("Status :"+i);
    if(!(i==0))
    {
    	fl = true;
    	
    }
  
    pstmt.close();
     }catch (Exception e)
     {
		System.out.println(e.getStackTrace());
	}
   
	return fl;
    
  }
  
  
  
  /**
   * To de-serialize a java object from database
   *
   * @throws SQLException
   * @throws IOException
   * @throws ClassNotFoundException
   */
  public static Object getPublicKey() throws SQLException, IOException,ClassNotFoundException 
  {
	
	  Database database=Database.getInstance();
		connection=database.connector();
	Statement pstmt = connection.createStatement();
    ResultSet rs = pstmt.executeQuery("select encryption_key from m_keys where k_no=1");
    rs.next();
 
    // Object object = rs.getObject(1);
 
    byte[] buf = rs.getBytes(1);
    ObjectInputStream objectIn = null;
    if (buf != null)
      objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));
    Object deSerializedObject = objectIn.readObject();
    rs.close();
    pstmt.close();
    System.out.println("\n\n ***** De-Serialization Information *****\n");
    System.out.println("Java object de-serialized from database. Object: "+ deSerializedObject + " Classname: "+ deSerializedObject.getClass().getName()+"\n\n");
    return deSerializedObject;
  }
  
  public static Object getPublicKey_con(int clscode,int ownercode) throws SQLException, IOException,ClassNotFoundException 
  {
	
	  Database database=Database.getInstance();
		connection=database.connector();
	Statement pstmt = connection.createStatement();
    ResultSet rs = pstmt.executeQuery("SELECT encryption_key FROM m_keys where key_cls_no = '"+clscode+"' and do_code='"+ownercode+"'");
    rs.next();
 
    // Object object = rs.getObject(1);
 
    byte[] buf = rs.getBytes(1);
    ObjectInputStream objectIn = null;
    if (buf != null)
      objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));
    Object deSerializedObject = objectIn.readObject();
    rs.close();
    pstmt.close();
    System.out.println("\n\n ***** De-Serialization Information *****\n");
    System.out.println("Java object de-serialized from database. Object: "+ deSerializedObject + " Classname: "+ deSerializedObject.getClass().getName()+"\n\n");
    return deSerializedObject;
  }
  
  public static Object getPrivateKey_con() throws SQLException, IOException,ClassNotFoundException 
  {
	
	  Database database=Database.getInstance();
		connection=database.connector();
	Statement pstmt = connection.createStatement();
    ResultSet rs = pstmt.executeQuery("SELECT decryption_key FROM m_keys where k_no = '1'");
    rs.next();
 
    byte[] buf = rs.getBytes(1);
    ObjectInputStream objectIn = null;
    if (buf != null)
      objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));
    Object deSerializedObject = objectIn.readObject();
    rs.close();
    pstmt.close();
    System.out.println("\n\n ***** De-Serialization Information *****\n");
    System.out.println("Java object de-serialized from database. Object: "+ deSerializedObject + " Classname: "+ deSerializedObject.getClass().getName()+"\n\n");
    return deSerializedObject;
  }
  
  public static Object getPrivateKey(int userid) throws SQLException, IOException,ClassNotFoundException 
  {
    
	  Database database=Database.getInstance();
		connection=database.connector();
	Statement pstmt = connection.createStatement();
    ResultSet rs = pstmt.executeQuery("SELECT master_s_key FROM m_key where k_no = '"+userid+"'");
    rs.next();
 
    // Object object = rs.getObject(1);
 
    byte[] buf = rs.getBytes(1);
    ObjectInputStream objectIn = null;
    if (buf != null)
      objectIn = new ObjectInputStream(new ByteArrayInputStream(buf));
 
    Object deSerializedObject = objectIn.readObject();
 
    rs.close();
    pstmt.close();
    //System.out.println("\n\n ***** De-Serialization Information *****\n");
    //System.out.println("Java object de-serialized from database. Object: "+ deSerializedObject + " Classname: "+ deSerializedObject.getClass().getName()+"\n\n");
    return deSerializedObject;
  }
  
 
  
  
  /* Testing The Algorithm */
  public static void main(String args[]) throws ClassNotFoundException,SQLException, IOException, NoSuchAlgorithmException 
  {
        
		String userName = "kumar";
 
	    // a sample java object to serialize
	   
	    SecretKey key = KeyGenerator.getInstance("DES").generateKey();
	    // serializing java object to mysql database
	  //  serializeJavaObjectToDB(userName, key);
	 
	    // de-serializing java object from mysql database
	    // Key objFromDatabase = (Key) (deSerializeJavaObjectFromDB(connection,userName));
	   // SecretKey objFromDatabase = (SecretKey)(getPublicKey());
	    connection.close();
   }
  
  
      
}
