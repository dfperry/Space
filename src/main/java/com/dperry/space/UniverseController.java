package com.dperry.space;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dperry.space.model.space.Galaxy;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping("/universe")
public class UniverseController {
	
	private static final Logger logger = LoggerFactory.getLogger(UniverseController.class);
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		
		List<Galaxy> galaxies = new ArrayList<Galaxy>();
		Galaxy galaxy = new Galaxy();
		
		model.addAttribute( "galaxies", galaxies );
		return "overview";
	}
	
}
