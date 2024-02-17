package fr.info.model;

import java.io.Serializable;
import java.util.Arrays;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class ImageSpecialite implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nom;
	
	@Lob
	private byte [] donnees;
	private static final long serialVersionUID = 1L;
	
	
	
	public ImageSpecialite() {
		super();
		// TODO Auto-generated constructor stub
	}



	public ImageSpecialite(Long id, String nom, byte[] donnees) {
		super();
		this.id = id;
		this.nom = nom;
		this.donnees = donnees;
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



	public byte[] getDonnees() {
		return donnees;
	}



	public void setDonnees(byte[] donnees) {
		this.donnees = donnees;
	}



	@Override
	public String toString() {
		return "ImageSpecialite [id=" + id + ", nom=" + nom + ", donnees=" + Arrays.toString(donnees) + "]";
	}
	
	
}
