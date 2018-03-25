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
	    
	    <h2 align="center"><font color="black"  size="6">Upload Your Exel File Data</font></h2>
	    
		<hr size="2" color="#11F260"></hr>
		
		<tr>
				<td>&nbsp;</td>
		</tr>
	    
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				
					<input type="file"  name="file"  accept=".xlsx"  required="required" width="200px"></input>
				
			</td>
		</tr>
		
		<tr>
				<td>&nbsp;</td>
		</tr>
		
		
		<tr>
				<td>&nbsp;</td>
		</tr>
		
		<tr align="center">
			<td align="center" colspan="3">
					<input type="submit" class="gradientbuttons" value="Upload" onclick="return check();"></input>
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
	{
		//String fileName = request.getParameter("file_name");
		//String cloud = request.getParameter("cloud");
		Calendar currentDate = Calendar.getInstance();
		SimpleDateFormat formatter=new SimpleDateFormat("dd-MM-yyyy");
		SimpleDateFormat formatter1=new SimpleDateFormat("HH:mm:ss");
		String date = formatter.format(currentDate.getTime());
		String time = formatter1.format(currentDate.getTime());
		String username = ""; 
		HttpSession sesion = request.getSession();
		
	   	if(sesion != null)
		{
		  username = (String) session.getAttribute("userid");
		}
		   
%>


	<div  style="position:absolute;left:50px" class="c">
	<table id="login" align="center">
	    
	    <h1 align="center"><font color="green" style="font-style: bold" size="5">File Upload Acknowledgement</font></h1>
	    
		<hr size="10" color="black"></hr>
		
		  <tr  bgcolor="" align="center">
		
		    <td><img src='Files/Images/giphy.gif'></img></td>
		    
	    </tr>
		
		
		<tr  bgcolor="" align="center">
		
		    <td><font color="#AEFC05" size="5px">Mr. <%= username.toUpperCase() %></font> </td>
		    
	    </tr>
		
		
		
		<tr  bgcolor="" align="center">
		
		    <td><pre><font color="white" size="5px">Your File has been Uploaded Successfully......</font></pre></td>
		    
	    </tr>
	   
	    
	    <tr  bgcolor="" align="center">
		
		   <td><font color="white" size="4">Date  :  <%= date %>       &       Time  :  <%= time %> </td>
		    
	    </tr>
	  
	    
	    
	</table>

<%
} 
%>
</body>
</html>