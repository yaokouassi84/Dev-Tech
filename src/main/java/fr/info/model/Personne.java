package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.util.Date;

import javax.persistence.*;

@Entity
public abstract class Personne implements Serializable {
	private static final long serialVersionUID = 1L;
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private String prenom;
	@Temporal(TemporalType.DATE)
	private Date dateNai;
	private boolean sexe;
	
	public Personne() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Personne(Long id, String nom, String prenom, Date dateNai, boolean sexe) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNai = dateNai;
		this.sexe = sexe;
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

	public Date getDateNai() {
		return dateNai;
	}

	public void setDateNai(Date dateNai) {
		this.dateNai = dateNai;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	@Override
	public String toString() {
		return "Personne [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNai=" + dateNai + ", sexe=" + sexe
				+ "]";
	}
	

}
