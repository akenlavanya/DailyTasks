<%@page import="in.co.hsbc.foodapp.model.FoodItem"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Showing All Foods</h1>
	<%
		List<FoodItem> f= (List<FoodItem>)request.getAttribute("allFoods");
	%>
</body>
</html>