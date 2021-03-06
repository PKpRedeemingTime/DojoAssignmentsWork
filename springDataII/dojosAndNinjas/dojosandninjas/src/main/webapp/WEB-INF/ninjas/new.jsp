<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>New Ninja</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<h1>New Ninja</h1>
		<form:form action="/ninjas/new" method="POST" modelAttribute="ninja">
			<p>
				<form:label path="dojo">Dojo:</form:label>
				<form:select path="dojo">
					<c:forEach var="dojo" items="${dojos}">
						<form:option value="${dojo}" label="${dojo.name}"/>
					</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label path="firstName">First Name: </form:label>
				<form:input path="firstName" type="text"/>
			</p>
			<p>
				<form:label path="lastName">Last Name: </form:label>
				<form:input path="lastName" type="text"/>
			</p>
			<p>
				<form:label path="age">Age: </form:label>
				<form:input path="age" type="number" min="16" value="16"/>
			</p>
			<input type="submit" value="Create"/>
		</form:form>
	</body>
</html>