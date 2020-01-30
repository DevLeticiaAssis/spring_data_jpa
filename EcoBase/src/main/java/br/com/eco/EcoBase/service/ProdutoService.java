package br.com.eco.EcoBase.service;

import java.util.List;

import br.com.eco.EcoBase.entity.Produto;

public interface ProdutoService {

	Produto insertOrUpdate(Produto entity);

	List<Produto> insertOrUpdateAll(List<Produto> entity);
	
	void delete(int id);
	
	List<Produto> getAll();
	
	Produto getById(int id);
	
	List<Produto> getAllByNome(String nome);
	
	Produto getByNome(String nome);
}
