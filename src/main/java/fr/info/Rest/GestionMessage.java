package fr.info.Rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/Messages")
public class GestionMessage {
	
	@GET
	public String getMessages() {
		
		return "Un message a été envoyé";
	}

}
