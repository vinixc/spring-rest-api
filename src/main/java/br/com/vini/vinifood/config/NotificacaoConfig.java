package br.com.vini.vinifood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.vini.vinifood.notificacao.Notificador;
import br.com.vini.vinifood.notificacao.NotificadorEmail;
import br.com.vini.vinifood.notificacao.NotificadorSMS;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public Notificador notificadorEmail() {
		return new NotificadorEmail("smtp.vini.com.br");
	}
	
	@Bean
	public Notificador notificadorSMS() {
		return new NotificadorSMS();
	}

}
