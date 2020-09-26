
public class ISS implements Tax{
	@Override
	public double calculate(Product product) {
		return product.getValue() * 0.3;
	}
}
