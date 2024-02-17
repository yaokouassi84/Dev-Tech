package fr.info;

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
import fr.info.model.Formation;


@WebServlet("/FormationPages")
public class FormationPages extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");     
    
    public FormationPages() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
			EntityManager em = emf.createEntityManager();
			
			List<Formation> fs = em.createNamedQuery("findAllFormations",Formation.class).getResultList();
				request.setAttribute("fs", fs);
				RequestDispatcher rd = request.getRequestDispatcher("formationForm.jsp");
				rd.forward(request, response);
				em.close();

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
