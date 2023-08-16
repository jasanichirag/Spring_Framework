<%@page import="com.entity.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <%
    String title=(String) request.getAttribute("title");
    String subTitle=(String)request.getAttribute("subTitle");
    %>
    <h1><%=title %></h1>
    <h4><%=subTitle %></h4>
<h1>Data page.</h1>
<%
/* String email=(String)request.getAttribute("email");
String add=(String)request.getAttribute("add");
String pass=(String)request.getAttribute("pass");

 */
 User u=(User)request.getAttribute("user");
 %>
<%-- <h2>User Email :<%=email %></h2>
<h2>User Address :<%=add %></h2>
<h2>User Password :<%=pass %></h2> --%>
<h2>Email :<%=u.getEmail() %></h2>
<h2>Address : <%=u.getAddress() %></h2>
<h2> Password :<%=u.getPassword() %></h2>
</body>
</html>