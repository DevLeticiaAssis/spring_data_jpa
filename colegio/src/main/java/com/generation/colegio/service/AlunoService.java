package com.generation.colegio.service;

import java.util.List;

import com.generation.colegio.entity.Aluno;

public interface AlunoService {
	
	List<Aluno> getAll();
	
	Aluno getById(int id);
	
	Aluno insertOrUpdate(Aluno aluno);
	
	void delete(int id);

}
