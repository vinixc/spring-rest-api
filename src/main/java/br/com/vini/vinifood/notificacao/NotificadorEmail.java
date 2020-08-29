package br.com.vini.vinifood.notificacao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.annotation.TipoDoNotificador;
import br.com.vini.vinifood.enums.NivelUrgencia;
import br.com.vini.vinifood.modelo.Cliente;

@Component
//@Profile("prod")
@TipoDoNotificador(NivelUrgencia.NORMAL)
public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp = "smtp.vini.com.br";
	
	@Value("${notificador.email.host-servidor}")
	private String host;
	@Value("${notificador.email.porta-servidor}")
	private Integer port;
	
	public NotificadorEmail() {
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(isCaixaAlta()) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.println("HOST: " +this.host);
		System.out.println("PORTA: " +this.port);

		
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
