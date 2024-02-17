package fr.info.requetes;

import java.io.IOException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.info.Accueil;
import fr.info.model.Message;

/**
 * Servlet implementation class getmessages
 */
@WebServlet("/GetMessages")
public class GetMessages extends HttpServlet {
	private static final long serialVersionUID = 1L;
	//private EntityManagerFactory emf = Persistence.createEntityManagerFactory("DevTech");      
    
    public GetMessages() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//EntityManager em = emf.createEntityManager();
		//List<Message> messages = em.createNamedQuery("findAllMessages",Message.class).getResultList();				
		//if(messages != null) {			
			//request.setAttribute("messages", messages);
			//RequestDispatcher	 rd = request.getRequestDispatcher("listMessages.jsp");
			RequestDispatcher	 rd = request.getRequestDispatcher("erreur404.jsp");
			rd.forward(request, response);
			//rd.forward(request, response);
		//}
		//else {
			//RequestDispatcher	 rd = request.getRequestDispatcher("error.jsp");
			//rd.forward(request, response);
		//}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
