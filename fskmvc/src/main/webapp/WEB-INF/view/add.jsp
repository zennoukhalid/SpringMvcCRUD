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
        <h2>Clients Registration</h2>
        <form:form action="/fskmvc/store" method="post" modelAttribute="clients">
        <form:hidden path="id" />
        <form:hidden path="abonnement.id"/>
        
        
        	<div class="row">
        		<div class="col">
        			<label for="nom">nom</label>
        			<form:input path="nom" />
        			<form:errors path="nom"/>
        		</div>
        		<div class="col">
        			<label for="email">email</label>
        			<form:input path="email" />
        			<form:errors path="email"/>
        		</div>
        	</div>
        	
        	<div class="row">
        		<div class="col">
        			<label for="tel">tel</label>
        			<form:input path="tel" />
        			<form:errors path="tel"/>
        		</div>
        		<div class="col">
        			<label for="ville">ville</label>
        			<form:input path="ville" />
        			<form:errors path="ville"/>
        		</div>
        	</div>
        	        	<div class="row">
        		<div class="col">
        			<label for="num">num abonnement</label>
        			<form:input path="abonnement.num" />
        			<form:errors path="abonnement.num"/>
        		</div>
        		<div class="col">
        			<label for="abonnement.name">name abonnement</label>
        			<form:input path="abonnement.name" />
        			<form:errors path="abonnement.name"/>
        		</div>
        	</div>
        	
        	<div class="row">
        		<div class="col">
        			<label for="abonnement.date">date abonnement</label>
        			<form:input path="abonnement.date"/>
        			<form:errors path="abonnement.date"/>
        		</div>
        		<div class="col">
        			<label for="balance">balance abonnement</label>
        			<form:input path="abonnement.balance" />
        			<form:errors path="abonnement.balance"/>
        		</div>
        	</div>
        	<tr>
					<td>type abonnement: </td>
					<td>
					<form:select path="abonnement.type">
					<form:option value="Subscription">Subscription</form:option>
					<form:option value="GSMSSubscription">GSMSSubscription</form:option>
					<form:option value="FixSubscription">FixSubscription</form:option>
					</form:select>
					<form:errors path="abonnement.type" cssClass="errors"/>
					</td>
				</tr>
        	
    
        	
        	<center>
        		<button type="submit">Valider</button>
        	</center>
        
        </form:form>
    </div>

</body>
</html>