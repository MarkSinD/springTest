<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.10.2020
  Time: 14:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Phone card</title>
</head>
<body>

<form:form action="processForm" modelAttribute="phone">

    Name : <form:input path="name" />
    <br><br>
    Number : <form:input path="number"/>
    <br><br>
    Model : <form:input path="model"/>
    <br><br>
    Serial number : <form:input path="serialNumber"/>
    <br><br>
    Buttery level : <form:input path="butteryLevel"/>
    <br><br>
    Battery capacity : <form:input path="batteryCapacity"/>
    <br><br>
    <input type="submit" value="Submit" />

</form:form>


</body>
</html>
