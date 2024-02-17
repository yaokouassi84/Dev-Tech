<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="votre_action.jsp" method="post">
        <label for="fichier">Sélectionnez un fichier :</label>
        <select name="fichier" id="fichier">
            <c:forEach var="fichierOption" items="${fs}">
                        <option value="${fichierOption}">${fichierOption.libelle}</option>
            </c:forEach>
        </select>
        <input type="submit" value="Soumettre">
    </form>
</body>
</html>