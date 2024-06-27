<%@page import="java.awt.geom.Path2D"%>
<%@ page import="com.ajspire.mode.Employee"%>
<%@ page import="com.ajspire.mode.ContractEmployee"%>
<%@ page import="com.ajspire.mode.PermanentEmployee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>showEmployee</title>
</head>
<body>
	<h2>Showing employee details</h2>

	<%-- <h3>Name:${requestScope.FoundEmployee.empName}</h3>
	<h3>Gross Salary Rs.:${requestScope.FoundEmployee.empSal}</h3>
	<h3>Department: ${requestScope.FoundEmployee.department}</h3>
	<h3>Joining Date: ${requestScope.FoundEmployee.dateofJoining }</h3>
	<h3>Birth Date: ${requestScope.FoundEmployee.dateofBirth }</h3>  --%>

	<hr size="4" color="gray" />
	<table border="solid 2x">
		<tr>
			<th>Employee No</th>
			<th>Employee name</th>
			<th>Department</th>
			<th>Joining Date</th>
			<th>Birth Date</th>
			<th>Salary</th>
		</tr>
		<tr>
			<th>${employee.empNO}</th>
			<th>${employee.empName}</th>
			<th>${employee.department}</th>
			<th>${employee.dateofJoining}</th>
			<th>${employee.dateofBirth}</th>
			<th>${employee.empSal}</th>
		</tr>
	</table>
	<h3>
		<a href="http://localhost:9191/showListMenu">Main Page</a>
	</h3>
</body>
</html>