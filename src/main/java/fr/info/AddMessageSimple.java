package fr.info;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.model.MessageSimple;

/**
 * Servlet implementation class AddMessageSimple
 */
@WebServlet("/AddMessageSimple")
public class AddMessageSimple extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");     
    
    public AddMessageSimple() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom"); 
		String email = request.getParameter("email");		
		String messageText = request.getParameter("messageText");
				
		MessageSimple msp = new MessageSimple();	
		
		try {
			
			msp.setNom(nom);
			msp.setPrenom(prenom);
			msp.setEmail(email);	
			msp.setMessageText(messageText);
			msp.setDateMessage(new Date());
			msp.setHeureMessage(new Date());
			
			if(nom.equals("") || email.equals("") || messageText.equals("")) {
				
				RequestDispatcher	 rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
								
			}
			 else {
					tx.begin();	
					em.persist(msp);
					tx.commit();
					em.close();
										
					RequestDispatcher rd = request.getRequestDispatcher("informations2.jsp");
					rd.forward(request, response);
				}
				
			
		}catch (Exception e) {
			
		}
		
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
