package org.app;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
         //recupere les parametre 
	  System.out.println("dfkldlfdf") ;
		String author = request.getParameter("author");
		   
		String dateString = request.getParameter("date");
		DateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
		Date date = null;
		try {
			date = formatDate.parse(dateString);
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}    

		String title = request.getParameter("title");
		String description = request.getParameter("description");
		String comment = request.getParameter("comment");
		try {

			EntityManager  em = (EntityManager) request.getServletContext().getAttribute("em");
			
			
			try {
				em.getTransaction().begin();
				em.persist(new Rapport(author, date, title, description, comment));
				em.getTransaction().commit();
				//request.getRequestDispatcher("afficher.jsp");
				response.sendRedirect("pages/afficher.jsp");
			} catch (Exception e) {
				e.printStackTrace(response.getWriter());
				em.getTransaction().rollback();
				
			}
		} catch (Exception e) {
			
			e.printStackTrace(response.getWriter());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		
	}

}
