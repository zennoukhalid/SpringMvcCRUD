<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="/fskmvc/store" method="post" modelAttribute="clients">
        <form:hidden path="id" />
        <form:hidden path="abonnement.id"/>
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
</body>
</html>