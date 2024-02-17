<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>QUELQUES AVIS DE NOS APPRENANTS</title>
</head>
<body>
	<c:forEach items="${messages}" var="me">
	<p>${me.nom} ${me.sujet} ${me.email}</p>		
	</c:forEach>
</body>
</html>