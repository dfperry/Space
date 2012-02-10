package com.dperry.space;

import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dperry.space.genesis.PlanetFactory;
import com.dperry.space.model.space.Planet;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/overview")
public class OverviewController {
	
	private static final Logger logger = LoggerFactory.getLogger(OverviewController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		return "overview";
	}
	
	@RequestMapping("/planettest")
	public String viewPlanetTest( Model model ) {
		
		PlanetFactory planetFactory = new PlanetFactory();
		planetFactory.setPlanetSizeMin( 10 );
		planetFactory.setPlanetSizeMax( 50 );
		planetFactory.setGridHeight( 400 );
		planetFactory.setGridWidth( 600 );
		planetFactory.setPlanetTypeGasMin( 35 );
		planetFactory.setPlanetTypeWaterMin( 20 );
		planetFactory.setPlanetOreMin( 50 );
		planetFactory.setPlanetOreMax( 500 );
		
		Planet planet = planetFactory.createPlanet();
		
		model.addAttribute( "planet", planet );
		
		return "planet";
	}
	
}
