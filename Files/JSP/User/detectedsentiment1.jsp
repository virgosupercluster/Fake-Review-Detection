<%@ page import="java.sql.*" %>
<%@ page import="com.user.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.util.*" %>
<html>
<head>
<%! 
public int convert(String str) 
{ 
	int conv=0; 
	if(str==null) 
	{ 
		str="0"; 
	} 
	else if((str.trim()).equals("null")) 
	{ 
		str="0"; 
	} 
	else if(str.equals("")) 
	{ 
		str="0"; 
	} 
	try
	{ 
		conv=Integer.parseInt(str); 
	} 
	catch(Exception e) 
	{ 
	} 
	return conv; 
	} 
%>

<%
System.out.println("Its came inside jsp page>>>>>>>>>>>"); 


String id1=request.getParameter("nmark");
System.out.println("negativereview :"+id1); 

String id2=request.getParameter("neumrk");
System.out.println("nuetralreview :"+id2); 

String id3=request.getParameter("pmark");
System.out.println("positivemark :"+id3); 


%>
<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />


<link href="<%=request.getContextPath()%>/Res/CSS/style1.css" rel="stylesheet" type="text/css"/>

<script type="text/javascript" src="<%=request.getContextPath() %>/pagination.js"></script>

</head>
<body bgcolor="cyan">




<!-- <div style="position: absolute;top: 5px;left:70px;">
<p><b><h3><font color="red">Detected Positive ,Negative and Neural Count for Dynamic Tweets</font></h3></b></p>

 -->
<%
if(Utility.parse(request.getParameter("no"))==1)
{%>
<div class="gradientbuttons" id="message" style="position:absolute;top:100px;left:0px">
	<p><font color="green"><h2>Detected Positive ,Negative and Neural Count for Dynamic Tweets</h2></font></p>
<center>
	<div>
	
					<table  style="width: 200px ; color: black; font-weight: bold;";>
						
						<tr><td>Positive Count of Tweets:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id3 %></td></tr>
						<tr><td>Negative Count of Tweets: </td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id1 %></td></tr>
						<tr><td>nuetral Count of Tweets:</td>&nbsp;&nbsp;&nbsp;&nbsp;<td><%=id2 %></td></tr>
					
						</table>
					</div></center>
	
</div>
<%}


%>		
	
   
</body>




</html>




