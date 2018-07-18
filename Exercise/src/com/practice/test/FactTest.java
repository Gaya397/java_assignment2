package com.practice.test;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.practice.Fact;

public class FactTest {

	
		private static Fact obj2;
		
		

		@BeforeClass
		public static void setup() {
			// This methods runs, before running any one of the test case
			// This method is used to initialize the required variables
			obj2 = new Fact ();

		}

		@AfterClass
		public static void teardown() {
			// This method runs, after running all the test cases
			// This method is used to clear the initialized variables
			obj2 = null;

		}
		
		
		
		@Test
		public void testfact()
		{
	long b=2432902008176640000L;
			assertEquals("factorial",479001600,obj2.intFact(1,1));
			assertEquals("Longfactorial",b,obj2.printLongFact(1,1));
	}

}
