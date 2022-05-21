package pfe.gestionDeConges.backen.controllers;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pfe.gestionDeConges.backen.entities.Avis;
import pfe.gestionDeConges.backen.repositories.AvisRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("avis")
public class AvisController {
	@Autowired
	AvisRepository avisRepository;
	@PostMapping("/save")
	public void save(@RequestBody Avis avis){
		avisRepository.save(avis);
	}

	@GetMapping("/get")
	public List<Avis> findAll() {
	    return avisRepository.findAll();
	}

	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable Long id){
		avisRepository.deleteById(id);
	}

	@PutMapping("/update")
	public void update(@RequestBody Avis avis){
		avisRepository.save(avis);
	}


	
}
