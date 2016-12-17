<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users List</title>

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">

</head>
<body>

	<div class="container">

		Hi ${name} <BR />

		<table class="table table-striped">
			<caption>Users</caption>
			<thead>
				<tr>
					<th>Id</th>
					<th>First Name</th>
					<th>Last Name</th>
					<th>User Id</th>
					<th>Password</th>
					<th>Email</th>
					<th>Creation Date</th>
					<th>Active</th>
					<th>User Actions</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${users}" var="user">
					<tr>
						<td>${user.id}</td>
						<td>${user.firstName}</td>
						<td>${user.lastName}</td>
						<td>${user.userId}</td>
						<td>${user.password}</td>
						<td>${user.email}</td>
						<td><fmt:formatDate pattern="dd/MM/yyyy"
								value="${user.creationDate}" /></td>
						<td>${user.active}</td>
						<td><a class="btn btn-primary"
							href="/update-user?id=${user.id}">Update</a> <a
							class="btn btn-danger" href="/delete-user?id=${user.id}">Delete</a>
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

		<div>
			<BR /> <a class="btn btn-success" href="/user">Add</a>
		</div>

	</div>
	<script src="webjars/jquery/2.2.4/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>

</html>