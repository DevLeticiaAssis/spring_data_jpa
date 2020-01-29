package com.escola.app.controller;

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

import com.escola.app.entity.Aluno;
import com.escola.app.service.AlunoService;

@RestController
@CrossOrigin("*")
public class AlunoController {

	@Autowired
	private AlunoService service;
	
	@PostMapping("/aluno")
	public ResponseEntity<Aluno> post(@RequestBody Aluno entity){
		try {
			Aluno alunoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(alunoSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/aluno")
	public ResponseEntity<Aluno> put(@RequestBody Aluno entity){
		try {
			Aluno alunoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(alunoSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/aluno/{id}")
	public ResponseEntity<String> delete(@PathVariable int id){
		if(this.service.getById(id) == null) {
			return ResponseEntity.notFound().build();
		}
		
		try {
			this.service.delete(id);
			return ResponseEntity.ok("Removido com sucesso.");
		} catch (Exception err) {
			return ResponseEntity.badRequest().body(err.getMessage());
		}
	}
	
	@GetMapping("/aluno/{id}")
	public ResponseEntity<Aluno> getById(@PathVariable int id){
		Aluno aluno = this.service.getById(id);
		
		if(aluno == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(aluno);
	}
	
	@GetMapping("/aluno")
	public ResponseEntity<List<Aluno>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/aluno/nomes/{nome}")
	public ResponseEntity<List<Aluno>> getAllByName(@PathVariable String nome){
		return ResponseEntity.ok(this.service.getAllByNome(nome));
	}
	
	@GetMapping("/aluno/nome/{nome}")
	public ResponseEntity<Aluno> getByName(@PathVariable String nome){
		return ResponseEntity.ok(this.service.getByNome(nome));
	}
}
