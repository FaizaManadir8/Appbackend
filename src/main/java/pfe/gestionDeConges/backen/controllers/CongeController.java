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
import pfe.gestionDeConges.backen.entities.Conge;
import pfe.gestionDeConges.backen.repositories.CongeRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("conge")
public class CongeController {
@Autowired
CongeRepository congeRepository;
@PostMapping("/save")
public void save(@RequestBody Conge conge){
	congeRepository.save(conge);
}

@GetMapping("/get")
public List<Conge> findAll() {
    return congeRepository.findAll();
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id){
	congeRepository.deleteById(id);
}

@PutMapping("/update")
public void update(@RequestBody Conge conge){
	congeRepository.save(conge);
}
}
