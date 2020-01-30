package com.generation.redeSocial.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.redeSocial.model.Cliente;
import com.generation.redeSocial.repository.ClienteRepository;
import com.generation.redeSocial.service.ClienteService;

@Service
public class ClienteServiceImpl implements ClienteService{

	@Autowired
	private ClienteRepository clienteRepository;	
	
	@Override
	public Cliente getById(int id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public List<Cliente> getAll() {
		return (List<Cliente>) clienteRepository.findAll();
	}

	@Override
	public Cliente createOrUpdate(Cliente cliente) {
		return clienteRepository.save(cliente);
	}

	@Override
	public void delete(int id) {
		clienteRepository.deleteById(id);		
	}

	@Override
	public List<Cliente> createOrUpdateAll(List<Cliente> clientes) {
		List<Cliente> clienteList = (List<Cliente>) clienteRepository.saveAll(clientes);
		return clienteList;
	}

}
