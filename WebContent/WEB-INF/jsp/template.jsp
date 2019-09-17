<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@include file="header.jsp"%>
<%@include file="principalMenu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Template</title>
</head>
<body>

<br><br><br><br><br><br>
	<h1 align="center">Create Template</h1>

	<c:if test="${message ne null}">
		<h2>${message}</h2>
	</c:if>
	<form:form commandName="templateCommand" method="post"
		action="templateForm.action" bgcolor="#e5e5e5" align="center">
		<table bgcolor="#e5e5e5" align="center">
			<tr>
				<td>Catagary</td>
				<td><form:select path="categary" items="${catagariesMap}">
					</form:select></td>
			</tr>
			<tr>
				<td>Description</td>
				<td><form:textarea path="description" /></td>
			</tr>
			<tr></tr><tr></tr>
			<tr>
				<td colspan="2" align="center"><input type="submit"
					value="save"></td>
			</tr>

		</table>

	</form:form>

</body>
</html>