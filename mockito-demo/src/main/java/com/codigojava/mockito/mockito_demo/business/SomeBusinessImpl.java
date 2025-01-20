package com.codigojava.mockito.mockito_demo.business;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}
	
	public int findTheGreatesFromAllData() {
		int[] data = dataService.retrieveAllData();
		int greatesValue = Integer.MIN_VALUE;
		for(int value : data) {
			if(value > greatesValue)
				greatesValue = value;
		}
		return greatesValue;
	}


}
