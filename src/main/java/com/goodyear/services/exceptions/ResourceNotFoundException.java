package com.goodyear.services.exceptions;

public class ResourceNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResourceNotFoundException(Object id) {
		super("Resources not found. Id = " + id);
	}
	
}
