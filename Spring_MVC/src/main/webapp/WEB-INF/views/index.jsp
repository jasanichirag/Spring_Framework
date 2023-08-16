<%@page import="java.util.List"%>
<%@page import="org.springframework.scheduling.support.SimpleTriggerContext"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>HOME / Index page</title>
</head>
<body>
 <%
    String title=(String) request.getAttribute("title");
    String subTitle=(String)request.getAttribute("subTitle");
    %>
    <h1><%=title %></h1>
    <h4><%=subTitle %></h4>
<h1>hello world</h1>
<h1>this is a HOME / Index page</h1>

<%-- <%String name=(String)request.getAttribute("name"); %>
<h1><%=name %></h1>
<h1>Age :<%=request.getAttribute("age") %></h1> --%>

<%-- <%
List<String>list=(List<String>) request.getAttribute("list");
for(String l:list){
	%>
	<h1><%=l %></h1>
	<%
}
%> --%>
<h1><a href=" view">View Page</a></h1>

</body>
</html>