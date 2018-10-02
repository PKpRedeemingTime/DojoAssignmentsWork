<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Great Number Game Home</title>
	</head>
	<body>
		<% String result = (String) session.getAttribute("result"); %>
		<h2>Welcome to the Great Number Game!</h2>
		<p>I am thinking of a number between 1 and 100</p>
		<% if(result != "" && (result == "Too Low!" || result == "Too High!")) { %>
			<h1><%= result %></h1>
		<% } %>
		
		<% if(result == "Correct!") { %>
			<h1><%= session.getAttribute("number") %> was the number!</h1>
			<form action="Home" method="POST">
				<input type="hidden" name="restart" value="restart">
				<input type="submit" value="Play again!">
			</form>
		<% } else { %>
			<p>Take a guess!</p>
			<form action="Home" method="POST">
				<input type="number" min="1" max="100" name="guess">
				<br><br>
				<input type="submit" name="Submit">
			</form>
		<% } %>
		
	</body>
</html>