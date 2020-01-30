package com.generation.redeSocial.controller;

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
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.generation.redeSocial.model.Estado;
import com.generation.redeSocial.service.EstadoService;

@RestController
@CrossOrigin("*")
public class EstadoController {

	@Autowired
	private EstadoService service;

	@GetMapping("/estado")
	public ResponseEntity<List<Estado>> getAll() {
		return ResponseEntity.ok(service.getAll());
	}

	@GetMapping("/estado/{id}") // @Valid serve para validar as anotações de validações feitas na model. ex:
								// @Size(max = 2, message = "... ")
	public ResponseEntity<Estado> getById(@Valid @PathVariable int id) {
		return ResponseEntity.ok(service.getById(id));
	}

	@PostMapping("/estado")
	@ResponseStatus(HttpStatus.CREATED)
	public Estado postEstado(@Valid @RequestBody Estado estado) {
		Estado estadoOb = service.createOrUpdate(estado);
		if (estadoOb == null) //Devolvendo um erro para o client
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu Ruim");
		return estadoOb;
	}
	
	@PutMapping("/estado")
	@ResponseStatus(HttpStatus.CREATED)
	public Estado putEstado(@Valid @RequestBody Estado estado) {
		Estado estadoOb = service.createOrUpdate(estado);
		if (estadoOb == null) //Devolvendo um erro para o client
			throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Deu Ruim");
		return estadoOb;
	}
	
	@DeleteMapping("estado/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		service.delete(id);
		return ResponseEntity.ok("Deletado");
	}
}
