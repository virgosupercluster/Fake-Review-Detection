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
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.jdbc.JDBCCategoryDataset;
import org.jfree.data.jdbc.JDBCPieDataset;
import org.jfree.chart.plot.PiePlot;


import com.DAOFactory.CommonDAO;

import com.user.AdminDAO;

import com.util.Utility;

public class ViewGraph extends HttpServlet
{
	
	private static final long serialVersionUID = 1L;
	private Connection dbConnection = null;

	public ViewGraph() throws SQLException
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
					System.out.println("===================================");
					int totalcount=AdminDAO.gettotalCount();
					double total=totalcount;
					System.out.println("==totalcount==="+totalcount);
					int totalfakecount=AdminDAO.getfaketotalCount();
					
					double tot=totalfakecount;
					System.out.println("==totalfakecount==="+totalfakecount);
					int totalrealcount=AdminDAO.getrealtotalCount();
					double totr=totalrealcount;
					
					System.out.println("==totalrealcount==="+totalrealcount);
					
					
					
					int metadatacountbyuid=AdminDAO.getmetatotalCountbyuid();
					
					double totmu=metadatacountbyuid;
					
					System.out.println("==metadatacountbyuid==="+metadatacountbyuid);
					int metadatacountbyip=AdminDAO.getmetatotalCountbyip();
					double totmip=metadatacountbyip;
					int intersectioncount=AdminDAO.getintersectioncount();
					double intercount=intersectioncount;
					double totmeta=(totmu+totmip)-intercount;
					
					System.out.println("==metadatacountbyip==="+metadatacountbyip);
					if(totmeta>tot)
					{
						tot=totmeta-tot;
					}
					else if(totmeta<tot)
					{
						tot=tot-totmeta;
					}
					else if(totmeta==tot)
					{
						tot=0;
					}
					System.out.println("After TOTAL================="+tot);
					
					double fakepercent=(tot/total)*100;
					
					System.out.println("==(totalfakecount/totalcount)==="+(totalfakecount/totalcount));
					
					System.out.println("==fakepercent==="+fakepercent);
					
					double realpercent=(totr/total)*100;
					
					System.out.println("==realpercent==="+realpercent);
					
					
					double metafakepercent=(totmeta/total)*100;
					
					System.out.println("==totmu+totmip==="+(totmu+totmip));
					
					System.out.println("==metafakepercent==="+metafakepercent);
					
					boolean flg=AdminDAO.inserttopietable("Fake Reviews"+"("+(int)fakepercent+"%"+")",(int)tot);
					 flg=AdminDAO.inserttopietable("Real Reviews"+"("+(int)realpercent+"%"+")",(int)totr);
					 flg=AdminDAO.inserttopietable("Meta Fake Reviews"+"("+(int)metafakepercent+"%"+")",((int)totmeta));
					
			    
				
					try 
					{
						DefaultPieDataset pieDataset = new JDBCPieDataset(
								dbConnection, "select status,count from graph_data");
						
						/*JFreeChart chart = ChartFactory.createPieChart(
							      "Graph report", pieDataset, true, true, true);*/

						JFreeChart chart = ChartFactory.createPieChart(
							      "Pie Chart", pieDataset,true, true, true);
						
					
						  PiePlot plot = (PiePlot) chart.getPlot();
					        plot.setCircular(false);
						
						
						 if (chart != null) 
						    {
						            int width = 500;
						            int height = 400;
						            response.setContentType("image/jpeg");
						            OutputStream out = response.getOutputStream();
						            ChartUtilities.writeChartAsJPEG(out, chart, width, height);
						     }
							   
					} 
					catch (Exception e) 
					{
						e.printStackTrace();
						
					}
					
				}
				
				else if(no==3)
				{
					ArrayList<String> listofproducts=new ArrayList<String>();
					listofproducts=AdminDAO.getproductsinList();
					
					for(int i=0;i<listofproducts.size();i++)
					{
						int fakecount=AdminDAO.getfakecountofProduct(listofproducts.get(i));
						
						int realcount=AdminDAO.getrealcountofProduct(listofproducts.get(i));
						int fakecountby_metadata_user=AdminDAO.getfakecountbymetauserid(listofproducts.get(i));
						int fakecountby_metadata_ip=AdminDAO.getfakecountbymetaip(listofproducts.get(i));
						
						boolean flg=AdminDAO.insertintobargraph_table(listofproducts.get(i),fakecount,realcount,fakecountby_metadata_user+fakecountby_metadata_ip);
						
						
						
						
					}
					
					
					System.out.println("===================================");
					JDBCCategoryDataset dataset = new JDBCCategoryDataset(dbConnection);
			    
					try 
				    {
				    	dataset.executeQuery("select product, fake_reviews,real_reviews,fake_by_metadata from m_bar_graph order by id");
				    	
				    	//System.out.println("select s_name, memory from m_load_status_1 order by memory ");
				    
				    	JFreeChart chart = ChartFactory.createBarChart("Real v/s Fake Review Product Wise", "Products", "No_of_reviews",
				           dataset, PlotOrientation.VERTICAL, true, true, true);           
				           chart.setBorderVisible(true);
				    
					    if (chart != null) 
					    {
					            int width = 600;
					            int height = 400;
					            response.setContentType("image/jpeg");
					            OutputStream out = response.getOutputStream();
					            ChartUtilities.writeChartAsJPEG(out, chart, width, height);
					     }
				    }
				    catch (SQLException e) 
				    {
				            System.err.println(e.getMessage());
				    }
					
					
					
					/*rd=request.getRequestDispatcher("/Files/JSP/User/choosereporttype.jsp?no=7");
					rd.forward(request,response);*/
					
	}
				
				else if(no==4)
				{
					rd=request.getRequestDispatcher("/Files/JSP/User/choosereporttype.jsp?no=7");
					rd.forward(request,response);
					
	}	
			}
	}
	
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
