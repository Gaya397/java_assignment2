package com.practice.test;

import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import com.practice.NewFile1;

public class NewFile1test {
	
 private static NewFile1 list;
	@Test
	public void testNewfiles() {
		
		    File folder = new File("/home/gayathri/Desktop/checkfile/");
		    assertEquals("hello everyoneHai",list.listFilesForFolder(folder));

		}
	}


