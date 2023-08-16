<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Data page.</h1>
<%
String email=(String)request.getAttribute("email");
String add=(String)request.getAttribute("add");
String pass=(String)request.getAttribute("pass");
%>
<h2>User Email :<%=email %></h2>
<h2>User Address :<%=add %></h2>
<h2>User Password :<%=pass %></h2>
</body>
</html>