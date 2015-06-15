package be.vdab.entities;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VeilingTest {
	
	private Veiling veiling;
	
	@Before
	public void before(){
		veiling = new Veiling();
	}

	@Test
	public void testGeenEnkelBodDanHoogstBodIsNul() {
		assertEquals(0, veiling.getHoogsteBod());
	}
	
	@Test
	public void testEersteEnEnigeBodIsGelijkAanHoogsteBod(){
		veiling.doeBod(10);
		assertEquals(10, veiling.getHoogsteBod());		
	}
	
	@Test
	public void testBijMeerdereBiedingenIsHetHoogsteOokHetHoogsteBod(){
		veiling.doeBod(5);
		veiling.doeBod(10);
		veiling.doeBod(2);
		assertEquals(10, veiling.getHoogsteBod());
	}	
	
}
