package com.generation.colegio.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.colegio.entity.Aluno;
import com.generation.colegio.repository.AlunoRepository;
import com.generation.colegio.service.AlunoService;
@Service
public class AlunoServiceImpl  implements AlunoService{
	
	@Autowired
	private AlunoRepository alunoRepository;
	
	@Override
	public List<Aluno> getAll() {
		List<Aluno> alunos= (List<Aluno>)alunoRepository.findAll();
		return alunos;
		//return (List<Aluno>)alunoRepository.findAll();
	}

	@Override
	public Aluno getById(int id) {
		
		return alunoRepository.findById(id).orElse(null);
	}

	@Override
	public Aluno insertOrUpdate(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	@Override
	public void delete(int id) {
		alunoRepository.deleteById(id);	
	}
	

}
