package com.dperry.space.genesis;

import com.dperry.space.model.space.Planet;

public class PlanetFactory {

	private int planetOreMin;
	private int planetOreMax;
	private int planetWaterMin;
	private int planetWaterMax;

	// planet sizes
	private int planetSizeMin;
	private int planetSizeMax;
	private int planetTypeWaterMin;
	private int planetTypeGasMin;

	public Planet createPlanet() {

		return new Planet();
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
