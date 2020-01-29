package com.generation.ecommerce.repository;

import org.springframework.data.repository.CrudRepository;

import com.generation.ecommerce.entity.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
