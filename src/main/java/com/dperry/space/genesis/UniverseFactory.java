package com.dperry.space.genesis;

public class UniverseFactory {

	// container sizes
	private int gridHeight;
	private int gridWidth;
	
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
	private GalaxyFactory galaxyFactory;
	private SolarSystemFactory solarSystemFactory;
	private PlanetFactory planetFactory;
	
	public UniverseFactory() {
		
	}
	
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
	public void setGridHeight( int gridHeight ) {
		this.gridHeight = gridHeight;
	}
	public void setGridWidth( int gridWidth ) {
		this.gridWidth = gridWidth;
	}
	public GalaxyFactory getGalaxyFactory() {
		return galaxyFactory;
	}
	public void setGalaxyFactory( GalaxyFactory galaxyFactory ) {
		this.galaxyFactory = galaxyFactory;
	}
	public SolarSystemFactory getSolarSystemFactory() {
		return solarSystemFactory;
	}
	public void setSolarSystemFactory( SolarSystemFactory solarSystemFactory ) {
		this.solarSystemFactory = solarSystemFactory;
	}
	public PlanetFactory getPlanetFactory() {
		return planetFactory;
	}
	public void setPlanetFactory( PlanetFactory planetFactory ) {
		this.planetFactory = planetFactory;
	}
	public int getGridHeight() {
		return gridHeight;
	}
	public int getGridWidth() {
		return gridWidth;
	}
	public boolean isGalaxyCountRandom() {
		return isGalaxyCountRandom;
	}
	public int getGalaxyCountMin() {
		return galaxyCountMin;
	}
	public int getGalaxyCountMax() {
		return galaxyCountMax;
	}
	public boolean isSolarsystemCountRandom() {
		return isSolarsystemCountRandom;
	}
	public int getSolarsystemCountMin() {
		return solarsystemCountMin;
	}
	public int getSolarsystemCountMax() {
		return solarsystemCountMax;
	}
	public boolean isIsplanetCountRandom() {
		return isplanetCountRandom;
	}
	public int getPlanetCountMin() {
		return planetCountMin;
	}
	public int getPlanetCountMax() {
		return planetCountMax;
	}
	public int getPlanetOreMin() {
		return planetOreMin;
	}
	public int getPlanetOreMax() {
		return planetOreMax;
	}
	public int getPlanetWaterMin() {
		return planetWaterMin;
	}
	public int getPlanetWaterMax() {
		return planetWaterMax;
	}
	public int getPlanetSizeMin() {
		return planetSizeMin;
	}
	public int getPlanetSizeMax() {
		return planetSizeMax;
	}
	public int getPlanetTypeWaterMin() {
		return planetTypeWaterMin;
	}
	public int getPlanetTypeGasMin() {
		return planetTypeGasMin;
	}
}
