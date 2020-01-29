package com.escola.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.escola.app.entity.Turma;
import com.escola.app.repository.TurmaRepository;
import com.escola.app.service.TurmaService;

@Service
public class TurmaServiceImpl implements TurmaService {

	@Autowired
	private TurmaRepository repository;
	
	@Override
	public Turma insertOrUpdate(Turma entity) {
		Turma turmaSalvo = this.repository.save(entity);
		return turmaSalvo;
	}

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Turma> getAll() {
		return (List<Turma>) this.repository.findAll();
	}

	@Override
	public Turma getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Turma> getAllByNome(String nome) {
		return (List<Turma>)this.repository.findAllByNome(nome);
	}
	
	@Override
	public Turma getByNome(String nome) {
		return this.repository.findTurmaByNome(nome);
	}
}
