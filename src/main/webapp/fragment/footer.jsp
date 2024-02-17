<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%-- <%@ taglib tagdir="/tags" prefix="mesTags"%> --%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
	<div class="container-fluid bg-primary text-white footer mt-5 pt-5 wow fadeIn" data-wow-delay="0.1s">
            <div class="container py-5 px-lg-5">
                <div class="row gy-5 gx-4 pt-5">                   
                    <div class="col-lg-5 col-md-12">
                        <div class="row gy-5 g-4">
                            <div class="col-md-6">
                                <h5 class="fw-bold text-white mb-4">Qui sommes-nous ?</h5>
                                <a class="btn btn-link" href="">A propos</a>
                                <a class="btn btn-link" href="">Nos Contacts</a>
                                <a class="btn btn-link" href="">Vie Privée</a>                       
                                <a class="btn btn-link" href="">Support</a>
                            </div>
                            <div class="col-md-6">
                                <h5 class="fw-bold text-white mb-4">Nos Services</h5>
                                <a class="btn btn-link" href="">Formations</a>
                                <a class="btn btn-link" href="">Conseils</a>
                                <a class="btn btn-link" href="">Interventions</a>
                                <a class="btn btn-link" href="">Cours à domicile</a>
                                <!-- <a class="btn btn-link" href="">Reseller Hosting</a> -->
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6 col-lg-3">
                        <h5 class="fw-bold text-white mb-4">Adresse</h5>
                        <p class="mb-2"><i class="fa fa-map-marker-alt me-3"></i>Marck, France, Europe</p>
                        <p class="mb-2"><i class="fa fa-phone-alt me-3"></i>+33 7 68 72 37 66</p>
                        <p class="mb-2"><i class="fa fa-envelope me-3"></i>yaobozi@gmx.fr</p>
                        <div class="d-flex pt-2">
                            <!-- <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-twitter"></i></a> -->
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-facebook-f"></i></a>
                            <!-- <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-youtube"></i></a> -->
                            <a class="btn btn-outline-light btn-social" href=""><i class="fab fa-linkedin-in"></i></a>
                        </div>
                    </div>                   
                </div>
            </div>
            <div class="container px-lg-5">
                <div class="copyright">
                    <div class="row">
                        <div class="col-md-6 text-center text-md-start mb-3 mb-md-0">
                            &copy; <a class="border-bottom" href="#">yao-kouassi.info</a>, Tous droits reservés. 
														
							Devéloppé par <a class="border-bottom" href="#">KY</a>
                            </br>
                            Distribué par <a class="border-bottom" href="#" target="_blank">Bozi.France.v1</a>
                        </div>
                        <div class="col-md-6 text-center text-md-end">
                            <!-- <mesTags:footer-menu></mesTags:footer-menu> -->
                            <div class="footer-menu">
                                <a href="<c:url value="Accueil" />">Accueil</a>
                                <a href="<c:url value="Accueil" />">Cookies</a>
                                <a href="<c:url value="Accueil" />">Aide</a>
                                <a href="<c:url value="Accueil" />">FQAs</a>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
</body>
</html>