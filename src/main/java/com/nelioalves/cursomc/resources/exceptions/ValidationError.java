package com.nelioalves.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {

	private static final long serialVersionUID = 1L;

	private List<FieldMessage> errors = new ArrayList<>();
	

	public ValidationError(Long timestamp, Integer status, String error, 
			String messge, String path) {
		super(timestamp, status, error, messge, path);
	}

	public List<FieldMessage> getErrors() {
		return errors;
	}
	
	public void setErrors(List<FieldMessage> errors) {
		this.errors = errors;
	}
	
	public void addError(String fieldName, String message) {
		this.errors.add(new FieldMessage(fieldName, message));
	}

}
