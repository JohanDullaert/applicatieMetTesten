package be.vdab.entities;

import static org.junit.Assert.*;

import org.junit.Test;

public class WoordTest {	

	@Test
	public void testIsWoordPalindroom() {
		assertTrue(new Woord("lepel").isPalindroom());
	}

	@Test
	public void testIsWoordGeenPalindroom() {
		assertFalse(new Woord("schaap").isPalindroom());
	}
	
	@Test
	public void testIsNullGeenPalindroom() {
		assertFalse(new Woord(null).isPalindroom());
	}
	
	@Test
	public void testIsLegeStringPalindroom() {
		assertTrue(new Woord("").isPalindroom());
	}
}
