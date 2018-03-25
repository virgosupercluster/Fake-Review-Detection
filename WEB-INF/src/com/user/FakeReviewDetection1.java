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

public class FakeReviewDetection1 extends HttpServlet
{
	
	
public void doGet(HttpServletRequest request, HttpServletResponse response)
	
{	
	boolean flag11=false;
	boolean flag22=false;
	boolean flag33=false;
	boolean flag7=false;
	boolean flag44=false;
	String fileName = "", root = "", md = "";
	String status; 
	String[] name = new String[2];
	int i = 0;
	File uploadedFile = null;
	File uploadedFile1=null;
	ResultSet rs = null;
	boolean flag = false;
	boolean flag_upload = false;
	RequestDispatcher rd = null;
	Random random = new Random();
	int num, num1 = 0;
	boolean isMultipart = ServletFileUpload.isMultipartContent(request);
	String name1=request.getParameter("name");
	System.out.println("value of name1 is  "+name1);
	HttpSession session11 =request.getSession();
	String uid=session11.getAttribute("userid").toString();
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
					
					String ip=null;
					Date d1 = null;
					Date d2 = null;
			     	SimpleDateFormat format = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
			     	
			     	ArrayList<String> iplist=new ArrayList<String>();
			     	iplist=AdminDAO.getiplist();
			     	
			     	for(int ipcount=0;ipcount<iplist.size();ipcount++)
			     	{
			     	
			     	boolean f1=AdminDAO.check_fake_ip_address(iplist.get(ipcount));
			     	 if(f1)
				        {
			     		boolean f2=AdminDAO.updatereviewstatus(iplist.get(ipcount));
			     		 
			     	
			     		 
			     		 String filename=AdminDAO.getFilename3(iplist.get(ipcount));
			     			
			     			
			     			
			     		 	FileInputStream instream = null;
			     			FileOutputStream outstream = null;
			     		 
			     		    	try{
			     		    	    File infile =new File(Utility.getPro("path")+filename+".txt");
			     		    	    File outfile =new File(request.getRealPath("")+"/FakeReviews/"+filename+".txt");
			     		    	    
			     		    	 
			     		    	    
			     		 
			     		    	    instream = new FileInputStream(infile);
			     		    	    outstream = new FileOutputStream(outfile);
			     		 
			     		    	    byte[] buffer = new byte[1024];
			     		 
			     		    	    int length;
			     		    	    /*copying the contents from input stream to
			     		    	     * output stream using read and write methods
			     		    	     */
			     		    	    while ((length = instream.read(buffer)) > 0){
			     		    	    	outstream.write(buffer, 0, length);
			     		    	    }

			     		    	    //Closing the input/output file streams
			     		    	    instream.close();
			     		    	    outstream.close();
			     		    	    
			     		    	    

				     		    	 
				     		    	  StringBuilder sb = new StringBuilder();
				     		    	    
				     		    	 
				     		    		    BufferedReader br = new BufferedReader(new FileReader(Utility.getPro("path")+filename+".txt"));
				     		    		    try {
				     		    		        
				     		    		    	String line = br.readLine();

				     		    		        while (line != null) {
				     		    		            sb.append(line);
				     		    		            sb.append("\n");
				     		    		            line = br.readLine();
				     		    		        }
				     		    		       
				     		    		    }
				     		    		    catch(Exception e)
				     		    		    {
				     		    		    	e.printStackTrace();
				     		    		    }
				     		    		    finally {
				     		    		        br.close();
				     		    		    }
				     		    		   String review=sb.toString().replace("'", "");
				     		    		    System.out.println("=================LINE===================="+review);
			     		    	    
			     		    	   boolean ti=AdminDAO.inserttofaketable(filename,review);

			     		    	    System.out.println("File copied successfully!!");
			     		 
			     		    	}
			     		    	catch(IOException ioe)
			     		    	{
			     		    		ioe.printStackTrace();
			     		    	 }
			     		
			     		
			     		
				        }
			     	}
			     	
			     	
			     	ArrayList<String> userslist=new ArrayList<String>();
			     	userslist=AdminDAO.getuserslistforverify();
			     	
			     	
			     	for(int usercount=0;usercount<userslist.size();usercount++)
			     	{
			     	
			     	boolean f1=AdminDAO.check_fake_userid(userslist.get(usercount));
			     	 if(f1)
				        {
			     		boolean f2=AdminDAO.updatereviewstatus2(userslist.get(usercount));
			     		 
			     		 String filename=AdminDAO.getFilename1(userslist.get(usercount));
			     			
			     			
			     			
			     		 	FileInputStream instream = null;
			     			FileOutputStream outstream = null;
			     		 
			     		    	try{
			     		    	    File infile =new File(Utility.getPro("path")+filename+".txt");
			     		    	    File outfile =new File(request.getRealPath("")+"/FakeReviews/"+filename+".txt");
			     		    	    
			     		    	 
			     		    	    
			     		 
			     		    	    instream = new FileInputStream(infile);
			     		    	    outstream = new FileOutputStream(outfile);
			     		 
			     		    	    byte[] buffer = new byte[1024];
			     		 
			     		    	    int length;
			     		    	    /*copying the contents from input stream to
			     		    	     * output stream using read and write methods
			     		    	     */
			     		    	    while ((length = instream.read(buffer)) > 0){
			     		    	    	outstream.write(buffer, 0, length);
			     		    	    }

			     		    	    //Closing the input/output file streams
			     		    	    instream.close();
			     		    	    outstream.close();
			     		    	    
			     		    	    

				     		    	 
				     		    	  StringBuilder sb = new StringBuilder();
				     		    	    
				     		    	 
				     		    		    BufferedReader br = new BufferedReader(new FileReader(Utility.getPro("path")+filename+".txt"));
				     		    		    try {
				     		    		        
				     		    		    	String line = br.readLine();

				     		    		        while (line != null) {
				     		    		            sb.append(line);
				     		    		            sb.append("\n");
				     		    		            line = br.readLine();
				     		    		        }
				     		    		       
				     		    		    }
				     		    		    catch(Exception e)
				     		    		    {
				     		    		    	e.printStackTrace();
				     		    		    }
				     		    		    finally {
				     		    		        br.close();
				     		    		    }
				     		    		   String review=sb.toString().replace("'", "");
				     		    		    System.out.println("=================LINE===================="+review);
			     		    	    
			     		    	   boolean ti=AdminDAO.inserttofaketable(filename,review);

			     		    	    System.out.println("File copied successfully!!");
			     		 
			     		    	}
			     		    	catch(IOException ioe)
			     		    	{
			     		    		ioe.printStackTrace();
			     		    	 }
			     			
			     		
				        }
			     	}
			     	
			     	
			     	
			     	
			     	
			     	
					ip=AdminDAO.getcountofip(Integer.parseInt(Utility.getPro("IPcountThreshold")));
					String arr[]=ip.split("~~");
					
					if(arr.length>0)
					{
						for(int jj=0;jj<arr.length;jj++)
						{
						
						
						HashMap<Integer, ArrayList<String>> map_reviews=new HashMap<Integer, ArrayList<String>>();
						map_reviews=AdminDAO.getreviewsbasedonip(arr[jj]);
						int count=0;
						String date1="";
						String time1="";
						int m=0,n=0;
						ArrayList<String> list=new ArrayList<>();
						ArrayList<String> list1=new ArrayList<>();
						
						if(map_reviews.size()>0)
				       	{
							
				        	  
				           for(Map.Entry m4:map_reviews.entrySet())  
				           {
				        	   
				        	  
				        	  // System.out.println("entry set is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map_tclaim.entrySet());
					         	  m4.getKey();
					         	  String values = m4.getValue().toString();
					         	  String first=values.replace("[", "").replace("]", "");
					         	  String a[]=first.split("~~");         	 
					         	 
				       
						            String id=a[0],sl_no=a[1],filename=a[2],ip_address=a[3],m_date=a[4],m_time=a[5],hotel=a[6],reviews=a[7],userid=a[8],status1=a[9];
						            
						       						         
						         
						         if(count==0)
						         {
						        	 date1=m_date; 
						        	 time1=m_time;
						        	  d1=format.parse( date1+""+time1);
						        	  list.add(id);
						        	 count=1;
						        	 
						         }
						         else
						         {
						        	 
						        	 d2 = format.parse(m_date+""+m_time); 
						        	 
						        	 long diff = d2.getTime() - d1.getTime();

						 			long diffSeconds = diff / 1000 % 60;
						 			long diffMinutes = diff / (60 * 1000) % 60;
						 			long diffHours = diff / (60 * 60 * 1000) % 24;
						 			long diffDays = diff / (24 * 60 * 60 * 1000);

						 			System.out.print(diffDays + " days, ");
						 			System.out.print(diffHours + " hours, ");
						 			System.out.print(diffMinutes + " minutes, ");
						 			System.out.print(diffSeconds + " seconds.");
						 			
						 			if(diffDays==0 )
						 			{
						 				if(diffHours==0)
							 			{
						 					if(diffMinutes<5)
								 			{
						 						System.out.println("====diffMinutes======="+diffMinutes);
						 						System.out.println("===========INSIDE M===============");
						 						m++;
						 						list.add(id);
						 						 
						 						 
								 			}
						 					else
						 					{
						 						n++;
						 						System.out.println("===========INSIDE N===============");
						 						list1.add(id);
						 					}
							 			}
						 			}
						 			
						 			System.out.println("===============MMMMMMMMMM=============="+m);
						        	 
						        	 
						         }
						         
						  
				           }
				       	}
					
						
						

				     	 if(m>=Integer.parseInt(Utility.getPro("IP_and_Time_Threshold")))
					     	{
				        	
					     		for(int j=0;j<list.size() ;j++)
					     		{
					     			 flag7=AdminDAO.updateStatus2(list.get(j));
					     			 String filename=AdminDAO.getFilename(list.get(j));
					     			
					     			
					     			
					     		 	FileInputStream instream = null;
					     			FileOutputStream outstream = null;
					     		 
					     		    	try{
					     		    	    File infile =new File(Utility.getPro("path")+filename+".txt");
					     		    	    File outfile =new File(request.getRealPath("")+"/FakeReviews/"+filename+".txt");
					     		    	    
					     		    	 
					     		    	    
					     		 
					     		    	    instream = new FileInputStream(infile);
					     		    	    outstream = new FileOutputStream(outfile);
					     		 
					     		    	    byte[] buffer = new byte[1024];
					     		 
					     		    	    int length;
					     		    	    /*copying the contents from input stream to
					     		    	     * output stream using read and write methods
					     		    	     */
					     		    	    while ((length = instream.read(buffer)) > 0){
					     		    	    	outstream.write(buffer, 0, length);
					     		    	    }

					     		    	    //Closing the input/output file streams
					     		    	    instream.close();
					     		    	    outstream.close();
					     		    	    
					     		    	    

						     		    	 
						     		    	  StringBuilder sb = new StringBuilder();
						     		    	    
						     		    	 
						     		    		    BufferedReader br = new BufferedReader(new FileReader(Utility.getPro("path")+filename+".txt"));
						     		    		    try {
						     		    		        
						     		    		    	String line = br.readLine();

						     		    		        while (line != null) {
						     		    		            sb.append(line);
						     		    		            sb.append("\n");
						     		    		            line = br.readLine();
						     		    		        }
						     		    		       
						     		    		    }
						     		    		    catch(Exception e)
						     		    		    {
						     		    		    	e.printStackTrace();
						     		    		    }
						     		    		    finally {
						     		    		        br.close();
						     		    		    }
						     		    		   String review=sb.toString().replace("'", "");
						     		    		    System.out.println("=================LINE===================="+review);
					     		    	    
					     		    	   boolean ti=AdminDAO.inserttofaketable(filename,review);

					     		    	    System.out.println("File copied successfully!!");
					     		 
					     		    	}
					     		    	catch(IOException ioe)
					     		    	{
					     		    		ioe.printStackTrace();
					     		    	 }
					     			
					     			 
					     		}
					     		
					     	}
				     	 
				     	 
				     	 else if(m<Integer.parseInt(Utility.getPro("IP_and_Time_Threshold")))
					         {
				     		 
				     		 System.out.println("====LIST???????????????????????? CONTENT========"+list1);
				     		 
					        	 for(int j=0;j<list1.size();j++)
						     		{
						     			 flag7=AdminDAO.updateStatus3(list1.get(j));
						     			 String filename=AdminDAO.getFilename(list1.get(j));
						     			
						     			
						     			FileInputStream instream = null;
						     			FileOutputStream outstream = null;
						     		 
						     		    	try{
						     		    	    File infile =new File(Utility.getPro("path")+filename+".txt");
						     		    	    File outfile =new File(request.getRealPath("")+"/RealReviews/"+filename+".txt");
						     		    	 
						     		    	    instream = new FileInputStream(infile);
						     		    	    outstream = new FileOutputStream(outfile);
						     		 
						     		    	    byte[] buffer = new byte[1024];
						     		 
						     		    	    int length;
						     		    	    /*copying the contents from input stream to
						     		    	     * output stream using read and write methods
						     		    	     */
						     		    	    while ((length = instream.read(buffer)) > 0){
						     		    	    	outstream.write(buffer, 0, length);
						     		    	    }

						     		    	    //Closing the input/output file streams
						     		    	    instream.close();
						     		    	    outstream.close();

						     		    	   StringBuilder sb = new StringBuilder();
						     		    	    
						     		    	 
						     		    		    BufferedReader br = new BufferedReader(new FileReader(Utility.getPro("path")+filename+".txt"));
						     		    		    try 
						     		    		    {
						     		    		       
						     		    		       String line = br.readLine();

						     		    		        while (line != null) 
						     		    		        {
						     		    		            sb.append(line);
						     		    		            sb.append("\n");
						     		    		            line = br.readLine();
						     		    		          
						     		    		                System.out.println("=========LINEEEEEEEEEEE=============="+line);
						     		    		              

						     		    		        }
						     		    		       
						     		    		    }
						     		    		    catch(Exception e)
						     		    		    {
						     		    		    	e.printStackTrace();
						     		    		    }
						     		    		    finally {
						     		    		        br.close();
						     		    		    }
						     		    		    
						     		    		    String review=sb.toString().replace("'", "");
						     		    		    System.out.println("=================LINE===================="+review);
						     		    		   boolean ti=AdminDAO.inserttorealtable(filename,review);
						     		    	    
						     		    	    
						     		    	    System.out.println("File copied successfully!!");
						     		 
						     		    	}
						     		    	catch(IOException ioe)
						     		    	{
						     		    		ioe.printStackTrace();
						     		    	 }
						     			
						     		}
					         }
				     	 
					}
					}
					
				ArrayList<String> uncheckediplist=new ArrayList<String>();
				uncheckediplist=AdminDAO.getuncheckediplist();
				
				System.out.println("========LIST====CONTENT IN UNCHECKED===="+uncheckediplist);
					
					
						for(int m=0;m<uncheckediplist.size();m++)
						{
							AdminDAO.updateStatus4(uncheckediplist.get(m));
							 String filename=AdminDAO.getFilename(uncheckediplist.get(m));
				     			
				     			
				     			FileInputStream instream = null;
				     			FileOutputStream outstream = null;
				     		 
				     		    	try{
				     		    	    File infile =new File(Utility.getPro("path")+filename+".txt");
				     		    	    File outfile =new File(request.getRealPath("")+"/RealReviews/"+filename+".txt");
				     		    	 
				     		    	    instream = new FileInputStream(infile);
				     		    	    outstream = new FileOutputStream(outfile);
				     		 
				     		    	    byte[] buffer = new byte[1024];
				     		 
				     		    	    int length;
				     		    	    /*copying the contents from input stream to
				     		    	     * output stream using read and write methods
				     		    	     */
				     		    	    while ((length = instream.read(buffer)) > 0){
				     		    	    	outstream.write(buffer, 0, length);
				     		    	    }

				     		    	    //Closing the input/output file streams
				     		    	    instream.close();
				     		    	    outstream.close();

				     		    	   StringBuilder sb = new StringBuilder();
				     		    	    
				     		    	 
				     		    		    BufferedReader br = new BufferedReader(new FileReader(Utility.getPro("path")+filename+".txt"));
				     		    		    try 
				     		    		    {
				     		    		       
				     		    		       String line = br.readLine();

				     		    		        while (line != null) 
				     		    		        {
				     		    		            sb.append(line);
				     		    		            sb.append("\n");
				     		    		            line = br.readLine();
				     		    		          
				     		    		                System.out.println("=========LINEEEEEEEEEEE=============="+line);
				     		    		              

				     		    		        }
				     		    		       
				     		    		    }
				     		    		    catch(Exception e)
				     		    		    {
				     		    		    	e.printStackTrace();
				     		    		    }
				     		    		    finally {
				     		    		        br.close();
				     		    		    }
				     		    		    
				     		    		    String review=sb.toString().replace("'", "");
				     		    		    System.out.println("=================LINE===================="+review);
				     		    		   boolean ti=AdminDAO.inserttorealtable(filename,review);
				     		    	    
				     		    	    
				     		    	    System.out.println("File copied successfully!!");
				     		 
				     		    	}
				     		    	catch(IOException ioe)
				     		    	{
				     		    		ioe.printStackTrace();
				     		    	 }
				     			
							
							
						}
						
					
					
					rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=1");
					rd.forward(request,response);
					
				}
				catch (Exception e) 
				{
					
				}
				
				
			
			
	}	
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
