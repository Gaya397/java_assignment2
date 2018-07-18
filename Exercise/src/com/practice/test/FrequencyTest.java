package com.practice.test;

import static org.junit.Assert.*;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

//import com.practice.Fact;
import com.practice.Frequency1;

public class FrequencyTest {

	@BeforeClass
	public static void setup() {
		// This methods runs, before running any one of the test case
		// This method is used to initialize the required variables
		//obj2 = new Fact ();

	}

	@AfterClass
	public static void teardown() {
		// This method runs, after running all the test cases
		// This method is used to clear the initialized variables
		//obj2 = null;

	}
	@Test
	   public void testFrequency() throws FileNotFoundException {
	       
	       Map<String, Integer> words = new HashMap<String, Integer>();
	       String path ="/home/gayathri/Desktop/FileDemo.txt/";

	       String expected="{sleep=1, a=2, home.=1, like=1, have=1, i=3, man=1, to=1, am=1, ,=2}";
	       assertEquals(expected,Frequency1.countWordFrequency(path,words));
	       }

}
