<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<div style="text-align: center; color: blue;">

<h2>Password Change Page</h2>
<c:if test="${param.invalidpassword != null}">
<i style="color: red;">Invalid Old PassWord</i>
</c:if>

<c:if test="${param.doesnotmatch != null}">
<i style="color: red;">Your NewPassWord And ConfirmPassword Does Not Match</i>
</c:if>
<br>
<form:form action="password-save" method="POST" modelAttribute="changepassword">

OldPassword :<form:input path="oldPassword"/>
<br><br>
NewPassword:<form:input path="newpassword"/>
<br><br>
ConfirmPassword :<form:input path="confirmpassword"/>
<br><br>
<input type="submit" value="Change Password">
</form:form>
</div>
</body>
</html>