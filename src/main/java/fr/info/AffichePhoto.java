package fr.info;

import java.io.IOException;
import java.io.OutputStream;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import fr.info.model.PhotoYao;



@WebServlet("/AffichePhoto")
public class AffichePhoto extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");
	 
	 
    public AffichePhoto() {
        super();
       
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//EntityManager em = emf.createEntityManager(); 	
        String photoId = request.getParameter("photoId");

        if (photoId != null) {
            try {
                Long id = Long.parseLong(photoId);

                // Récupérer les données binaires de la photo
                AffichePhoto af = new AffichePhoto();
                byte[] photoData = af.getPhotoDataById(id);
                
                if (photoData != null) {
                    // Configurer la réponse pour envoyer des données binaires
                    response.setContentType("image/*"); // Assurez-vous d'utiliser le type de contenu approprié

                    // Envoyer les données binaires de la photo en réponse
                    try (OutputStream out = response.getOutputStream()) {
                        out.write(photoData);
                    }
                } else {
                    response.getWriter().println("Photo non trouvée.");
                }
            } catch (NumberFormatException e) {
                response.getWriter().println("ID de la photo invalide.");
            }
        } else {
            response.getWriter().println("ID de la photo manquant.");
        }
    }
		
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	
	public byte[] getPhotoDataById(Long id) {
		EntityManager em = emf.createEntityManager(); 
        PhotoYao photo = em.find(PhotoYao.class, id);
        return (photo != null) ? photo.getDonnees() : null;
    }
}
