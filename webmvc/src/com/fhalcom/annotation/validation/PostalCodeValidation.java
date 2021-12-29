package com.fhalcom.annotation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PostalCodeValidation implements ConstraintValidator<PostalCodeValidationI, String>{

    private String prefijo;

    public void initialize(PostalCodeValidationI code){
        prefijo=code.value();
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
     
        boolean ecuadorCode = false;
        if(value!=null) ecuadorCode = value.startsWith(this.prefijo);
        else ecuadorCode = true;
        return ecuadorCode;
    }

}
