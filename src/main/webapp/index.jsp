<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Index</h1>
	<br />
	<p>
<%-- 		Hello:<br /> ${name}<br /> ${user1._name}, ${user1._age}<br /> --%>
<%-- 		${user2._name}, ${user2._age}<br /> --%>
	Hello <br/>
	<%
	String name = request.getAttribute("name").toString(); 
	
	%>
	<%=name %>
	</p>
</body>
</html>