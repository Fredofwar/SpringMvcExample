<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirm Registration</title>
</head>
<body>
	
	The student twith name <strong> ${theStudent.name} </strong>, last name <strong> ${theStudent.lastName}</strong>, age <strong> ${theStudent.age}</strong>, e-mail <strong> ${theStudent.email}</strong> and postal code <strong> ${theStudent.postalCode}</strong> has been registered <br>   
	The asignature choosed is <strong> ${theStudent.optative}</strong> <br>
	The city where the student will begin his studies is:<strong> ${theStudent.cityStudent}</strong> <br>
	The languages chosen by the student are:<strong> ${theStudent.languagesStudent}</strong> <br>
	
</body>
</html>