package com.csilocacoes.myapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csilocacoes.myapi.domain.Usuario;
import com.csilocacoes.myapi.exceptions.ObjectNotFoundException;
import com.csilocacoes.myapi.repositories.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;

	public Usuario findById(Integer id) {
		Optional<Usuario> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", tipo: " + Usuario.class.getName()));
	}

	public List<Usuario> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	public Usuario update(Integer id, Usuario obj) {

		Usuario newObj = findById(id);

		newObj.setNome(obj.getNome());
		newObj.setLogin(obj.getLogin());
		newObj.setSenha(obj.getSenha());

		return repository.save(newObj);

	}

	public Usuario create(Usuario obj) {
		obj.setId(null);

		return repository.save(obj);
	}

	public void delete(Integer id) {

		findById(id);
		
		repository.deleteById(id);

	}

}
