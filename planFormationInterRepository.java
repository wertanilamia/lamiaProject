package org.sid.dao;

import org.sid.entities.planFormationInter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface planFormationInterRepository extends JpaRepository<planFormationInter, Integer> {
	//@Query("select f.nom, f.prenom from FicheBesoins f where f.typeformation ")

}
