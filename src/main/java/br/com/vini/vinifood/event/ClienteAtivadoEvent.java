package br.com.vini.vinifood.event;

import br.com.vini.vinifood.domain.model.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;

	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
