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
<script src="https://code.jquery.com/jquery-1.10.2.js"></script>

<script type="text/javascript">
	$(document).ready(function() {

		
		$("input:radio[name=templateID]").click(function() {
		    var templateid= $(this).val();
		 var list= ${list};
		 
		 $.each(list, function( index, value ) {
				if(templateid==value.tid){
					alert();
					$("#message").text(value.description);
					return false;
				}
			});
		    
		    
		});
	 
		 
		$(function () {
		    $("#selectall").click(function () {
		        $('input[type=checkbox]').prop('checked', $(this).prop('checked'));
		    });
		});
		 
		$("#clear").click(function(){
			$("#message").text('');
		});

	});
	
	
		
</script>




<!-- <SCRIPT language="javascript">
$(function(){
 
    // add multiple select / deselect functionality
    $("#selectall").click(function () {
          $('.case').attr('checked', this.checked);
    });
 
    // if all checkbox are selected, check the selectall checkbox
    // and viceversa
    $(".case").click(function(){
 
        if($(".case").length == $(".case:checked").length) {
            $("#selectall").attr("checked", "checked");
        } else {
            $("#selectall").removeAttr("checked");
        }
 
    });
});
</SCRIPT> -->

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
	<br>
	<br>
	<form:form commandName="sendMessageCommand" method="post"
		action="templateForm.action" bgcolor="#e5e5e5" align="center">
<div style="float:left;height:100px;overflow:auto;">
<h1 style="align:left">choose your Template</h1>
		<table cellpadding="10" cellspacing="10" bgcolor="#e5e5e5" border="1"
			align="left">

			<tr>
				<th>TID</th>
				<th>Catagory</th>
				<th>Description</th>
				
			</tr>

			<c:forEach items="${templateList}" var="template">
				<tr>
					<td><input type="radio" value="${template.tid}" name="templateID"/>${template.tid}</td>
					<td>${template.categary }</td>
					<td>${template.description }</td>
				</tr>
			</c:forEach>

		</table>
</div>
<div style="float:center">
<h1 style="align:right">Select your Recipients</h1>
		<table cellpadding="10" cellspacing="10" bgcolor="#e5e5e5" border="1"
			align="center">
			<tr>
				<th><input type="checkbox" id="selectall"/>FID</th>
				<th>Name</th>
				<th>Mobile</th>
				
			</tr>

			<c:forEach items="${facultyList}" var="faculty">
				<tr>
					<td><form:checkbox path="pageIDS" value="${faculty.fid}" class="case"/>${faculty.fid}</td>
					<td>${faculty.firstName }</td>
					<td>${faculty.mobile }</td>
				</tr>
			</c:forEach>


			<tr align="center">
				<td>Message</td>
				<td colspan="2"><form:textarea path="message"  id="message"/></td>
			</tr>
			<tr>
				<td><input type="submit" value="send"></td>
				<td><input type="button" value="clear" id="clear"></td>
			</tr>
		</table>
</div>
	</form:form>
</body>
</html>