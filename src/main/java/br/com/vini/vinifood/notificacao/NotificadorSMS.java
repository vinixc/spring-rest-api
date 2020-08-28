package br.com.vini.vinifood.notificacao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.modelo.Cliente;

@Primary
@Component
public class NotificadorSMS implements Notificador {
	
	public NotificadorSMS() {}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s por SMS atraves do telefon %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}
