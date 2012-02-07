package com.dperry.space.model.space;

import java.util.Date;

import com.dperry.space.model.User;

public class DiscoveredPlanet {

	private String name;
	private User user;
	private Planet planet;
	private Date date;
	
	public String getName() {
		return name;
	}
	public void setName( String name ) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser( User user ) {
		this.user = user;
	}
	public Planet getPlanet() {
		return planet;
	}
	public void setPlanet( Planet planet ) {
		this.planet = planet;
	}
	public Date getDate() {
		return date;
	}
	public void setDate( Date date ) {
		this.date = date;
	}
}
