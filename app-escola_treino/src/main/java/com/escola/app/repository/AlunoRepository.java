package com.escola.app.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.escola.app.entity.Aluno;

public interface AlunoRepository extends CrudRepository <Aluno, Integer>{
	List<Aluno> findAllByNome(String nome);
	Aluno findAlunoByNome(String nome);
}
