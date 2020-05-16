<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<title>ADD EMPLOYEE DETAILS</title>
</head>
<body>
	<h1>ADD USER</h1>
	<form action="/addUser" method="POST">
		ID : <input id="id" name="id" type="text" /> NAME : <input id="name"
			name="name" type="text" /> COUNTRY : <input id="country"
			name="country" type="text" /> <input name="ADD" type="submit" />
	</form>
	Added USER: ${addedUser.id} ${addedUser.name} ${addedUser.country}

	<h1>ALL USER</h1>
	<form action="/allUser" method="GET">
		<input type="submit" />
	</form>
	<br /> ALL USER
	<table>
		<c:forEach items="${addAllUser}" var="user1">
			<tr>
				<td>${user1.id}</user>
				<td>${user1.name}</user>
				<td>${user1.country}</user>
			</tr>
		</c:forEach>
	</table>
	<br></br>

	<br></br>
	<h1>UPDATE USER</h1>
	<form action="/updateUser" method="POST">
		ID : <input id="id" name="id" type="text" /> NAME : <input id="name"
			name="name" type="text" /> COUNTRY : <input id="country"
			name="country" type="text" /> <input type="submit" />
	</form>
	Added USER: ${updatedUser.id} ${updatedUser.name}
	${updatedUser.country}
	<br></br>
	<h1>DELETE USER</h1>
	<form action="/deleteUser" method="POST">
		ID : <input id="id" name="id" type="text" /> <input type="submit" />
	</form>
	Added USER: ${deletedUser.id} ${deletedUser.name}
	${deletedUser.country}
	<br></br>
</body>
</html>