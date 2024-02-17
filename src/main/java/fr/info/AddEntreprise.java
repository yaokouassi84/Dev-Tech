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
import fr.info.model.Recruteur;

@WebServlet("/recruteur")
public class AddEntreprise extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");

	public AddEntreprise() {
		super();

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		EntityManager em = emf.createEntityManager();

		String nomRecruteur = request.getParameter("nomRecruteur");
		String prenomRecruteur = request.getParameter("prenomRecruteur");
		String email = request.getParameter("email");
		String numeroMobile = request.getParameter("numtel");
		String codePostal = request.getParameter("codePostal");
		String fonction = request.getParameter("fonction");
		String msg = request.getParameter("messageRecruteur");
		String ville = request.getParameter("ville");
		String nomE = request.getParameter("nomEntreprise");
		

		// Valider les champs nomRecruteur, prenomRecruteur, email et numeroMobile
		if (!validateNomPrenom(nomRecruteur) || !validateNomPrenom(prenomRecruteur) || !validateEmail(email)
			|| !validateNumeroMobile(numeroMobile) || !validateCodePostal(codePostal) || !validateMessage(msg) || !validateFonction(fonction) || !validateVille(ville) || !validateNomEntreprise(nomE)) {
			// Si la validation échoue, définir un message d'erreur
			request.setAttribute("errorMessage", "Données du formulaire non valides.");
			// Renvoyer à la JSP
			request.getRequestDispatcher("recruteur-form.jsp").forward(request, response);
			return;
		}

		// Créer une instance de Recruteur
		Recruteur recruteur = new Recruteur();
		recruteur.setNomRecruteur(nomRecruteur);
		recruteur.setPrenomRecruteur(prenomRecruteur);
		recruteur.setEmail(email);
		recruteur.setNumtel(numeroMobile);
		recruteur.setCodePostal(codePostal);
		recruteur.setFonction(fonction);
		recruteur.setMessageRecruteur(msg);
		recruteur.setVille(ville);
		recruteur.setNomEntreprise(nomE);
		recruteur.setDateRecru(new Date());
		recruteur.setHeureRecru(new Date());
		
		String mes = "Votre message a bien été envoyé.";
		try {
			em.getTransaction().begin();
			em.persist(recruteur);
			em.getTransaction().commit();

		} catch (Exception e) {

			if (em.getTransaction().isActive()) {
				em.getTransaction().rollback();
			}

			e.printStackTrace();

			response.sendRedirect(request.getContextPath() + "/erreur.jsp");
			return;
		} finally {

			em.close();
		}

		// Rediriger vers une page de confirmation
		//response.sendRedirect(request.getContextPath() + "index.jsp");
		request.setAttribute("mes", mes);
		request.getRequestDispatcher("recruteur-form.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	private boolean validateNomPrenom(String value) {

		return value != null && !value.isEmpty() && value.matches("^[a-zA-Z]+$");
	}

	private boolean validateEmail(String email) {

		return email != null && email.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}$");
	}

	private boolean validateNumeroMobile(String numeroMobile) {

		return numeroMobile.matches("^(06|07)\\d{8}$");
	}
	
	private boolean validateCodePostal(String codePostal) {
        
        return codePostal != null && codePostal.matches("^[0-9]{5}$");
    }
	 private boolean validateMessage(String msg) {
	        
		 if (msg == null || msg.isEmpty()) {
		        return false;
		    }

		    // La regex autorise les lettres, chiffres, espaces et caractères spéciaux, ainsi que les retours à la ligne
		    return msg.matches("^[a-zA-Z0-9\\s\\p{Punct}]+$");
		
	    }
	 
	 private boolean validateFonction(String fonction) {
	        
	        return fonction != null && !fonction.isEmpty() && fonction.matches("^[a-zA-Z]+$");
	    }
	 private boolean validateVille(String ville) {
	        
	        return ville != null && ! ville.isEmpty() && ville.matches("^[a-zA-Z]+$");
	    }
	 private boolean validateNomEntreprise(String entreprise) {
	        
	        return entreprise != null && ! entreprise.isEmpty() && entreprise.matches("^[a-zA-Z]+$");
	    }
}

