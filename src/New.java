
public class New implements StateOfProduct{
	public void addExtraTax(Product product) {
		product.value += product.value * 0.05;
	}

	@Override
	public void newState(Product product) {
		product.currentState = new New();
	}

	@Override
	public void oldState(Product product) {
		product.currentState = new Old();
	}
}
