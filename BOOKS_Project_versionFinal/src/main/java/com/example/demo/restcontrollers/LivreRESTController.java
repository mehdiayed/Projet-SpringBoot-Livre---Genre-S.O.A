package com.example.demo.restcontrollers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Livre;
import com.example.demo.service.LivreService;

@RestController
@RequestMapping("/api")
@CrossOrigin
public class LivreRESTController {
	@Autowired
	private LivreService livreService;
	
	@RequestMapping(method = RequestMethod.GET)
	List<Livre> getAllLivres(){
		return livreService.getAllLivres();
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Livre getLivreProduitById(@PathVariable("id") Long id) {
	return livreService.getLivre(id);
	}
	
	
	@RequestMapping(method = RequestMethod.POST)
	public Livre createProduit(@RequestBody Livre liv) {
	return livreService.saveLivre(liv);
	}
	
	@RequestMapping(method = RequestMethod.PUT)
	public Livre updateLivre(@RequestBody Livre liv) {
	return livreService.updateLivre(liv);
	}
	
	@RequestMapping(value="/{id}",method = RequestMethod.DELETE)
	public void deleteLivre(@PathVariable("id") Long id)
	{
		livreService.deleteLivreById(id);
	}
	
	@RequestMapping(value="/livGen/{idGenre}",method = RequestMethod.GET)
	public List<Livre> getProduitsByCatId(@PathVariable("idGenre") Long idGenre) {
		return livreService.findByGenreIdGenre(idGenre);
	}
}
