package com.codigojava.rest.webservices.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.codigojava.rest.webservices.helloworld.beans.HelloWorldBean;

@RestController
public class HelloWorldController {
	
	/**
	 * @return string
	 */
	@GetMapping("/hello-world")
	public String helloWorld() {
		return "Hello World";
	}
	
	/**
	 * @return HelloWorldBean json format
	 */
	@GetMapping("/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hello World");
	}
	
	/**
	 * Path Parameters
	 *  /users/{id}/todos/{id} => /users/2/todos/200
	 *  /hello-world/path-variable/{name} => /hello-world/path-variable/Evan
	 */
	@GetMapping("/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorldPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hello World, %s", name));
	}

}
