
public class Old implements StateOfProduct	{
	
	public void addExtraTax(Product product) {
		product.value -= product.value * 0.01;
	}

	@Override
	public void newState(Product product) {
		throw new RuntimeException("Produto n�o pode mudar de estado!");
		
	}

	@Override
	public void oldState(Product product) {
		product.currentState = new Old();
	}
}
