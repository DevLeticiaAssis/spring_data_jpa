package com.generation.ecommerce.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.ecommerce.entity.Produto;
import com.generation.ecommerce.repository.ProdutoRepository;
import com.generation.ecommerce.service.ProdutoService;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	@Autowired
	private ProdutoRepository repository; 
	
	@Override
	public Produto insertOrUpdate(Produto entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Produto> getAll() {
		return (List<Produto>)repository.findAll();
	}

	@Override
	public Produto getById(int id) {
		return this.repository.findById(id).get();
	}

}
