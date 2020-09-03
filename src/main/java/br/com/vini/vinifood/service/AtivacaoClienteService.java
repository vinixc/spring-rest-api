package br.com.vini.vinifood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.domain.model.Cliente;
import br.com.vini.vinifood.event.ClienteAtivadoEvent;

@Component
public class AtivacaoClienteService {
	
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		//dizer para o container que o cliente esta ativo neste momento.
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));
	}
}
