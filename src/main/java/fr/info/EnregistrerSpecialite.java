package fr.info;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import fr.info.model.ImageSpecialite;


@WebServlet("/EnregistrerSpecialite")
@MultipartConfig
public class EnregistrerSpecialite extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");   
   
    public EnregistrerSpecialite() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EntityManager em = emf.createEntityManager();
		EntityTransaction tx = em.getTransaction();
		tx.begin();

		String nom = request.getParameter("nom");
		Part fichierPart = request.getPart("fichier");

		byte[] donnees = fichierPart.getInputStream().readAllBytes();

		ImageSpecialite ims = new ImageSpecialite();
		ims.setNom(nom);
		ims.setDonnees(donnees);

		// Enregistrer la nouvelle photo dans la base de données
		em.persist(ims);
		tx.commit();
		em.close();

		// Rediriger ou afficher un message de succès
		response.sendRedirect(request.getContextPath() + "/index.jsp");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
