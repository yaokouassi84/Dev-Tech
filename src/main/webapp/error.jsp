<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
		<meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
        <title>Page Erreur</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
 <div class="d-flex align-items-center justify-content-center vh-100">
            <div class="text-center">
                <h1 class="display-1 fw-bold">404</h1>
                <p class="fs-3"> <span class="text-danger">Ouuff !!!</span> Page non trouvée.</p>
                <p class="lead">
                    Cette page n'existe pas encore.
                  </p>
                <a href='<c:url value="Accueil"/>' class="btn btn-primary">Allez à l'accueil</a>
            </div>
        </div>
	<%-- <div>Erreur 404</div><div><a href='<c:url value="Accueil"/>'>Retour à l'accueil</a></div> --%>
</body>
</html>