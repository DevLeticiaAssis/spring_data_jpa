package com.generation.redeSocial.service.impl;

import java.util.List;
import java.util.Optional;

import com.generation.redeSocial.model.Estado;
import com.generation.redeSocial.repository.EstadoRepository;
import com.generation.redeSocial.service.EstadoService;

public class EstadoServiceImpl implements EstadoService {

	private EstadoRepository estadoRepository;

	@Override
	public Estado getById(int id) {
		Optional<Estado> estado = estadoRepository.findById(id);
		return estado.get();
	}

	@Override
	public List<Estado> getAll() {
		List<Estado> estados = (List<Estado>) estadoRepository.findAll();
		return estados;
	}

	@Override
	public Estado createOrUpdate(Estado estado) {		
		return estadoRepository.save(estado);
	}

	@Override
	public void delete(int id) {
		estadoRepository.deleteById(id);
	}

}
