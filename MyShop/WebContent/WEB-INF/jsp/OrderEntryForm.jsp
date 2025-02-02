<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>order entry</title>
</head>
<body>
<% request.getSession().getAttribute("isInvalid"); %>
<form:form modelAttribute="order" method="post" action="purchase/submitItems">

	<table>
		<c:forEach items="${order.items}" var="item" varStatus="loop">
			<tr>
				<td><c:out value="${item.name}"></c:out></td>
				<td><c:out value="$${item.price}"></c:out></td>
				<td><form:input path="items[${loop.index}].quantity" /></td>
				<td><form:hidden path="items[${loop.index}].name" value="${item.name}"/></td>
				<td><form:hidden path="items[${loop.index}].price" value="${item.price}"/></td>
			</tr>
		</c:forEach>
		
		<tr>
			<td colspan="2"><input type="submit" value="Purchase"></td>
		</tr>
		
		
	</table>
</form:form>
</body>
</html>