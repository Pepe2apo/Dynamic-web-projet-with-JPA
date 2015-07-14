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

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap-theme.min.css"/>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>

</head>
<body>
<div> </div>   
   <div  class="panel panel-success ">
   <div class="panel-heading">Liste des rapports</div>
   <div class="panel-body container-fluid">
		 <%
		     EntityManager em = (EntityManager)request.getServletContext().getAttribute("em");
		     List<Rapport> list  = em.createQuery("select r from Rapport r").getResultList();
		 %>
		 
		 <div class="container">
			 
			            
			  <table class="table">
			    <thead>
			      <tr>
			        <th>ID</th>
			        <th>Author</th>
			        <th>Title</th>
			        <th></th>
			      </tr>
			    </thead>
			    <tbody>
			        <%
			          for(Rapport r: list) {
			        %>
			          
			          <tr>
			                <td> <%= r.getId() %>  </td>
			                <td> <%= r.getAuthor()%>  </td>
			                <td> <%= r.getTitle() %> </td>
			                 <td> <a href="details.jsp?id=<%= r.getId() %>" class="btn btn-primary"> details </a> </td>
			          </tr>
			       <%}%>
			      
			    </tbody>
			  </table>
			</div>
		</div>
    </div>
   
    <a href="ajout.html" class="btn btn-primary"> Nouveau </a>
   <div> </div> 
</body>
</html>




