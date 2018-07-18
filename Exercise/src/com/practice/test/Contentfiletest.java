package com.practice.test;

import static org.junit.Assert.*;

import org.junit.Test;
import com.practice.Contentfile;

public class Contentfiletest {
	public static Contentfile cfile;

	@Test
	public void testFile() {
		String required = "HELLO EVERYONE";
		String filename = "/home/gayathri/Desktop/file.txt";
		assertEquals(required,cfile.fileread(filename));
		
		  
			 }
	@Test
	public void testFilelength() {
		int required = 14;
		String filename = "/home/gayathri/Desktop/file.txt";
		assertEquals(required,cfile.filelength(filename));
		
		
		  
			 }
		
	}








