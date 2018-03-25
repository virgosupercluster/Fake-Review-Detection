package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;




public class Firstlogin extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("its came inside");
	 String user=request.getParameter("loginEmail");
	 System.out.println("user is "+user);
	 String pass=request.getParameter("loginPass");
	 System.out.println("pass is "+pass);
	 
     boolean flag=PoolingDAO.loginCheck(user, pass);
    
     System.out.println("status is :"+flag);
     RequestDispatcher rd=null;
     
	if(flag)
	{
		HttpSession session =request.getSession();
		 session.setAttribute("userid", user);
		
		
		rd=request.getRequestDispatcher("/Files/JSP/User/user_home.jsp?");
		rd.forward(request, response);
		
		
	}
		
	else
	{
		
	    rd=request.getRequestDispatcher("index.jsp?no=1");
		rd.forward(request, response);
		
		System.out.println("Error in login");
	}
		
		
		
	}
}
