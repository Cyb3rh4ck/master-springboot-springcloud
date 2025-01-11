package com.codigojava.spring.learnspringframework.enterprise.example;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BusinessService {
	

	private DataService dataService;
	
	@Autowired
	public BusinessService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public long calculateSum() {
		List<Integer> data = dataService.getData();
		return data.stream().reduce(Integer::sum).get();
	}
	

}
