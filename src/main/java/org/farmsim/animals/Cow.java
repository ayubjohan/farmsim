package org.farmsim.animals;

public class Cow extends Animal {
	
	public int milkAmount=10;
	
	public Cow() {
		super();
	}
	
	public void milk() {
		milkAmount -= 1;
	}
	
	public int getMilkAmount() {
		return milkAmount;
	}

}
