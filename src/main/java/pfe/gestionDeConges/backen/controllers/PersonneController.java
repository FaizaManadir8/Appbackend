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

import pfe.gestionDeConges.backen.entities.Personne;
import pfe.gestionDeConges.backen.repositories.PersonneRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("user")
public class PersonneController {

        @Autowired
        private PersonneRepository personneRepository;

        @PostMapping("/save")
        public void save(@RequestBody Personne personne){
            personneRepository.save(personne);
        }

        @GetMapping("/get")
        public List<Personne> findAll() {
            return personneRepository.findAll();
        }

        @DeleteMapping("/delete/{id}")
        public void delete(@PathVariable Long id){
            personneRepository.deleteById(id);
        }

        @PutMapping("/update")
        public void update(@RequestBody Personne personne){
            personneRepository.save(personne);
        }
//        @GetMapping("/get/{id}")
//        public Personne findByCompteID(@PathVariable Long id) {
//        	return personneRepository.findOne(id);    			
//        }

    }
