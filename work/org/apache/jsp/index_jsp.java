package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.util.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("  <link href=\"");
      out.print(request.getContextPath() );
      out.write("/Files/CSS/message.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n");
      out.write("<link href=\"");
      out.print(request.getContextPath());
      out.write("/Files/CSS/menu.css\" rel=\"stylesheet\" type=\"text/css\" /> \r\n");
      out.write("<link href=\"");
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
      out.write("<link rel=\"stylesheet\" href=\"assets/css/styles.css\" />\r\n");
      out.write("\r\n");
      out.write("<link href=\"");
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
      out.write("  background: -webkit-linear-gradient(top, #ffffff, #f9f9f9);\r\n");
      out.write("}\r\n");
      out.write("\t</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body  background=\"bg1.jpg\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

		if(Utility.parse(request.getParameter("no"))==1)
		{
			
      out.write("\r\n");
      out.write("\t\t\t\t<div class=\"error\" id=\"message\" style=\"position:absolute;top:100px;left:200px\">\t\r\n");
      out.write("\t\t\t\t\t<p>login fail,please enter correct userid and password</p>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t");

		}
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<IMG SRC=\"");
      out.print(request.getContextPath());
      out.write("/Files/Images/header.png\" width=100% height=\"13%\" style=\"position: absolute;top: -0.5px;left: 5px;\" BORDER=\"0\" ALT=\"\">\r\n");
      out.write("\r\n");
      out.write("      \r\n");
      out.write(" \t<div id=\"formContainer\" style=\"position: center;top: 200px;\">\r\n");
      out.write("\t\t\t<form id=\"login\" action=\"");
      out.print(request.getContextPath());
      out.write("/Firstlogin\" method=\"get\">\r\n");
      out.write("\t\t\t\t<!-- <a href=\"#\" id=\"flipToRecover\" class=\"flipLink\">Forgot?</a> -->\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"loginEmail\" id=\"loginEmail\"  />\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"loginPass\" id=\"loginPass\"  />\r\n");
      out.write("\t\t\t\t<input type=\"submit\" name=\"submit\" value=\"Login\" />\r\n");
      out.write("\t\t\t</form></div>\r\n");
      out.write("\t\t\t \r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("      \r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div style=\"position:absolute;top:150px;left:300px;\">\r\n");
      out.write("\t<iframe align=\"middle\"  style=\"margin-left: 60px;\" \r\n");
      out.write("\tframeborder=\"0\" scrolling=\"auto\" name=\"myIframe\" height=\"470px\" width=\"650px\"></iframe>\r\n");
      out.write("</div>\r\n");
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
