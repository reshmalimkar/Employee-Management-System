<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">

<h1>${msg}</h1>
	<h2>Welcome To Employee Management System</h2>
	
	<!-- <a href="addPermanentEmployee.jsp">Create Permanent Employee</a> --> 
	<a href="addPermanentEmployee">Create Permanent Employee</a>  <br>
	
	<a href=" addContractEmployee">Create Contract Employee</a> <br> 
	<a href="searchEmployee">Search Employee</a> <br>
	<a href="updateSal">Update Salary</a> <br>
	<a href="updateDeptMentDet">Update Department</a> <br>
	<a href="deleteEmp"> Delete Employee </a><br>
	
	<br>
	<a href="/logout">Logout</a>
</body>
</html>