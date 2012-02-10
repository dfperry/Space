package com.dperry.space.model.space;

import java.util.List;

public class Universe extends SpaceObject {
	
	private int universeId;
	private String name;
	private List<Galaxy> galaxies;
	
	public int getUniverseId() {
		return universeId;
	}
	public void setUniverseId( int universeId ) {
		this.universeId = universeId;
	}
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public List<Galaxy> getGalaxies() {
		return galaxies;
	}
	public void setGalaxies( List<Galaxy> galaxies ) {
		this.galaxies = galaxies;
	}
	
}
