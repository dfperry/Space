package com.dperry.space.model.space;


public class PlanetPlot {

	private int x;
	private int y;
	
	private int planetId;
	
	private int oreCount = 0;
	
	PlotType plotType = PlotType.ROCK; 
	
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
	public PlotType getPlotType() {
		return plotType;
	}
	public void setPlotType( PlotType plotType ) {
		this.plotType = plotType;
	}
	
}
