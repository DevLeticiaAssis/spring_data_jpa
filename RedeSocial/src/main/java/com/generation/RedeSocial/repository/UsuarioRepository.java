package com.generation.RedeSocial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.generation.RedeSocial.entity.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer>  {
	
	List<Usuario> findAllByNome(String nome);
	Usuario findUsuarioByNome(String nome);

}
