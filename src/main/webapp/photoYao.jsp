<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Ajouter PHOTO</h1>
	<!-- <form action="AddPhotoYao" method="post" enctype="multipart/form-data">
		<label>Nom</label>
		<input type="text" name="nom" id="nom">
		<input type="file" name="photo" id="photo" accept="image/*" required>
		<input type="submit" value="Envoyez">
	
	</form> -->
	
	<form action="EnregistrementPhoto" method="post" enctype="multipart/form-data">
    <label for="nom">Nom:</label>
    <input type="text" id="nom" name="nom" required>
    <br>
    <label for="fichier">Fichier:</label>
    <input type="file" id="fichier" name="fichier" accept="image/*" required>
    <br>
    <button type="submit">Enregistrer</button>
</form>
</body>
</html>