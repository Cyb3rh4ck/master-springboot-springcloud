package com.codigojava.junit;

public class MyMath {
	//{1,2,3} => 1+2+3 = 6
	
	public int sum(int [] numbers) {
		int sum = 0;
		for(int number : numbers) {
			sum += number;
		}
		
		return sum;
	}
}
