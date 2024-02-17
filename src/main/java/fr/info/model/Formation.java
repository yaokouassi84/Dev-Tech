package fr.info.model;

import java.io.Serializable;
import java.lang.Long;
import java.lang.String;
import java.util.Date;
import javax.persistence.*;


@Entity
@NamedQuery(name="findAllFormations",query="SELECT f FROM Formation f")
public class Formation implements Serializable {

	   
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String libelle;
	private int nbHeures;
	
	@Temporal(TemporalType.DATE)
	private Date debutFormation;
	
	@Temporal(TemporalType.DATE)
	private Date finFormation;
	
	@ManyToOne
	InscriptionFormation inscription;
	
	private static final long serialVersionUID = 1L;

	public Formation() {
		super();
	}  
	
	
	
	public Formation(Long id, String libelle, int nbHeures, Date debutFormation, Date finFormation,
			InscriptionFormation inscription) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.nbHeures = nbHeures;
		this.debutFormation = debutFormation;
		this.finFormation = finFormation;
		this.inscription = inscription;
	}



	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}   
	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}   
	public int getNbHeures() {
		return this.nbHeures;
	}

	public void setNbHeures(int nbHeures) {
		this.nbHeures = nbHeures;
	}   
	public Date getDebutFormation() {
		return this.debutFormation;
	}

	public void setDebutFormation(Date debutFormation) {
		this.debutFormation = debutFormation;
	}   
	public Date getFinFormation() {
		return this.finFormation;
	}

	public void setFinFormation(Date finFormation) {
		this.finFormation = finFormation;
	}



	public InscriptionFormation getInscription() {
		return inscription;
	}



	public void setInscription(InscriptionFormation inscription) {
		this.inscription = inscription;
	}



	@Override
	public String toString() {
		return "Formation [id=" + id + ", libelle=" + libelle + ", nbHeures=" + nbHeures + ", debutFormation="
				+ debutFormation + ", finFormation=" + finFormation + ", inscription=" + inscription + "]";
	}
   
}
