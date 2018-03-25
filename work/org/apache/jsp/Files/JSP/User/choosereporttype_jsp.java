package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;
import java.sql.ResultSet;
import com.util.*;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.ArrayList;
import com.user.AdminDAO;
import java.util.Map;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import com.util.*;
import java.sql.ResultSet;
import java.util.HashMap;
import java.util.ArrayList;
import com.user.AdminDAO;
import java.util.Map;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.SimpleDateFormat;

public final class choosereporttype_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/AllFiles/CSS/style.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/message.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/button.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<link href=\"");
      out.print(request.getContextPath() );
      out.write("/AllFiles/CSS/login.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/style.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"");
      out.print(request.getContextPath() );
      out.write("/Files/JS/pagination.js\"></script>\r\n");
      out.write("\t<style type=\"text/css\">\r\n");
      out.write("\t.custom-file-input::-webkit-file-upload-button {\r\n");
      out.write("  visibility: hidden;\r\n");
      out.write("}\r\n");
      out.write(".custom-file-input::before {\r\n");
      out.write("  content: 'Select File';\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("  background: -webkit-linear-gradient(top, #f9f9f9, #e3e3e3);\r\n");
      out.write("  border: 3px solid #999;\r\n");
      out.write("  border-radius: 6px;\r\n");
      out.write("  padding: 5px 8px;\r\n");
      out.write("  outline: none;\r\n");
      out.write("  white-space: nowrap;\r\n");
      out.write("  -webkit-user-select: none;\r\n");
      out.write("  cursor: pointer;\r\n");
      out.write("  text-shadow: 1px 1px #fff;\r\n");
      out.write("  font-weight: 700;\r\n");
      out.write("  font-size: 10pt;\r\n");
      out.write("}\r\n");
      out.write(".custom-file-input:hover::before {\r\n");
      out.write("  border-color: black;\r\n");
      out.write("}\r\n");
      out.write(".custom-file-input:active::before {\r\n");
      out.write("  background: -webkit-linear-gradient(top, #e3e3e3, #f9f9f9);\r\n");
      out.write("}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<script language=\"javascript\">\r\n");
      out.write("\tfunction check()\r\n");
      out.write("\t{\r\n");
      out.write("\t\tif(document.f1.file.value.length==0)\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\talert(\"Please Select a File\");\r\n");
      out.write("\t\t\treturn false\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\telse\r\n");
      out.write("\t\t{\r\n");
      out.write("\t\t\treturn true;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<body onload=\"startTimer()\">\r\n");
      out.write("\r\n");
      out.write("\r\n");


    if(Utility.parse(request.getParameter("no"))==0)
	{

      out.write("\r\n");
      out.write("\r\n");
      out.write("<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/CalculateReport\" method=\"get\" >\r\n");
      out.write("\t<input type=\"hidden\" name=\"no\" value=\"0\">\r\n");
      out.write("\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t    \r\n");
      out.write("\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Report Type 1</font></h2>\r\n");
      out.write("\t    \r\n");
      out.write("\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t    \r\n");
      out.write("\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\tSelect Userid:\r\n");
      out.write("\t\t\t <select name=\"userid\" id=\"userid\"   required>\r\n");
      out.write("                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("                     ");

                      
                      
                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
                     	map_tclaim=AdminDAO.getuserid();
                     	
                     	if(map_tclaim.size()>0)
                       	{
                        	  
                           for(Map.Entry m4:map_tclaim.entrySet())  
                           {
                         	  m4.getKey();
                         	  String values = m4.getValue().toString();

                         	  String first=values.replace("[", "").replace("]", "");
                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("                         \r\n");
      out.write("                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("                         \r\n");
      out.write("                         \r\n");
      out.write("                         ");
  }
                       	}
                        
                        
                        
                        
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                       \r\n");
      out.write("                       \r\n");
      out.write("                      \r\n");
      out.write("                    </select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tSelect Product:\r\n");
      out.write("\t\t\t <select name=\"product\" id=\"product\"   required>\r\n");
      out.write("                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("                     ");

                      
                      
                      HashMap<Integer, ArrayList<String>> map_tclaim11=new HashMap<Integer, ArrayList<String>>();
                     	map_tclaim11=AdminDAO.getproducts();
                     	
                     	if(map_tclaim11.size()>0)
                       	{
                        	  
                           for(Map.Entry m4:map_tclaim11.entrySet())  
                           {
                         	  m4.getKey();
                         	  String values = m4.getValue().toString();

                         	  String first=values.replace("[", "").replace("]", "");
                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("                         \r\n");
      out.write("                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("                         \r\n");
      out.write("                         \r\n");
      out.write("                         ");
  }
                       	}
                        
                        
                        
                        
      out.write("\r\n");
      out.write("                  \r\n");
      out.write("                       \r\n");
      out.write("                       \r\n");
      out.write("                      \r\n");
      out.write("                    </select>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<tr align=\"center\">\r\n");
      out.write("\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\r\n");
      out.write("\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t</td>\r\n");
      out.write("\t    </tr>\r\n");
      out.write("\t\r\n");
      out.write("\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t");

	
	}
	if(Utility.parse(request.getParameter("no"))==1)
	{
      out.write("\r\n");
      out.write("\t\t<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/CalculateReport\" method=\"get\" >\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"no\" value=\"1\">\r\n");
      out.write("\t\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Report Type 2</font></h2>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tSelect Product:\r\n");
      out.write("\t\t\t\t <select name=\"product\" id=\"product\"   required>\r\n");
      out.write("\t                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("\t                     ");

	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getproducts();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         \r\n");
      out.write("\t                         ");
  }
	                       	}
	                        
	                        
	                        
	                        
      out.write("\r\n");
      out.write("\t                  \r\n");
      out.write("\t                       \r\n");
      out.write("\t                       \r\n");
      out.write("\t                      \r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

} 
	if(Utility.parse(request.getParameter("no"))==2)
	{
      out.write("\r\n");
      out.write("\t\t<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/CalculateReport\" method=\"get\" >\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"no\" value=\"2\">\r\n");
      out.write("\t\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Report Type 3</font></h2>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tSelect Userid:\r\n");
      out.write("\t\t\t\t <select name=\"userid\" id=\"userid\"   required>\r\n");
      out.write("\t                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("\t                     ");

	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getuserid();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         \r\n");
      out.write("\t                         ");
  }
	                       	}
	                        
	                        
	                        
	                        
      out.write("\r\n");
      out.write("\t                  \r\n");
      out.write("\t                       \r\n");
      out.write("\t                       \r\n");
      out.write("\t                      \r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

}
	
	


if(Utility.parse(request.getParameter("no"))==3)
	{
      out.write("\r\n");
      out.write("\t\t<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/UploadexelReviews\" method=\"post\" enctype=\"multipart/form-data\">\r\n");
      out.write("\t\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Report Type 4</font></h2>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tSelect Userid:\r\n");
      out.write("\t\t\t\t <select name=\"stmntprcs\" id=\"stmntprcs\"   required>\r\n");
      out.write("\t                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("\t                     ");

	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getuserid();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         \r\n");
      out.write("\t                         ");
  }
	                       	}
	                        
	                        
	                        
	                        
      out.write("\r\n");
      out.write("\t                  \r\n");
      out.write("\t                       \r\n");
      out.write("\t                       \r\n");
      out.write("\t                      \r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

} 

if(Utility.parse(request.getParameter("no"))==5)
	{
      out.write("\r\n");
      out.write("\t\t<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/CalculateReport\" method=\"get\" >\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"no\" value=\"5\">\r\n");
      out.write("\t\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Report Type 5</font></h2>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tSelect Based On:\r\n");
      out.write("\t\t\t\t <select name=\"basedon\" id=\"basedon\"   required>\r\n");
      out.write("\t                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("\t                     \r\n");
      out.write("\t                   <option   value=\"userid\">UserID</option>\r\n");
      out.write("\t                     <option   value=\"ipaddress\">IPAddress</option>\r\n");
      out.write("\t                       \r\n");
      out.write("\t                       \r\n");
      out.write("\t                      \r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

	}

if(Utility.parse(request.getParameter("no"))==7)
	{
	System.out.println("============================INSIDE 7======");
	
      out.write("\r\n");
      out.write("\t\t<div  style=\"position:absolute;top:50px; height:300px; width:500px; background-color: white\"  >\r\n");
      out.write("\t\t<form name=\"f1\" action=\"");
      out.print(request.getContextPath());
      out.write("/ViewGraph\" method=\"get\" >\r\n");
      out.write("\t\t<input type=\"hidden\" name=\"no\" value=\"4\">\r\n");
      out.write("\t\t<table id=\"login\" align=\"center\">\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t    <h2 align=\"center\"><font color=\"black\"  size=\"6\">Graph Report</font></h2>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<hr size=\"2\" color=\"#11F260\"></hr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t    \r\n");
      out.write("\t\t\t<tr id=\"label\" align=\"center\">\r\n");
      out.write("\t\t\t    \r\n");
      out.write("\t\t\t\t<td align=\"justify\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\tSelect Product:\r\n");
      out.write("\t\t\t\t <select name=\"product\" id=\"product\"   required>\r\n");
      out.write("\t                      <option selected disabled value=\"\">Select</option>\r\n");
      out.write("\t                     ");

	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getproducts();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");
      out.write("\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         <option value=\"");
      out.print(a[0].trim());
      out.write('"');
      out.write('>');
      out.print( a[0].trim());
      out.write("</option>\r\n");
      out.write("\t                         \r\n");
      out.write("\t                         \r\n");
      out.write("\t                         ");
  }
	                       	}
	                        
	                        
	                        
	                        
      out.write("\r\n");
      out.write("\t                  \r\n");
      out.write("\t                       \r\n");
      out.write("\t                       \r\n");
      out.write("\t                      \r\n");
      out.write("\t                    </select>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<tr align=\"center\">\r\n");
      out.write("\t\t\t<td>&nbsp;</td>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t<td align=\"center\" colspan=\"3\">\r\n");
      out.write("\t\t\t\t\t\t<input type=\"submit\" class=\"gradientbuttons\" value=\"Report\" onclick=\"return check();\"></input>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t    </tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t");

} 
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
