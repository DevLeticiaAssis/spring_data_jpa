package com.generation.ecommerce.entity;

import javax.persistence.*;


@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idProduto;
	private String nome;
	private String descricao;
	private float valor;
	private int qtdEstoque;
	
	public int getIdProduto() {
		return idProduto;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public float getValor() {
		return valor;
	}
	
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	
	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setValor(float valor) {
		this.valor = valor;
	}
	
	public void setQtdEstoque(int qtdEstoque) {
		this.qtdEstoque = qtdEstoque;
	}
}
