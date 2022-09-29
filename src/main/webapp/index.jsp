<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Multiplication Calculator</title>
</head>
<body>
<h1>Multiplication Calculator</h1>
<form action="calculateServlet" method="post">Enter the first whole number to multiply:
<input type="text" name="firstNumber" size="10">
<br>Enter the second whole number to multiply: 
<input type="text" name="secondNumber" size="10">
<br>
<input type="submit" value="Calculate" />
 </form>
</body>
</html>