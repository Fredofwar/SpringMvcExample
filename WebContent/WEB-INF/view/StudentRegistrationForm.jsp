<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Registration Form</title>
</head>
<body>
	
	<form:form action="processForm" modelAttribute="theStudent">
		
		Name: <form:input path="name"/> 
		<form:errors path="name" style="color: red"/>
		<br/><br/>
		Last Name: <form:input path="lastName"/>
		<br/><br/>
		Age: <form:input path="age" />
		<form:errors path="age" style="color: red"/>
		<br/><br/>
		E-mail: <form:input path="email" />
		<form:errors path="email" style="color: red"/>
		<br/><br/>
		Postal Code: <form:input path="postalCode" />
		<form:errors path="postalCode" style="color: red"/>
		<br/><br/>
		Asignature:
		<form:select path="optative" multiple="true">
			<form:option value="design">Design</form:option>
			<form:option value="karate">Karate</form:option>
			<form:option value="commerce">Commerce</form:option>
			<form:option value="dance">Dance</form:option>
		</form:select>
		<br/><br/>
		Mexico: <form:radiobutton path="cityStudent" value="Mexico"/>
		Monterrey: <form:radiobutton path="cityStudent" value="Monterrey"/>
		Queretaro: <form:radiobutton path="cityStudent" value="Queretaro"/>
		Yucatan: <form:radiobutton path="cityStudent" value="Yucatan"/>
		<br/><br/>
		English<form:checkbox path="languagesStudent" value="English"/>
		German<form:checkbox path="languagesStudent" value="German"/>
		French<form:checkbox path="languagesStudent" value="French"/>
		Spanish<form:checkbox path="languagesStudent" value="Spanish"/>
		<br/><br/>
		<input type="submit" value="Send">
		
	</form:form>
	
</body>
</html>