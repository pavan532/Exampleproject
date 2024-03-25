<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome page</title>
</head>

<body>
<div style="text-align: center;color: brown;">
<h3>Welcome To New Form</h3>
<form:form action="result" modelAttribute="student" method="get">
<label for="nick">Enter YourName :</label>
<form:input path="name" id="nick"/>
<br><br>
<label for="nick1">Enter YourId :</label>
<form:input path="id" id="nick1"/>
<br><br>
<input type="submit" value="check Your Name And id">
</form:form>
</div>
</body>
</html>