<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="principalMenu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Management People</title>
</head>
<body>
	<h1>Create Management People</h1>
</body>


<form:form commandName="managementCommand" method="post"
	action="managementForm.action">

	<table bgcolor="#e5e5e5" align="center">
		<tr>
			<td>FirstName</td>
			<td><form:input path="firstName" /></td>
		</tr>
		<tr>
			<td>LastName</td>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><form:input path="email" /></td>
		</tr>
		<tr>
			<td>Mobile</td>
			<td><form:input path="mobile" /></td>
		</tr>
		<tr>
			<td>DOB</td>
			<td><form:input path="dob" /></td>
		</tr>
		
		<tr>
			<td>Place</td>

			<td><form:input path="place" /></td>

		</tr>
		
		
		<tr>
			<td>Role</td>

			<td><form:input path="role" /></td>

		</tr>
		<tr></tr>
		<tr>
			<td colspan="2" align="center"><input type="submit" value="save"></td>
		</tr>

	</table>
</form:form>
</html>