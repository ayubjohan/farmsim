package org.farmsim;

import java.util.ArrayList;
import org.farmsim.items.Item;
import org.farmsim.Farm;

public class GameEnv {
	private final int defaultStartingCash = 1000;
	private final int defaultGameLength = 7; // days
	
	private final String name;
	private final int gameLength;
	private final ArrayList<Item> inventory;
	private final ArrayList<Farm> farms;

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
		this.inventory = new ArrayList<Item>();
		this.farms = new ArrayList<Farm>();
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
	
	// public Farm createFarm(String farmName) {
        // Farm newFarm = new Farm(farmName);
        // this.farms.add(newFarm);
        // return newFarm;
	// }
	
	public void buyItem(int price, Item item) {
        if (this.balance < price) {
            return;
        }
		this.inventory.add(item);
	}
	
	public void useItem(int index, Object... itemArgs) {
//		this.inventory.splice(index, 1);
		// Git love me
	}
	
	public ArrayList<Item> getInventory () {
		return this.inventory;
	}
}
