/**
 * 
 */
package com.DAOFactory;

import java.sql.ResultSet;
import java.util.Vector;


public abstract class DAO
{
	public abstract boolean loginCHK(String name,String pass);
	

	public abstract ResultSet getProfile(String name);
	public abstract boolean editProfile(String [] s);
	public abstract boolean chnagePass(int id,String cpass);
	public abstract ResultSet getUsers();
	public abstract ResultSet getUsers(String id);
	public abstract boolean deleteUser(String id);
	public abstract boolean deleteCloud(String id);

	public abstract boolean editUser(String [] s);
	public abstract boolean editCloud(String [] s);
	public abstract ResultSet getClouds();
	public abstract boolean CHKCloud(String id);
	public abstract ResultSet getClouds(int id);

	
	
}
