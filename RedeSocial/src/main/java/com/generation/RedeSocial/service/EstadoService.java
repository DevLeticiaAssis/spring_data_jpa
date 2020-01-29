package com.generation.RedeSocial.service;

import java.util.List;

import com.generation.RedeSocial.entity.Estado;

public interface EstadoService {

	Estado insertOrUpdate(Estado entity);
	
	List<Estado> insertOrUpdateAll(List<Estado> entity);
	
	void delete(int id);
	
	List<Estado> getAll();
	
	Estado getById(int id);
	
	List<Estado> getAllByEstado(String estado);
	
	Estado getByEstado(String estado);

}
