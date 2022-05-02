<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Form</title>
<style >
	.error{color:red}
</style>
</head>
<body>
   <form:form method="post" action="submitData" modelAttribute="empObj" >
     <table>
         <tr>
            <td>Employee number</td>
            <td>
            	<form:input path="empno"/>
            	<form:errors path="empno" cssClass="error"/>
            </td>
            
         </tr>
         <tr>
            <td>Employee name</td>
            <td>
            	<form:input path="name"/>
            	<form:errors path="name" cssClass="error"/>
            </td>
         </tr>
         <tr>
            <td>Employee salary</td>
            <td>
            	<form:input path="salary"/>
            	<form:errors path="salary" cssClass="error"/>
            </td>
         </tr>
         <tr>
          <td><input type="submit" value="Submit" /></td>
           <td><input type="reset" value="Cancel" /></td>    
         </tr> 
     </table>
   
   </form:form>

</body>
</html>