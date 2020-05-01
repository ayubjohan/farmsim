
public class Cow extends Animal {
	
	public int Milk_amount=10;
	
	public Cow() {
		super("Cow", 1);
	}
	
	public void Milk_cow() {
		Milk_amount -= 1;
	}
	
	public int getMilkamount() {
		return Milk_amount;
	}

}
