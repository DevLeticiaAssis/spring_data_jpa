package com.generation.redeSocial.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "usuario")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 100)
	@Size(max = 100, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String nome;
	
	@Column(length = 100)
	@Size(max = 100, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String email;
	
	@Column(length = 30)
	@Size(max = 30, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String senha;
	
	@ManyToOne
	private Estado estado;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
}
