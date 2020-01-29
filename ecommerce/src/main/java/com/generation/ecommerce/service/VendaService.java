package com.generation.ecommerce.service;

import java.util.List;

import com.generation.ecommerce.entity.Venda;

public interface VendaService {
	Venda insertOrUpdate(Venda entity);
	
	void delete(int id);
	
	List<Venda> getAll();
	
	Venda getById(int id);
}
