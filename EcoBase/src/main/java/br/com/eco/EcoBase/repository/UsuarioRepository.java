package br.com.eco.EcoBase.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.eco.EcoBase.entity.Usuario;

public interface UsuarioRepository extends CrudRepository <Usuario, Integer> {

	List<Usuario> findAllByNome(String nome);
	Usuario findUsuarioByNome(String nome);

}
