<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="principalMenu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Faculty</title>
</head>
<body>
	<h1>Create Faculty</h1>
	<br>
	<h1 align="center">Faculty Creation Form</h1>
	<c:if test="${message ne null}">
		<h2>${message}</h2>
	</c:if>
	<form:form commandName="facultyCommand" method="post"
		action="facultyForm.action">

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
			<tr>
				<td>UserName</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:input path="password" /></td>
			</tr>
			<tr>
				<td>ConfirmPassword</td>
				<td><form:input path="confirmPassword" /></td>
			</tr>
			<tr>
				<td>classTeacherFor</td>
				<td><form:select path="classTeacherFor" items="${standardMap}">
					</form:select></td>
			</tr>
			<tr></tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="save"></td>
			</tr>

		</table>
	</form:form>
</body>
</html>