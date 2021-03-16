<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/css/bootstrap.min.css" rel="stylesheet" >
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta2/dist/js/bootstrap.bundle.min.js"  ></script>
</head>
<body class="container">

<h1> Employee Data</h1> <hr/>

<table class="table table-hover">
<thead>
	<tr>
		<th>SNO</th>
		<th>Employee ID</th>
		<th>Employee Name</th>
		<th>Salary</th>
		<th>Date of Join</th>
	</tr>
</thead>


<tbody>

<c:forEach items="${employees}" var="emp" varStatus="rc">
	<tr>
		<td>${rc.count}</td>
		<td>${emp.empId}</td>
		<td>${emp.empName}</td>
		<td>${emp.salary}</td>
		<td>${emp.doj}</td>
	</tr>
</c:forEach>
</tbody>

</table>


</body>
</html>