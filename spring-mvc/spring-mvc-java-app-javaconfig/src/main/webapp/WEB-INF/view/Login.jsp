<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Yahoo!!</title>
</head>
<body>
	<p>
		<font color="red">${errorMessage}</font>
	</p>
	<form action="/spring-mvc/welcome" method="POST">
		Name : <input name="name" type="text" /> Password : <input
			name="password" type="password" /> <input type="submit" />
	</form>
</body>
</html>