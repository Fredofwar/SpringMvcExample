package com.smartcode.spring.mvc.customvalidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CPostalMexicoValidator implements ConstraintValidator<CPostalMexico, String>{
	
	private String prefixCodeMx;
	
	@Override
	public void initialize(CPostalMexico cp) {
		this.prefixCodeMx = cp.values();
	}

	@Override
	public boolean isValid(String arg0, ConstraintValidatorContext arg1) {
		boolean valCp;
		
		if (arg0 != null)
			valCp = arg0.startsWith(prefixCodeMx);
		else 
			valCp = true;
		
		return valCp;
	}

}
