package com.generation.ecommerce.entity;

import java.util.Date;

import javax.persistence.*;

@Entity
public class Venda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVenda;
	
	@ManyToOne
	private Cliente cliente;
	
	@ManyToOne
	private Produto produto;
	
	@ManyToOne
	private Vendedor vendedor;
	
	private int qtdVendida;
	
	private float valorVendido;
	
	private Date dataVenda;

	public int getIdVenda() {
		return idVenda;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public Produto getProduto() {
		return produto;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}

	public int getQtdVendida() {
		return qtdVendida;
	}

	public float getValorVendido() {
		return valorVendido;
	}

	public Date getDataVenda() {
		return dataVenda;
	}

	public void setIdVenda(int idVenda) {
		this.idVenda = idVenda;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}

	public void setQtdVendida(int qtdVendida) {
		this.qtdVendida = qtdVendida;
	}

	public void setValorVendido(float valorVendido) {
		this.valorVendido = valorVendido;
	}

	public void setDataVenda(Date dataVenda) {
		this.dataVenda = dataVenda;
	}
	
	
}
