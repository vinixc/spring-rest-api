package br.com.vini.vinifood.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.enums.NivelUrgencia;
import br.com.vini.vinifood.modelo.Cliente;
import br.com.vini.vinifood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	@TipoDoNotificador(NivelUrgencia.NORMAL)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
