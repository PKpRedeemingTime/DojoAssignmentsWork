<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Dojo Survey</title>
		<link rel="stylesheet" href="/css/style.css" />
	</head>
	<body>
		<form class="box" action="/result" method="POST">
			<p>
				<label for="name">Your Name:</label>
				<input class="float" type="text" name="name"/>
			</p>
			<p>
				<label for="location">Dojo Location:</label>
				<select class="float" name="location">
					<option value="Burbank">Burbank</option>
					<option value="San Jose">San Jose</option>
					<option value="Seattle">Seattle</option>
					<option value="Washington DC">Washington DC</option>
				</select>
			</p>
			<p>
				<label for="language">Language:</label>
				<select class="float" name="language">
					<option value="Java">Java</option>
					<option value="Python">Python</option>
					<option value="Ruby">Ruby</option>
					<option value="JavaScript">JavaScript</option>
				</select>
			</p>		
			<p>
				<label id="comment-label" for="comment">Comment (optional):</label>
				<textarea name="comment" id="" cols="60" rows="10"></textarea>
			</p>
			<input class="float" type="submit" value="Submit"/>
		</form>
	</body>
</html>