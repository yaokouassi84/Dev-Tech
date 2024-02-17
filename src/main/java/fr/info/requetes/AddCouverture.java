package fr.info.requetes;

import java.io.IOException;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


import org.apache.commons.io.IOUtils;

import fr.info.model.MesImages;



/**
 * Servlet implementation class AddCouverture
 */
@WebServlet("/AddCouverture")
public class AddCouverture extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");
    
	public AddCouverture() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Part filePart = request.getPart("fichier");
		//Part filePart1 = request.getPart("fichier1");

		if (filePart != null) {

			String nomFichier = filePart.getSubmittedFileName();
			//String nomFichier1 = filePart1.getSubmittedFileName();
			//String nomFichier = request.getParameter("fichier"); // Récupérez le nom du
			// fichier
			String typeFichier = request.getParameter("typeFichier"); // Récupérez le type MIME du fichier

			byte[] donneesFichier = IOUtils.toByteArray(filePart.getInputStream());
			//byte[] donneesFichier1 = IOUtils.toByteArray(filePart1.getInputStream());

			MesImages photo = new MesImages();
			photo.setNom(nomFichier);
			//photo.setNom1(nomFichier1);
			photo.setType(typeFichier);
			photo.setDonnees(donneesFichier);
			//photo.setDonnees(donneesFichier1);
			EntityManager em = emf.createEntityManager();
			EntityTransaction tx = em.getTransaction();
			tx.begin();
			em.persist(photo);
			tx.commit();
			em.close();
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
