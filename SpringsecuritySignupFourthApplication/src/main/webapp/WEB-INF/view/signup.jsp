<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div align="center">
<h1>SignUp Page</h1>

<form:form action="process" method="POST" modelAttribute="custmer">
UserName :<form:input path="username"/><br><br>
Password :<form:password path="password"/><br><br>
<input type="submit" value="SignUp">
</form:form>
</div>
</body>
</html>