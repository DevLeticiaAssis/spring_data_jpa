package br.com.eco.EcoBase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eco.EcoBase.entity.Endereco;

public interface EnderecoRepository extends CrudRepository <Endereco, Integer> {
	
	List<Endereco> findAllByRua(String rua);
	Endereco findEnderecoByRua(String rua);

}
