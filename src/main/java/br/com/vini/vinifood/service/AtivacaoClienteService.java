package br.com.vini.vinifood.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.vini.vinifood.modelo.Cliente;
import br.com.vini.vinifood.notificacao.Notificador;

@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		}
	}
}
