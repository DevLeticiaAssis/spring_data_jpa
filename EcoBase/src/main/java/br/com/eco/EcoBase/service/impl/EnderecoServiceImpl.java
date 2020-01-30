package br.com.eco.EcoBase.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.eco.EcoBase.entity.Endereco;
import br.com.eco.EcoBase.repository.EnderecoRepository;
import br.com.eco.EcoBase.service.EnderecoService;

@Service
public class EnderecoServiceImpl implements EnderecoService {

		@Autowired
		private EnderecoRepository repository;
		
		@Override
		public Endereco insertOrUpdate(Endereco entity) {
			Endereco enderecoSalvo = this.repository.save(entity);
			return enderecoSalvo;
		}
		
		@Override
		public void delete(int id) {
			this.repository.deleteById(id);
		}

		@Override
		public List<Endereco> getAll() {
			return (List<Endereco>) this.repository.findAll();
		}

		@Override
		public Endereco getById(int id) {
			return this.repository.findById(id).orElse(null);
		}

		@Override
		public List<Endereco> getAllByRua(String rua) {
			return (List<Endereco>)this.repository.findAllByRua(rua);
		}
		
		@Override
		public Endereco getByRua(String rua) {
			return this.repository.findEnderecoByRua(rua);
		}


		@Override
		public List<Endereco> insertOrUpdateAll(List<Endereco> entities) {
			return (List<Endereco>) this.repository.saveAll(entities);
		}
}
