<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="text-align: center;">
<form:form action="deleteuser" method="get" modelAttribute="user">
UserName :<form:input path="username"/><br><br>
<input type="submit" value="Delete UserName">
</form:form>
</div>
</body>
</html>