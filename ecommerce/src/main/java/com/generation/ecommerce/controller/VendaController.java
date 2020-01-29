package com.generation.ecommerce.controller;

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

import com.generation.ecommerce.entity.Venda;
import com.generation.ecommerce.service.VendaService;

@RestController
@CrossOrigin("*")
public class VendaController {
	
	@Autowired
	private VendaService service;
	
	@PostMapping("/venda")
	public ResponseEntity<Venda> post(@RequestBody Venda entity){
		try {
			Venda vendaSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(vendaSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/venda")
	public ResponseEntity<Venda> put(@RequestBody Venda entity){
		try {
			Venda vendaSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(vendaSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/venda/{id}")
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
	
	@GetMapping("/venda/{id}")
	public ResponseEntity<Venda> getById(@PathVariable int id){
		Venda venda = this.service.getById(id);
		
		if(venda == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(venda);
	}
	
	@GetMapping("/venda")
	public ResponseEntity<List<Venda>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
}
