package pfe.gestionDeConges.backen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.gestionDeConges.backen.entities.Conge;

public interface CongeRepository extends JpaRepository<Conge,Long> {

}
