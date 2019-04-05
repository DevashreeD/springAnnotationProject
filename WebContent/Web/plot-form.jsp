<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<head>
	<title>Machine information Form</title>
	
	<style>
		.error {color:red}
	</style>
</head>
<body>

<i>Fill out the form. Asterisk (*) means required.</i>
<br><br>

	<form:form action="processing" modelAttribute="machineModel">
	
		Plotter name(*): <form:input path="plotterName" />
		<form:errors path="plotterName" cssClass="error" />
		<br><br>
		
		Cartridge Numbers : <form:input path="cartridgeNo" />
		<form:errors path="cartridgeNo" cssClass="error" />
		
		<br><br>

		Rolls: <form:input path="rolls" />
		<form:errors path="rolls" cssClass="error" />
		
		
		<br><br>
         Machine Id: <form:input path="machineId" />
		<form:errors path="machineId" cssClass="error" />
		
		<br><br>
		<input type="submit" value="Submit" />
				
	</form:form>

</body>

</html>










