package pfe.gestionDeConges.backen.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import pfe.gestionDeConges.backen.entities.Decision;

public interface DecisionRepository extends JpaRepository<Decision,Long> {

}

