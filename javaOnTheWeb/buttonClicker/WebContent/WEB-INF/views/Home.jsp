<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Button Clicker</title>
		<link rel="stylesheet" type="text/css" href="static/stylesheets/style.css" />
	</head>
	<body>
		<a href="Counter">Click Me</a>
		<h4>You have clicked this button <%= session.getAttribute("clicks") %> times...</h4>
	</body>
</html>