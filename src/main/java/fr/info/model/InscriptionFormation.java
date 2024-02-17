package fr.info.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Entity
//@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name="findAllInscriptions",query="SELECT i FROM InscriptionFormation i ")
public class InscriptionFormation implements Serializable{

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	private String nom;
	
	@NotBlank
	private String prenom;
	
	@NotBlank
	private String ville;
	@NotBlank
	private String pays;
	
	@NotBlank
	private String niveauEtude;
	
	@Email
	private String email;
	
	@NotBlank
	private String messageFormation;
	
	@Temporal(TemporalType.DATE)
	private Date dateInscrit;
	@Temporal(TemporalType.TIME)
	private Date HeureInscri;
	
	
	public InscriptionFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InscriptionFormation(Long id, String nom, String prenom, String ville, String pays, String niveauEtude,
			String email, String messageFormation, Date dateInscrit, Date heureInscri) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.ville = ville;
		this.pays = pays;
		this.niveauEtude = niveauEtude;
		this.email = email;
		this.messageFormation = messageFormation;
		this.dateInscrit = dateInscrit;
		HeureInscri = heureInscri;
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

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getNiveauEtude() {
		return niveauEtude;
	}

	public void setNiveauEtude(String niveauEtude) {
		this.niveauEtude = niveauEtude;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessageFormation() {
		return messageFormation;
	}

	public void setMessageFormation(String messageFormation) {
		this.messageFormation = messageFormation;
	}

	public Date getDateInscrit() {
		return dateInscrit;
	}

	public void setDateInscrit(Date dateInscrit) {
		this.dateInscrit = dateInscrit;
	}

	public Date getHeureInscri() {
		return HeureInscri;
	}

	public void setHeureInscri(Date heureInscri) {
		HeureInscri = heureInscri;
	}

	@Override
	public String toString() {
		return "InscriptionFormation [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", ville=" + ville + ", pays="
				+ pays + ", niveauEtude=" + niveauEtude + ", email=" + email + ", messageFormation=" + messageFormation
				+ ", dateInscrit=" + dateInscrit + ", HeureInscri=" + HeureInscri + "]";
	}


}
