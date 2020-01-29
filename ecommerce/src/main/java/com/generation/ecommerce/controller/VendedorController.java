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

import com.generation.ecommerce.entity.Vendedor;
import com.generation.ecommerce.service.VendedorService;

@RestController
@CrossOrigin("*")
public class VendedorController {
	
	@Autowired
	private VendedorService service;
	
	@PostMapping("/vendedor")
	public ResponseEntity<Vendedor> post(@RequestBody Vendedor entity){
		try {
			Vendedor vendedorSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(vendedorSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PutMapping("/vendedor")
	public ResponseEntity<Vendedor> put(@RequestBody Vendedor entity){
		try {
			Vendedor vendedorSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(vendedorSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/vendedor/{id}")
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
	
	@GetMapping("/vendedor/{id}")
	public ResponseEntity<Vendedor> getById(@PathVariable int id){
		Vendedor vendedor = this.service.getById(id);
		
		if(vendedor == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(vendedor);
	}
	
	@GetMapping("/vendedor")
	public ResponseEntity<List<Vendedor>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
}
