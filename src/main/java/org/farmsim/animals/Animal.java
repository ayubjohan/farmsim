package org.farmsim.animals;

public class Animal {
	
	private String species;
	public int happiness;
	
	public Animal() {
		
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void play() {
		happiness += 10;
	}
	
	public int getHappy() {
		return happiness;
	}
}
