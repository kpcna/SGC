<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
    <title>SGC - Syst&egrave;me de gestion des cours</title>
	<meta http-equiv="content-type" content="text/html; charset=utf-8" />
	<!-- Latest compiled and minified CSS -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap.min.css"/>

	<!-- Optional theme -->
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.1/css/bootstrap-theme.min.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/cytoscapejs/style.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/justified-nav.css" />
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/jquery/jstree_dist/themes/default/style.min.css" />
	<script src="http://ajax.googleapis.com/ajax/libs/jquery/1/jquery.min.js"></script>
  	<script src="http://cytoscape.github.io/cytoscape.js/api/cytoscape.js-latest/cytoscape.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/cytoscapejs/code.js"></script> 
</head>
<body>
	
	    <div class="container">

      <div class="masthead">
        <h3 class="text-muted">SGC - Syst&egrave;me de gestion des cours</h3>
        <div role="navigation">
          <ul class="nav nav-justified">
            <li class="active"><a href="/">Accueil</a></li>
            <li><a href="/cours">Cours</a></li>
            <li><a href="/dossier">Dossier</a></li>
            <li><a href="/notes">Notes</a></li>
            <li><a href="/inscription">Inscription</a></li>
          </ul>
        </div>
      </div>
      <!-- Placed at the end of the document so the pages load faster -->
      <script src="${pageContext.request.contextPath}/resources/jquery/jstree_dist/jstree.min.js"></script>   
	  <div class="maincontent">
	  
	  <!-- Stack the columns on mobile by making one full-width and the other half-width -->
	  <div class="row">	   
	    <form:form class="navbar-form navbar-right" action="/logout" method="post">
         <div class="form-group">
            <button type="submit" class="btn btn-success">Sign Out</button>
            </div>
        </form:form> 
        Bienvenue, ${pageContext.request.remoteUser}