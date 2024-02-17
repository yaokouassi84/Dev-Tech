package fr.info.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
public class Recruteur implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nomRecruteur;

	private String prenomRecruteur;

	private String nomEntreprise;

	private String email;

	private String codePostal;

	private String ville;

	private String numtel;

	private String fonction;

	private String messageRecruteur;

	@Temporal(TemporalType.DATE)
	private Date dateRecru;
	@Temporal(TemporalType.TIME)
	private Date heureRecru;

	public Recruteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Recruteur(Long id, String nomRecruteur, String prenomRecruteur, String nomEntreprise, String email,
			String codePostal, String ville, String numtel, String fonction, String messageRecruteur, Date dateRecru,
			Date heureRecru) {
		super();
		this.id = id;
		this.nomRecruteur = nomRecruteur;
		this.prenomRecruteur = prenomRecruteur;
		this.nomEntreprise = nomEntreprise;
		this.email = email;
		this.codePostal = codePostal;
		this.ville = ville;
		this.numtel = numtel;
		this.fonction = fonction;
		this.messageRecruteur = messageRecruteur;
		this.dateRecru = dateRecru;
		this.heureRecru = heureRecru;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomRecruteur() {
		return nomRecruteur;
	}

	public void setNomRecruteur(String nomRecruteur) {
		this.nomRecruteur = nomRecruteur;
	}

	public String getPrenomRecruteur() {
		return prenomRecruteur;
	}

	public void setPrenomRecruteur(String prenomRecruteur) {
		this.prenomRecruteur = prenomRecruteur;
	}

	public String getNomEntreprise() {
		return nomEntreprise;
	}

	public void setNomEntreprise(String nomEntreprise) {
		this.nomEntreprise = nomEntreprise;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getNumtel() {
		return numtel;
	}

	public void setNumtel(String numtel) {
		this.numtel = numtel;
	}

	public Date getDateRecru() {
		return dateRecru;
	}

	public void setDateRecru(Date dateRecru) {
		this.dateRecru = dateRecru;
	}

	public Date getHeureRecru() {
		return heureRecru;
	}

	public void setHeureRecru(Date heureRecru) {
		this.heureRecru = heureRecru;
	}

	public String getFonction() {
		return fonction;
	}

	public void setFonction(String fonction) {
		this.fonction = fonction;
	}

	public String getMessageRecruteur() {
		return messageRecruteur;
	}

	public void setMessageRecruteur(String messageRecruteur) {
		this.messageRecruteur = messageRecruteur;
	}

	@Override
	public String toString() {
		return "Recruteur [id=" + id + ", nomRecruteur=" + nomRecruteur + ", prenomRecruteur=" + prenomRecruteur
				+ ", nomEntreprise=" + nomEntreprise + ", email=" + email + ", codePostal=" + codePostal + ", ville="
				+ ville + ", numtel=" + numtel + ", fonction=" + fonction + ", messageRecruteur=" + messageRecruteur
				+ ", dateRecru=" + dateRecru + ", heureRecru=" + heureRecru + "]";
	}

}
