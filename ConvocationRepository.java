package org.sid.dao;

import java.util.List;

import org.sid.entities.ConvocationChef;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param; 

public interface ConvocationRepository extends JpaRepository<ConvocationChef, Integer> {
	@Query("select conv from ConvocationChef conv where conv.destinataire like:c")
	public Page<ConvocationChef> ChercherConvocation(@Param("c")String McConv, Pageable pageable);
	@Query("SELECT c FROM ConvocationChef c WHERE typeform='inter' ")
	public List<ConvocationChef> getInterConvocation();
	@Query("SELECT c FROM ConvocationChef c WHERE typeform='intra' ")
	public List<ConvocationChef> getIntraConvocation();

	@Query("SELECT c FROM ConvocationChef c WHERE typeform='A distance' ")
	public List<ConvocationChef> getAdistanceConvocation();

	@Query("SELECT c FROM ConvocationChef c WHERE typeform='cours du soir' ")
	public List<ConvocationChef> getCsoirConvocation();

	@Query("SELECT c FROM ConvocationChef c WHERE typeform='A l etranger' ")
	public List<ConvocationChef> getAetrangerConvocation();

	

}
