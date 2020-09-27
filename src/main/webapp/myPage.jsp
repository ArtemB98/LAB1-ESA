<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Employees</title>
</head>
<body>
<table>
    <thead>
    <tr>
        <td>Employee ID</td>
        <td>Name</td>
        <td>Salary</td>
        <td>Department</td>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employeesList}" var="employee">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.salary}</td>
            <td>${employee.departmentByDepartmentId.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>
