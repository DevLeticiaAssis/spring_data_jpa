package br.com.eco.EcoBase.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "endereco")
public class Endereco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(length = 255)
	@Size(max = 255, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String rua;
	
	@Column(length = 50)
	private int numero;

	@Column(length = 100)
	@Size(max = 100, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String bairro;
	
	@Column(length = 100)
	@Size(max = 100, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String cidade;
	
	@Column(length = 2)
	@Size(max = 2, message = "Numero de caracteres não permitido")
	@NotEmpty(message = "O campo deve ser preenchido")
	private String uf;
	
	@Column(length = 11)
	private int cep;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getUf() {
		return uf;
	}

	public void setUf(String uf) {
		this.uf = uf;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}
	
}
