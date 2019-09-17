<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@include file="header.jsp"%>
    <%@include file="adminMenu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:if test="${message ne null}">
		<h2>${message}</h2>
	</c:if>
<br><br><br><br><br><br>
<h1>Create Organization</h1>
<hr/>
<br>
<form:form commandName="organizationCommand" method="post"
		action="organizationForm.action">

		<table bgcolor="#e5e5e5" align="center">
			<tr>
				<td>OrganizationName</td>
				<td><form:input path="orgName" /></td>
			</tr>
			<tr>
				<td>Telephone</td>
				<td><form:input path="telphone" /></td>
			</tr>
			<tr>
				<td>Motto</td>
				<td><form:input path="motto" /></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:input path="description" /></td>
			</tr>
			<tr>
				<td>AddressLine1</td>
				<td><form:input path="addressLine1" /></td>
			</tr>
			<tr>
				<td>AddressLine2</td>
				<td><form:input path="addressLine2" /></td>
			</tr>
			<tr>
				<td>City</td>
				<td><form:input path="city" /></td>
			</tr>
			<tr>
				<td>Postcode</td>
				<td><form:input path="postcode" /></td>
			</tr>
			<tr>

				<td colspan="2" align="center"><input type="submit"
					value="save"></td>


			</tr>

</form:form>

</body>
</html>
