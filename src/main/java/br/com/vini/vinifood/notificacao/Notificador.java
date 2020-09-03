package br.com.vini.vinifood.notificacao;

import br.com.vini.vinifood.domain.model.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);
	
}
