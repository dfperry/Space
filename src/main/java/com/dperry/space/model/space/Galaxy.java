package com.dperry.space.model.space;

import java.util.List;

public class Galaxy extends SpaceObject {
	
	private int universeId;
	private int galaxyId;
	private String name;
	private List<SolarSystem> solarSystems;
	
	public int getUniverseId() {
		return universeId;
	}
	public void setUniverseId( int universeId ) {
		this.universeId = universeId;
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
	public List<SolarSystem> getSolarSystems() {
		return solarSystems;
	}
	public void setSolarSystems( List<SolarSystem> solarSystems ) {
		this.solarSystems = solarSystems;
	}
}
