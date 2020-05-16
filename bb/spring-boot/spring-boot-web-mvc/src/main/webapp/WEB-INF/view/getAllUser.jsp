<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>ADD EMPLOYEE DETAILS</title>
</head>
<body>
	<form action="/addUser" method="POST">
		ID : <input id="id" name="id" type="text" /> 
		NAME : <input id="name" name="name" type="text" /> 
		COUNTRY : <input id="country" name="country" type="text" /> 
		<input type="submit" />
	</form>
</body>
</html>