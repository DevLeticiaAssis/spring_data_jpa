package br.com.eco.EcoBase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eco.EcoBase.entity.Categoria;
import br.com.eco.EcoBase.repository.CategoriaRepository;
import br.com.eco.EcoBase.service.CategoriaService;

@Service
public class CategoriaServiceImpl implements CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	@Override
	public Categoria insertOrUpdate(Categoria entity) {
		Categoria categoriaSalvo = this.repository.save(entity);
		return categoriaSalvo;
	}
	
	@Override
	public void delete(int id) {
		this.repository.deleteById(id);
	}

	@Override
	public List<Categoria> getAll() {
		return (List<Categoria>) this.repository.findAll();
	}

	@Override
	public Categoria getById(int id) {
		return this.repository.findById(id).orElse(null);
	}

	@Override
	public List<Categoria> getAllByNome(String nome) {
		return (List<Categoria>)this.repository.findAllByNome(nome);
	}
	
	@Override
	public Categoria getByNome(String nome) {
		return this.repository.findUsuarioByNome(nome);
	}


	@Override
	public List<Categoria> insertOrUpdateAll(List<Categoria> entities) {
		return (List<Categoria>) this.repository.saveAll(entities);
	}	

}
