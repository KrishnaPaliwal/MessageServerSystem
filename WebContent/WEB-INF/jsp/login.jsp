<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login here..</title>

</head>
<body>
<c:if test="${message ne null}">
		<h2>${message}</h2>
	</c:if>
	<h1>Message Server System</h1>
	<hr style="color: red" />
	<br>
	<br>
	<form:form commandName="loginCommand" action="loginForm.action"
		method="post" id="loginForm">


		<table bgcolor="#e5e5e5" align="center" cellpadding="10"
			cellspacing="10">
			<tr>
				<td>UserName</td>
				<td><form:input path="userName" /></td>
			</tr>


			<tr>
				<td>Password</td>
				<td><form:password path="password" /></td>

			</tr>
			<tr>
			<td>Role</td>
			<td> <form:select path="role" items="${roleMap}">
			
			</form:select> </td>
			</tr>
			
			<tr>

				<td colspan="2" align="center"><input type="submit"
					value="login"></td>

			</tr>


		</table>


	</form:form>


</body>
</html>