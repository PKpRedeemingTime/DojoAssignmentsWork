<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Pets</title>
		<link rel='stylesheet' type='text/css' href='static/style.css'>
	</head>
	<body>
		<div class="header">
			<h1>Create Your Pets!</h1>
		</div>
		<div class=body>
			<div class=dog>
				<fieldset class="dogF">
					<legend>Make a Dog!</legend>
					<form action="Dog" method="get">
						<p>
							<label>Name: </label>
							<input type="text" name="name">
						</p>
						<p>
							<label>Breed: </label>
							<input type="text" name="breed">
						</p>
						<p>
							<label>Weight: </label>
							<input type="number" name="weight">
						</p>
						<input type="submit" value="Create">
					</form>
				</fieldset>	
			</div>
			<div class=cat>
				<fieldset class="catF">
					<legend>Make a Cat!</legend>
					<form action="Cat" method="get">
						<p>
							<label>Name: </label>
							<input type="text" name="name">
						</p>
						<p>
							<label>Breed: </label>
							<input type="text" name="breed">
						</p>
						<p>
							<label>Weight: </label>
							<input type="number" name="weight">
						</p>
						<input type="submit" value="Create">
					</form>
				</fieldset>
			</div>
		</div>
	</body>
</html>