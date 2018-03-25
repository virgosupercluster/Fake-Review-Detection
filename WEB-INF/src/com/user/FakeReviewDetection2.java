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
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import com.DAOFactory.CommonDAO;

import com.util.HadoopUpload;
import com.user.AdminDAO;

import com.util.Utility;
import com.util.WritetoTextFile;

public class FakeReviewDetection2 extends HttpServlet
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

				
				ArrayList<String> userslist=new ArrayList<String>();
				
				HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
		     	map_tclaim=AdminDAO.getuserslist();
		     	System.out.println("===============map_tclaim.size()========="+map_tclaim.size());
		     	if(map_tclaim.size()>0)
		       	{
		        	  
		           for(Map.Entry m4:map_tclaim.entrySet())  
		           {
		        	   
		        	  
		        	  // System.out.println("entry set is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map_tclaim.entrySet());
			         	  m4.getKey();
			         	  String values = m4.getValue().toString();
			         	  String first=values.replace("[", "").replace("]", "");
			         	  String a[]=first.split("~~"); 
			         	 String review=a[0];
			         	 
			         	 
			         	 System.out.println("====Review in fakedetect2========="+review);
			         	  String userid=a[1];
			         	 String review_slno=a[2].trim();
			         	 userslist.add(userid);
			         	  
			         	 System.out.println("====Userid in fakedetect2========="+userid);
			         	  
			         	 String review2=review.toLowerCase(); 
			         	  
			         	String review3=Program.filterwords(review2);
			         	String fileName1=Utility.getPro("temp_file");  //"D:\\otow8.txt";          
			         	
			         	System.out.println("=========FILEname===="+fileName1);
			         	FileWriter foWriter = new FileWriter(fileName1, false); // true to append
						// false to overwrite.
						 foWriter.write(review3);
						 foWriter.close();
		       
						 
						 String dat = TextSearch.text_Search(fileName1);
						 
						 System.out.println("List Of words :"+dat);
						 
						 ArrayList key_data = TextSearch.text_filter(dat,review_slno);
						 
						 int id=1;
						 for(int j=0;j<key_data.size();j++)
						   {
							   
							   boolean f1=AdminDAO.checkNoun(key_data.get(j).toString());
								
								   boolean f4=AdminDAO.checkPositive(key_data.get(j).toString());
								  boolean f5=AdminDAO.checkNegative(key_data.get(j).toString());
								   if(f1==true)
								   {
									   
									   System.out.println("In Noun>>"+key_data.get(j).toString());
									   AdminDAO.insertNoun(id,key_data.get(j).toString());
									    
								   }
								   else if(f4==true)
								   {
									   System.out.println("In Adjective>>"+key_data.get(j).toString());
									   AdminDAO.insertAdject(id,key_data.get(j).toString());
									   
								   }
								   else if(f5=true)
								   {
									   System.out.println("In Special>>"+key_data.get(j).toString());
									   AdminDAO.insertNadjective(id,key_data.get(j).toString());
									   
								   }
								 
							   }
						 
						 
						 
						 
						 ArrayList<String> wordslist = new ArrayList<String>();
						   ArrayList<String> typelist = new ArrayList<String>();
						   
						   HashMap<Integer, ArrayList<String>> map_tclaim1=new HashMap<Integer, ArrayList<String>>();
					     	map_tclaim1=AdminDAO.getworddiscription(id);
						   
					     	
					     	if(map_tclaim1.size()>0)
					       	{
					        	  
					           for(Map.Entry m5:map_tclaim1.entrySet())  
					           {
					        	   
					        	  
					        	  // System.out.println("entry set is>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+map_tclaim.entrySet());
						         	  m5.getKey();
						         	  String values1 = m5.getValue().toString();
						         	  String first1=values1.replace("[", "").replace("]", "");
						         	  String a1[]=first1.split("~~");
						         	  
						         	 wordslist.add(a1[2]);
									  // System.out.println("wordlist is "+wordslist);
									   typelist.add(a1[3]);
						         	 
					           }
					       	}
						  
						 
					        for(int i1=0;i1<wordslist.size();i1++)
							   {
								 //System.out.println("condition value :"+i+1+" "+wordslist.size());
								   if(i1+1<wordslist.size())
								   {
									 if(typelist.get(i1).equals("noun")&&typelist.get(i1+1).equals("adjective"))
									 {
										 System.out.println(" noun adjective "+wordslist.get(i1)+" "+wordslist.get(i1+1));
										 System.out.println("========================");
										
										  rank=AdminDAO.getRankValue(wordslist.get(i1+1));
										
										 int rank2=AdminDAO.getRankValue1(wordslist.get(i1+1));
										
										 System.out.println("rank value :"+rank);
										 System.out.println("rank2 value :"+rank2);
										 if(rank==1)
										 {
										 boolean flag111=AdminDAO.insertWordVal(wordslist.get(i1), rank, wordslist.get(i1+1));
										 }
										 if(rank2==-1)
										 {
											 boolean flag117=AdminDAO.insertWordVal(wordslist.get(i1), rank2, wordslist.get(i1+1)); 
										 }
										 if(i1+1<wordslist.size())
										{
											 i1=i1+1; 
										}
										
									 }
									 else if(typelist.get(i1).equals("adjective")&&typelist.get(i1+1).equals("noun"))
									 {
										 int rankval=AdminDAO.getRankValue(wordslist.get(i1));
										 int rank2=AdminDAO.getRankValue1(wordslist.get(i1));
										 System.out.println("rank value :"+rankval);
										 if(rankval==1)
										 {
										 boolean flag221=AdminDAO.insertWordVal(wordslist.get(i1+1), rankval, wordslist.get(i1));
										 }
										 if(rank2==-1)
										 {
											 boolean flag331=AdminDAO.insertWordVal(wordslist.get(i1+1), rank2, wordslist.get(i1)); 
										 }
										 System.out.println(" adjective noun "+wordslist.get(i1)+" "+wordslist.get(i1+1));
										 System.out.println("========================");
										 if(i1+1<wordslist.size())
											{
												 i1=i1+1; 
											}
									 }
									 else if(typelist.get(i1).equals("noun")&&typelist.get(i1+1).equals("noun"))
									 {
										 System.out.println(" noun noun "+wordslist.get(i1)+" "+wordslist.get(i1+1));
									 }
									 else if(typelist.get(i1).equals("adjective")&&typelist.get(i1+1).equals("adjective"))
									 {
										 System.out.println(" adjective adjective "+wordslist.get(i1)+" "+wordslist.get(i1+1));
									 }
									 else if(typelist.get(i1).equals("special"))
									 {
										 System.out.println("========================");
										 System.out.println(" Special "+wordslist.get(i1));
										 
												// i=i+1; 
										 
										 boolean flag441=AdminDAO.insertSpecial(wordslist.get(i1));
											
									 }
									
									 
								   }
								   else if(i1+1==wordslist.size())
								   {
									  // System.out.println("its came to else block");
									   if(typelist.get(i1).equals("noun"))
										 {
											 System.out.println(" noun  "+wordslist.get(i1));
											
										 }
										 else if(typelist.get(i1).equals("adjective"))
										 {
											 System.out.println(" adjective "+wordslist.get(i1));
											
										 }
										 else if(typelist.get(i1).equals("special"))
										 {
											 System.out.println(" Special "+wordslist.get(i1));
											 boolean flag55=AdminDAO.insertSpecial(wordslist.get(i1));
											
										 }
									   
								   }
								
							 }
					        
					        
					       
						    int positivemark1=AdminDAO.getReviewFeedBackPositive();
						    System.out.println("////////////////////////////////////////////////////:"+positivemark1);
						    
						    int negativemark1=AdminDAO.getReviewFeedBackNegative();
						    System.out.println("////////////////////////////////////////////////////:"+negativemark1);
						    
						    int neutralmark1=AdminDAO.getReviewFeedBackNeutral();
						    System.out.println("////////////////////////////////////////////////////:"+neutralmark1);
						    
						    String review_value="";
						    
						    if(positivemark1>negativemark1)
							{
						    	review_value="positive";
							}
							if(positivemark1==negativemark1)
							{
								review_value="neutral";
							}
							
							if(positivemark1<negativemark1)
							{
								review_value="negative";
							}
						    
						    
						  String filtered_review= key_data.toString();
						   String filtered_review1= filtered_review.replace("[", "");
						   String filtered_review2= filtered_review1.replace("]", "");
						   String filtered_review3= filtered_review2.replace(",", "");
						   System.out.println("==========filtered_review3============"+filtered_review3);
						   
						   String arr[]=filtered_review3.split(" ");
						   int length=arr.length;
						   System.out.println("==========String Length======="+length);
						   int no_two_gram=length-1;
						   
						   System.out.println("==========String no_two_gram======="+no_two_gram);
						   int no_three_gram=length-2;
						   
						   System.out.println("==========String no_three_gram======="+no_three_gram);
						   
						   
						   
						   int autoIncrCount=AdminDAO.auto_incr_count("m_temp2");
						   
						   for(kk=0;kk<no_two_gram;kk++)
						   {
							  
							   String firstword=arr[kk];
							   String secondword=arr[kk+1];
							   StringBuffer sb=new StringBuffer();
							   sb.append(firstword);
							   sb.append("-");
							   sb.append(secondword);
							   System.out.println("=========String Buffer===="+sb.toString());
							   boolean flag77=AdminDAO.insertintoNGram(autoIncrCount,userid, Utility.getPro("N_gram1"), sb.toString());  
							  
							   
						   }
						   
						   
						   
						   for(kk=0;kk<no_three_gram;kk++)
						   {
							  
							   String firstword=arr[kk];
							   String secondword=arr[kk+1];
							   String thirdword=arr[kk+2];
							   StringBuffer sb=new StringBuffer();
							   sb.append(firstword);
							   sb.append("-");
							   sb.append(secondword);
							   sb.append("-");
							   sb.append(thirdword);
							  // System.out.println("=========String Buffer===="+sb.toString());
							   boolean flag77=AdminDAO.insertintoNGram(autoIncrCount,userid, Utility.getPro("N_gram2"), sb.toString());  
							 
						   }
						   
						 
						 boolean flag77=AdminDAO.insertintoTemp2(filtered_review3,review_value,userid);
						 boolean f77=AdminDAO.truncateTable();
						 
				        
		           }
		           
		           
		         
			        	  ArrayList<String> userlistdata=new ArrayList<String>();
			        	  
			        	  userlistdata=AdminDAO.getUserslistforPercentageCalculation();
			           for(int k=0;k<userlistdata.size();k++)  
			           {
		           
		           double count_of_reviews_of_user=0.0;
		           count_of_reviews_of_user = AdminDAO.getCountofRevies(userlistdata.get(k));
		           double count_percentage=0.0;
		           count_percentage= (count_of_reviews_of_user/Double.parseDouble(Utility.getPro("Count_Threshold")))* Double.parseDouble(Utility.getPro("total_threshold_of_count_percent"));
		           
		           System.out.println("===count_percentage====="+count_percentage);
		           
		           double count_of_posreviews_of_user=0.0;
		           count_of_posreviews_of_user= AdminDAO.getCountofPositivereviews(userlistdata.get(k));
		           
		           double positive_percentage=0.0;
		          
		          double pos=count_of_posreviews_of_user/count_of_reviews_of_user;
		          System.out.println("======POSITIVE======="+pos);
		          
		          System.out.println("======count_of_reviews_of_user======="+count_of_reviews_of_user);
		          System.out.println("======count_of_posreviews_of_user======="+count_of_posreviews_of_user);
		          
		          System.out.println("======Double.parseDouble(Utility.getPro(total_threshold_of_positive_percent))======="+Double.parseDouble(Utility.getPro("total_threshold_of_positive_percent")));
		          positive_percentage=((count_of_posreviews_of_user/count_of_reviews_of_user)* Double.parseDouble(Utility.getPro("total_threshold_of_positive_percent")));
		           
		           System.out.println("===positive_percentage====="+count_of_posreviews_of_user/count_of_reviews_of_user+"~~~~~~~~"+userlistdata.get(k));
		           
		           double two_gram_content_similarity_Percentage=0.0;
		           two_gram_content_similarity_Percentage=AdminDAO.get2gramContentSimilaritypercent(userlistdata.get(k),Double.parseDouble(Utility.getPro("n_gram_similarity_threshold")));
		           
		           double three_gram_content_similarity_Percentage=0.0;
		           three_gram_content_similarity_Percentage=AdminDAO.get3gramContentSimilaritypercent(userlistdata.get(k),Double.parseDouble(Utility.getPro("n_gram_similarity_threshold")));
		           
		           System.out.println("===content_similarity_Percentage====="+two_gram_content_similarity_Percentage);
		           
		           double total_percentage=0.0;
		           total_percentage=count_percentage+positive_percentage+two_gram_content_similarity_Percentage+three_gram_content_similarity_Percentage;
		           //=========NEGATIVE Ratio======================================
		            double negcount=AdminDAO.getCountofNegativereviews(userlistdata.get(k));
		            double negratio=negcount/count_of_reviews_of_user;
		            System.out.println("==?????????????????????????????????????==negratio==="+negratio);
		            double negratioroundup = (double)Math.round(negratio*100)/100;
		            System.out.println("==???????????????????????????????????????????????==negratioround==="+negratioroundup);
		            
		            

		           //=======================================
		           
		           boolean f7=AdminDAO.insertToPercentage(count_of_reviews_of_user,count_percentage,positive_percentage,two_gram_content_similarity_Percentage,three_gram_content_similarity_Percentage,total_percentage,userlistdata.get(k),negratioroundup);
		          
		           if(total_percentage>=Double.parseDouble(Utility.getPro("total_threshold")))
		           {
		        	  
		        	  boolean flg=AdminDAO.insertfakeuser(userlistdata.get(k)); 
		        	  
		        	  boolean fl=AdminDAO.updatereviewstatus2(userlistdata.get(k));
		        	   
		           }
			      }
			           
			           
			           
			       	
		           
		       	}
		     	
		     	
		     	
				
				
				//=================Cosine Similarity Calculation==========================================
				
				boolean f=AdminDAO.Calculatecosinesimilarity();
				
				//================================================================
				//========================Get the Users based on cosine similarity threshold==========
				ArrayList<String> userlistofcosinesimilarity=new ArrayList<String>();
				
				userlistofcosinesimilarity=AdminDAO.getuseridofcosinethreshold(Double.parseDouble(Utility.getPro("cosine_similarity_threshold")),Double.parseDouble(Utility.getPro("avg_cosine_similarity_threshold")));
	             for(int h=0;h<userlistofcosinesimilarity.size();h++)
	             {
				 boolean flg=AdminDAO.insertfakeuser(userlistofcosinesimilarity.get(h)); 
	        	  
	        	  boolean fl=AdminDAO.updatereviewstatus2(userlistofcosinesimilarity.get(h));
	             }
			  //==================================================================================
			
			
	             
	             ArrayList list=new ArrayList();
	             list=AdminDAO.getFinalResult(uid);
	             StringBuffer sb=new StringBuffer();
	             for(int i=0;i<list.size();i++)
	             {
	            	 sb.append(list.get(i).toString());
	            	 sb.append("\n");
	            	 
	            	 
	            	 
	            	 
	            	 //=====================================
	            	 
	            	 
	            	 //==================================
	            	 
	            	 
	            	 
	            	 
	             }
	             String filepath=getServletContext().getRealPath("/FileToHDFS/");
	             
	             WritetoTextFile.writetotextfile(filepath, sb.toString());
	             String HDFSConfigPath=getServletContext().getRealPath("/config.properties");
	            boolean flag= HadoopUpload.uploadtohadoop(HDFSConfigPath,filepath); 
	            
	          
	            
	            
			
		     	rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=3");
				rd.forward(request,response);
			
			
			}	
	} 
	catch (Exception e) {
		// TODO: handle exception
	}
	
	
		
		
		
		
	}
	
}
