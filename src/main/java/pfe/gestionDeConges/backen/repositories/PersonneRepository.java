package pfe.gestionDeConges.backen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.gestionDeConges.backen.entities.Personne;

public interface PersonneRepository extends JpaRepository<Personne,Long> {
//	public Personne findByCompteId(Long compteID);

//	public Personne findOne(Long id);
}
