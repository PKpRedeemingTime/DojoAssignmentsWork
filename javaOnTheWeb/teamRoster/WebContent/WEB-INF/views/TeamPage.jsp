<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Team Page</title>
		<link rel="stylesheet" type="text/css" href="static/stylesheets/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<div class="header">
				<p>${team.getName()}</p>
				<a href="Home">Home</a>
				<a href="NewPlayer?id=${teamID}">New Player</a>
			</div>
			<div class="table">
				<table>
					<thead>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
						<th>Action</th>
					</thead>
					<tbody>
						<tr>
							<c:forEach var="player" items="${team.getPlayers()}" varStatus="loop">
								<tr>
									<td><c:out value="${player.getFirstName()}" /></td>
									<td><c:out value="${player.getLastName()}" /></td>
									<td><c:out value="${player.getAge()}" /></td>
									<td><a href="DeletePlayer?teamID=${teamID}&playerID=${loop.index}">Delete</a></td>
								</tr>
							</c:forEach>
						</tr>
					</tbody>
				</table>
			</div>
		</div>
	</body>
</html>