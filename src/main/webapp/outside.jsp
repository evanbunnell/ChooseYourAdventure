<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>You do not enter the cottage</title>
</head>
<body>
	<p>You stand outside for a minute, looking at the cottage.  It would be so easy to go inside and look around, but it's not your place.<br/>
	<br/>
	But you can't stand out here forever.  The longer you wait, the wetter and colder you get.</p>
	<form action="SecondDecisionServlet" method="post">
	You have a choice to make.  Do you leave and walk home in the rain, risking illness?  Or sit down outside the cottage, 
	hoping to be protected from the rain and wind near the small building?<br/>
	Type "Leave" to leave the forest and go home, or anything else to wait outside by the cottage until the weather clears up.<br/>
		<input type="text" name="userInput" size="10">
		<input type="submit" value="Decide my Fate" />
		<input type="hidden" name="path" value="3"/>
	</form>
</body>
</html>