package org.app;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.app.model.Rapport;

/**
 * Servlet implementation class RapportJour
 */
@WebServlet("/RapportJour")
public class RapportJour extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public RapportJour() {
        // TODO Auto-generated constructor stub
    }

	

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			EntityManager  em = (EntityManager) request.getServletContext().getAttribute("em");
			
			response.getWriter()
			.append("Served at: ")
			.append(request.getContextPath())
			.append("  is open "+em.isOpen());
			try {
				em.getTransaction().begin();
				em.persist(new Rapport("kouam", new Date(), "creation d'un projet web jpa", "configuration de tomcat, ....", "pas facile 2 jrs pour le faire"));
				em.getTransaction().commit();
			} catch (Exception e) {
				em.getTransaction().rollback();
				e.printStackTrace();
			}
		} catch (Exception e) {
			
			e.printStackTrace(response.getWriter());
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
	}

}
