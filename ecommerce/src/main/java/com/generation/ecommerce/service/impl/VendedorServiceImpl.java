package com.generation.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.entity.Vendedor;
import com.generation.ecommerce.repository.VendedorRepository;
import com.generation.ecommerce.service.VendedorService;

@Service
public class VendedorServiceImpl implements VendedorService {

	@Autowired
	private VendedorRepository repository; 
	
	@Override
	public Vendedor insertOrUpdate(Vendedor entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Vendedor> getAll() {
		return (List<Vendedor>)repository.findAll();
	}

	@Override
	public Vendedor getById(int id) {
		return this.repository.findById(id).get();
	}
}
