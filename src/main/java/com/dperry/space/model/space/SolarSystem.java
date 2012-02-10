package com.dperry.space.model.space;

import java.util.List;

public class SolarSystem extends SpaceObject {

	private int solarSystemId;
	private int galaxyId;
	private String name;
	private List<Planet> planets;
	
	public int getSolarSystemId() {
		return solarSystemId;
	}
	public void setSolarSystemId( int solarSystemId ) {
		this.solarSystemId = solarSystemId;
	}
	public int getGalaxyId() {
		return galaxyId;
	}
	public void setGalaxyId( int galaxyId ) {
		this.galaxyId = galaxyId;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public List<Planet> getPlanets() {
		return planets;
	}
	public void setPlanets( List<Planet> planets ) {
		this.planets = planets;
	}
	
}
