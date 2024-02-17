/*package fr.info.controleur;

import java.util.ArrayList;

import javax.annotation.ManagedBean;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import fr.info.ejbs.EtudiantEJB;
import fr.info.model.Etudiant;

@ManagedBean
@RequestScoped
public class EtudiantControleur {

	@EJB
	private EtudiantEJB etuEJB;
	private Etudiant etu = new Etudiant();
	private ArrayList<Etudiant> Eetudiants = new ArrayList<Etudiant>();
	
	public String formCreate() {
		return "formulaire.jsp";
	}
	
	public String createEtu(){
		etu = etuEJB.createEtudiant(etu);
		Eetudiants = (ArrayList<Etudiant>) etuEJB.findEtudants();
		return "list.jsp";
	}
}
*/