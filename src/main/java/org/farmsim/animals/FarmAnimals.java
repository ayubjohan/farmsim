import java.util.ArrayList;

public class FarmAnimals {
	
	private ArrayList<Animal> Animal_list = new ArrayList<Animal>();
	
	public void addAnimal(Animal animal) {
		Animal_list.add(animal);
	}
	
	public void printAllAnimals() {
		for (int i=0;i<Animal_list.size(); i++) {
			System.out.println(Animal_list.get(i).toString());
		}
	}
	
	public int getAnimalCount() {
		return Animal_list.size();
	}
	
}
