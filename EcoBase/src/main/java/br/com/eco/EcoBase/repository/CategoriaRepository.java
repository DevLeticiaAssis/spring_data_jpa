package br.com.eco.EcoBase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eco.EcoBase.entity.Categoria;

public interface CategoriaRepository extends CrudRepository <Categoria, Integer>{
	
	List<Categoria> findAllByNome(String nome);
	Categoria findUsuarioByNome(String nome);

}
