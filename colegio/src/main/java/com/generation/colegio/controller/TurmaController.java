package com.generation.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.generation.colegio.entity.Turma;
import com.generation.colegio.service.TurmaService;

@RestController
@CrossOrigin("*")
public class TurmaController {

	@Autowired
	TurmaService turmaService;
	
	@GetMapping("/turma")
	public ResponseEntity<List<Turma>> getAllAluno() {
		return ResponseEntity.ok(this.turmaService.getAll());
	}
	
	@GetMapping("/turma/{id}")
	public ResponseEntity<Turma> getByIdAluno(@PathVariable int id) {
		return ResponseEntity.ok(turmaService.getById(id));
	}
	
	@PostMapping("/turma/")
	public ResponseEntity<Turma> postAluno(@RequestBody Turma turma) {
		return ResponseEntity.ok(turmaService.insertOrUpdate(turma));
	}
	
	@PutMapping("/turma/")
	public ResponseEntity<Turma> putAluno(@RequestBody Turma turma) {
		return ResponseEntity.ok(turmaService.insertOrUpdate(turma));
	}
	@DeleteMapping("/turma/{id}")
	public ResponseEntity<String> deleteAluno(@PathVariable int id) {
		turmaService.delete(id);
		return ResponseEntity.ok("Turma deletada"); 
	}
	
}
