<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Success Page</title>
</head>
<body>
	<h1>Record submitted successfully</h1>
	<h3>Employee Number:${empObj.getEmpno }</h3>
	<h3>Employee Name:${empObj.getName }</h3>
	<h3>Employee Salary:${empObj.getSalary }</h3>
</body>
</html>