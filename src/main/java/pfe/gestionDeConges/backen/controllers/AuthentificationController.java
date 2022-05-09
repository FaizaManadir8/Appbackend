package pfe.gestionDeConges.backen.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pfe.gestionDeConges.backen.entities.Authentification;
import pfe.gestionDeConges.backen.entities.Compte;
import pfe.gestionDeConges.backen.mappers.CompteToPersonne;
import pfe.gestionDeConges.backen.repositories.CompteRepository;

@RestController
	@CrossOrigin(origins="*")
	@RequestMapping("authentification")
	public class AuthentificationController {

	    @Autowired
	    private CompteRepository compteRepository;
	    
	    @PostMapping("/login")
	    public CompteToPersonne login(@RequestBody Authentification authentification) throws ResourceNotFoundException{
	        Compte compte = compteRepository.findByLoginAndPassword(authentification.getLogin(), authentification.getPassword());
	        if(compte != null) {
	        	CompteToPersonne client = new CompteToPersonne();
	        	return client.mapCompteToClient(compte);
	        }else {
	    			throw new ResourceNotFoundException("Login ou mot de Passe erroné");
	    		
	        }
	       }

	}
	

