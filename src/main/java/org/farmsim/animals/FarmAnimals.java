package org.farmsim.animals;

import java.util.ArrayList;

public class FarmAnimals {
	
	private ArrayList<Animal> animalList = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal) {
		animalList.add(animal);
	}
	
	public void printAllAnimals() {
		for (int i=0;i<animalList.size(); i++) {
			System.out.println(animalList.get(i).toString());
		}
	}
	
	public int getAnimalCount() {
		return animalList.size();
	}
	
}
