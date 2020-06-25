package org.sid.dao;

import org.sid.entities.Utilisateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UtilisateursRepository extends JpaRepository<Utilisateurs , Integer>{

	@Query("select U from Utilisateurs U where U.nom like :M")
	public Page<Utilisateurs> chercher(@Param("M") String mc , Pageable pageable);
}