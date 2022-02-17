<%@page import="model.User"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello MVC</title>
</head>
<body>
	<%
	User user1 = new User((User) request.getAttribute("user1"));
	User user2 = new User((User) request.getAttribute("user2"));
	%>
	<p>
		Hello:<br />
	<%=user1.toString()%><br/>
	<%=user2.toString()%><br/>
	</p>
</body>
</html>