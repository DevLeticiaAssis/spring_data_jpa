package com.generation.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.entity.Cliente;
import com.generation.ecommerce.repository.ClienteRepository;
import com.generation.ecommerce.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService {

	// @Autowired é para fazer a Injeção de Dependencia
	@Autowired
	private ClienteRepository repository;
	
	@Override
	public Cliente insertOrUpdate(Cliente entity) {
		Cliente clienteSalvo = this.repository.save(entity);
		return clienteSalvo;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>) this.repository.findAll();
	}

	@Override
	public Cliente getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Cliente> getAllByNome(String nome) {
		return (List<Cliente>)this.repository.findAllByNome(nome);
	}
	
	@Override
	public Cliente getByNome(String nome) {
		return this.repository.findClienteByNome(nome);
	}

	@Override
	public List<Cliente> getByNomeAndEmail(String nome, String email) {
		return (List<Cliente>)this.repository.findAllByNomeAndEmail(nome, email);
	}

}
