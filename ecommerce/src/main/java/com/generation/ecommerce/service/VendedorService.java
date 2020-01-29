package com.generation.ecommerce.service;

import java.util.List;

import com.generation.ecommerce.entity.Vendedor;

public interface VendedorService {
	Vendedor insertOrUpdate(Vendedor entity);
	
	void delete(int id);
	
	List<Vendedor> getAll();
	
	Vendedor getById(int id);
}
