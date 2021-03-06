package com.pipobeneficio.inclusao.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pipobeneficio.inclusao.model.PlanoSaudeMental;
import com.pipobeneficio.inclusao.repository.PlanoSaudeMentalRepository;

@RestController
@RequestMapping ("/planosaudemental")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PlanoSaudeMentalController {
	@Autowired
	private PlanoSaudeMentalRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PlanoSaudeMental>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PlanoSaudeMental> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<PlanoSaudeMental> post (@Valid @RequestBody PlanoSaudeMental planosaudemental){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(planosaudemental));
	}
	
	@PutMapping
	public ResponseEntity<PlanoSaudeMental> put (@Valid @RequestBody PlanoSaudeMental planosaudemental){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(planosaudemental));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	
}
