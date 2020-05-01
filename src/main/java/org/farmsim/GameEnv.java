package org.farmsim;

import org.farmsim.Item;
import org.farmsim.Farm;

public class GameEnv {
	private final int defaultStartingCash = 1000;
	private final int defaultGameLength = 7; // days
	
	private final String name;
	private final int gameLength;
	private final Item[] inventory;
	private final Farm[] farms;

	private int balance;
	private int day;
	
	public GameEnv(String name, int... gameLength) {
		// Maybe a different farmer for every farm, so name should not go here?
		// Check 3 <= name.length() <= 15
		if (name.length() < 3 || name.length() > 15) {
			throw new IllegalArgumentException("Name must be between 3 and 15 characters.");
		}
		this.name = name;
		this.gameLength = gameLength.length > 0 ? gameLength[0] : defaultGameLength;
		if (this.gameLength < 5 || this.gameLength > 10) {
			throw new IllegalArgumentException("Game length must be between 5 and 10 days.");
		}
		this.balance = defaultStartingCash;
		this.day = 0;
		this.inventory = new Item[]{};
		this.farms = new Farm[]{};
		System.out.println("Welcome to the farm sim " + this.name);
	}
	
	public static void main(String[] args) {
		GameEnv game = new GameEnv("Johan", 7);
	}
	
	
	public void nextDay() {
		this.day += 1;
		// Reset actions etc.
		// Check if day > this.gameLength
	}
	
	public Farm createFarm(String farmName) {
		return new Farm(farmName);
	}
	
	public void buyItem(int price, Item item) {
		
	}
	
	public void useItem(int index, Object... itemArgs) {
//		this.inventory.splice(index, 1);
		// Git love me
	}
	
	public Item[] getInventory () {
		return this.inventory;
	}
}
