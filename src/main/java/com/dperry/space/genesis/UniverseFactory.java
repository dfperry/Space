package com.dperry.space.genesis;

public class UniverseFactory {

	// container sizes
	private boolean isGalaxyCountRandom;
	private int galaxyCountMin;
	private int galaxyCountMax;
	private boolean isSolarsystemCountRandom;
	private int solarsystemCountMin;
	private int solarsystemCountMax;
	private boolean isplanetCountRandom;
	private int planetCountMin;
	private int planetCountMax;

	// planetary resources
	private int planetOreMin;
	private int planetOreMax;
	private int planetWaterMin;
	private int planetWaterMax;

	// planet sizes
	private int planetSizeMin;
	private int planetSizeMax;
	private int planetTypeWaterMin;
	private int planetTypeGasMin;
	
	// factories
	PlanetFactory planetFactory;
	
	
	public void spark() {
		
	}
	
	public void setGalaxyCountRandom( boolean isGalaxyCountRandom ) {
		this.isGalaxyCountRandom = isGalaxyCountRandom;
	}
	public void setGalaxyCountMin( int galaxyCountMin ) {
		this.galaxyCountMin = galaxyCountMin;
	}
	public void setGalaxyCountMax( int galaxyCountMax ) {
		this.galaxyCountMax = galaxyCountMax;
	}
	public void setSolarsystemCountRandom( boolean isSolarsystemCountRandom ) {
		this.isSolarsystemCountRandom = isSolarsystemCountRandom;
	}
	public void setSolarsystemCountMin( int solarsystemCountMin ) {
		this.solarsystemCountMin = solarsystemCountMin;
	}
	public void setSolarsystemCountMax( int solarsystemCountMax ) {
		this.solarsystemCountMax = solarsystemCountMax;
	}
	public void setIsplanetCountRandom( boolean isplanetCountRandom ) {
		this.isplanetCountRandom = isplanetCountRandom;
	}
	public void setPlanetCountMin( int planetCountMin ) {
		this.planetCountMin = planetCountMin;
	}
	public void setPlanetCountMax( int planetCountMax ) {
		this.planetCountMax = planetCountMax;
	}
	public void setPlanetOreMin( int planetOreMin ) {
		this.planetOreMin = planetOreMin;
	}
	public void setPlanetOreMax( int planetOreMax ) {
		this.planetOreMax = planetOreMax;
	}
	public void setPlanetWaterMin( int planetWaterMin ) {
		this.planetWaterMin = planetWaterMin;
	}
	public void setPlanetWaterMax( int planetWaterMax ) {
		this.planetWaterMax = planetWaterMax;
	}
	public void setPlanetSizeMin( int planetSizeMin ) {
		this.planetSizeMin = planetSizeMin;
	}
	public void setPlanetSizeMax( int planetSizeMax ) {
		this.planetSizeMax = planetSizeMax;
	}
	public void setPlanetTypeWaterMin( int planetTypeWaterMin ) {
		this.planetTypeWaterMin = planetTypeWaterMin;
	}
	public void setPlanetTypeGasMin( int planetTypeGasMin ) {
		this.planetTypeGasMin = planetTypeGasMin;
	}
}
