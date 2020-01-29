package com.generation.colegio.service;

import java.util.List;

import com.generation.colegio.entity.Turno;

public interface TurnoService {
	List<Turno> getAll();

	Turno getById(int id);

	Turno insertOrUpdate(Turno turno);

	void delete(int id);
}
