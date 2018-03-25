package com.user;

import java.io.BufferedReader;
import java.io.FileReader;



public class Program 
{
    static String collapseWhitespace(String value) 
    {
	   // Replace all whitespace blocks with single spaces.
    		String trimval=value.trim();    		
    	    return trimval.replaceAll("\\s[^a-zA-Z]+", " ");
    }

    public static String filterwords(String value)
    {
    	
      String replace = null;
    	
    	String result = collapseWhitespace(value);
    	StringBuffer buffer=new StringBuffer();
    	String[] tokens = result.split(" ");
    	for(String s:tokens)
    	{
		        replace=s.replaceAll("[^a-zA-Z]+", "");
		    
		       buffer.append(replace+" ");
        }
    	String str=buffer.toString();
    	return str;
        //return str;
	 }
    
    
    public static void main(String arg[])
    {
    	 String replace = null;
    	
    	//String theInput =fileName;
    	
    	String value = "  \t@#$%Hi,\r\n\t\thow are  you\r\n\n\n\t hello2345 java \r\t\n\n\n\t good morning daddy";
    	// Test our methods.
    	String result = collapseWhitespace(value);
    	StringBuffer buffer=new StringBuffer();
    	String[] tokens = result.split(" ");
    	for(String s:tokens)
    	{
		        replace=s.replaceAll("[^a-zA-Z]+", "");
		 
		       buffer.append(replace+" ");
        }
    	String str=buffer.toString();
    	
        //return str;
	 }
    
  
	

}