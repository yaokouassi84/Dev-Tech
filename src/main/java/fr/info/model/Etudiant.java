package fr.info.model;


import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;

import javax.persistence.*;


@Entity
@Inheritance(strategy=InheritanceType.JOINED)
@NamedQuery(name="findAllEtudiants",query="SELECT e FROM Etudiant e")
public class Etudiant extends Personne implements Serializable {

	private String niveau;
	private static final long serialVersionUID = 1L;

	public Etudiant() {
		super();
	}   
	
	
	public Etudiant(Long id, String nom, String prenom, Date dateNai, boolean sexe, String niveau) {
		super(id, nom, prenom, dateNai, sexe);
		this.niveau = niveau;
	}


	public String getNiveau() {
		return niveau;
	}


	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}


	@Override
	public String toString() {
		return "Etudiant [niveau=" + niveau + "]";
	}
  
}
