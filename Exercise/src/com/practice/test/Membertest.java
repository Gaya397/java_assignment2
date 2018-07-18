package com.practice.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.practice.Member1;
public class Membertest {
	  @Test 
	  public void testMember() { 
		  assertArrayEquals(new String[]{"Members name:Harry Potter","member salary:2500.3","member age:30"},Member1.getMemberVariable(new String[]{"Members name:","member salary:","member age:"}));
 }
}

