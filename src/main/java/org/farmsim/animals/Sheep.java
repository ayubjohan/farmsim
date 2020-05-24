package org.farmsim.animals;

public class Sheep extends Animal {
	
	public int woolLevel=10;
	
	public Sheep() {
		super();
	}
	
	public void Sheer() {
		woolLevel -= 1;
	}
	
	public int getWoolLevel() {
		return woolLevel;
	}

}
