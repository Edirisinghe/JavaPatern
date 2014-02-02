package org.buddhi.pattern.factory;

public class ProductOne extends Product {

	static {
		ProductFactory.getInstance().registerProduct("P1",new ProductOne());
	}

	public ProductOne createProduct() {

		return new ProductOne();
	}

}
