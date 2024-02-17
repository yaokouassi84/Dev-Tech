package fr.info.mesLivres;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.model.ImageSpecialite;


@WebServlet("/PageLivres")
public class PageLivres extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");   
    
    public PageLivres() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();

		List<ImageSpecialite> listePhotos = em.createQuery("SELECT p FROM ImageSpecialite p", ImageSpecialite.class).getResultList();

		request.setAttribute("listePhotos", listePhotos);

		/*
		 * RequestDispatcher dispatcher =
		 * request.getRequestDispatcher("WEB-INF/affichageSpecialites.jsp");
		 * dispatcher.forward(request, response);
		 */
		RequestDispatcher	 rd = request.getRequestDispatcher("mesLivres.jsp");
		rd.forward(request, response);
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
