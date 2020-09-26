
public class IOP extends TemplateForConditionalTaxes {

	@Override
	public boolean useMaxTaxes(Product product) {
		return product.getValue() > 200;
	}

	@Override
	public double maxTax(Product product) {
		return product.getValue() * 0.25;
	}

	@Override
	public double minTax(Product product) {
		return product.getValue() * 0.12;
	}

}
