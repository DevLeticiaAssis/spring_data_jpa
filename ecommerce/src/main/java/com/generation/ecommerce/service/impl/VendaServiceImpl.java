package com.generation.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.entity.Venda;
import com.generation.ecommerce.repository.VendaRepository;
import com.generation.ecommerce.service.VendaService;

@Service
public class VendaServiceImpl implements VendaService {

	@Autowired
	private VendaRepository repository;
	
	@Override
	public Venda insertOrUpdate(Venda entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Venda> getAll() {
		return (List<Venda>)this.repository.findAll();
	}

	@Override
	public Venda getById(int id) {
		return this.repository.findById(id).get();
	}

}
