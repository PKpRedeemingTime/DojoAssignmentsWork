<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Create a License</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<h1>New License</h1>
		<form:form action="/licenses/new" method="POST" modelAttribute="license">
			<p>
				<form:label path="person">Person:</form:label>
				<form:select path="person">
					<c:forEach var="person" items="${persons}">
						<form:option value="${person}" label="${person.firstName} ${person.lastName}"/>
					</c:forEach>
				</form:select>
			</p>
			<p>
				<form:label path="state">State:</form:label>
				<form:select path="state">
		            <form:option value="AL" label="Alabama"/>
		            <form:option value="AK" label="Alaska"/>
		            <form:option value="AZ" label="Arizona"/>
		            <form:option value="AR" label="Arkansas"/>
		            <form:option value="CA" label="California"/>
		            <form:option value="CO" label="Colorado"/>
		            <form:option value="CT" label="Connecticut"/>
		            <form:option value="DE" label="Delaware"/>
		            <form:option value="DC" label="District Of Columbia"/>
		            <form:option value="FL" label="Florida"/>
		            <form:option value="GA" label="Georgia"/>
		            <form:option value="HI" label="Hawaii"/>
		            <form:option value="ID" label="Idaho"/>
		            <form:option value="IL" label="Illinois"/>
		            <form:option value="IN" label="Indiana"/>
		            <form:option value="IA" label="Iowa"/>
		            <form:option value="KS" label="Kansas"/>
		            <form:option value="KY" label="Kentucky"/>
		            <form:option value="LA" label="Louisiana"/>
		            <form:option value="ME" label="Maine"/>
		            <form:option value="MD" label="Maryland"/>
		            <form:option value="MA" label="Massachusetts"/>
		            <form:option value="MI" label="Michigan"/>
		            <form:option value="MN" label="Minnesota"/>
		            <form:option value="MS" label="Mississippi"/>
		            <form:option value="MO" label="Missouri"/>
		            <form:option value="MT" label="Montana"/>
		            <form:option value="NE" label="Nebraska"/>
		            <form:option value="NV" label="Nevada"/>
		            <form:option value="NH" label="New Hampshire"/>
		            <form:option value="NJ" label="New Jersey"/>
		            <form:option value="NM" label="New Mexico"/>
		            <form:option value="NY" label="New York"/>
		            <form:option value="NC" label="North Carolina"/>
		            <form:option value="ND" label="North Dakota"/>
		            <form:option value="OH" label="Ohio"/>
		            <form:option value="OK" label="Oklahoma"/>
		            <form:option value="OR" label="Oregon"/>
		            <form:option value="PA" label="Pennsylvania"/>
		            <form:option value="RI" label="Rhode Island"/>
		            <form:option value="SC" label="South Carolina"/>
		            <form:option value="SD" label="South Dakota"/>
		            <form:option value="TN" label="Tennessee"/>
		            <form:option value="TX" label="Texas"/>
		            <form:option value="UT" label="Utah"/>
		            <form:option value="VT" label="Vermont"/>
		            <form:option value="VA" label="Virginia"/>
		            <form:option value="WA" label="Washington"/>
		            <form:option value="WV" label="West Virginia"/>
		            <form:option value="WI" label="Wisconsin"/>
		            <form:option value="WY" label="Wyoming"/>
				</form:select>
			</p>
			<p>
				<form:label path="expirationDate">Expiration Date:</form:label>
				<form:input type="date" path="expirationDate"/>
			</p>
			<input type="submit" value="Create"/>
		</form:form>
	</body>
</html>