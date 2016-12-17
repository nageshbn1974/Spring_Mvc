<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>
	<div class="container">
		<h2>Add New User</h2>
		<form:form action="/user" method="post" commandName="user">

			<form:hidden path="id" />
			<fieldset class="form-group">

				<form:label path="firstName">First Name</form:label>
				<form:input path="firstName" type="text" class="form-control"
					required="required" />
				<form:errors path="firstName" cssClass="text-warning" />

				<form:label path="lastName">Last Name</form:label>
				<form:input path="lastName" type="text" class="form-control"
					required="required" />
				<form:errors path="lastName" cssClass="text-warning" />

				<form:label path="userId">User Id</form:label>
				<form:input path="userId" type="text" class="form-control"
					required="required" />
				<form:errors path="userId" cssClass="text-warning" />

				<form:label path="password">Password</form:label>
				<form:input path="password" type="password" class="form-control"
					required="required" />
				<form:errors path="password" cssClass="text-warning" />

				<form:label path="email">Email</form:label>
				<form:input path="email" type="text" class="form-control"
					required="required" />
				<form:errors path="email" cssClass="text-warning" />

				<form:label path="creationDate">Creation Date</form:label>
				<form:input path="creationDate" type="text" class="form-control"
					required="required" />
				<form:errors path="creationDate" cssClass="text-warning" />

				<form:label path="active">Is Active ?</form:label>
				<form:input path="active" type="text" class="form-control"
					required="required" />
				<form:errors path="active" cssClass="text-warning" />

				<%-- 				<form:label path="isActive">Is Active ?</form:label>
				<form:select path="isActive" class="form-control" />
				<form:option value="None" label="--- Select a Status ---" />
				<form:option value="Yes" label="Yes" />
				<form:option value="No" label="No" />
				</form:select>
				<form:errors path="isActive" cssClass="text-warning" /> --%>

			</fieldset>

			<input class="btn btn-success" type="submit" value="Submit">
		</form:form>
	</div>
	<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>