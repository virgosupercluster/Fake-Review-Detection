package com.user;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.omg.CORBA.Request;




public class ChangePass extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("its came change pass inside");
	 String userid=request.getParameter("userid");
	 System.out.println("user is "+userid);
	 String oldpass=request.getParameter("oldpass");
	 System.out.println("pass is "+oldpass);
	 String newpass=request.getParameter("newpass");
	 String conpass=request.getParameter("conpass");
	 boolean flag=false;
	 RequestDispatcher rd=null;
	 if(newpass.equals(conpass))
	 {
      flag =PoolingDAO.Changepass(userid, oldpass,newpass,conpass);
	 }
	 else
	 {
		 rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no1=2");
			rd.forward(request, response);
	 }
   //  System.out.println("status is :"+flag);
     
     
	if(flag)
	{
		HttpSession session =request.getSession();
		 session.setAttribute("userid", userid);
		
		
		rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no1=1");
		rd.forward(request, response);
		
		
	}
		
	else
	{
		
//		rd=request.getRequestDispatcher("/Files/JSP/User/success.jsp?no1=2");
//		rd.forward(request, response);
		rd=request.getRequestDispatcher("/Files/JSP/User/changepass.jsp?no1=3");
		rd.forward(request, response);
	}
		
		
		
	}
}
