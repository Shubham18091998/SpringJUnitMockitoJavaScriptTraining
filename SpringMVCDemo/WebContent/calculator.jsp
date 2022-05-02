<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Calculator</title>
</head>
<body>
	<form action="addNumber" method="post">
	<table>
		<tr>
			<td>Number 1</td>
			<td><input id="num1" name="num1" type="text"></td>
		</tr>
		<tr>
			<td>Number 2</td>
			<td><input id="num2" name="num2" type="text"></td>
		</tr>
		<tr>
			<td><input type="submit" id="submit" value="Submit"></td>
			<td><input type="reset" id="reset" value="Reset"></td>
		</tr>
	</table>
	</form>
</body>
</html>