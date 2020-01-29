package com.generation.ecommerce.entity;

import javax.persistence.*;

@Entity
public class Vendedor {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVendedor;
	private String nome;
	private String email;
	private int registro;
	public int getIdVendedor() {
		return idVendedor;
	}
	public String getNome() {
		return nome;
	}
	public String getEmail() {
		return email;
	}
	public int getRegistro() {
		return registro;
	}
	public void setIdVendedor(int idVendedor) {
		this.idVendedor = idVendedor;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	
}
