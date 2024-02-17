package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
@NamedQuery(name="findAllMessages",query="SELECT m FROM Message m")
@NamedQuery(name="findBySujet",query="SELECT m FROM Message m WHERE m.sujet = :sujet")
public class Message implements Serializable {
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String email;
	private String sujet;
	private String msg;
	@Temporal(TemporalType.DATE)
	private Date dateMessage;
	
	@Temporal(TemporalType.TIME)
	private Date heureMessage;
	
	private static final long serialVersionUID = 1L;

	public Message() {
		super();
	} 
	
	

	public Message(Long id, String nom, String email, String sujet, String msg, Date dateMessage, Date heureMessage) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.sujet = sujet;
		this.msg = msg;
		this.dateMessage = dateMessage;
		this.heureMessage = heureMessage;
	}



	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNom() {
		return this.nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}   
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}   
	public String getSujet() {
		return this.sujet;
	}

	public void setSujet(String sujet) {
		this.sujet = sujet;
	}   
	public String getMsg() {
		return this.msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
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
		return "Message [id=" + id + ", nom=" + nom + ", email=" + email + ", sujet=" + sujet + ", msg=" + msg
				+ ", dateMessage=" + dateMessage + ", heureMessage=" + heureMessage + "]";
	}

}
