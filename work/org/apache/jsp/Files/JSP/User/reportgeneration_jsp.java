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

public final class reportgeneration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body bgcolor=\"cyan\">\r\n");
      out.write("\r\n");
      out.write("\r\n");


    if(Utility.parse(request.getParameter("no"))==0)
	{
    	
    	String userid=request.getParameter("userid");
    	String product=request.getParameter("product");
    	
    	System.out.println("userid =========="+userid);
    	System.out.println("product =========="+product);


String topic=request.getParameter("resultprcs");

HashMap<Integer, ArrayList<String>> report1=new HashMap<Integer, ArrayList<String>>();
report1=AdminDAO.getreport1(userid,product);

System.out.println("report1 =========="+report1);





      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report1.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report1.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                           <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("\t\t");

	
	}
	if(Utility.parse(request.getParameter("no"))==1)
	{	
    
    	String product=request.getParameter("product");
    	
    	
    	System.out.println("product =========="+product);


String topic=request.getParameter("resultprcs");

HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport2(product);

System.out.println("report1 =========="+report2);





      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                            <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("    ");

} 
	if(Utility.parse(request.getParameter("no"))==2)
	{
		String userid=request.getParameter("userid");
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport3(userid);

System.out.println("report1 =========="+report2);





      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                          <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("    ");

}
	
	


if(Utility.parse(request.getParameter("no"))==3)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport4();







      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                            <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("    ");

}


if(Utility.parse(request.getParameter("no"))==4)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport5();







      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                            <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
      out.write("\r\n");
      out.write("                                 \r\n");
      out.write("                                 \r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t </table>\r\n");
      out.write("\t </div>\r\n");
      out.write("\t<div id=\"pageNavPosition\" style=\"position:relative;top:250px;left:200px\"></div>\r\n");
      out.write("<script type=\"text/javascript\"><!--\r\n");
      out.write("        var pager = new Pager('user',5); \r\n");
      out.write("        pager.init(); \r\n");
      out.write("        pager.showPageNav('pager', 'pageNavPosition'); \r\n");
      out.write("        pager.showPage(1);\r\n");
      out.write("    //--></script> \r\n");
      out.write("    ");

} 



if(Utility.parse(request.getParameter("no"))==5)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport5();







      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                            <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
                       }
                                 
  if(Utility.parse(request.getParameter("no"))==6)
	{
		
 
HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport6();







      out.write("\r\n");
      out.write("<br></br>\r\n");
      out.write("\r\n");
      out.write("<div style=\"position: absolute;top: 5px;left:200px;\">\r\n");
      out.write("<p><b><h3><font color=\"red\">Detected Report</font></h3></b></p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"CSSTableGenerator\" style=\"width:580px;height:150px;\">\r\n");
      out.write("<table class=\"pretty-table\" border=\"1\" id=\"user\">\r\n");
      out.write("  \r\n");
      out.write("    <th scope=\"col\">Sl_no</th>\r\n");
      out.write("    <th scope=\"col\">FileName</th>\r\n");
      out.write("    <th scope=\"col\">IPAddress</th>\r\n");
      out.write("    <th scope=\"col\">Date</th>\r\n");
      out.write("     <th scope=\"col\">Time</th>\r\n");
      out.write("     <th scope=\"col\">Product</th>\r\n");
      out.write("     <th scope=\"col\">Reviews</th>\r\n");
      out.write("     <th scope=\"col\">Userid</th>\r\n");
      out.write("     <th scope=\"col\">Status</th>\r\n");

if(report2.size()>0)
                        	  	{ 
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        \t\t \r\n");
      out.write("                       \r\n");
      out.write("                        \t\t  ");

                              	   int i=1;
                                 for(Map.Entry m4:report2.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                              /*  	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]); */
                               	   
      out.write("\r\n");
      out.write("                               \t  \r\n");
      out.write("                        \t   <tr>\r\n");
      out.write("                            <td>");
      out.print(a[1].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[2].trim());
      out.write("</td>\r\n");
      out.write("                            <td >");
      out.print(a[3].trim());
      out.write("</td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[4].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[5].trim());
      out.write("</td>\r\n");
      out.write("                               <td >");
      out.print(a[6].trim());
      out.write("</td>\r\n");
      out.write("                            <td ><a href=\"");
      out.print(request.getContextPath());
      out.write("/ViewReview?reviewid=");
      out.print(a[0].trim());
      out.write("\">View Review</a></td>\r\n");
      out.write("                            \r\n");
      out.write("                             <td >");
      out.print(a[8].trim());
      out.write("</td>\r\n");
      out.write("                              <td >");
      out.print(a[9].trim());
      out.write("</td>\r\n");
      out.write("                             \r\n");
      out.write("                             \r\n");
      out.write("                            \r\n");
      out.write("                            </tr>\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t\r\n");
      out.write("                        \t \r\n");
      out.write("                      \r\n");
      out.write("                        \t  \r\n");
      out.write("                        \t  ");
}
                                 
                                
                                 }
                                 }
      out.write("\r\n");
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
