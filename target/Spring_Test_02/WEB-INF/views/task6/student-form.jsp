<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student Registration Form</title>
</head>

<body>

	<form:form action="processForm"  modelAttribute="student">
	
		First name: <form:input path="firstName" />
		<form:errors path="firstName" cssClass="error"/>
		
		<br><br>
	
		Last name: <form:input path="lastName" />
		<form:errors path="lastName" cssClass="error"/>
		
		<br><br>

		<form:select path="country">
			<form:options items="${student.countryOption}"/>
 		</form:select>

		<br><br>
		<form:radiobutton path="favouriteLanguage" value="Java" /> Java
		<br>
		<form:radiobutton path="favouriteLanguage" value="C++"/> C++
		<br>
		<form:radiobutton path="favouriteLanguage" value="C#"/> C#
		<br>
		<form:radiobutton path="favouriteLanguage" value="Ruby"/> Ruby
		<br>
		<form:radiobutton path="favouriteLanguage" value="Lisp"/> Lisp

		<br><br>
		What operation systems have you been using?
		<br>
		<form:checkbox path="operatingSystems" value="Windows"/> Windows
		<br>
		<form:checkbox path="operatingSystems" value="Linux"/> Linux
		<br>
		<form:checkbox path="operatingSystems" value="Mac OS"/> Mac OS
		<br><br>
	
		<input type="submit" value="Submit" />
	
	</form:form>


</body>

</html>

<%--<form:option value="Brazil" label="Brazil"/>
<form:option value="France" label="France"/>
<form:option value="Russian Federation" label="Russian Federation"/>
<form:option value="Italy" label="Italy"/>
<form:option value="Japan" label="Japan"/>
<form:option value="USA" label="USA"/>
<form:option value="Ukraine" label="Ukraine"/>--%>












