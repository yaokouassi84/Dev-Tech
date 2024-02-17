package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import javax.persistence.*;


@Entity
public class PhotoYao implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@Lob
	private byte [] donnees;
	private static final long serialVersionUID = 1L;

	public PhotoYao() {
		super();
	} 
	
	
	public PhotoYao(Long id, String nom, byte[] donnees) {
		super();
		this.id = id;
		this.nom = nom;
		this.donnees = donnees;
	}


	public Long getId() {
		return this.id;
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




	public byte[] getDonnees() {
		return donnees;
	}




	public void setDonnees(byte[] donnees) {
		this.donnees = donnees;
	}


	@Override
	public String toString() {
		return "PhotoYao [id=" + id + ", nom=" + nom + ", donnees=" + Arrays.toString(donnees) + "]";
	}


}
