<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	 <nav class="navbar navbar-expand-lg navbar-light px-4 px-lg-5 py-3 py-lg-0">
                <a href="" class="navbar-brand p-0">
                    <h1 class="m-0"><i class="fa fa-server me-3"></i>DEV-TECH</h1>
                    <!-- <img src="img/logo.png" alt="Logo"> -->
                </a>
                <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarCollapse">
                    <span class="fa fa-bars"></span>
                </button>
                <div class="collapse navbar-collapse" id="navbarCollapse">
                    <div class="navbar-nav ms-auto py-0">
                        <a href='<c:url value="Accueil" />' class="nav-item nav-link active">Accueil</a>
                        <a href="<c:url value="About" />" class="nav-item nav-link">A propos</a>
                        <div class="nav-item dropdown">
                            <a href="<c:url value="Service" />" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Services</a>
                            <div class="dropdown-menu m-0">
                                <a href="<c:url value="Equipe" />" class="dropdown-item">Notre équipe</a>
                                <!-- <a href="testimonial.html" class="dropdown-item">Testimonial</a> -->
                                <a href="<c:url value="NosFormateurs" />" class="dropdown-item">Nos formateurs</a>
                                <%-- <a href="<c:url value="ListEtudiants" />" class="dropdown-item">Etudiants</a> --%>
                            </div>
                        </div>
                        <a href="<c:url value="/recruteur-form" />" class="nav-item nav-link">Entreprises</a>
                        <%-- <a href="<c:url value="Informations" />" class="nav-item nav-link">Informations</a> --%>
                        <div class="nav-item dropdown">
                            <a href="#" class="nav-link dropdown-toggle" data-bs-toggle="dropdown">Autres</a>
                            <div class="dropdown-menu m-0">
                            	<%-- <a href="<c:url value="MesEtudiants" />" class="dropdown-item">Etudiants</a> --%>
                                <a href="<c:url value="PageLivres" />" class="dropdown-item">Mes Livres</a>
                                <a href="<c:url value="Avis" />" class="dropdown-item">Avis</a>
                        
                                <a href="<c:url value="Autre" />" class="dropdown-item">Autres</a>
                                <%-- <a href="<c:url value="PhotoYaoForm" />" class="dropdown-item">Ajouter Photo YAO</a>
                                 <a href="<c:url value="ImageSpecForm" />" class="dropdown-item">Ajouter Images Specialites</a> --%>
                            </div>
                        </div>
                        <a href="<c:url value="/contact-form" />" class="nav-item nav-link">Contact</a>
                    </div>
                    <butaton type="button" class="btn text-secondary ms-3" data-bs-toggle="modal" data-bs-target="#searchModal"><i class="fa fa-search"></i></butaton>
                    <a href="<c:url value="InscriptionForm" />" class="btn btn-secondary py-2 px-4 ms-3">S'inscrire</a>
                </div>
            </nav>
</body>
</html>