package com.tnsif.testingdemo;

import static org.junit.Assume.assumeFalse;
import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class Assumedemo {
@Test
	void assueme(){
		System.out.println("checking assumptions....");
		
		assumeFalse(10>5);
		System.out.println("assumption passed,");
		
		assertEquals(20, 10+5);
	}
}
