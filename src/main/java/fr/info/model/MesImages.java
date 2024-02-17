package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.util.Arrays;

import javax.persistence.*;


@Entity
public class MesImages implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private String nom;
	private String nom1;
	private String type;
	
	@Lob
    private byte[] donnees;
	public MesImages() {
		super();
	}
	public MesImages(Long id, String nom, String nom1, String type, byte[] donnees) {
		super();
		this.id = id;
		this.nom = nom;
		this.nom1 = nom1;
		this.type = type;
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
	public String getNom1() {
		return nom1;
	}
	public void setNom1(String nom1) {
		this.nom1 = nom1;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public byte[] getDonnees() {
		return donnees;
	}
	public void setDonnees(byte[] donnees) {
		this.donnees = donnees;
	}
	@Override
	public String toString() {
		return "MesImages [id=" + id + ", nom=" + nom + ", nom1=" + nom1 + ", type=" + type + ", donnees="
				+ Arrays.toString(donnees) + "]";
	}

}
