<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>

	<%
	
		//response.setHeader("Pragma", "no-cache"); // za HTTP 1.0 verziju se dodaje i ovo
		//response.setHeader("Expires", "0"); //Proxiji
		
		//onemogucujemo cuvanje kesa - da ne bismo mogli da se vracamo nazad ....
		response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
		if (session.getAttribute("username") == null){
			response.sendRedirect("login.jsp");
		} 
	%>

	Welcome ${username} !
	
	
	<form action="logout">
		<input type="submit" value="logout">
	</form>
	
</body>
</html>