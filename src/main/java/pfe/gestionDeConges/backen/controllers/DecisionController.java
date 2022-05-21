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

import pfe.gestionDeConges.backen.entities.Decision;
import pfe.gestionDeConges.backen.repositories.DecisionRepository;

@RestController
@CrossOrigin(origins="*")
@RequestMapping("decision")
public class DecisionController {
@Autowired
DecisionRepository decisionRepository;
@PostMapping("/save")
public void save(@RequestBody Decision decision){
	decisionRepository.save(decision);
}

@GetMapping("/get")
public List<Decision> findAll() {
    return decisionRepository.findAll();
}

@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id){
	decisionRepository.deleteById(id);
}

@PutMapping("/update")
public void update(@RequestBody Decision decision){
	decisionRepository.save(decision);
}

@PutMapping("/accepter")
public void updateCongeAccepted(@RequestBody Decision decision){
	decision.setEtat("Accepté");
       decisionRepository.save(decision);

   }
@PutMapping("/refuser")
public void updateCongeRefuse(@RequestBody Decision decision){
	decision.setEtat("Refusé");
   decisionRepository.save(decision);

}
}

