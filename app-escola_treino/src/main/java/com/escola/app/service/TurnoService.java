package com.escola.app.service;

import java.util.List;

import com.escola.app.entity.Turno;

public interface TurnoService {
	
	Turno insertOrUpdate(Turno entity);
	
	void delete(int id);
	
	List<Turno> getAll();
	
	Turno getById(int id);
	
	List<Turno> getAllByNome(String nome);
	
	Turno getByNome(String nome);

}
