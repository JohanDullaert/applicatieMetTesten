package be.vdab.entities;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IsbnTest {

	private Isbn isbn;

	@Test(expected = IllegalArgumentException.class)
	public void test12CijfersIsOngeldigeIsbn() {
		isbn = new Isbn(-120000000000L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test14CijfersIsOngeldigeIsbn() {
		isbn = new Isbn(14000000000000L);
	}

	@Test(expected = IllegalArgumentException.class)
	public void test9789027439641IsOngeldigeIsbn() {
		isbn = new Isbn(9789027439641L);
	}

	@Test
	public void test9789027439642IsGeldigeIsbn() {
		isbn = new Isbn(9789027439642L);
	}

	@Test
	public void testToString() {
		isbn = new Isbn(9789027439642L);
		String string = "Isbn [isbnnummer=9789027439642]";
		assertEquals(string, isbn.toString());
	}
	
	//extra uit oplossing
	@Test(expected = IllegalArgumentException.class)
	public void hetNummer0IsVerkeerd() {
	new Isbn(0);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void eenNegatiefNummerIsVerkeerd() {
	new Isbn(-9789027439642L);
	}
	
	@Test(expected = IllegalArgumentException.class)
	public void eenNummerMet13CijfersMetVerkeerdControleGetal0() {
	new Isbn(7789227439640L);
	}
	@Test
	public void eenNummerMet13CijfersMetCorrectControleGetal0() {
	new Isbn(9789227439640L);
	}

}
