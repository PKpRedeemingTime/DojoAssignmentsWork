<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Random Word Generator</title>
	</head>
	<body>
		<h4>You have generated a word <%= session.getAttribute("counter") %> times...</h4>
		<h2><%= session.getAttribute("randomWord") %></h2>
		<form action="Random">
			<input type="submit" name="generate" value="Generate">
		</form>
		<h4>The last time you generated a word was...</h4>
		<h2><%= session.getAttribute("lastGenerated") %></h2>
		<form action="Random">
			<input type="submit" value="Reset">
		</form>
	</body>
</html>