package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.DirectionRepository;
import org.sid.entities.Direction;
import org.sid.entities.Utilisateurs;
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
public class DirectionController {
	@Autowired
	private DirectionRepository directionRepository;
	
	@RequestMapping(value = "/direction", method = RequestMethod.GET)
	public List<Direction> getAllDirection(){
		return directionRepository.findAll();	
	}
	@RequestMapping(value = "/direction/{idirect}", method = RequestMethod.GET)
	public Optional<Direction> getDirectionById (@PathVariable int idirect) {
		return directionRepository.findById(idirect);
		
	}
 @RequestMapping(value = "/direction", method = RequestMethod.POST)
	public Direction saveDirection(@RequestBody Direction direct) {
		return directionRepository.save(direct);
		
	}
 @RequestMapping(value = "/direction/{idirect}", method = RequestMethod.PUT)
 public  Direction updateDirection( @RequestBody Direction D, @PathVariable int idirect) {
	 D.setIdirect(idirect);
	return directionRepository.save(D);
	 
 }
 @RequestMapping(value = "/direction/{idirect}", method = RequestMethod.DELETE)
 public Boolean deleteDirection(@PathVariable int idirect) {
	 directionRepository.findById(idirect);
	 directionRepository.deleteById(idirect);
	return true;
	 
 }
 
 @RequestMapping(value = "/chercherdirection", method = RequestMethod.GET)
	public Page<Direction> chercher(
			@RequestParam(name="McD" , defaultValue = "") String McD ,
			@RequestParam(name="page" , defaultValue = "0") int page ,
			@RequestParam(name="size" , defaultValue = "5") int size){
	 return directionRepository.chercher("%"+McD+"%", PageRequest.of(page, size));
 }
	
}
