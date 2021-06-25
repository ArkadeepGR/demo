package com.testing.demo;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;

class CalculatorTest {

	
	
	@Test
	public void DevideTest() {
		Calculator c=new Calculator();
		float res=c.divide(1,2);
		System.out.println(res);
		assertEquals(0.5,res);
	}
	
	/*
	@Test
	public void DevideTestZero() {
		Calculator c=new Calculator();
		org.junit.jupiter.api.Assertions.assertThrows(ArithmeticException.class,c.divide(2,0));
	}
	*/

}
