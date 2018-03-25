package org.apache.jsp.Files.JSP.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;

public final class user_005fhome_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title></title>\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/menu.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
String uname=request.getParameter("name");
System.out.println("=============home========"+uname);

      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body  background=\"bg1.jpg\">\r\n");
      out.write("\r\n");
      out.write("<IMG SRC=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/header.png\" width=100% height=\"13%\" style=\"position: absolute;top: -0.5px;left: 5px;\" BORDER=\"0\" ALT=\"\">\r\n");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("<nav class=\"menu animated flipInX\">\r\n");
      out.write("\r\n");
      out.write("\t\t<ul class=\"ul\">\r\n");
      out.write("      \r\n");
      out.write(" \r\n");
      out.write("  \r\n");
      out.write(" <div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/upload_file.jsp\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Upload Excel</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/FakeReviewDetection1\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Fake Review Detection 1</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/FakeReviewDetection2\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Fake Review Detection 2</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/DownloadFromHadoop\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Download Result</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Report?no=0\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Report</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/ViewGraph?no=1\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>View Graph</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Reset\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Reset</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class=\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/Files/JSP/User/changepass.jsp?name=");
      out.print(uname);
      out.write("\" method=\"get\" target=\"myIframe\">\r\n");
      out.write("\t\t\t\t<h3>Change Password</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("      \r\n");
      out.write("<div class =\"link\">      \r\n");
      out.write("\t\t\t<a class =\"a\" href=\"");
      out.print(request.getContextPath());
      out.write("/index.jsp\">\r\n");
      out.write("\t\t\t\t<h3>Logout</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t</a>\r\n");
      out.write("</div>\r\n");
      out.write("      \r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write("\t\t</ul>\r\n");
      out.write("\t</nav>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute;top:150px;left:300px;\">\r\n");
      out.write("\t<iframe align=\"middle\"  style=\"margin-left: 60px;\" \r\n");
      out.write("\tframeborder=\"0\" scrolling=\"auto\" name=\"myIframe\" height=\"470px\" width=\"650px\"></iframe>\r\n");
      out.write("</div>\r\n");
      out.write("\t\r\n");
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
