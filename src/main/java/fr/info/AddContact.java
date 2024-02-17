package fr.info;

import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.info.model.Message;



@WebServlet("/contact")
public class AddContact extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");
    public AddContact() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManager em = emf.createEntityManager();
		
		//EntityTransaction tx = em.getTransaction();
		String nom = request.getParameter("nom");
		String email = request.getParameter("email");
		String sujet = request.getParameter("sujet");
		String msg = request.getParameter("msg");
		

		
		if (!validateNom(nom)|| !validateEmail(email)|| !validateSujet(sujet) || !validateMessage(msg)) {
			
			request.setAttribute("errorMessage", "Données du formulaire non valides.");
			
			request.getRequestDispatcher("contact.jsp").forward(request, response);
			return;
		}

		
		Message m = new Message();
		m.setNom(nom);
		m.setEmail(email);
		m.setSujet(sujet);
		m.setMsg(msg);
		m.setDateMessage(new Date());
		m.setHeureMessage(new Date());
		
		
		String mes = "Votre message a bien été envoyé.";
		try {
			em.getTransaction().begin();
			em.persist(m);
			em.getTransaction().commit();

		} catch (Exception e) {

			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}

			e.printStackTrace();

			response.sendRedirect(request.getContextPath() + "erreur.jsp");
			return;
		} finally {

			em.close();
		}

		// Rediriger vers une page de confirmation
		//response.sendRedirect(request.getContextPath() + "index.jsp");
		request.setAttribute("mes", mes);
		request.getRequestDispatcher("contact.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	private boolean validateNom(String value) {

		return value != null && !value.isEmpty() && value.matches("^[a-zA-Z]+$");
	}
	
	private boolean validateEmail(String email) {

		return email != null && email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
	}
	
	private boolean validateSujet(String sujet) {

		return sujet != null && !sujet.isEmpty() && sujet.matches("^[a-zA-Z]+$");
	}
	
	 private boolean validateMessage(String msg) {
	        
		 if (msg == null || msg.isEmpty()) {
		        return false;
		    }

		    // La regex autorise les lettres, chiffres, espaces et caractères spéciaux, ainsi que les retours à la ligne
		    return msg.matches("^[a-zA-Z0-9\\s\\p{Punct}]+$");
		
	    }
	 
	}
