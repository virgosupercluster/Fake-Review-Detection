<%@ page import="com.util.*" %>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%><html>
<head>
	<link href="<%=request.getContextPath() %>/AllFiles/CSS/style.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/Files/CSS/message.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/Files/CSS/button.css" rel="stylesheet" type="text/css" />
	<link href="<%=request.getContextPath() %>/AllFiles/CSS/login.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="<%=request.getContextPath() %>/Files/JS/style.js"></script>
	<script type="text/javascript" src="<%=request.getContextPath() %>/Files/JS/pagination.js"></script>
	<style type="text/css">
	.custom-file-input::-webkit-file-upload-button {
  visibility: hidden;
}
.custom-file-input::before {
  content: 'Select File';
  display: inline-block;
  background: -webkit-linear-gradient(top, #f9f9f9, #e3e3e3);
  border: 3px solid #999;
  border-radius: 6px;
  padding: 5px 8px;
  outline: none;
  white-space: nowrap;
  -webkit-user-select: none;
  cursor: pointer;
  text-shadow: 1px 1px #fff;
  font-weight: 700;
  font-size: 10pt;
}
.custom-file-input:hover::before {
  border-color: black;
}
.custom-file-input:active::before {
  background: -webkit-linear-gradient(top, #e3e3e3, #f9f9f9);
}
	</style>
</head>

<script language="javascript">
	function check()
	{
		if(document.f1.file.value.length==0)
		{
			alert("Please Select a File");
			return false
		}
		else
		{
			return true;
		}
	}
</script>

<body onload="startTimer()">


<%

    if(Utility.parse(request.getParameter("no"))==0)
	{
%>

<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
	<form name="f1" action="<%=request.getContextPath()%>/UploadexelReviews" method="post" enctype="multipart/form-data">
	<table id="login" align="center">
	    
	    <h2 align="center"><font color="black"  size="6">List of Reports</font></h2>
	    
		<hr size="2" color="#11F260"></hr>
		
		
	    
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<li><a href="<%=request.getContextPath()%>/Report?no=1" target="myIframe">
				<h3>One user - One Product</h3>
				   </a></li>
				
			</td>
		</tr>
		
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<li><a href="<%=request.getContextPath()%>/Report?no=2" target="myIframe">
				<h3>One Product - All User</h3>
				   </a></li>
				
			</td>
		</tr>
		
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<li><a href="<%=request.getContextPath()%>/Report?no=3" target="myIframe">
				<h3>One User - All Product</h3>
				   </a></li>
				
			</td>
		</tr>
		
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<li><a href="<%=request.getContextPath()%>/Report?no=4" target="myIframe">
				<h3>Fake Reviews By all Users</h3>
				   </a></li>
				
			</td>
		</tr>
		
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<li><a href="<%=request.getContextPath()%>/Report?no=5" target="myIframe">
				<h3>Meta Data Fake Review</h3>
				   </a></li>
				
			</td>
		</tr>
		
		
		
		
	
	</table>
	</form>
	</div>
	
	<%
		if(Utility.parse(request.getParameter("no1"))==1)
		{
			%>
				<div class="success" id="message" style="position:absolute;top:100px;left:200px">	
					<p>Excel Uploaded Successfully....!</p>
				</div>
			<%
		}
	
	
	if(Utility.parse(request.getParameter("no1"))==2)
	{
		%>
			<div class="error" id="message" style="position:absolute;top:300px;left:300px">	
				<p>Sorry!!! Excel Uploaded Failure....!</p>
			</div>
		<%
	}
	
	
	}
	if(Utility.parse(request.getParameter("no"))==2)
	{%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/ViewGraph" method="get">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">List of Graphs</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					
						<a href="<%=request.getContextPath()%>/ViewGraph?no=2" target="myIframe">
					<h3>Pie Chart of the  reviews</h3>
					   </a>
					
				</td>
			</tr>
			
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					
						<a href="<%=request.getContextPath()%>/ViewGraph?no=3" target="myIframe">
					<h3>Bar Chart Of the Product reviews </h3>
					   </a>
					
				</td>
			</tr>
			
			
			
			
			
			
			
			
			
			
		
		</table>
		</form>
		</div>
<%
} 
%>
</body>
</html>