<%@ page language="java" 
         contentType="text/html; charset=windows-1256"
         pageEncoding="windows-1256"
         import="com.ExamplePackage.UserBean"
         import="com.ExamplePackage.LoginServlet"
   %>
 
   <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title> User Logged Successfully </title>
	</head>
	<body>
		<center>
			<%UserBean currentUser = (UserBean)session.getAttribute("currentsessionUser"); %>
			Welcome<%=currentUser.getFirstname()+" "+currentUser.getLastname() %>
		</center>
	
	</body>
</html>