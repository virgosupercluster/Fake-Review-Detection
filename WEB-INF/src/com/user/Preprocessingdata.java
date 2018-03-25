package com.user;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.DAOFactory.CommonDAO;
import com.user.AdminDAO;

import com.util.Utility;

public class Preprocessingdata extends HttpServlet
{
	
	
public void doGet(HttpServletRequest request, HttpServletResponse response)
	
{	
	try {
		   HttpSession session = request.getSession(false);  
		   boolean	flag1=false;
			System.out.println("its came inside preprocessing>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			ArrayList<String> data=new ArrayList<String>();
			
			if ( session.getAttribute( "waitPage" ) == null )
		    	   
	       	 {  
	    	   session.setAttribute( "waitPage", Boolean.TRUE );  
	    	   PrintWriter out = response.getWriter();  
	    	   out.println( "<html><head>" );  
	    	   out.println( "<title>Please Wait...</title>" );  
	       	   out.println( "<meta http-equiv=\"Refresh\" content=\"0\">" );  
	    	   out.println( "</head><body bgcolor=''>" );  
	    	   out.println( "<br><br><br>" );
	    	   out.print( "<center><img src='Files/Images/animated.gif' width='200' height='200'></img><br><br>");
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please Do not press Back or Refresh button.......<br>  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Preprocessing of data is going on......  " );
	    	   out.println("<font color='#fedcba' size='5'>");
	    	   out.println( "Please wait....</h1></center");  
	    	   out.close();  
	       } 
			else
			{
				String preprocessdata=request.getParameter("preprocess");
				System.out.println("===============preprocessdata=========="+preprocessdata);
				
				 session.removeAttribute( "waitPage" );  				
			
												HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
										     	map_tclaim=AdminDAO.getm_tweets(preprocessdata);
										     	
										     	map_tclaim.size();
										     	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>size"+map_tclaim.size());
										     	 System.out.println("entry set is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map_tclaim.entrySet());
									     	
									     	if(map_tclaim.size()>0)
									       	{
									        	  
									           for(Map.Entry m4:map_tclaim.entrySet())  
									           {
									        	  // System.out.println("entry set is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map_tclaim.entrySet());
										         	  m4.getKey();
										         	  String values = m4.getValue().toString();
										         	  String first=values.replace("[", "").replace("]", "");
										         	  String a[]=first.split("~~");         	 
										         	  String part1=a[0];
									       
											         System.out.println("Column id is is>>>>>>>>>>>>>>>>>>>>"+part1);
											         String part2=a[1];
											         System.out.println("Column topic is is>>>>>>>>>>>>>>>>>>>>"+part2);
											         String part3=a[2];
											         
											         System.out.println("Column sentiment is is>>>>>>>>>>>>>>>>>>>>"+part3);
											         String part4=a[3];
											         System.out.println("Columntweetid id is>>>>>>>>>>>>>>>>>>>>"+part4);
											         String part5=a[4];
											         System.out.println("Column tweetdate is>>>>>>>>>>>>>>>>>>>>"+part5);
											         
											         
											         
											         String part6=a[5];
											         System.out.println("Column tweettext is>>>>>>>>>>>>>>>>>>>>"+part6);	
											       /*   part5= Temp.removehttplink(part5);*/
											          
											        String  part7= Temp.removeUrl(part6);
											         System.out.println("String Part 7 is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+part7);		         
											       //  data=Preprocessing1.filter(part7);
											         StringBuffer buf = null;
											         String str=""+data;
											         data.add(str);
														for(int ii=0;ii<data.size();ii++)
														{
															buf=new StringBuffer();
															buf.append(data.get(ii));
														}					
														String s=buf.toString();
														s=s.replace("[", "");
														s=s.replace("]", "");
													 	flag1= AdminDAO.storefiltereddata(part1, part2,part3,part4,part5,s);
													   
											           
												
									           }
									           
									           RequestDispatcher rd=null;
												if(flag1==true)
												{
													
													rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=1");
													rd.forward(request,response);
												}
												else
												{
													
													rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no=0&no1=2");
													rd.forward(request,response);
												}                   
									           
									           
									           
									           
									           
       	}
	}	
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
