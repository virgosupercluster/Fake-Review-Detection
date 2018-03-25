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
import java.sql.Connection;
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
import javax.servlet.ServletException;
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
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;


import com.DAOFactory.CommonDAO;

import com.user.AdminDAO;

import com.util.Utility;

public class ViewGraph2 extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	private Connection dbConnection = null;

	public ViewGraph2() throws SQLException
	{
       // dbConnection = Bardao.getConnection();
		//Connection c1= null;
        DataBaseConnectionPool dbConnectionPool;
        dbConnectionPool = new DataBaseConnectionPool(Global.Driver,Global.URL, Global.Uname, Global.Pass);

        dbConnection = dbConnectionPool.getConnection();
	}
	
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

				int no=Integer.parseInt(request.getParameter("no"));
				
				if(no==1)
				{
					System.out.println("==============INSIDE 1===");
						
						rd=request.getRequestDispatcher("/Files/JSP/User/listofreports.jsp?no=2");
						rd.forward(request,response);
				}
				else if(no==2)
				{
					System.out.println("==============INSIDE 1===");
					
					rd=request.getRequestDispatcher("/Files/JSP/User/choosereporttype.jsp?no=7");
					rd.forward(request,response);
					
				}
				
				else if(no==3)
				{
				
					System.out.println("===================================");
					JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnection);
			    
				
					try 
					{
						DefaultPieDataset pieDataset = new JDBCPieDataset(
								dbConnection, "select status,count from graph_data");
						
						JFreeChart chart = ChartFactory.createPieChart(
							      "", pieDataset, true, true, true);

						
						 if (chart != null) 
						    {
						            int width = 1000;
						            int height = 400;
						            response.setContentType("image/jpeg");
						            OutputStream out = response.getOutputStream();
						            ChartUtilities.writeChartAsJPEG(out, chart, width, height);
						     }
							   
					} 
					catch (Exception e) 
					{
						
					}
				}
			  
	}	
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
