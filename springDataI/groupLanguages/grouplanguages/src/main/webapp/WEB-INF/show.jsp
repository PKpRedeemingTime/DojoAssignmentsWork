<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Language</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<p class="float"><a href="/">Dashboard</a></p>
			<p><c:out value="${lang.name}"/></p>
			<p><c:out value="${lang.creator}"/></p>
			<p><c:out value="${lang.version}"/></p>
			<a href="/languages/edit/${id}">Edit</a>
			<a href="/languages/delete/${id}">Delete</a>
		</div>
	</body>
</html>