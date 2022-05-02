<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
   <form:form  action="submitData" method="post" modelAttribute="empObj" >
     <table>
         <tr>
            <td>Employee number</td>
            <td><form:input path="empNo"/></td>
         </tr>
         <tr>
            <td>Employee name</td>
            <td><form:input path="name"/></td>
         </tr>
         <tr>
            <td>Employee salary</td>
            <td><form:input path="salary"/></td>
         </tr>
         <tr>
          <td><input type="submit" value="Submit" /></td>
           <td><input type="reset" value="Cancel" /></td>    
         </tr> 
     </table>
   
   </form:form>

</body>
</html>