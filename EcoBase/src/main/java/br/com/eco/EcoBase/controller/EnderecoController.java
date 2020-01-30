package br.com.eco.EcoBase.controller;

import java.util.List;

import javax.validation.Valid;

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

import br.com.eco.EcoBase.entity.Endereco;
import br.com.eco.EcoBase.service.EnderecoService;


@RestController
@CrossOrigin("*")
public class EnderecoController {
	
	@Autowired
	private EnderecoService service;
	
	@PostMapping("/endereco")
	public ResponseEntity<Endereco> post(@Valid @RequestBody Endereco entity){
		try {
			Endereco enderecoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(enderecoSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@PostMapping("/endereco/nomes")
		public ResponseEntity <List<Endereco>> postAll(@Valid @RequestBody List<Endereco> enderecos){
		try {
		List<Endereco> enderecoSalvo = this.service.insertOrUpdateAll(enderecos);
			return ResponseEntity.ok(enderecoSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
		
	
	@PutMapping("/endereco")
	public ResponseEntity<Endereco> put(@Valid @RequestBody Endereco entity){
		try {
			Endereco enderecoSalvo = this.service.insertOrUpdate(entity);
			return ResponseEntity.ok(enderecoSalvo);
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(null);
		}
	}
	
	@DeleteMapping("/endereco/{id}")
	public ResponseEntity<String> delete(@Valid @PathVariable int id){
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
	
	@GetMapping("/endereco/{id}")
	public ResponseEntity<Endereco> getById(@Valid @PathVariable int id){
		Endereco endereco = this.service.getById(id);
		
		if(endereco == null)
			return ResponseEntity.notFound().build();
		
		return ResponseEntity.ok(endereco);
	}
	
	@GetMapping("/endereco")
	public ResponseEntity<List<Endereco>> getAll(){
		return ResponseEntity.ok(this.service.getAll());
	}
	
	@GetMapping("/endereco/nomes/{nome}")
	public ResponseEntity<List<Endereco>> getAllByRua(@Valid @PathVariable String rua){
		return ResponseEntity.ok(this.service.getAllByRua(rua));
	}
	
	@GetMapping("/endereco/nome/{nome}")
	public ResponseEntity<Endereco> getByRua(@Valid @PathVariable String rua){
		return ResponseEntity.ok(this.service.getByRua(rua));
	}

}
