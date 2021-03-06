package br.com.vini.vinifood.domain.repository;

import java.util.List;

import br.com.vini.vinifood.domain.model.Cozinha;

public interface CozinhaRepository {
	
	List<Cozinha> listar();
	Cozinha buscar(Long id);
	Cozinha salvar(Cozinha cozinha);
	void remover(Cozinha cozinha);

}
