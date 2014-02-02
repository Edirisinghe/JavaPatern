package org.buddhi.pattern.factory;

public class Main {

	static {

		try {
			Class.forName("ProductOne");
			
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		System.out.println("buddhi");

		// ProductFactory.getInstance().registerProduct("PR1",
		// ProductOne.class);
		// ProductFactory.getInstance().registerProduct("PR2",
		// ProductTwo.class);

	}

}
