<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Top Ten Songs</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<a href="/dashboard">Dashboard</a>
			<h3>Top Ten Songs:</h3>
			<c:forEach var="song" items="${songs}">
				<p><c:out value="${song.rating}"/> - <a href="/songs/${song.id}"><c:out value="${song.title}"/></a> - <c:out value="${song.artist}"/></p>
			</c:forEach>
		</div>
	</body>
</html>