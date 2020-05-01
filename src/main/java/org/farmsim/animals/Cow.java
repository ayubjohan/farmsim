
public class Cow extends Animal {
	
	public int milkAmount=10;
	
	public Cow() {
		super("Cow", 1);
	}
	
	public void milk() {
		milkAmount -= 1;
	}
	
	public int getMilkAmount() {
		return milkAmount;
	}

}
