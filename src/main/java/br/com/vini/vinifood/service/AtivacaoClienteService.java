package br.com.vini.vinifood.service;

import org.springframework.beans.factory.annotation.Autowired;

import br.com.vini.vinifood.modelo.Cliente;
import br.com.vini.vinifood.notificacao.Notificador;

public class AtivacaoClienteService {

	@Autowired(required = false)
	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
	}
	
	public AtivacaoClienteService(String qualquer) {
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null)
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		else
			System.out.println("Não existe notificador, mas cliente foi ativado");
	}
	
}
