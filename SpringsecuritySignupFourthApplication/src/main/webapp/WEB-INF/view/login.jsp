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
<h2>My CustomLogin Page</h2>
<form:form>
Username :	<input type="text" name="username">
<br><br>
Password :	<input type="password" name="password">
<br><br>
<input type="submit" value="Login">

</form:form>
</div>
</body>
</html>