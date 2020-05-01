
public class Sheep extends Animal {
	
	public int woolLevel=10;
	
	public Sheep() {
		super("Sheep", 1);
	}
	
	public void Sheer() {
		woolLevel -= 1;
	}
	
	public int getWoolLevel() {
		return woolLevel;
	}

}
