package com.generation.RedeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.RedeSocial.entity.Estado;
import com.generation.RedeSocial.repository.EstadoRepository;
import com.generation.RedeSocial.service.EstadoService;


@Service
public class EstadoServiceImpl implements EstadoService {
	
	@Autowired
	private EstadoRepository repository;
	
	@Override
	public Estado insertOrUpdate(Estado entity) {
		Estado estadoSalvo = this.repository.save(entity);
		return estadoSalvo;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Estado> getAll() {
		return (List<Estado>) this.repository.findAll();
	}

	@Override
	public Estado getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Estado> getAllByEstado(String estado) {
		return (List<Estado>)this.repository.findAllByEstado(estado);
	}
	
	@Override
	public Estado getByEstado (String estado) {
		return this.repository.findEstadoByEstado(estado);
	}

	@Override
	public List<Estado> insertOrUpdateAll(List<Estado> entities) {
		return (List<Estado>) this.repository.saveAll(entities);
	}
}
