<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Your Adventure Begins</title>
</head>
<body>
	<h1>Choose your own adventure.</h1>
	<h2>Good luck.</h2>
	<p>You awaken.  You don't remember where you are, but you feel tired.  And cold.  And wet.  Your legs ache.  Your head is pounding.  
	It's raining, you're exhausted, and you have no idea where you are.<br/>
	<br/>
	Panic washes over you.  You can feel your blood surging through your body as your heart beats rapidly.  You take a deep breath to calm yourself.
	You look around to take in your surroundings, suddenly more alert.   <br/>
	<br/>
	Ahead of you is a cottage.  It looks old and beaten down by years of harsh weather and no maintenance.  
	You see fire light through a frosted over window.  It's not the most welcoming, but neither is the chill of night.<br/>
	<br/>
	</p>
	
	<form action="FirstDecisionServlet" method="post">
	Do you enter?<br/>
	Type "Yes" to enter, or anything else to stay where you are.<br/>
		<input type="text" name="userInput" size="10">
		<input type="submit" value="Decide my Fate" />
	</form>

</body>
</html>