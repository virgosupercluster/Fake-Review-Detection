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


	
	<%
		if(Utility.parse(request.getParameter("no1"))==1)
		{
			%>
				<div class="success" id="message" style="position:absolute;top:100px;left:200px">	
					<p>Fake review Detection process-1 done successfully</p>
				</div>
			<%
		}
	
	
	
	
	
	
	if(Utility.parse(request.getParameter("no1"))==5)
	{
		%>
			<div class="success" id="message" style="position:absolute;top:100px;left:200px">	
				<p>File uploaded  successfully</p>
			</div>
		<%
	}
	
	if(Utility.parse(request.getParameter("no1"))==3)
	{
		%>
			<div class="success" id="message" style="position:absolute;top:100px;left:200px">	
				<p>Fake review Detection process-2 done successfully</p>
			</div>
		<%
	}
	
	
	
	
	if(Utility.parse(request.getParameter("no1"))==4)
	{
		%>
			<div class="success" id="message" style="position:absolute;top:100px;left:200px">	
				<p>Reset Process done successfully</p>
			</div>
		<%
	}
	
	if(Utility.parse(request.getParameter("no1"))==2)
	{
		%>
			<div class="error" id="message" style="position:absolute;top:300px;left:300px">	
				<p>Sorry!!! File Details not inserted to table... !</p>
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


	

<%
} 
%>
</body>
</html>