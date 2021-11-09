<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>   
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <div align="center">
        <h2>Person Registration</h2>
        <form:form action="/fskmvc/home/store" method="post" modelAttribute="person">
        <form:hidden path="id" />
        <form:hidden path="address.id" />
        
        	<div class="row">
        		<div class="col">
        			<label for="firstname">First name</label>
        			<form:input path="firstname" />
        			<form:errors path="firstname"/>
        		</div>
        		<div class="col">
        			<label for="lasttname">Last name</label>
        			<form:input path="lasttname" />
        			<form:errors path="lasttname"/>
        		</div>
        	</div>
        	
        	<div class="row">
        		<div class="col">
        			<label for="age">age</label>
        			<form:input path="age" />
        			<form:errors path="age"/>
        		</div>
        		<div class="col">
        			<label for="email">email</label>
        			<form:input path="email" />
        			<form:errors path="email"/>
        		</div>
        	</div>
        	
        	<div class="row">
        		<div class="col">
        			<label for="country">country</label>
        			<form:select path="address.country">
        				<form:option value="1">Morocco</form:option>
        				<form:option value="2">Zimbabwey</form:option>
        				<form:option value="3">LMARIKAN</form:option>
        			</form:select>
        			<form:errors path="address.country"/>
        		</div>
        		<div class="col">
        			<label for="city">city</label>
        			<form:input path="address.city" />
        			<form:errors path="address.city"/>
        		</div>
        	</div>
        	
        	<div class="row">
        		<div class="col">
        			<label for="address">address</label>
        			<form:input path="address.address" />
        			<form:errors path="address.address"/>
        		</div>
        		<div class="col">
        			<label for="zipcode">Zipcode</label>
        			<form:input path="address.zipcode" />
        			<form:errors path="address.zipcode"/>
        		</div>
        	</div>
        	
        	<center>
        		<button type="submit">Valider les informations</button>
        	</center>
        
        </form:form>
    </div>

</body>
</html>