package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.hibernate.boot.model.relational.Database;
import org.sid.dao.UtilisateursRepository;
import org.sid.entities.Utilisateurs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin(origins = "*")
@RestController
public class UtilisateursController {
	@Autowired
	private UtilisateursRepository utilisateursRepository ;
	
	@RequestMapping(value = "/utilisateurs", method = RequestMethod.GET)
	public List<Utilisateurs> getUtilisateurs(){
		return utilisateursRepository.findAll();
	}
	
	@RequestMapping(value = "/utilisateurs", method = RequestMethod.POST)
	public Utilisateurs savetUtilisateurs (@RequestBody Utilisateurs U){
		return utilisateursRepository.save(U);
	}

	@RequestMapping(value = "/utilisateurs/{id}", method = RequestMethod.GET)
	public Optional<Utilisateurs> getutilisateurbyId(@PathVariable int id){
		return utilisateursRepository.findById(id);
	}
	@RequestMapping(value = "/utilisateurs/{id}", method = RequestMethod.PUT)
    public Utilisateurs updateUtilisateurs(@PathVariable int id, @RequestBody Utilisateurs U) {
	 U.setId(id);
	 return utilisateursRepository.save(U);
}
	
	@RequestMapping(value = "/utilisateurs/{id}", method = RequestMethod.DELETE)
	public Boolean deleteUtilisateurs(@PathVariable int id){
		 utilisateursRepository.findById(id);
		 utilisateursRepository.deleteById(id);
		 return true ;
	}
	@RequestMapping(value = "/chercherUtilisateur", method = RequestMethod.GET)
	public Page<Utilisateurs> chercher(
			@RequestParam(name="mc" , defaultValue = "") String mc ,
			@RequestParam(name="page" , defaultValue = "0") int page ,
			@RequestParam(name="size" , defaultValue = "5") int size){
				return utilisateursRepository.chercher("%"+mc+"%", PageRequest.of(page, size));
		
	}
	
	
	
	
	
	
	
	
	

}
