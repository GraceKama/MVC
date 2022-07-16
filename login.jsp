<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>

</head>
<body>
<h2 style="color:red">${errorMsg}</h2>
<form action="login" method="post">

<input type="text" name="username" placeholder="Enter username here">
<input type="password" name="password" placeholder="Enter password here">
<input type="submit" value="Login">
</form>
</body>
</html>