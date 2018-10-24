<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Search Result</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
	<div class="wrapper">
		<div class="header">
			<form action="/search" method="POST">
				<input type="text" placeholder="Artist Name" name="artist" />
				<input type="submit" value="Search Artists"/>
			</form>
			<a href="/dashboard">Dashboard</a>
		</div>
		<p>Songs by artist: <c:out value="${artist}"/></p>
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Rating</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="song" items="${songs}">
					<tr>
						<td>
							<a href="/songs/${song.id}"><c:out value="${song.title}"/></a>
						</td>
						<td><c:out value="${song.rating}"/></td>
						<td>| 
							<a href="/songs/delete/${song.id}">Delete</a>				
						</td>
					</tr>	
				</c:forEach>							
			</tbody>
		</table>
	</div>
	</body>
</html>