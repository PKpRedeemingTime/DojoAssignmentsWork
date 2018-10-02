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
			<p>Create a new team here</p>
			<br><br>
			<form action="NewTeam" method="POST">
				<p>
					<label>Team Name:</label>
					<input type="text" name="teamName">
				</p>
				<br>
				<input type="submit" value="Create">
			</form>
		</div>
	</body>
</html>