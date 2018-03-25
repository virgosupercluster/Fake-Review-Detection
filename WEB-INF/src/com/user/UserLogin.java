package com.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DAOFactory.DAO;
import com.DAOFactory.DAOFactory;
import com.DAOFactory.User;
import com.util.Utility;

public class UserLogin extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		PrintWriter out = response.getWriter();
		
		try
		{
			String name=request.getParameter("name");
			String pass=request.getParameter("pass");
			
			System.out.println("==========NAME============"+name);
			
			DAOFactory factory=new DAOFactory();
			DAO dao=factory.getInstance("User");
			boolean result=dao.loginCHK(name, pass);
			if(result)
			{
				HttpSession session =request.getSession();
				
				InetAddress ip=InetAddress.getLocalHost();
				String systemIP=ip.getHostAddress();
				
				System.out.println("System Ip---->"+systemIP);
				/*//String server_id=User.getServer(systemIP);
				
				User.setIP(systemIP);
				
				System.out.println("Server id is-->"+server_id);
					session.setAttribute("server_id", server_id);*/
				
				
				request.setAttribute("user", name);
				session.setAttribute("userid", name);
				//Utility.writeOnFile(name+".txt", "Successfully Logged in on date "+Utility.getDate()+" and time "+Utility.getTime()+"", getServletContext().getRealPath("/"));
				RequestDispatcher rd=request.getRequestDispatcher("/Files/JSP/User/user_home.jsp?name="+name+"");
				rd.forward(request, response);
			}
			else
			{
				response.sendRedirect(request.getContextPath()+"?no=1");
			}
		}
		catch(Exception e)
		{
			System.out.println("Opps's Error is in UserLogin Servlet......"+e);
			out.println("Opps's Error is in UserLogin Servlet......"+e);
		}
		
	}

}
