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

<body bgcolor="cyan">


<%

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




%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report1.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                           <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }%>

	
	 </table>
	 </div>
	<div id="pageNavPosition" style="position:relative;top:250px;left:200px"></div>
<script type="text/javascript"><!--
        var pager = new Pager('user',5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script> 
		
	

		<%
	
	}
	if(Utility.parse(request.getParameter("no"))==1)
	{	
    
    	String product=request.getParameter("product");
    	
    	
    	System.out.println("product =========="+product);


String topic=request.getParameter("resultprcs");

HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport2(product);

System.out.println("report1 =========="+report2);




%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                            <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }%>

	
	 </table>
	 </div>
	<div id="pageNavPosition" style="position:relative;top:250px;left:200px"></div>
<script type="text/javascript"><!--
        var pager = new Pager('user',5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script> 
    <%
} 
	if(Utility.parse(request.getParameter("no"))==2)
	{
		String userid=request.getParameter("userid");
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport3(userid);

System.out.println("report1 =========="+report2);




%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                          <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }%>

	
	 </table>
	 </div>
	<div id="pageNavPosition" style="position:relative;top:250px;left:200px"></div>
<script type="text/javascript"><!--
        var pager = new Pager('user',5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script> 
    <%
}
	
	


if(Utility.parse(request.getParameter("no"))==3)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport4();






%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                            <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }%>

	
	 </table>
	 </div>
	<div id="pageNavPosition" style="position:relative;top:250px;left:200px"></div>
<script type="text/javascript"><!--
        var pager = new Pager('user',5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script> 
    <%
}


if(Utility.parse(request.getParameter("no"))==4)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport5();






%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                            <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }%>
                                 
                                 

	
	 </table>
	 </div>
	<div id="pageNavPosition" style="position:relative;top:250px;left:200px"></div>
<script type="text/javascript"><!--
        var pager = new Pager('user',5); 
        pager.init(); 
        pager.showPageNav('pager', 'pageNavPosition'); 
        pager.showPage(1);
    //--></script> 
    <%
} 



if(Utility.parse(request.getParameter("no"))==5)
	{
		
    	
    	
    




HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport5();






%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                            <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }
                       }
                                 
  if(Utility.parse(request.getParameter("no"))==6)
	{
		
 
HashMap<Integer, ArrayList<String>> report2=new HashMap<Integer, ArrayList<String>>();
report2=AdminDAO.getreport6();






%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Report</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">Sl_no</th>
    <th scope="col">FileName</th>
    <th scope="col">IPAddress</th>
    <th scope="col">Date</th>
     <th scope="col">Time</th>
     <th scope="col">Product</th>
     <th scope="col">Reviews</th>
     <th scope="col">Userid</th>
     <th scope="col">Status</th>
<%
if(report2.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
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
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            <td ><%=a[3].trim()%></td>
                            
                             <td ><%=a[4].trim()%></td>
                              <td ><%=a[5].trim()%></td>
                               <td ><%=a[6].trim()%></td>
                            <td ><a href="<%=request.getContextPath()%>/ViewReview?reviewid=<%=a[0].trim()%>">View Review</a></td>
                            
                             <td ><%=a[8].trim()%></td>
                              <td ><%=a[9].trim()%></td>
                             
                             
                            
                            </tr>
                        	
                        	
                        	 
                      
                        	  
                        	  <%}
                                 
                                
                                 }
                                 }%>


</body>
</html>