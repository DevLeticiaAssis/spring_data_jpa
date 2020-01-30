package br.com.eco.EcoBase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eco.EcoBase.entity.Produto;

public interface ProdutoRepository extends CrudRepository <Produto, Integer>{
	
	List<Produto> findAllByNome(String nome);
	Produto findProdutoByNome(String nome);
	
}
