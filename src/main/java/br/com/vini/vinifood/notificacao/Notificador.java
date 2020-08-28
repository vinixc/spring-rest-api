package br.com.vini.vinifood.notificacao;

import br.com.vini.vinifood.modelo.Cliente;

public interface Notificador {
	
	void notificar(Cliente cliente, String mensagem);
	
}
