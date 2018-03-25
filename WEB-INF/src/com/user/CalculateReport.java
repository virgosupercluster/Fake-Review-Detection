package com.user;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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

public class CalculateReport extends HttpServlet
{
	
	
public void doGet(HttpServletRequest request, HttpServletResponse response)
	
{	
	
	
	
	RequestDispatcher rd = null;
	
	int rank=0;
	
	
	String name1=request.getParameter("name");
	System.out.println("value of name1 is  "+name1);
	HttpSession session11 =request.getSession();
	int kk=0;
	String uid=session11.getAttribute("userid").toString();
	//String grpname=CommonDAO.getGroupName(name1);
	try {
		   HttpSession session = request.getSession(false);  
		   boolean	flag1=false;
			System.out.println("its came inside Fakedetection2>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
			int no=Integer.parseInt(request.getParameter("no"));
			System.out.println("============NO============"+no);
			
			if (session.getAttribute( "waitPage" ) == null )
		    	   
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
				
				if(no==0)
				{
					
					String userid=request.getParameter("userid");
			    	String product=request.getParameter("product");
				
		     	rd=request.getRequestDispatcher("/Files/JSP/User/reportgeneration.jsp?no=0&userid="+userid+"&product="+product+"");
				rd.forward(request,response);
				}
				
				else if(no==1)
				{
					String product=request.getParameter("product");
					System.out.println("=========INSIDE NO=1====");
					
					rd=request.getRequestDispatcher("/Files/JSP/User/reportgeneration.jsp?no=1&product="+product+"");
					rd.forward(request,response);
					
					
				}
				else if(no==2)
				{
					String userid=request.getParameter("userid");
					
					rd=request.getRequestDispatcher("/Files/JSP/User/reportgeneration.jsp?no=2&userid="+userid+"");
					rd.forward(request,response);
				}
				else if(no==3)
				{
					
				}
				else if(no==4)
				{
					
				}
				else if(no==5)
				{
					String basedon=request.getParameter("basedon");
					
					if(basedon.equals("userid"))
					{
						rd=request.getRequestDispatcher("/Files/JSP/User/reportgeneration.jsp?no=5&userid="+basedon+"");
						rd.forward(request,response);
						
					}
					else if(basedon.equals("ipaddress"))
					{
						rd=request.getRequestDispatcher("/Files/JSP/User/reportgeneration.jsp?no=6&ipaddress="+basedon+"");
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
