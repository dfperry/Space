package com.dperry.space.model.space;

public enum PlanetType {
	LAND("land"),
	ROCK("rock"),
	GAS("gas"),
	WATER("water");
	
	private String description;
	
	private PlanetType( String description ) {
		this.description = description;
	}
	
	public String toString() {
		return description;
	}
	
	public static PlanetType byValue( String description ) {
		for( PlanetType planetType : PlanetType.values() ) {
			if( planetType.toString().equals( description ) ) {
				return planetType;
			}
		}
		return null;
	}
}
