<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Inside the Cottage</title>
</head>
<body>
	<p>You enter the cottage.  Despite the meager fire in the hearth, the cottage is not well lit.  
	You see a table near the fireplace and a bench near the window.<br/>
	<br/>
	Upon the table is half a loaf of bread and an apple.  It feels like you haven't eaten in days, but this isn't your food.</p>
	<form action="SecondDecisionServlet" method="post">
	Do you sit down and eat the food on the table or sit by the window and wait for the storm to ease up?<br/>
	Type "Eat"" to eat the food, or anything else to sit down by the window.<br/>
		<input type="text" name="userInput" size="10">
		<input type="submit" value="Decide my Fate" />
		<input type="hidden" name="path" value="2"/>
	</form>
</body>
</html>