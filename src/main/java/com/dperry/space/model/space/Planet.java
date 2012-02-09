package com.dperry.space.model.space;

import java.util.List;


public class Planet extends SpaceObject {

	int size;
	
	PlanetType planetType;
	
	List<PlanetPlot> planetPlots;
	
	public Planet() {
		
	}
	
	public PlanetPlot getPlanetPlot( int x, int y ) {
		if( planetPlots != null ) {
			for( PlanetPlot planetPlot : planetPlots ) {
				if( planetPlot.getX() == x && planetPlot.getY() == y ) {
					return planetPlot;
				}
			}
		}
		System.out.println( "plot not found");
		return null;
	}
	
	public void setPlanetPlot( int x, int y, PlanetPlot plot ) {
		if( planetPlots != null ) {
			for( PlanetPlot planetPlot : planetPlots ) {
				if( planetPlot.getX() == x && planetPlot.getY() == y ) {
					planetPlot = plot;
				}
			}
		}
		System.out.println( "plot not found");
	}

	public int getSize() {
		return size;
	}
	public void setSize( int size ) {
		this.size = size;
	}
	public List<PlanetPlot> getPlanetPlots() {
		return planetPlots;
	}
	public void setPlanetPlots( List<PlanetPlot> planetPlots ) {
		this.planetPlots = planetPlots;
	}
	public PlanetType getPlanetType() {
		return planetType;
	}
	public void setPlanetType( PlanetType planetType ) {
		this.planetType = planetType;
	}
}
