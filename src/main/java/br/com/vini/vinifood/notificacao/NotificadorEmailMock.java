package br.com.vini.vinifood.notificacao;

import org.springframework.context.annotation.Profile;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.domain.model.Cliente;
import br.com.vini.vinifood.enums.NivelUrgencia;

@Profile("dev")
//@Component
@TipoDoNotificador(NivelUrgencia.NORMAL)
public class NotificadorEmailMock implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(),mensagem);
	}
}
