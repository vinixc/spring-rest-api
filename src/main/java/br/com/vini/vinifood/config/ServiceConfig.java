package br.com.vini.vinifood.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import br.com.vini.vinifood.notificacao.Notificador;
import br.com.vini.vinifood.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
