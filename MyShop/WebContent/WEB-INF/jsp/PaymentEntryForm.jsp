<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set var="baseURL" value="${pageContext.request.localName}"/>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>payment entry</title>

</head>
<body>

<form:form modelAttribute="payment" method="post" action="submitPayment">


	
	Exp date:
	<form:input path = "expDate" /><br>
	Cvv code:
	<form:input path = "cvvCode" /><br>
	Cardholder name:
	<form:input path = "cardholderName" /><br>
	
	<input type="submit" value="Confirm">
	
</form:form>
</body>
</html>