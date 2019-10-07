<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Us</title>
</head>
<body>
	<jsp:include page="header.jsp"/> 
	</br>
	<div class="container center_div">
		<h1> Contact Us </h1>
		<form>
		  <div class="form-group">
		    <label for="exampleFormControlInput1">Name</label>
		    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name">
		  </div>
		  <div class="form-group">
		    <label for="exampleFormControlInput1">Email address</label>
		    <input type="email" class="form-control" id="exampleFormControlInput1" placeholder="name@example.com">
		  </div>
		  <div class="form-group">
		    <label for="exampleFormControlTextarea1">Message</label>
		    <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
		  </div>
		</form>
		<a href="${pageContext.request.contextPath}" class="btn btn-primary btn-lg active" role="button" aria-pressed="true">Send</a>
	</div>

</body>
</html>