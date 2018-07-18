package com.practice.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.practice.EvenNumTest;

public class EvenNumTest1 {

	@Test
	public void testIsEven() {
		assertEquals("testIsEven(),checking if even"
				,true,EvenNumTest.isEven(4));
	
	
	}

}
