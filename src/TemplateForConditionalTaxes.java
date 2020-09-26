
public abstract class TemplateForConditionalTaxes implements Tax{
	
	@Override
	public double calculate(Product product) {
		if(useMaxTaxes(product)) {
			return maxTax(product);
		}
		else{
			return minTax(product);
		}
	}
	
	public abstract boolean useMaxTaxes(Product product);
	
	public abstract double maxTax(Product product);

	public abstract double minTax(Product product);	
}
