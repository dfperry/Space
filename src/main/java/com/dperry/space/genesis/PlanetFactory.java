package com.dperry.space.genesis;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.dperry.space.model.space.Planet;
import com.dperry.space.model.space.PlanetPlot;
import com.dperry.space.model.space.PlanetType;
import com.dperry.space.model.space.PlotType;

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

	private int gridHeight;
	private int gridWidth;

	private Random random = new Random( System.currentTimeMillis() );

	public Planet createPlanet() {

		Planet planet = new Planet();
		planet.setX( random.nextInt( gridWidth ) );
		planet.setY( random.nextInt( gridHeight ) );
		planet.setSize( random.nextInt( planetSizeMax - planetSizeMin + 1 ) + planetSizeMin );
		
		planet.setPlanetType( PlanetType.ROCK );
		
		if( planet.getSize() > planetTypeWaterMin && random.nextBoolean() && random.nextBoolean() ) {
			planet.setPlanetType( PlanetType.WATER );
		}
		if( planet.getSize() > planetTypeWaterMin ) {
			if( random.nextBoolean() ) {
				planet.setPlanetType( PlanetType.LAND );
			}
			else if ( random.nextBoolean() && random.nextBoolean() ) {
				planet.setPlanetType( PlanetType.WATER );
			}
		}
		if( planet.getSize() > planetTypeGasMin && random.nextBoolean() && random.nextBoolean() ) {
			planet.setPlanetType( PlanetType.GAS );
		}

		generatePlots( planet );
		
		if( planet.getPlanetType() == PlanetType.LAND ) {
			generateOcean( planet );
		}
		
		generateOre( planet );

		return planet;
	}
	
	public void generatePlots( Planet planet ) {
		int width = planet.getSize() * 2;
		int height = planet.getSize();
		
		List<PlanetPlot> plots = new ArrayList<PlanetPlot>(); 
		
		for( int i = 0; i < height; i++ ) {
			for( int j = 0; j < width; j++ ) {
				PlanetPlot plot = new PlanetPlot();
				plot.setX( j );
				plot.setY( i );	
				
				switch( planet.getPlanetType() ) {
					case GAS:
						plot.setPlotType( PlotType.GAS );
						break;
					case WATER:
						plot.setPlotType( PlotType.WATER );
						break;
					case ROCK:
						plot.setPlotType( PlotType.ROCK );
						break;
					case LAND:
						plot.setPlotType( PlotType.LAND );
				}
				
				plots.add( plot );
			}
		}
		planet.setPlanetPlots( plots );
	}
	
	public void generateOre( Planet planet ) {
		
	}
	
	public void generateOcean( Planet planet ) {
		int width = planet.getSize() * 2;
		int height = planet.getSize();
		boolean[][] ocean = new boolean[height][width];
		boolean[][] ocean2 = new boolean[height][width];

		// fill with random

		for( int i = 0; i < height; i++ ) {
			for( int j = 0; j < width; j++ ) {
				ocean[i][j] = random.nextBoolean();
			}
		}

		int r1_cutoff = 5;
		int r2_cutoff = 4;

		// clean up for a few generations

		for( int g = 0; g < 3; g++ ) {
			int xi, yi, ii, jj;
			for( yi = 1; yi < height - 1; yi++ )
				for( xi = 1; xi < width - 1; xi++ ) {
					int adjcount_r1 = 0, adjcount_r2 = 0;

					for( ii = -1; ii <= 1; ii++ ) {
						for( jj = -1; jj <= 1; jj++ ) {
							if( ocean[yi + ii][xi + jj] )
								adjcount_r1++;
						}
					}
					for( ii = yi - 2; ii <= yi + 2; ii++ ) {
						for( jj = xi - 2; jj <= xi + 2; jj++ ) {
							if( Math.abs( ii - yi ) == 2 && Math.abs( jj - xi ) == 2 )
								continue;
							if( ii < 0 || jj < 0 || ii >= height || jj >= width )
								continue;
							if( ocean[ii][jj] )
								adjcount_r2++;
						}
					}
					if( adjcount_r1 >= r1_cutoff || adjcount_r2 <= r2_cutoff )
						ocean2[yi][xi] = true;
					else
						ocean2[yi][xi] = false;
				}
			for( yi = 1; yi < height - 1; yi++ ) {
				for( xi = 1; xi < width - 1; xi++ ) {
					ocean[yi][xi] = ocean2[yi][xi];
				}
			}
		}

		// set water on plots
		for( int i = 0; i < height; i++ ) {
			for( int j = 0; j < width; j++ ) {
				if( ocean[i][j] ) {
					planet.getPlanetPlot( j, i ).setPlotType( PlotType.WATER );
				}
			}
		}
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
}
