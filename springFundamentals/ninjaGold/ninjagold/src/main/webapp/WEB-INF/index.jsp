<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Ninja Gold</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<div class="wrapper">
			<h1>Your Gold: <span class="goldCount"><c:out value="${gold}"/></span></h1>
			<div class="main">
				<div class="box">
					<h2>Farm</h3>
					<h4>(earns 10-20 gold)</h2>
					<form action="/process" method="post">
						<input type="hidden" name="building" value="farm" />
						<input type="submit" value="Find Gold!"/>
					</form>
				</div>
				<div class="box">
					<h2>Cave</h3>
					<h4>(earns 5-10 gold)</h2>
					<form action="/process" method="post">
						<input type="hidden" name="building" value="cave" />
						<input type="submit" value="Find Gold!"/>
					</form>
				</div>
				<div class="box">
					<h2>House</h3>
					<h4>(earns 2-5 gold)</h2>
					<form action="/process" method="post">
						<input type="hidden" name="building" value="house" />
						<input type="submit" value="Find Gold!"/>
					</form>
				</div>
				<div class="box">
					<h2>Casino!</h3>
					<h4>(earns or loses 0-50 gold)</h2>
					<form action="/process" method="post">
						<input type="hidden" name="building" value="casino" />
						<input type="submit" value="Find Gold!"/>
					</form>
				</div>
			</div>
			<h1>Activities:</h1>
			<div class="messages">
				<c:forEach var="msg" items="${messages}">
					<c:choose>
						<c:when test="${msg.contains('lost')}">
							<p class="red"><c:out value="${msg}"/></p>
						</c:when>
						<c:otherwise>
							<p class="green"><c:out value="${msg}"/></p>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</div>
		</div>
	</body>
</html>