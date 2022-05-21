package pfe.gestionDeConges.backen.controllers;

import java.util.List;
import java.util.Optional;

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

import pfe.gestionDeConges.backen.entities.Compte;
import pfe.gestionDeConges.backen.repositories.CompteRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("comptes")
public class CompteController{
    @Autowired
private CompteRepository compteRepository;


@PostMapping("/save")
public void save(@RequestBody Compte compte){
        compteRepository.save(compte);
        }

@GetMapping("/get")
public List<Compte> findAll() {
        return compteRepository.findAll();
        }

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable("id") Long id){
        compteRepository.deleteById(id);

        }

@PutMapping("/update")
public void update(@RequestBody Compte compte){
        compteRepository.save(compte);
        }
@GetMapping("get/{id}")
public  Optional<Compte> get(@PathVariable("id") Long id) {
	return compteRepository.findById(id);
}

}
