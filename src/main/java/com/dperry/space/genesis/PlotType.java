package com.dperry.space.genesis;

public enum PlotType {
	LAND("land"),
	ROCK("rock"),
	GAS("gas"),
	WATER("water");
	
	private String description;
	
	private PlotType( String description ) {
		this.description = description;
	}
	
	public String toString() {
		return description;
	}
	
	public static PlotType byValue( String description ) {
		for( PlotType planetType : PlotType.values() ) {
			if( planetType.toString().equals( description ) ) {
				return planetType;
			}
		}
		return null;
	}
}
