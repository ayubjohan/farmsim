package org.farmsim.animals;

public class Chicken extends Animal {
	
	public int EggNum=10;

	public Chicken() {
		super("Chicked", 1);
	}
	
	public void collectEggs() {
		EggNum -= 1;
	}
	
	public int getEggNum() {
		return EggNum;
	}
	
	
}
