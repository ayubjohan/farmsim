package org.farmsim.animals;

public class Chicken extends Animal {
	
	public int EggNum=10;

	public Chicken() {
		super();
	}
	
	public void collectEggs() {
		EggNum -= 1;
	}
	
	public int getEggNum() {
		return EggNum;
	}
	
	
}
