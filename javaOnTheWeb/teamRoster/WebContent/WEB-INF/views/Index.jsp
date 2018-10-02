<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>All Rosters</title>
		<link rel="stylesheet" type="text/css" href="static/stylesheets/style.css" />
	</head>
	<body>
	<div class="wrapper">
		<div class="header">
			<p>All Rosters</p>
			<a href="NewTeam">New Team</a>
		</div>
		<div class="table">
			<table>
				<thead>
					<th>Team</th>
					<th>Players</th>
					<th>Action</th>
				</thead>
				<tbody>
					<c:forEach var="team" items="${allTeams}" varStatus="loop">
						<tr>
							<td><c:out value="${team.getName()}" /></td>
							<td><c:out value="${team.getPlayers().size()}" /></td>
							<td><a href="TeamPage?id=${loop.index}">Details</a><td><a href="DeleteTeam?id=${loop.index}">Delete</a></td></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	</body>
</html>