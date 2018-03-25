/**
 * 
 */
package com.user;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.util.Utility;


public class ViewReview extends HttpServlet 
{
	public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException
	{
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try
		{
			String reviewid=request.getParameter("reviewid");
			String filename=AdminDAO.getFilename2(reviewid);
			out.println("<html><body bgcolor=\"#E6E6FA\">");
			out.println("<h1><justify>Review</justify></h1>");
			FileInputStream fstream = new FileInputStream(Utility.getPro("path")+filename+".txt");
			DataInputStream in = new DataInputStream(fstream);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			String text="";
			
			while((text = br.readLine()) != null)
			{
				out.println("<h4 ><justify>"+text+"</justify></h4>");
				
			}
			out.println("</body></html>");
			
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in UserLogin Servlet......"+e);
			out.println("Opps's Error is in UserLogin Servlet......"+e);
		}
	}
}
