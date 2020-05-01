
public class Animal {
	
	private String species;
	private int happiness;
	
	public Animal(String type, int excitement) {
		species = type;
		happiness = excitement;
	}
	
	public String getSpecies() {
		return species;
	}
	
	public void play() {
		happiness += 1;
	}
	
	public int getHappy() {
		return happiness;
	}
}
