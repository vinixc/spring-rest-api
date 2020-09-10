package br.com.vini.vinifood.infrastructure.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;

import br.com.vini.vinifood.domain.model.Restaurante;
import br.com.vini.vinifood.domain.repository.RestauranteRepository;

@Component
public class RestauranteRepositoryImpl implements RestauranteRepository{
	
	@PersistenceContext
	private EntityManager manager;

	@Override
	public List<Restaurante> listar() {
		return manager.createQuery("FROM Restaurante", Restaurante.class).getResultList();
	}

	@Override
	public Restaurante buscar(Long id) {
		return manager.find(Restaurante.class, id);
	}

	@Override
	public Restaurante salvar(Restaurante restaurante) {
		return manager.merge(restaurante);
	}

	@Override
	public void remover(Restaurante restaurante) {
		manager.remove(restaurante);
	}
	
}
