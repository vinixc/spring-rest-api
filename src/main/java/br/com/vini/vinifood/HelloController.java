package br.com.vini.vinifood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.vini.vinifood.modelo.Cliente;
import br.com.vini.vinifood.service.AtivacaoClienteService;

@Controller
public class HelloController {
	
	private AtivacaoClienteService ativacaoClienteService;

	public HelloController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("HelloController: " + ativacaoClienteService);
	}

	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("Joao", "joao@gmail.com", "1231213");
		
		ativacaoClienteService.ativar(joao);
		
		return "Oie!";
	}
}
