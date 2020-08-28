package br.com.vini.vinifood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.event.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalService {
	
	@EventListener
	public void clienteAtivadoService(ClienteAtivadoEvent event) {
		System.out.println("Emitindo nota fiscal para o cliente: " + event.getCliente().getNome());
	}
}
