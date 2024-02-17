package fr.info;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.model.PhotoYao;


@WebServlet("/AffichagePhotos")
public class AffichagePhotos extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");   
    
    public AffichagePhotos() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();
		
		List<PhotoYao> listePhotos = em.createQuery("SELECT p FROM PhotoYao p", PhotoYao.class).getResultList();
        
       
        request.setAttribute("listePhotos", listePhotos);
      
        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/affichagePhotos.jsp");
        dispatcher.forward(request, response);
    
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
