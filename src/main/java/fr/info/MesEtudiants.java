package fr.info;

import java.io.IOException;
import java.util.Date;
import java.util.List;

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


@WebServlet({ "/MesEtudiants", "/QuelquesEtudiants" })
public class MesEtudiants extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");      
   
    public MesEtudiants() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			EntityManager em = emf.createEntityManager();
			
			List<InscriptionFormation> ins = em.createNamedQuery("findAllInscriptions",InscriptionFormation.class).getResultList();
				request.setAttribute("ins", ins);
				RequestDispatcher rd = request.getRequestDispatcher("mesEtudiantsListe.jsp");
				rd.forward(request, response);
				em.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
