package org.sid.web;

import java.util.List;
import java.util.Optional;

import org.sid.dao.ConvocationRepository;
import org.sid.entities.ConvocationChef;
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
public class ConvocationChefController {
@Autowired
private ConvocationRepository convocationRepository ;

@RequestMapping(value = "/convocations", method = RequestMethod.GET)
public List<ConvocationChef> getAllConvocation(){
	return convocationRepository.findAll();
	
}
@RequestMapping(value = "/convocations/{idc}", method = RequestMethod.GET)
public Optional<ConvocationChef> getConvocationById(@PathVariable int idc) {
	return convocationRepository.findById(idc);
	
}
@RequestMapping(value = "/convocations",method = RequestMethod.POST)
public ConvocationChef saveConvocation(@RequestBody ConvocationChef convocation) {
	return convocationRepository.save(convocation);
}
@RequestMapping(value = "/convocations/{idc}", method = RequestMethod.PUT)
public ConvocationChef updateChefConvocation(@PathVariable int idc, @RequestBody ConvocationChef conv) {
	conv.setIdc(idc);
	return convocationRepository.save(conv);
}
	
@RequestMapping(value = "/convocations/{idc}",method = RequestMethod.DELETE)
public Boolean DeleteConvocation(@PathVariable int idc) {
	convocationRepository.findById(idc);
	convocationRepository.deleteById(idc);
	return true;
	
}
@RequestMapping(value = "chercherconvocation",method = RequestMethod.GET)
public Page<ConvocationChef> chercher(@RequestParam(name = "McConv", defaultValue = "")String McConv,
		                               @RequestParam(name = "page",defaultValue = "0")int page,
		                               @RequestParam(name = "size",defaultValue = "5")int size){
                           	return convocationRepository.ChercherConvocation("%"+McConv+"%", PageRequest.of(page, size));}

@RequestMapping(value = "/intraconvocation", method = RequestMethod.GET)
public List<ConvocationChef> getintraConvocation() {
	return convocationRepository.getIntraConvocation();
}

@RequestMapping(value = "/interconvocation", method = RequestMethod.GET)
public List<ConvocationChef> getinterConvocation() {
	return convocationRepository.getInterConvocation();
}
@RequestMapping(value = "/distanceconvocation", method = RequestMethod.GET)
public List<ConvocationChef> getadistanceConvocation() {
	return convocationRepository.getAdistanceConvocation();
}
@RequestMapping(value = "/coursoirconvocation", method = RequestMethod.GET)
public List<ConvocationChef> getcoursoirConvocation() {
	return convocationRepository.getCsoirConvocation();
}
@RequestMapping(value = "/etrangerconvocation", method = RequestMethod.GET)
public List<ConvocationChef> getetrangerConvocation() {
	return convocationRepository.getAetrangerConvocation();
}

}
