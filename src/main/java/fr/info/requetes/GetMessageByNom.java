package fr.info.requetes;

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

import fr.info.model.Message;

/**
 * Servlet implementation class GetMessageByNom
 */
@WebServlet("/GetMessageByNom")
public class GetMessageByNom extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");      
    /**   
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMessageByNom() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		EntityManager em = emf.createEntityManager();
		String sujet = request.getParameter("sujet");
		List<Message> messages = em.createNamedQuery("findBySujet",Message.class)
				.setParameter("sujet", sujet)
				.getResultList();
		if(messages != null) {			
			request.setAttribute("messages", messages);
			System.out.println("Message ok");
			RequestDispatcher	 rd = request.getRequestDispatcher("listMessages.jsp");
			rd.forward(request, response);
		}
		else {
			RequestDispatcher	 rd = request.getRequestDispatcher("error.jsp");
			rd.forward(request, response);
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
