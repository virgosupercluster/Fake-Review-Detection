<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.util.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title></title>
<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />
<%String uname=request.getParameter("name");
System.out.println("=============home========"+uname);
%>
</head>


<body  background="bg1.jpg">

<IMG SRC="<%=request.getContextPath()%>/Files/Images/header.png" width=100% height="13%" style="position: absolute;top: -0.5px;left: 5px;" BORDER="0" ALT="">

<div class="container">
<nav class="menu animated flipInX">

		<ul class="ul">
      
 
  
 <div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/upload_file.jsp" target="myIframe">
				<h3>Upload Excel</h3>
				
			</a>
</div>


<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/FakeReviewDetection1" target="myIframe">
				<h3>Fake Review Detection 1</h3>
				
			</a>
</div>


<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/FakeReviewDetection2" target="myIframe">
				<h3>Fake Review Detection 2</h3>
				
			</a>
</div>

<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/DownloadFromHadoop" target="myIframe">
				<h3>Download Result</h3>
				
			</a>
</div>



<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Report?no=0" target="myIframe">
				<h3>Report</h3>
				
			</a>
</div>

<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/ViewGraph?no=1" target="myIframe">
				<h3>View Graph</h3>
				
			</a>
</div>



<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Reset" target="myIframe">
				<h3>Reset</h3>
				
			</a>
</div>




<div class ="link">      
			<a class="a" href="<%=request.getContextPath()%>/Files/JSP/User/changepass.jsp?name=<%=uname%>" method="get" target="myIframe">
				<h3>Change Password</h3>
				
			</a>
</div>
      
<div class ="link">      
			<a class ="a" href="<%=request.getContextPath()%>/index.jsp">
				<h3>Logout</h3>
				
			</a>
</div>
      

      
		</ul>
	</nav>
</div>



<div style="position:absolute;top:150px;left:300px;">
	<iframe align="middle"  style="margin-left: 60px;" 
	frameborder="0" scrolling="auto" name="myIframe" height="470px" width="650px"></iframe>
</div>
	
</body>
</html>