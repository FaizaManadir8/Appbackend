package pfe.gestionDeConges.backen.entities;

import javax.persistence.Entity;

@Entity
public class Agent extends Personne {

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agent(String cin, String nom, String prenom, String mail, String telephone) {
		super(cin, nom, prenom, mail, telephone);
		// TODO Auto-generated constructor stub
	}

}
