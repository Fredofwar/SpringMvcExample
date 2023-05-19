<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel= "stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/styles/style.css">
</head>
<body>

	Hi ${param.studentName} welcome to the spring course
	<h2>Hey everyone! </h2>
	${message}
	<br>
	<img alt="photo" src="${pageContext.request.contextPath}/resources/images/IA.png">
</body>
</html>