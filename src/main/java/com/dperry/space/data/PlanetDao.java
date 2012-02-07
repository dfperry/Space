package com.dperry.space.data;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.dperry.space.model.space.DiscoveredPlanet;
import com.dperry.space.model.space.Planet;

@Repository
@Transactional
public class PlanetDao {

	private SessionFactory sessionFactory;
	
	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	public PlanetDao() {
		
	}
	
	private Session currentSession() { 
		return sessionFactory.getCurrentSession();
	}
	
	@SuppressWarnings( "unchecked" )
	public List<Planet> getPlanetsForSystem( int systemId ) {
		return currentSession().createQuery( 
				"from Planet planet where planet.systemId = :id " )
				.setInteger( "id", systemId )
				.list();
	}
	
	@SuppressWarnings( "unchecked" )
	public List<DiscoveredPlanet> getDiscoveredPlanetsForSystem( int systemId, int userId ) {
		return currentSession().createQuery( 
				"from DiscoveredPlanet planet where planet.user.id = :userId and planet.planet.systemId = :systemId" )
				.setInteger( "userId", userId )
				.setInteger( "systemId", systemId )
				.list();		
	}
}
