<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
</head>
<body>
	<form action="add_new_order" method="POST">
		<label>Title</label>
		<input type="text" name="title">
		<label>Price</label>
		<input type="text" name="price">
		<input type="submit" value="Add new order">
	</form>
</body>
</html>