package br.com.vini.vinifood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.vini.vinifood.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.vinimail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}

}
