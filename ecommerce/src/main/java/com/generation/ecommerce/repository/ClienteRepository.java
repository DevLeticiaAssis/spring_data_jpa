package com.generation.ecommerce.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.generation.ecommerce.entity.Cliente;

/// A interface responsavel por interagir como banco de dados
/// Para isso herdamos da Interface CrudRepository
/// 	passando a entidade e o tipo da PK (sempre class, exemplo int é Integer
public interface ClienteRepository extends CrudRepository<Cliente, Integer> {  
	List<Cliente> findAllByNome(String nome);
	Cliente findClienteByNome(String nome);
	List<Cliente> findAllByNomeAndEmail(String nome, String email);
}






