package com.practice.test;

import static org.junit.Assert.*;
import com.practice.Avg;



import org.junit.Test;

public class Avgtest {
 private static Avg objavg;
	
	
		@Test
	       public void testCheckAvg() {
	           String[] expect = { "81.5", "65", "98" };
	           int [] arr1 = { 86, 65, 98, 77 };
	           float actual = objavg.FindAvg(arr1);
	           float ex=(float) 81.5;
	           assertEquals(ex, actual,0.001);

	       }
	    
	        
	    @Test
	    public void testCheckMax()
	    {
	        int[] arr1= {86,65,98,77};
	        assertEquals(98,objavg.CheckMax(arr1));
	    }
	    @Test
	    public void testCheckMin()
	    {
	        int[] arr1= {86,65,98,77};
	        assertEquals(65,objavg.CheckMin(arr1));
	    }
	}


