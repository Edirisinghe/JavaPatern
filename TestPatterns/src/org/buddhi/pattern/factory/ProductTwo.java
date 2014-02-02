package org.buddhi.pattern.factory;

public class ProductTwo extends Product {
	
	
	static {
		ProductFactory.getInstance().registerProduct("P2", new ProductTwo());
	}

	@Override
	public Product createProduct() {
		// TODO Auto-generated method stub
		return null;
	}

}
