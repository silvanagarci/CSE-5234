<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>view order</title>
</head>
<body>
	Your order:
	<br>
	<table>
		<c:forEach items="${order.items}" var="item" varStatus="loop">
			<tr>
				<td><c:out value="${item.name}"></c:out></td>
				<td><c:out value="$${item.price}"></c:out></td>
				<td><c:out value="${item.quantity}"></c:out></td>
			</tr>
		</c:forEach>
	</table>
	<br> Shipping info: ${shipment.name}
	<br> ${shipment.addressLine1}
	<br> ${shipment.addressLine2}
	<br> ${shipment.city}
	<br> ${shipment.state}
	<br> ${shipment.zip}
	<br>
	Total price: ${price}

	<form:form modelAttribute="payment" method="post"
		action="confirmOrder">

		<input type="submit" value="Confirm">

	</form:form>



</body>
</html>