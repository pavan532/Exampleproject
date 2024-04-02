<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;color: blue;">
<h2>Update Page</h2>
<form:form action="updateuser" method="POST" modelAttribute="userdto">
UserName :<form:input path="username"/><br><br>
Password :<form:input path="password"/><br><br>
<input type="submit" value="Update User">
</form:form>
</div>
</body>
</html>