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

import com.generation.colegio.entity.Aluno;
import com.generation.colegio.service.AlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {
	
	@Autowired
	private AlunoService alunoService;

	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> getAllAluno() {
		return ResponseEntity.ok(this.alunoService.getAll());
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> getByIdAluno(@PathVariable int id) {
		return ResponseEntity.ok(alunoService.getById(id));
	}
	
	@PostMapping("/aluno/")
	public ResponseEntity<Aluno> postAluno(@RequestBody Aluno aluno) {
		return ResponseEntity.ok(alunoService.insertOrUpdate(aluno));
	}
	
	@PutMapping("/aluno/")
	public ResponseEntity<Aluno> putAluno(@RequestBody Aluno aluno) {
		return ResponseEntity.ok(alunoService.insertOrUpdate(aluno));
	}
	@DeleteMapping("/aluno/{id}")
	public ResponseEntity<String> deleteAluno(@PathVariable int id) {
		alunoService.delete(id);
		return ResponseEntity.ok("Aluno deletado"); 
	}
	
}
