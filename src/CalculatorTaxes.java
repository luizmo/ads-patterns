
public class CalculatorTaxes {
	public void calculateTaxes(Product product, Tax anyTax) {
		double tax = anyTax.calculate(product);
		System.out.print(tax);
	}
}
