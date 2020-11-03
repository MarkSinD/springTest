<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>

<head>
	<title>Student Confirmation</title>
</head>

<body>

The student is confirmed: ${student.firstName} ${student.lastName} from ${student.country}.
<br> <br>
Favourite language is ${student.favouriteLanguage}
<br> <br>
Operation systems :

<ul>
	<c:forEach var="temp" items="${student.operatingSystems}">

		<li> ${temp} </li>

	</c:forEach>
</ul>


</body>

</html>







