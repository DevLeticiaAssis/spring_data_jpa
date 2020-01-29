package com.generation.RedeSocial.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.generation.RedeSocial.entity.Estado;

public interface EstadoRepository extends CrudRepository<Estado, Integer> {
	
	List<Estado> findAllByEstado(String estado);
	Estado findEstadoByEstado(String estado);
}
