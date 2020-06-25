package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.CommandeChefRepository;
import org.sid.entities.CommandeChef;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
public class CommandeChefController {
	@Autowired
	private CommandeChefRepository commandeChefRepository;
	
	@RequestMapping(value = "/commandes", method = RequestMethod.GET)
	public List<CommandeChef> getAllCommandes(){
		return commandeChefRepository.findAll();
}
	@RequestMapping(value = "/commandes/{idcom}", method = RequestMethod.GET)
	private Optional<CommandeChef> getCommandeChefById(@PathVariable int idcom) {
		return commandeChefRepository.findById(idcom);
		
	}
	@RequestMapping(value = "/scommande",method = RequestMethod.POST)
	public CommandeChef savecommande(@RequestBody CommandeChef commande) {
		return commandeChefRepository.save(commande);
		
	}
	@RequestMapping(value = "/commande/{idcom}", method = RequestMethod.PUT)
	public CommandeChef updatecommande(@PathVariable int idcom , @RequestBody CommandeChef com) {
		com.setIdcom(idcom);
		return commandeChefRepository.save(com);
		
	}
	@RequestMapping(value = "/commandes/{idcom}", method = RequestMethod.DELETE)
	public boolean deletecommande(@PathVariable int idcom) {
		commandeChefRepository.findById(idcom);
		commandeChefRepository.deleteById(idcom);
		return true;
		
	}
	@RequestMapping(value = "/cherchercommande", method = RequestMethod.GET)
	public Page<CommandeChef> SearchCommande(@RequestParam(name = "McCom",defaultValue = "")String McCom,
			                                 @RequestParam(name = "page", defaultValue = "0")int page,
			                                 @RequestParam(name = "size", defaultValue = "5")int size){
		return commandeChefRepository.ChercherCommande("%"+McCom+"%", PageRequest.of(page, size));
	}
	@RequestMapping(value = "/cmdintra", method = RequestMethod.GET)
	public List<CommandeChef> getCmdIntra(){
		return commandeChefRepository.getIntraCmd();
	}
	@RequestMapping(value = "/cmdinter", method = RequestMethod.GET)
	public List<CommandeChef> getCmdInter(){
		return commandeChefRepository.getInterCmd();
	}
	@RequestMapping(value = "/cmdcsoir", method = RequestMethod.GET)
	public List<CommandeChef> getCmdCsoir(){
		return commandeChefRepository.getCsoirCmd();
	}
	
	
	
}