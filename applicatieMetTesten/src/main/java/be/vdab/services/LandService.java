package be.vdab.services;

import java.math.BigDecimal;

import be.vdab.dao.LandDAO;
import be.vdab.entities.Land;

public class LandService {

	private final LandDAO landDAO;

	public LandService(LandDAO landDAO) {
		this.landDAO = landDAO;
	}

	public BigDecimal findVerhoudingOppervlakteLandTovOppervlakteAlleLanden(
			String landcode) {
		Land land = landDAO.read(landcode);
		int oppervlakteAlleLanden = landDAO.findOppervlakteAlleLanden();
		return new BigDecimal(land.getOppervlakte()).divide(new BigDecimal(
				oppervlakteAlleLanden));
	}

}
