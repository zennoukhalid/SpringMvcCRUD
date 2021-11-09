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
    <h2>Customer Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" /> &nbsp;
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/fskmvc/home/add">Add New</a></h3>
    <table border="1" cellpadding="5">
        <tr>
            <th>First name</th>
            <th>Last name</th>
            <th>Age</th>
            <th>E-mail</th>
            <th>Country</th>
            <th>City</th>
            <th>Address</th>
            <th>Zip Code</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${persons}" var="person">
        <tr>
            <td>${person.firstname}</td>
            <td>${person.lasttname}</td>
            <td>${person.age}</td>
            <td>${person.email}</td>
            <td>${person.address.country}</td>
            <td>${person.address.city}</td>
            <td>${person.address.address}</td>
            <td>${person.address.zipcode}</td>
            <td>
                <a href='${"/fskmvc/home/edit/"}${person.id}'>Edit</a>
                &nbsp;&nbsp;&nbsp;
                <a href="delete?id=${person.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>   
</body>
</html>