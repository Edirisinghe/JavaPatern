package org.buddhi.pattern.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;

public class ProductFactory {

	private HashMap<String, Product> m_RegisteredProduct = new HashMap<>();

	private static ProductFactory instance;

	private ProductFactory() {

	}

	public static ProductFactory getInstance() {

		if (instance == null) {

			synchronized (ProductFactory.class) {
				if (instance == null) {
					instance = new ProductFactory();
				}
			}
		}

		return instance;

	}

	public void registerProduct(String productId, Product productClass) {

		m_RegisteredProduct.put(productId, productClass);

	}

	public Product createProduct(String productId)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		/*
		 * Class<Product> productClass = (Class<Product>)
		 * m_RegisteredProduct.get(productId);
		 * 
		 * Constructor<Product> productConstructor =
		 * productClass.getDeclaredConstructor(new Class[] { String.class });
		 * 
		 * return (Product) productConstructor.newInstance(new Object() { });
		 */
		return m_RegisteredProduct.get(productId).createProduct();
	}

}
