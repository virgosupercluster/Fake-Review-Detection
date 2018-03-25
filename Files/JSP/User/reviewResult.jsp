<%@page import="java.io.PrintWriter"%>
<%@ page import="com.util.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<%
String id=request.getAttribute("mark").toString();

String id1=request.getParameter("nmark");
System.out.println("negativereview :"+id1); 

String id2=request.getParameter("neumrk");
System.out.println("nuetralreview :"+id2); 

String id3=request.getParameter("pmark");
System.out.println("positivemark :"+id3); 

/* String no=request.getParameter("no");
int no1=Integer.parseInt("no"); */
/* System.out.println("review :"+no); */
%>

</head>




<%
if(Utility.parse(request.getParameter("no"))==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:0px">
	<p><font color="green"><h2>This product consist of more positive remarks...you can buy this product</h2></font></p>
<center>
	<div>
	
					<table  style="width: 200px ; color: black; font-weight: bold;";>
						<tr><td>Negative ReviewMark: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id1 %></td></tr>
						<tr><td>nuetral ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id2 %></td></tr>
						<tr><td>Positive ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id3 %></td></tr>
						
					
						</table>
					</div></center>
	
</div>
<%}



if(Utility.parse(request.getParameter("no"))==2)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:0px">
	<p><font color="green"><h2>This product consist of more neutral marks...you may either buy or maynot</h2></font></p>
	
	<center>
	<div>
	
					<table  style="width: 100px ; color: black; font-weight: bold;";>
						<tr><td>Negative ReviewMark: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id1 %></td></tr>
						<tr><td>nuetral ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id2 %></td></tr>
						<tr><td>Positive ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id3 %></td></tr>
						
					
						</table>
					</div></center>
</div>
<%}
if(Utility.parse(request.getParameter("no"))==3)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:0px">
	<p><font color="green"><h2>This product consist of more negative remarks...if you want you can buy</h2></font></p>
	<center>
	<div>
	
					<table  style="width: 100px ; color: black; font-weight: bold;";>
						<tr><td>Negative ReviewMark: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id1 %></td></tr>
						<tr><td>nuetral ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id2 %></td></tr>
						<tr><td>Positive ReviewMark:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id3 %></td></tr>
						
					
						</table>
					</div></center>
	
</div>
<%}%>

<body>



</body>
</html>