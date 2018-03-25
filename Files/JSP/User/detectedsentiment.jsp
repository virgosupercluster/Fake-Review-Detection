<%@ page import="java.sql.*" %>
<%@ page import="com.user.*" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %>
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

<link href="<%=request.getContextPath()%>/Files/CSS/menu.css" rel="stylesheet" type="text/css" />
<%-- <link rel="stylesheet" href="<%=request.getContextPath() %>/pagenationcss.css" />
<script src="<%=request.getContextPath() %>/pagenation.js"></script> --%>


<link href="<%=request.getContextPath()%>/Res/CSS/style1.css" rel="stylesheet" type="text/css"/>

<script type="text/javascript" src="<%=request.getContextPath() %>/pagination.js"></script>

</head>
<body bgcolor="cyan">
<%-- <body background="<%=request.getContextPath()%>/Files/Images/back.jpg"> --%>

<center>
<%
String topic=request.getParameter("resultprcs");

HashMap<Integer, ArrayList<String>> sentimentdetected=new HashMap<Integer, ArrayList<String>>();
sentimentdetected=AdminDAO.getdetectedsentiment(topic);

System.out.println("Sentiment Dectected==========="+sentimentdetected);




%>
<br></br>

<div style="position: absolute;top: 5px;left:200px;">
<p><b><h3><font color="red">Detected Sentiment Details</font></h3></b></p>
</div>

<div class="CSSTableGenerator" style="width:580px;height:150px;">
<table class="pretty-table" border="1" id="user">
  
    <th scope="col">TweetID</th>
    <th scope="col">Topic</th>
    <th scope="col">Sentiment</th>
    <th scope="col">Tweet_text</th>
     <th scope="col">Detected_Sentiment</th>
<%
if(sentimentdetected.size()>0)
                        	  	{ %>

                        		 
                       
                        		  <%
                              	   int i=1;
                                 for(Map.Entry m4:sentimentdetected.entrySet())  
                                 {
                               	  m4.getKey();
                               	  String values = m4.getValue().toString();

                               	  String first=values.replace("[", "").replace("]", "");
                               	 String a[]=first.split("~~");
                               	 
                               	 
                               	System.out.println("arary1 is >>>>>>>>>>>>>>>>>>"+a[0]);
                               	System.out.println("arary2 is >>>>>>>>>>>>>>>>>>"+a[1]);
                               	System.out.println("arary3 is >>>>>>>>>>>>>>>>>>"+a[2]);
                               	System.out.println("arary4 is >>>>>>>>>>>>>>>>>>"+a[3]);
                               	System.out.println("arary5 is >>>>>>>>>>>>>>>>>>"+a[4]);
                               	System.out.println("arary6 is >>>>>>>>>>>>>>>>>>"+a[5]);
                               	System.out.println("arary7 is >>>>>>>>>>>>>>>>>>"+a[6]);
                               	   %>
                               	  
                        	   <tr>
                            <td><%=a[0].trim()%></td>
                                <td ><%=a[1].trim()%></td>
                            <td ><%=a[2].trim()%></td>
                            
                             <td ><%=a[5].trim()%></td>
                              <td ><%=a[6].trim()%></td>
                             
                             
                            
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
		

		
	
   
</body>




</html>




