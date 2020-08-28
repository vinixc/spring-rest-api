package br.com.vini.vinifood.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import org.springframework.beans.factory.annotation.Qualifier;

import br.com.vini.vinifood.enums.NivelUrgencia;

@Retention(RetentionPolicy.RUNTIME)
@Qualifier
public @interface TipoDoNotificador {
	
	NivelUrgencia value();

}
