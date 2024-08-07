package com.in28minutes.junit.helper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringHelperTest {
	
	StringHelper helper ;
	
	@Before 
	public void  before() {
		helper=new StringHelper();
	}
	@Test
	public void test() {
		
		//AACD => CD ACD => CD CDEF CDAA => CDAA
//		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",helper.truncateAInFirst2Positions("ACD"));

		//EXPECTED , ACTUAL
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
		
		//AACD => CD ACD => CD CDEF CDAA => CDAA
		assertEquals("CD",helper.truncateAInFirst2Positions("AACD"));
	}
	@Test
	public void testTruncateAInFirst2Positions_1() {
		
		// CDEF=>CDEF CDAA => CDAA
		assertEquals("CDEF",helper.truncateAInFirst2Positions("CDEF"));
	}
	
	@Test
	public void testTruncateAInFirst2Positions_3() {
		
		// CDAA => CDAA
		assertEquals("CDAA",helper.truncateAInFirst2Positions("CDAA"));
	}

	// expected:<ABC[]> but was:<ABC[D]>
	
	
	//ABCD => FALSE ,ABAB=> TRUE ,AB=>TRUE ,A=> FALSE
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Pos() {
		assertFalse(helper.areFirstAndLastTwoCharactersTheSame("ABCD"));
	}
	
	@Test
	public void testAreFirstAndLastTwoCharactersTheSame_Neg() {
		assertTrue(helper.areFirstAndLastTwoCharactersTheSame("ABAB"));
	}

	
}
