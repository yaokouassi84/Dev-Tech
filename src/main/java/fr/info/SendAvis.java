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
import fr.info.model.Avis;

@WebServlet("/SendAvis")
public class SendAvis extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");    
    
    public SendAvis() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		String nom = request.getParameter("nomAvis");
		String prenom = request.getParameter("prenomAvis"); 
		String email = request.getParameter("email");		
		String message= request.getParameter("message");	
		String msa = "Votre message a bien été envoyé";
		Avis av = new Avis();
			av.setDateAvis(new Date());			
		try {
			
			av.setNomAvis(nom);
			av.setPrenomAvis(prenom);
			av.setEmail(email);
			av.setMessage(message);
			
			
			if(nom.equals("") || prenom.equals("") || email.equals("") || message.equals("")) {
				
				RequestDispatcher	 rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);
								
			}
			 else {
					tx.begin();	
					em.persist(av);
					tx.commit();
					em.close();
					request.setAttribute("msa", msa);					
					RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
					rd.forward(request, response);
				}
				
			
		}catch (Exception e) {
			
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		doGet(request, response);
	}

}
