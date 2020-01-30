package com.generation.redeSocial.service;

import java.util.List;

import com.generation.redeSocial.model.Estado;

public interface EstadoService {

	Estado getById(int id);
	
	List<Estado> getAll();
	
	Estado createOrUpdate(Estado estado);
	
	void delete(int id);
}
