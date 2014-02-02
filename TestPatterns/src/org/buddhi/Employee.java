package org.buddhi;

public class Employee implements IDisposable {

	@Override
	public void dispose() {
	
		System.out.println("implent's disposable method");

	}

	
	public Employee() {
	
	}
	
}
