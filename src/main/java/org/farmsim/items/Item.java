package org.farmsim.items;

public class Item {
	private boolean used;
	
	public Item () {
		System.out.println("Hello");
	}
	
	public void use () {
		this.used = false;
		System.out.println("You used me");
	}
}
