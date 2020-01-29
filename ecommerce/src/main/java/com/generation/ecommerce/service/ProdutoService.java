package com.generation.ecommerce.service;

import java.util.List;

import com.generation.ecommerce.entity.Produto;

public interface ProdutoService {
	Produto insertOrUpdate(Produto entity);
	
	void delete(int id);
	
	List<Produto> getAll();
	
	Produto getById(int id);
}
