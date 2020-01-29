package com.generation.ecommerce.service;

import java.util.List;

import com.generation.ecommerce.entity.Cliente;

public interface ClienteService {
	Cliente insertOrUpdate(Cliente entity);
	
	void delete(int id);
	
	List<Cliente> getAll();
	
	Cliente getById(int id);
	
	List<Cliente> getAllByNome(String nome);
	
	Cliente getByNome(String nome);
	
	List<Cliente> getByNomeAndEmail(String nome, String email);
}
