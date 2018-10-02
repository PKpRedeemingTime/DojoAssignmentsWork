<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Create New Team</title>
		<link rel="stylesheet" type="text/css" href="static/stylesheets/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<p>Add a new player to the ${team.getName()}<a href="Home" style="margin-left:40px">Home</a></p>
			<br><br>
			<form action="NewPlayer?id=${teamID}" method="POST">
				<p>
					<label>First Name:</label>
					<input type="text" name="firstName">
				</p>
				<p>
					<label>Last Name:</label>
					<input type="text" name="lastName">
				</p>
				<p>
					<label>Age</label>
					<input type="number" min="18" max="110" name="age">
				</p>
				<br>
				<input type="hidden" name="teamID" value="${teamID}">
				<input type="submit" value="Add">
			</form>
		</div>
	</body>
</html>