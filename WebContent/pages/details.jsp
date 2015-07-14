<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="javax.persistence.* , java.util.* , org.app.model.*" %>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css"/>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css" id="bs-theme-stylesheet"/>
<link rel="stylesheet" href="../css/docs.min.css" />
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
<div> </div>   
   <div  class="panel panel-success ">
   <div class="panel-heading">Details </div>
   <div class="panel-body container-fluid">
		 <%
		     EntityManager em = (EntityManager)request.getServletContext().getAttribute("em");
		     Integer id  = Integer.valueOf(request.getParameter("id"));
		     Rapport rapport  = (Rapport)em.createQuery("select r from Rapport r where r.id =:id").setParameter("id",   id).getSingleResult();
		 %>
		 
		<div class="container bs-docs-container" >
			<div class="bs-docs-section">
				        <h2> <%= rapport.getTitle() %> </h2>   
				 		 <div class="bs-callout bs-callout-info">
				 		   <h2> description </h2> 
					       <p> <%= rapport.getDescription() %>
		                </div>
		                
		                 <div class="bs-callout bs-callout-warning"> 
			                  <h2> commentaire </h2> 
						      <p> <%= rapport.getComment() %>
		                </div>
			 </div> 
		 </div> 
		 

		 
		</div>
    </div>
   
    <a href="afficher.jsp" class="btn btn-primary"> retour </a>
   <div> </div> 
</body>
</html>




