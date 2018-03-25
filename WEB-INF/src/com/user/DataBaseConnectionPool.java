package com.user;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.Vector;
public class DataBaseConnectionPool {
	private String driverName;
	private String password;
	private String url;
	private String user;
	private Driver driver;
	private Vector freeConnections;
	private int maxConn;
	private int count;
	/**
	 * DatabaseConnectionPool constructor.
	 * 
	 * @param drivername
	 * @param conUrl
	 * @param conuser
	 * @param conpassword
	 * @throws SQLException
	 */
	public DataBaseConnectionPool(String drivername, String conUrl,
			String conuser, String conpassword) throws SQLException 
			{
		
		freeConnections = new Vector();
		driverName = drivername;
		url = conUrl;
		user = conuser;
		password = conpassword;
		try {
			driver = (Driver) Class.forName(driverName).newInstance();
			DriverManager.registerDriver(driver);
		} catch (Exception _ex) {
			new SQLException();
		}
		count = 0;
		maxConn = 10;
	}
	/**
	 * Method to destroy all connections.
	 */
	public void destroy() 
	{
		System.out.println("Destroy Connection");
		closeAll();
		try {
			DriverManager.deregisterDriver(driver);
			return;
		} catch (Exception e) {
			e.printStackTrace();
			return;
		}
	}
	/**
	 * Method to add free connections in to pool.
	 * 
	 * @param connection
	 */
	public synchronized void freeConnection(Connection connection)
	{
		freeConnections.addElement(connection);
		System.out.println("Vector :"+freeConnections);
		count--;
		
		//System.out.println("Count :"+count);
		
		notifyAll();
	}
	
	/**
	 * Method to get connections.
	 * 
	 * @return Connection
	 */
	public synchronized Connection getConnection()
	{
		
		Connection connection = null;
		if (freeConnections.size() > 0) 
		{
			connection = (Connection) freeConnections.elementAt(0);
			freeConnections.removeElementAt(0);
			try
			{
				if (connection.isClosed()) 
				{
					//System.out.println("Connection Closed");
					connection = getConnection();
				}
				//System.out.println("Count 1:"+count);
			} catch (Exception e) {
				print(e.getMessage());
				connection = getConnection();
			}
			return connection;
		}
		if (count < maxConn) 
		{
			
			//System.out.println("Count 2:"+count);
			connection = newConnection();
			print("NEW CONNECTION CREATED");
		}
		if (connection != null) 
		{
			//System.out.println("Count 3:"+count);
			count++;
		}
		
		return connection;
	}
	/**
	 * Method to close all resources
	 */
	private synchronized void closeAll() {
		for (Enumeration enumeration = freeConnections.elements(); enumeration
				.hasMoreElements();) {
			Connection connection = (Connection) enumeration.nextElement();
			try {
				connection.close();
			} catch (Exception e) {
				print(e.getMessage());
			}
		}
		freeConnections.removeAllElements();
	}
	/**
	 * Method to create new connection object.
	 * 
	 * @return Connection.
	 */
	private Connection newConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			print(e.getMessage());
			return null;
		}
		return connection;
	}
	private void print(String print) {
		System.out.println(print);
	}
}