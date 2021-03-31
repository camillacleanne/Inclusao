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


import com.pipobeneficio.inclusao.model.PlanoSaudePampulhaInt;
import com.pipobeneficio.inclusao.repository.PlanoSaudePampulhaIntRepository;

@RestController
@RequestMapping ("/planosaudepampulhaint")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PlanoSaudePampulhaIntController {

	@Autowired
	private PlanoSaudePampulhaIntRepository repository;
	
	@GetMapping
	public ResponseEntity<List<PlanoSaudePampulhaInt>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PlanoSaudePampulhaInt> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	@PostMapping
	public ResponseEntity<PlanoSaudePampulhaInt> post (@Valid @RequestBody PlanoSaudePampulhaInt planosaudepampulhaint){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(planosaudepampulhaint));
	}
	
	@PutMapping
	public ResponseEntity<PlanoSaudePampulhaInt> put (@Valid @RequestBody PlanoSaudePampulhaInt planosaudepampulhaint){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(planosaudepampulhaint));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}	
}
