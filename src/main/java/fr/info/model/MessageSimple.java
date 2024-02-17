package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name="findAllMessagesSimples",query="SELECT ms FROM MessageSimple  ms")
public class MessageSimple implements Serializable {
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	private String email;
	private String messageText;
	
	@Temporal(TemporalType.DATE)
	private Date dateMessage;
	
	@Temporal(TemporalType.TIME)
	private Date heureMessage;
	
	private static final long serialVersionUID = 1L;

	public MessageSimple() {
		super();
	}  
	

	public MessageSimple(Long id, String nom, String prenom, String email, String messageText, Date dateMessage,
			Date heureMessage) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.messageText = messageText;
		this.dateMessage = dateMessage;
		this.heureMessage = heureMessage;
	}


	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}


	public String getPrenom() {
		return prenom;
	}


	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}


	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getMessageText() {
		return messageText;
	}



	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}



	public Date getDateMessage() {
		return dateMessage;
	}



	public void setDateMessage(Date dateMessage) {
		this.dateMessage = dateMessage;
	}



	public Date getHeureMessage() {
		return heureMessage;
	}


	public void setHeureMessage(Date heureMessage) {
		this.heureMessage = heureMessage;
	}


	@Override
	public String toString() {
		return "MessageSimple [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", messageText="
				+ messageText + ", dateMessage=" + dateMessage + ", heureMessage=" + heureMessage + "]";
	}

}
