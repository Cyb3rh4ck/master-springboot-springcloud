package com.codigojava.rest.webservices.user.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class UserNotFoundException extends RuntimeException {
	
	private static final long serialVersionUID = -2907589908299782763L;

	public UserNotFoundException(String message) {
		super(message);
	}

}
