<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Logins</title>
</head>
<body>
<h1>Welcome</h1>

<form action="login" method = "post">
	<div class="container">
		<label for="email"><b>Email</b></label> <input type="text"
			placeholder="Enter Email" name="email" required> <label
			for="psw"><b>Password</b></label> <input type="password"
			placeholder="Enter Password" name="password" required>
<input type="submit" value="Submit">
		<!-- <button type="submit">Login</button> -->

	</div>
</form>

</body>
</html>