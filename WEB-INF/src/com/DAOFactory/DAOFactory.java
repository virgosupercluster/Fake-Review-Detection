/**
 * 
 */
package com.DAOFactory;


public class DAOFactory
{
	public DAO getInstance(String name)
	{
		
		if(name.equals("User"))
			return new User();
		
		else
			return null;
	}
}
