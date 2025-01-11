package com.codigojava.springboot.learnspringboot.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codigojava.springboot.learnspringboot.configurations.CurrencyServiceConfiguration;

@RestController
public class CurrencyConfigurationController {

	private CurrencyServiceConfiguration currencyConfiguration;
	
	public CurrencyConfigurationController(CurrencyServiceConfiguration currencyConfiguration) {
		super();
		this.currencyConfiguration = currencyConfiguration;
	}

	@GetMapping("/currency-configuration")
	public CurrencyServiceConfiguration retrieveCurrencyConfiguration() {
		return currencyConfiguration;
	}
}
