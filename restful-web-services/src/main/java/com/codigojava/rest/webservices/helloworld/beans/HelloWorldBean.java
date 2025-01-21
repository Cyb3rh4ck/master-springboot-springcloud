package com.codigojava.rest.webservices.helloworld.beans;

public record HelloWorldBean(String message) {

	public HelloWorldBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
