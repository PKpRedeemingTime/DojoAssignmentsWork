<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Fortran Dashboard</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<div class="header">
				<div class="fortran">
					<h1>Fortran!</h1>
				</div>
				<div class="links">
					<p><a href="/m/38/0553/0733">Set up</a> | <a href="/m/38/0483/0345">Forms</a> | <a href="/m/38/0553/0342">Cards</a> | <a href="/m/26/0553/0348">Advanced</a> | <a href="/m/26/0483/2342">Binary</a></p>
				</div>
			</div>
			<div class="output">
				<div class="box">
					<c:out value="${goal}"/>
				</div>
			</div>
		</div>
	</body>
</html>