package com.tnsif.testingdemo;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;

// if expected value equals to actual
//// if condition is false->test will be failed

public class Assertexample {
//	@Test
//	void testEquals() {
//		int result=10+5;
//		System.out.println("running assertequals test..");
//		System.out.println("Expected=15,Actual= "+result);
//	//	assertEquals(19, result);
//		// assertNotEquals()- checks values are not Equal
//		assertNotEquals(20, 10+5);
//		
//		
//		
//	}
	
	// AssertTrue()-Test passes only if condition is true
  @Test
	void testTrue() {
		boolean isadult=20>18;
		System.out.println("checking if 20>18");
		assertNull(isadult);
	}
}
