<%@ page import="com.util.*" %>
<%@page import="java.sql.ResultSet"%>
<%@ page import="com.util.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.user.AdminDAO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@ page import="com.util.*" %>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.user.AdminDAO"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.text.SimpleDateFormat"%>

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
	<form name="f1" action="<%=request.getContextPath()%>/CalculateReport" method="get" >
	<input type="hidden" name="no" value="0">
	<table id="login" align="center">
	    
	    <h2 align="center"><font color="black"  size="6">Report Type 1</font></h2>
	    
		<hr size="2" color="#11F260"></hr>
		
		<tr>
				<td>&nbsp;</td>
		</tr>
	    
		<tr id="label" align="center">
		    
			<td align="justify" colspan="3">
				Select Userid:
			 <select name="userid" id="userid"   required>
                      <option selected disabled value="">Select</option>
                     <%
                      
                      
                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
                     	map_tclaim=AdminDAO.getuserid();
                     	
                     	if(map_tclaim.size()>0)
                       	{
                        	  
                           for(Map.Entry m4:map_tclaim.entrySet())  
                           {
                         	  m4.getKey();
                         	  String values = m4.getValue().toString();

                         	  String first=values.replace("[", "").replace("]", "");
                         	 String a[]=first.split("~~");%>
                         
                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
                         
                         
                         <%  }
                       	}
                        
                        
                        
                        %>
                  
                       
                       
                      
                    </select>
				
			</td>
			
			<td>&nbsp;</td>
			
			<td align="justify" colspan="3">
				
				Select Product:
			 <select name="product" id="product"   required>
                      <option selected disabled value="">Select</option>
                     <%
                      
                      
                      HashMap<Integer, ArrayList<String>> map_tclaim11=new HashMap<Integer, ArrayList<String>>();
                     	map_tclaim11=AdminDAO.getproducts();
                     	
                     	if(map_tclaim11.size()>0)
                       	{
                        	  
                           for(Map.Entry m4:map_tclaim11.entrySet())  
                           {
                         	  m4.getKey();
                         	  String values = m4.getValue().toString();

                         	  String first=values.replace("[", "").replace("]", "");
                         	 String a[]=first.split("~~");%>
                         
                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
                         
                         
                         <%  }
                       	}
                        
                        
                        
                        %>
                  
                       
                       
                      
                    </select>
				
			</td>
		</tr>
		
		<tr>
				<td>&nbsp;</td>
		</tr>
		
		
		<tr>
				<td>&nbsp;</td>
		</tr>
		
		<tr align="center">
		<td>&nbsp;</td>
	
			<td align="center" colspan="3">
					<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
			</td>
	    </tr>
	
	</table>
	</form>
	</div>
	

		<%
	
	}
	if(Utility.parse(request.getParameter("no"))==1)
	{%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/CalculateReport" method="get" >
		<input type="hidden" name="no" value="1">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">Report Type 2</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					Select Product:
				 <select name="product" id="product"   required>
	                      <option selected disabled value="">Select</option>
	                     <%
	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getproducts();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");%>
	                         
	                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
	                         
	                         
	                         <%  }
	                       	}
	                        
	                        
	                        
	                        %>
	                  
	                       
	                       
	                      
	                    </select>
					
				</td>
				
			
			</tr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			<tr align="center">
			<td>&nbsp;</td>
		
				<td align="center" colspan="3">
						<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
				</td>
		    </tr>
		
		</table>
		</form>
		</div>
		<%
} 
	if(Utility.parse(request.getParameter("no"))==2)
	{%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/CalculateReport" method="get" >
		<input type="hidden" name="no" value="2">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">Report Type 3</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					Select Userid:
				 <select name="userid" id="userid"   required>
	                      <option selected disabled value="">Select</option>
	                     <%
	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getuserid();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");%>
	                         
	                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
	                         
	                         
	                         <%  }
	                       	}
	                        
	                        
	                        
	                        %>
	                  
	                       
	                       
	                      
	                    </select>
					
				</td>
				
			
			</tr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			<tr align="center">
			<td>&nbsp;</td>
		
				<td align="center" colspan="3">
						<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
				</td>
		    </tr>
		
		</table>
		</form>
		</div>
		<%
}
	
	


if(Utility.parse(request.getParameter("no"))==3)
	{%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/UploadexelReviews" method="post" enctype="multipart/form-data">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">Report Type 4</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					Select Userid:
				 <select name="stmntprcs" id="stmntprcs"   required>
	                      <option selected disabled value="">Select</option>
	                     <%
	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getuserid();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");%>
	                         
	                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
	                         
	                         
	                         <%  }
	                       	}
	                        
	                        
	                        
	                        %>
	                  
	                       
	                       
	                      
	                    </select>
					
				</td>
				
			
			</tr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			<tr align="center">
			<td>&nbsp;</td>
		
				<td align="center" colspan="3">
						<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
				</td>
		    </tr>
		
		</table>
		</form>
		</div>
		<%
} 

if(Utility.parse(request.getParameter("no"))==5)
	{%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/CalculateReport" method="get" >
		<input type="hidden" name="no" value="5">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">Report Type 5</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					Select Based On:
				 <select name="basedon" id="basedon"   required>
	                      <option selected disabled value="">Select</option>
	                     
	                   <option   value="userid">UserID</option>
	                     <option   value="ipaddress">IPAddress</option>
	                       
	                       
	                      
	                    </select>
					
				</td>
				
			
			</tr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			<tr align="center">
			<td>&nbsp;</td>
		
				<td align="center" colspan="3">
						<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
				</td>
		    </tr>
		
		</table>
		</form>
		</div>
		<%
	}

if(Utility.parse(request.getParameter("no"))==7)
	{
	System.out.println("============================INSIDE 7======");
	%>
		<div  style="position:absolute;top:50px; height:300px; width:500px; background-color: white"  >
		<form name="f1" action="<%=request.getContextPath()%>/ViewGraph" method="get" >
		<input type="hidden" name="no" value="4">
		<table id="login" align="center">
		    
		    <h2 align="center"><font color="black"  size="6">Graph Report</font></h2>
		    
			<hr size="2" color="#11F260"></hr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
		    
			<tr id="label" align="center">
			    
				<td align="justify" colspan="3">
					Select Product:
				 <select name="product" id="product"   required>
	                      <option selected disabled value="">Select</option>
	                     <%
	                      
	                      
	                      HashMap<Integer, ArrayList<String>> map_tclaim=new HashMap<Integer, ArrayList<String>>();
	                     	map_tclaim=AdminDAO.getproducts();
	                     	
	                     	if(map_tclaim.size()>0)
	                       	{
	                        	  
	                           for(Map.Entry m4:map_tclaim.entrySet())  
	                           {
	                         	  m4.getKey();
	                         	  String values = m4.getValue().toString();

	                         	  String first=values.replace("[", "").replace("]", "");
	                         	 String a[]=first.split("~~");%>
	                         
	                         <option value="<%=a[0].trim()%>"><%= a[0].trim()%></option>
	                         
	                         
	                         <%  }
	                       	}
	                        
	                        
	                        
	                        %>
	                  
	                       
	                       
	                      
	                    </select>
					
				</td>
				
			
			</tr>
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			
			<tr>
					<td>&nbsp;</td>
			</tr>
			
			<tr align="center">
			<td>&nbsp;</td>
		
				<td align="center" colspan="3">
						<input type="submit" class="gradientbuttons" value="Report" onclick="return check();"></input>
				</td>
		    </tr>
		
		</table>
		</form>
		</div>
		<%
} %>

</body>
</html>