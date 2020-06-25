package org.sid;
import java.util.Date;

import org.omg.CORBA.PRIVATE_MEMBER;
import org.sid.dao.CommandeChefRepository;
import org.sid.dao.ConvocationRepository;
import org.sid.dao.DirectionRepository;
import org.sid.dao.FicheBesoinsRepository;
import org.sid.dao.UtilisateursRepository;
import org.sid.dao.bilanRepository;
import org.sid.entities.Bilan;
import org.sid.entities.CommandeChef;
import org.sid.entities.ConvocationChef;
import org.sid.entities.Direction;
import org.sid.entities.FicheBesoins;
import org.sid.entities.Utilisateurs;

import org.sid.web.UtilisateursController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PfelamiaApplication  implements CommandLineRunner{
	@Autowired
	private FicheBesoinsRepository ficheBesoinsRepository;
	@Autowired
	private UtilisateursRepository utilisateursRepository;
	@Autowired
	private CommandeChefRepository commandeChefRepository;
	@Autowired
	private DirectionRepository directionRepository;
	@Autowired
	private ConvocationRepository convocationRepository;
	@Autowired
	private bilanRepository bilanRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(PfelamiaApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		
		  Bilan b = bilanRepository.save(new Bilan(123456, "hedia jbeli", 4, 2, 6, 7, 1, 123455, 7688, 98776));
		
		   ficheBesoinsRepository.save(new FicheBesoins(12332, "aaaa", "zzzz", "rrrr", "dddd", "ffff", "eeee", "yyyy", "yyyy", 1, 3, 4, 5, "eee", "de base", "intra", "EEEE", "info", "eeee", "afca", "32233", 5, 6, true, "2321", b));
		   ficheBesoinsRepository.save(new FicheBesoins(12332, "mariem", "hamdi", "rrrr", "dddd", "ffff", "eeee", "yyyy", "yyyy", 1, 3, 4, 5, "eee", "de base", "intra", "EEEE", "info", "eeee", "afca", "32233", 5, 6, false, "2321", b));
			
	
	}
}
	

	
	
	


