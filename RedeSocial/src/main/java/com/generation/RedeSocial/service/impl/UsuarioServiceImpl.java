package com.generation.RedeSocial.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.generation.RedeSocial.entity.Usuario;
import com.generation.RedeSocial.repository.UsuarioRepository;
import com.generation.RedeSocial.service.UsuarioService;

@Service
public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	private UsuarioRepository repository;
	
	@Override
	public Usuario insertOrUpdate(Usuario entity) {
		Usuario usuarioSalvo = this.repository.save(entity);
		return usuarioSalvo;
	}
	

	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Usuario> getAll() {
		return (List<Usuario>) this.repository.findAll();
	}

	@Override
	public Usuario getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Usuario> getAllByNome(String nome) {
		return (List<Usuario>)this.repository.findAllByNome(nome);
	}
	
	@Override
	public Usuario getByNome(String nome) {
		return this.repository.findUsuarioByNome(nome);
	}


	@Override
	public List<Usuario> insertOrUpdateAll(List<Usuario> entities) {
		return (List<Usuario>) this.repository.saveAll(entities);
	}
}
