package br.com.vini.vinifood.notificacao;

import br.com.vini.vinifood.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	
	private boolean caixaAlta;
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(isCaixaAlta()) {
			mensagem = mensagem.toUpperCase();
		}
		
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
