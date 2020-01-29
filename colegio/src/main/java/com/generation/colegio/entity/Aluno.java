package com.generation.colegio.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Aluno {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String nome;
	
	@ManyToOne
	private Turma turma;

	public int getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}
}
