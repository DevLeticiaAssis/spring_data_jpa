package com.generation.RedeSocial.service;

import java.util.List;

import com.generation.RedeSocial.entity.Usuario;

public interface UsuarioService {
	
	Usuario insertOrUpdate(Usuario entity);

	List<Usuario> insertOrUpdateAll(List<Usuario> entity);
	
	void delete(int id);
	
	List<Usuario> getAll();
	
	Usuario getById(int id);
	
	List<Usuario> getAllByNome(String nome);
	
	Usuario getByNome(String nome);
	

}
