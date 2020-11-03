<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 07.10.2020
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Form</title>

    <style>
        .error{color:red}
    </style>
</head>
<body>
<%--Here, look here--%>
<form:form action="showInfo" modelAttribute="customer">
    First name : <form:input path="firstName" />
    <form:errors path="firstName" cssClass="error"/>
    <br><br>

    Second name : <form:input path="lastName" />
    <form:errors path="lastName" cssClass="error"/>
    <br><br>

    Free passes : <form:input path="freePasses"/>
    <form:errors path="freePasses" cssClass="error"/>
    <br><br>

    Postal code : <form:input path="postalCode"/>
    <form:errors path="postalCode" cssClass="error"/>
    <br><br>

    <input type="submit" value="Submit" />
</form:form>

</body>
</html>
