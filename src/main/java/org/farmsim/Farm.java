package org.farmsim;


import java.util.ArrayList;

public class Farm {
	public String name;
	public int farmHealth;
	public int waterQuality;
	public int soilQuality;
	public int cropLevel;
	
	public Farm(String name1, int health1, int waterQuality1, int soilQuality1, int cropLevel1) {
		this.name = name1;
		this.farmHealth = health1;
		this.waterQuality = waterQuality1;
		this.soilQuality = soilQuality1;
		this.cropLevel = cropLevel1;
		
	}
	
	// public void fertilize() {
	// 	this.soilQuality += 5;
	// 	this.farmHealth += 3;
    // }
    
    
    public void changeSoilQuality (int amount) {
        this.soilQuality += amount;
    }

    public void changeFarmHealth (int amount) {
        this.farmHealth += amount;
    }
	
	public void harvest() {
		if (this.cropLevel >= 3) {
			this.cropLevel -= 3;
		} else {
			System.out.println("you dont have enough crops to harvest!");
		}
	}
	
	public void tendFarmland() {
		this.farmHealth += 2;
		this.waterQuality += 2;
	}
	
	public void tendCrops() {
		this.cropLevel += 3;
		this.farmHealth += 2;
	}
	
	public void farmDetails(){
		ArrayList<String> myList = new ArrayList<String>();
		myList.add(name);
		myList.add(Integer.toString(cropLevel));
		myList.add(Integer.toString(soilQuality));
		myList.add(Integer.toString(waterQuality));
		myList.add(Integer.toString(farmHealth));
		System.out.println(myList);
		
	}
	
	//    public static void main(String[] args) {
	// 	   Farm farm  = new Farm("john", 4, 5, 6, 6);
	// 	   farm.harvest();
	// 	   farm.harvest();
	// 	   farm.harvest();
	// 	   farm.farmDetails();
	//    }
	
}
