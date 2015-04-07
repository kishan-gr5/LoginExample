<%@ page language="java" 
    contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"
%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
"http://www.w3.org/TR/html4/loose.dtd">
<html>

	<head>
		<title> Login Page </title>
	</head>
	<body>
		<form action="LoginServlet" method="get">
		Enter username:
		<input type="text" name="un"/><br>
		
		Enter Password:
		<input type="text" name="pw"/><br>
		
		<input type="submit" value="submit">
		</form>
	</body>
</html>