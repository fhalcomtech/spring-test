package com.fhalcom.annotation.validation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy=PostalCodeValidation.class)  // Clase con la logica de la validacion
@Target({ElementType.METHOD, ElementType.FIELD}) // Destino de nestra validacion
@Retention(RetentionPolicy.RUNTIME) //Chequea la anotac|ion en tiempo de ejecución

public @interface PostalCodeValidationI {

    //Definir payload

    public String value() default "593"; //Defini el codigo inicial del codigo postal

    public String message() default "Ecuatorians postal codes began with 593";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {}; 

}
