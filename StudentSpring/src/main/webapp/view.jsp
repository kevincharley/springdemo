<%@page import="com.example.demo.beans.Studentbean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>  
<head>  
<title>Core Tag Example</title>  
</head>  
<body>  
<label>dfghjkl</label>
<c:if test="${not empty  stlst}">  

   <c:forEach var="st" items="${stlst}">  <br>
   <label>${st.id}</label>
    <label>${st.name}</label>
     <label>${st.password}</label><br>
</c:forEach>   
</c:if>  

<c:if test="${not empty  sl}">  

   <c:forEach var="sl" items="${sl}">  <br>
   <label>${sl.id}</label>
    <label>${sl.name}</label>
     <label>${sl.password}</label><br>
</c:forEach>   
</c:if>  
</body>  
</html> 