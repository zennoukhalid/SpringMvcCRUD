<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home</title>
</head>
<body>
<div align="center">
    <h2>Exam</h2>
   
    <h3><a href="/fskmvc/add">Add New</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>nom</th>
            <th>E-mail</th>
            <th>tel</th>
            <th>ville</th>
            <th>num abonnement</th>
            <th>name abonnement</th>
            <th>date abonnement</th>
            <th>balance abonnement</th>
            <th>type abonnement</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${clients}" var="client">
        <tr>
            <td>${client.nom}</td>
            <td>${client.email}</td>
            <td>${client.tel}</td>
            <td>${client.ville}</td> 
            <td>${client.abonnement.num}</td>
            <td>${client.abonnement.name}</td>
            <td>${client.abonnement.date}</td>
            <td>${client.abonnement.balance}</td> 
            <td>${client.abonnement.type}</td>
            
            <td>
                <a href='${"/fskmvc/edit/"}${client.id}'>Edit</a>
                &nbsp;&nbsp;&nbsp;
                
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>