package br.com.vini.vinifood.domain.repository;

import java.util.List;

import br.com.vini.vinifood.domain.model.Restaurante;

public interface RestauranteRepository {
	
	List<Restaurante> listar();
	Restaurante buscar(Long id);
	Restaurante salvar(Restaurante restaurante);
	void remover(Restaurante restaurante);

}
