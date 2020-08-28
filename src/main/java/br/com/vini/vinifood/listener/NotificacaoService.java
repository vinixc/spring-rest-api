package br.com.vini.vinifood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.enums.NivelUrgencia;
import br.com.vini.vinifood.event.ClienteAtivadoEvent;
import br.com.vini.vinifood.notificacao.Notificador;

@Component
public class NotificacaoService {
	
	@Autowired
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente(), "Seu cadastro está ativo.");
	}

}
