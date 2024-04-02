<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>login page</title>
</head>
<body>
<div align="center">
<h2>Add User Page</h2>

<form:form action="save-page" method="POST" modelAttribute="user">

UserName :<form:input path="username"/><br><br>

Password :<form:password path="password"/><br><br>

<input type="submit" value="SaveData">

</form:form>

<h3><a href="/SpringSecurityJdbcConnetionCustom7ThApplication/deleteform">Delete Page</a></h3>
<h3><a href="/SpringSecurityJdbcConnetionCustom7ThApplication/changepass">ChangePassword Page</a></h3>


</div>
</body>
</html>