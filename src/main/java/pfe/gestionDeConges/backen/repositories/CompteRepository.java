package pfe.gestionDeConges.backen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.gestionDeConges.backen.entities.Compte;

public interface CompteRepository extends JpaRepository<Compte,Long> {
	
	public Compte findByLoginAndPassword(String login,String password);


}
