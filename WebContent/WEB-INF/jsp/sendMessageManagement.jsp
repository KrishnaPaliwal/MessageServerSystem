<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Send Message...</title>
</head>
<body>
	<h1 align="center">Send Message...</h1>
	<c:if test="${message ne null}">
		<h2>${message}</h2>
	</c:if>
	<h1>Send Message To Recipients..</h1>
	<hr>
	<br>
	<span><a href="facultyListFom.action"> 1.Faculties List</a></span>
	<span><a href="managementListFom.action">2.Management List</a></span>
	<br><br>
	<form:form commandName="sendMessageCommand" method="post"
		action="templateForm.action" bgcolor="#e5e5e5" align="center">

		<form:select path="template" items="${catagariesMap}">
		</form:select>

		<table cellpadding="10" cellspacing="10" bgcolor="#e5e5e5" border="1"  align="center">
			<tr>
				<th>FID</th>
				<th>Name</th>
				<th>Mobile</th>

			</tr>
			
				<c:forEach items="${managementList}" var="management">
				<tr>
					<td><form:checkbox path="pageIDS"  value="${management.mgmtId}"/>${management.mgmtId}</td>
					<td>${management.firstName }</td>
					<td>${management.mobile }</td>
					</tr>
				</c:forEach>
			

		<tr>
			<td >Message</td>
			<td colspan="2"><form:textarea path="message" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="send"></td><td><input type="button" value="clear"></td>
		</tr>
		</table>

	</form:form>
</body>
</html>