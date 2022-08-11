<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import = "java.io.*,java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Country GDP</title>
</head>
<body>

	<h3>COUNTRY GDP</h3>
	
	<table>
		<tr>
			<th>Country</th>
			<th>GDP</th>
		</tr>
		<c:forEach items = "${countries}" var = "country">
		<tr>
		<%String regex = "^[*]$"; %>
			<td>${country.country.replace("regex", "")}</td>
			<td>${country.gdp}</td>
		</tr>
		</c:forEach>
	</table>

</body>
</html>