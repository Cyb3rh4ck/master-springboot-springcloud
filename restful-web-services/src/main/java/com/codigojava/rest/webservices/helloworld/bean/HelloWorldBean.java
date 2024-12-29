package com.codigojava.rest.webservices.helloworld.bean;

public record HelloWorldBean(String message) {

	public HelloWorldBean(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "HelloWorldBean [message=" + message + "]";
	}

}
