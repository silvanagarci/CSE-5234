<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>shipping entry</title>
</head>
<body>
<form:form modelAttribute="shipment" method="post" action="submitShipping">


	
	Name:
	<form:input path = "name" /><br>
	Address1:
	<form:input path = "addressLine1" /><br>
	Address2:
	<form:input path = "addressLine2" /><br>
	City:
	<form:input path = "city" /><br>
	State:
	<form:input path = "state" /><br>
	Zip:
	<form:input path = "zip" /><br>
	
	<input type="submit" value="Confirm">
	
</form:form>
</body>
</html>