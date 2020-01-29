package com.escola.app.service;

import java.util.List;

import com.escola.app.entity.Turma;


public interface TurmaService {

	Turma insertOrUpdate(Turma entity);
	
	void delete(int id);
	
	List<Turma> getAll();
	
	Turma getById(int id);
	
	List<Turma> getAllByNome(String nome);
	
	Turma getByNome(String nome);
}
