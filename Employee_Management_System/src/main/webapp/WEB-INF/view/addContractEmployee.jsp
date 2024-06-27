<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="yellow">
<h2>Contract Employee Creation</h2>
<form action="addContractEmployeeData" method="post"  modelAttribute="employeeObj" >
<!-- <pre>
Employee No:                 <input type="text" name="empNo"> <br>
Name:                        <input type="text" name="empName"> <br>
Basic Salary :               <input type="text" name="empSal"> <br>
Department :                 <input type="text" name="empDept"> <br>
Date of Joining(mm-dd-yyyy): <input type="text" name="empJoinDate" > <br>
Date of Birth(mm-dd-yyyy) :  <input type="text" name="empBirthDate"> <br>
Contract Period(In Month):   <input type="text" name="contractPeriod" > <br>
Contractor:                  <input type="text" name="contractor"> <br> -->
<pre>
Employee No:                 <input type="empNO" name="empNO"/> <br>
Name:                        <input type="empName" name="empName"/> <br>
Basic Salary :               <input type="empSal" name="empSal"/> <br>
Department :                 <input type="department" name="department"/> <br>
Date of Joining(mm-dd-yyyy): <input type="dateofJoining" name="dateofJoining" /> <br>
Date of Birth(mm-dd-yyyy) :  <input type="dateofBirth" name="dateofBirth"/> <br>
Contract Period(In Month):   <input type="contractPeriod" name="contractPeriod" /> <br>
Contractor:                  <input type="contractor" name="contractor"/> <br>
<input type="submit" name="Submit">
</pre>
</form>
<h3><a href="showMenu.jsp">Back</a></h3>
</body>
</html>