package com.dperry.space.genesis;

import org.junit.Before;
import org.junit.Test;

//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration
public class PlanetFactoryTest {

	private PlanetFactory planetFactory = null;
	
	@Before
	public void setup() {
		planetFactory = new PlanetFactory();
		planetFactory.setPlanetSizeMin( 10 );
		planetFactory.setPlanetSizeMax( 10 );
		planetFactory.setGridHeight( 400 );
		planetFactory.setGridWidth( 600 );
	}
	
	@Test
	public void testCreatePlanet() {
		planetFactory.createPlanet();
	}
}
