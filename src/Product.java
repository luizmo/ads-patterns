
public class Product {
	protected double value;
	protected StateOfProduct currentState;
	
	public Product(double value) {
		this.value = value;
		currentState = new New();
	}

	public double getValue() {
		return value;
	}
	
	public void addExtraTax() {
		currentState.addExtraTax(this);
	}
	
	public void newState() {
		currentState.newState(this);
	}
	
	public void oldState() {
		currentState.oldState(this);
	}
}
