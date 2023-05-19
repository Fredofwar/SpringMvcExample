package com.smartcode.spring.mvc.customvalidator;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = CPostalMexicoValidator.class) //Futura clase con la logica de validación
@Target({ElementType.METHOD, ElementType.FIELD}) //destino de la validacion a metodos o campos
@Retention(RetentionPolicy.RUNTIME) // chequea la anotacion en tiempo de jecución
public @interface CPostalMexico {
	
	//definir el codigo postal por defecto
	public String values() default "61";
	// definir el mensaje de error
	public String  message() default "El codigo postal debe comenzar por 28";
	// definir los grupos
	Class<?>[] groups() default {};
	//definir los payloads
	Class<? extends Payload>[] payload() default {};
	
}
