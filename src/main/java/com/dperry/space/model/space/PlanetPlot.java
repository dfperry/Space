package com.dperry.space.model.space;

public class PlanetPlot {

	private int x;
	private int y;
	
	private int planetId;
	
	private int oreCount = 0;
	
	private boolean isWater = false;
	private boolean isGas = false;
	private boolean isRock = true;
	private boolean isLand = false;
	
	public int getX() {
		return x;
	}
	public void setX( int x ) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY( int y ) {
		this.y = y;
	}
	public int getPlanetId() {
		return planetId;
	}
	public void setPlanetId( int planetId ) {
		this.planetId = planetId;
	}
	public int getOreCount() {
		return oreCount;
	}
	public void setOreCount( int oreCount ) {
		this.oreCount = oreCount;
	}
	public boolean isWater() {
		return isWater;
	}
	public void setWater( boolean isWater ) {
		this.isWater = isWater;
	}
	public boolean isGas() {
		return isGas;
	}
	public void setGas( boolean isGas ) {
		this.isGas = isGas;
	}
	public boolean isRock() {
		return isRock;
	}
	public void setRock( boolean isRock ) {
		this.isRock = isRock;
	}
	public boolean isLand() {
		return isLand;
	}
	public void setLand( boolean isLand ) {
		this.isLand = isLand;
	}
}
