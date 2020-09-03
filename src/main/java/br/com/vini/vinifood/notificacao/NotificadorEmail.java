package br.com.vini.vinifood.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.domain.model.Cliente;
import br.com.vini.vinifood.enums.NivelUrgencia;

@Component
//@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
public class NotificadorEmail implements Notificador {
	
	@Autowired
	private NotificadorProperties properties;
	
	private boolean caixaAlta;
	private String hostServidorSmtp = "smtp.vini.com.br";
	
	public NotificadorEmail() {
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(isCaixaAlta()) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.println("HOST: " +this.properties.getHostServidor());
		System.out.println("PORTA: " +this.properties.getPortaServidor());

		
		System.out.printf("Notificando %s através do e-mail %s usando SMTP: %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp,mensagem);
	}

	public boolean isCaixaAlta() {
		return caixaAlta;
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
}
