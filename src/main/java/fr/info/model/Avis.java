package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;

@Entity
public class Avis implements Serializable {
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomAvis;
	private String prenomAvis;
	private String email;
	private String message;
	
	@Temporal(TemporalType.DATE)
	private Date dateAvis;
		
	private static final long serialVersionUID = 1L;

	public Avis() {
		super();
	} 
	
	
	public Avis(Long id, String nomAvis, String prenomAvis, String email, String message, Date dateAvis) {
		super();
		this.id = id;
		this.nomAvis = nomAvis;
		this.prenomAvis = prenomAvis;
		this.email = email;
		this.message = message;
		this.dateAvis = dateAvis;
		
	}


	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getNomAvis() {
		return this.nomAvis;
	}

	public void setNomAvis(String nomAvis) {
		this.nomAvis = nomAvis;
	}   
	public String getPrenomAvis() {
		return this.prenomAvis;
	}

	public void setPrenomAvis(String prenomAvis) {
		this.prenomAvis = prenomAvis;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public Date getDateAvis() {
		return dateAvis;
	}


	public void setDateAvis(Date dateAvis) {
		this.dateAvis = dateAvis;
	}

	@Override
	public String toString() {
		return "Avis [id=" + id + ", nomAvis=" + nomAvis + ", prenomAvis=" + prenomAvis + ", email=" + email
				+ ", message=" + message + ", dateAvis=" + dateAvis + "]";
	}
   
}
