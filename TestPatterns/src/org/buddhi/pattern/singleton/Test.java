package org.buddhi.pattern.singleton;

public class Test {

	public Test() {

	}

	public static void main(String[] args) {

		System.out.println(Singleton.getInstance().getClass().hashCode());

		System.out.println(new Singleton().getClass().hashCode());
	}
	
}

