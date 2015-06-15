package be.vdab.services;

import static org.junit.Assert.assertEquals;
//import be.vdab.dao.LandDAOStub;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import be.vdab.dao.LandDAO;
import be.vdab.entities.Land;

public class LandServiceTest {

	private LandDAO landDAO;
	private LandService landService;

	@Before
	public void before() {
		// landDAO = new LandDAOStub();
		landDAO = mock(LandDAO.class);
		when(landDAO.findOppervlakteAlleLanden()).thenReturn(20);
		when(landDAO.read("B")).thenReturn(new Land("B", 5));
		landService = new LandService(landDAO);
	}

	@Test
	public void findVerhoudingOppervlakteLandTovOppervlakteAlleLanden() {
		assertEquals(
				0,
				BigDecimal
						.valueOf(0.25)
						.compareTo(
								landService
										.findVerhoudingOppervlakteLandTovOppervlakteAlleLanden("B")));
		verify(landDAO).findOppervlakteAlleLanden();
		verify(landDAO).read("B");
	}
}
