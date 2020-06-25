package org.sid.dao;

import org.sid.entities.Direction;
import org.sid.entities.Utilisateurs;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DirectionRepository extends JpaRepository<Direction, Integer>{
	@Query("select D from Direction D where D.nomdirect like:Z")
	public Page<Direction> chercher(@Param("Z")String McD , Pageable pageable);
	
}
