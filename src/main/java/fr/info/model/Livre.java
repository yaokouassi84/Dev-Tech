package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Arrays;
import java.util.Date;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Livre
 *
 */
@Entity
@NamedQuery(name="findAllLivres",query="SELECT l FROM Livre l")
public class Livre implements Serializable {
	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titre;
	private String description;
	
	@Lob
	private byte [] photo;
	
	@Lob
	private byte [] photo1;
	
	private int nbPages;
	private Date anneeParution;
	private static final long serialVersionUID = 1L;

	public Livre() {
		super();
	}

	public Livre(Long id, String titre, String description, byte[] photo, byte[] photo1, int nbPages,
			Date anneeParution) {
		super();
		this.id = id;
		this.titre = titre;
		this.description = description;
		this.photo = photo;
		this.photo1 = photo1;
		this.nbPages = nbPages;
		this.anneeParution = anneeParution;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	public byte[] getPhoto1() {
		return photo1;
	}

	public void setPhoto1(byte[] photo1) {
		this.photo1 = photo1;
	}

	public int getNbPages() {
		return nbPages;
	}

	public void setNbPages(int nbPages) {
		this.nbPages = nbPages;
	}

	public Date getAnneeParution() {
		return anneeParution;
	}

	public void setAnneeParution(Date anneeParution) {
		this.anneeParution = anneeParution;
	}

	@Override
	public String toString() {
		return "Livre [id=" + id + ", titre=" + titre + ", description=" + description + ", photo="
				+ Arrays.toString(photo) + ", photo1=" + Arrays.toString(photo1) + ", nbPages=" + nbPages
				+ ", anneeParution=" + anneeParution + "]";
	}
	
}
