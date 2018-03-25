package com.user;

public class Connectionpoolingshanu {
	
	
	
	public static void main(String args[]) 
	
	{
		
	String shanu="shalinigowda";
	String sharu="sharathgowda";	
	boolean flag=PoolingDAO.insertcontents(shanu,sharu);
	System.out.println("flsg is "+flag);
	
		
	}

}
