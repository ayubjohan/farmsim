
public class Sheep extends Animal {
	
	public int Wool_level=10;
	
	public Sheep() {
		super("Sheep", 1);
	}
	
	public void Sheer() {
		Wool_level -= 1;
	}
	
	public int getWoolLevel() {
		return Wool_level;
	}

}
