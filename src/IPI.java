
public class IPI extends TemplateForConditionalTaxes{

	@Override
	public boolean useMaxTaxes(Product product) {
		return product.getValue() > 500 ;
	}

	@Override
	public double maxTax(Product product) {
		return product.getValue() * 0.1;
	}

	@Override
	public double minTax(Product product) {
		return product.getValue() * 0.06;
	}


}
