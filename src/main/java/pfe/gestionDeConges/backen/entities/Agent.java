package pfe.gestionDeConges.backen.entities;

import javax.persistence.Entity;

@Entity
public class Agent extends Personne {

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(String cin, String nom, String prenom, String mail, String telephone ,String matricule, String fonction , String service , String adresse , String grade ,String image) {
		super(cin, nom, prenom, mail, telephone ,matricule ,fonction ,service,adresse,grade, image);
		// TODO Auto-generated constructor stub
	}

}
