package com.codigojava.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	
	MyMath math = new MyMath();
	
	//Absence of failure ie success
	//Test condition or assert
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll");
	}
	
	@BeforeEach
	void beforeEAch(){
		System.out.println("BeforeEach");
	}
	


	@Test
	void calculateSum_ThreeMemberArry() {
		assertEquals(6, math.sum(new int[] {1,2,3} ));
	}
	
	@Test
	void calculateSum_ZeroMemberArray() {
		assertEquals(0, math.sum(new int[] {} ));
	}

	@AfterAll
	static void afterAll() {
		System.out.println("AfterAll");
	}
}
