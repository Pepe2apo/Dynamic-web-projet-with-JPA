/**
 * 
 */
package org.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @author akouam
 *
 */
@WebListener
public class InitOrm implements ServletContextListener {

	/**
	 * 
	 */
	public InitOrm() {
	  System.out.println("================================InitOrm=============================================");	
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextDestroyed(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextDestroyed(ServletContextEvent context) {
		
		EntityManagerFactory emf = (EntityManagerFactory) context.getServletContext().getAttribute("emf");
		EntityManager em = (EntityManager) context.getServletContext().getAttribute("em");
		context.getServletContext().removeAttribute("emf");
		em.close();
		emf.close();
		
		System.out.println("================================contextDestroyed=============================================");
	}

	/* (non-Javadoc)
	 * @see javax.servlet.ServletContextListener#contextInitialized(javax.servlet.ServletContextEvent)
	 */
	@Override
	public void contextInitialized(ServletContextEvent context) {
		
		EntityManagerFactory emf=	Persistence.createEntityManagerFactory("primoWebDynamicProjet");
		EntityManager em  = emf.createEntityManager();
		context.getServletContext().setAttribute("emf", emf);
		context.getServletContext().setAttribute("em", em);
		
		
		System.out.println("================================contextInitialized=============================================");
	}

}
