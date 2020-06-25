package org.sid.dao;
import java.util.List;
import org.sid.entities.Bilan;
import org.sid.entities.FicheBesoins;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface bilanRepository extends JpaRepository<Bilan, Integer> {

	
	@Query("SELECT DISTINCT b FROM Bilan b  JOIN b.fiches  WHERE validate=true ")
	
     public List<Bilan> getBilan();
}