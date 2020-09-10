package br.com.vini.vinifood.jpa;

import java.util.List;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import br.com.vini.vinifood.VinifoodApiApplication;
import br.com.vini.vinifood.domain.model.Cozinha;

public class ConsultaCozinhaMain {
	
	public static void main(String[] args) {
		
		ApplicationContext application = new SpringApplicationBuilder(VinifoodApiApplication.class)
				.web(WebApplicationType.NONE)
				.run(args);
		
		
		CadastroCozinha cadastroCozinha = application.getBean(CadastroCozinha.class);
		List<Cozinha> listar = cadastroCozinha.listar();
		listar.forEach(System.out::println);
		
				
	}

}
