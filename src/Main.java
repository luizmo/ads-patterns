
public class Main {
	public static void main(String[] args) {
		Tax icms = new ICMS();
		Tax iss = new ISS();
		
		Product product = new Product(50.0);
		
		CalculatorTaxes calculator = new CalculatorTaxes();
		
		calculator.calculateTaxes(product, icms);
		calculator.calculateTaxes(product, iss);
		
	}
}
