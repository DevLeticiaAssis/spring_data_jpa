package com.generation.colegio.service;

import java.util.List;


import com.generation.colegio.entity.Turma;

public interface TurmaService {

	List<Turma> getAll();

	Turma getById(int id);

	Turma insertOrUpdate(Turma turma);

	void delete(int id);
}
