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

import fr.info.model.InscriptionFormation;


/**
 * Servlet implementation class Inscription
 */
@WebServlet({ "/Inscription", "/JeMeForme" })
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");   


    public Inscription() {
        super();


    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();

		EntityTransaction tx = em.getTransaction();
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String pays = request.getParameter("pays");
		String ville = request.getParameter("ville");
		String email = request.getParameter("email");
		String niveauEtude = request.getParameter("niveauEtude");
		String messageFormation = request.getParameter("messageFormation");

		InscriptionFormation ifor = new InscriptionFormation();
		try {
			
			ifor.setNom(nom);
			ifor.setPrenom(prenom);
			ifor.setPays(pays);
			ifor.setVille(ville);			
			ifor.setNiveauEtude(niveauEtude);
			ifor.setEmail(email);
			ifor.setMessageFormation(messageFormation);			
			ifor.setDateInscrit(new Date());
			ifor.setHeureInscri(new Date());
			String msg = "Votre message a bien été envoyé";
			request.setAttribute("msg", msg);
			
			if (nom.equals("") || email.equals("") || pays.equals("") || ville.equals("") || email.equals("") || niveauEtude.equals("") ||messageFormation.equals("")) {

				RequestDispatcher rd = request.getRequestDispatcher("error.jsp");
				rd.forward(request, response);

			} else {
				tx.begin();
				em.persist(ifor);
				tx.commit();
				em.close();
				RequestDispatcher rd = request.getRequestDispatcher("inscription.jsp");
				rd.forward(request, response);
			}

		} catch (Exception e) {
			e.printStackTrace();
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
