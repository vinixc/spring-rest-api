package br.com.vini.vinifood.notificacao;

import org.springframework.stereotype.Component;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.enums.NivelUrgencia;
import br.com.vini.vinifood.modelo.Cliente;

@Component
@TipoDoNotificador(NivelUrgencia.URGENTE)
public class NotificadorSMS implements Notificador {
	
	public NotificadorSMS() {}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS atraves do telefon %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
