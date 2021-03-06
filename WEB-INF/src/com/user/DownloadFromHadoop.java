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
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
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

import com.util.HadoopDownload;
import com.util.HadoopUpload;
import com.util.Utility;

public class DownloadFromHadoop extends HttpServlet
{
	
	
public void doGet(HttpServletRequest request, HttpServletResponse response)
	
{	
	
	RequestDispatcher rd = null;
	
	
	
	//String grpname=CommonDAO.getGroupName(name1);
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

				try
				{
					 String HDFSConfigPath=getServletContext().getRealPath("/config.properties");
					 String DownloadPath=getServletContext().getRealPath("/Download");
			            boolean flag= HadoopDownload.downloadfromhadoop(HDFSConfigPath, "Review_Result_data.txt", DownloadPath); 
						
			        	File ofile = new File(DownloadPath+"/"+"Review_Result_data.txt");
			            ServletContext context = getServletContext();
					    String mimeType = context.getMimeType(DownloadPath+"/"+"Review_Result_data.txt");
					    if (mimeType == null) 
					    {
					    // set to binary type if MIME mapping not found
					    mimeType = "application/octet-stream";
					    }
					    System.out.println("MIME type: " + mimeType);
					    												
					    // modifies response
					    response.setContentType(mimeType);
					    response.setContentLength((int) ofile.length());

					    System.out.println("=======lenghthhhhh========="+(int) ofile.length());
					    FileInputStream inStream = new FileInputStream(ofile);												
					    // forces download
					    String headerKey = "Content-Disposition";
					    String headerValue = String.format("attachment; filename=\"%s\"", ofile.getName());
					   // System.out.println("=======Fname========="+path+"Digestive.txt");
					    response.setHeader(headerKey, headerValue);
					    // obtains response's output stream
					    OutputStream outStream = response.getOutputStream();
					    												
					    byte[] buffer = new byte[100096];
					    int bytesRead1 = -1;
					    												
					    while ((bytesRead1 = inStream.read(buffer)) != -1) 
					    {
					    outStream.write(buffer, 0, bytesRead1);
					    }
					    inStream.close();
					    outStream.close();
						
						
					}
					catch (Exception e) 
					{
						e.printStackTrace();
					}
	}	
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
