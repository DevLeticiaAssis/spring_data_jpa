package com.generation.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity	//Informar que o Model é uma entidade do banco de dados (tabela)
public class Cliente {
	
	@Id	//Especifica que este atributo é a Primary Key da tabela
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idCliente;
	@Column(length = 255)
	private String nome;
	private String email;
	@Column(length = 12)
	private String senha;
	
	public int getIdCliente() {
		return idCliente;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public String getSenha() {
		return senha;
	}
	
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
