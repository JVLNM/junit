package com.epam.tdddemo;

import static org.junit.Assert.*;

import org.junit.Test;

public class remove {
	/*
	     “ABCD” => “BCD”
         “AACD” => “CD”
         “BACD” => “BCD”
         “BBAA” => “BBAA”
         “AABAA” => “BAA”
	  */
	

	@Test
	public void testingA() {
		removeA rem=new removeA();
	    assertEquals("BCD",rem.removing("ABCD"));
	}
	    
	@Test
	public void testingAA() {
		   
		removeA rem=new removeA();
		    assertEquals("CD",rem.removing("AACD"));
	    		
	}
	@Test
	public void testingBA() {
		   
		removeA rem=new removeA(); 
		    assertEquals("BCD",rem.removing("BACD"));
	    		
	}
	@Test
	public void testingBB() {
		   
		removeA rem=new removeA();  
		    assertEquals("BBAA",rem.removing("BBAA"));
	    		
	}
	@Test
	public void testingN() {
		removeA rem=new removeA();  
		    
		    assertEquals("CD",rem.removing("AAACD"));
	    		
	}
}
