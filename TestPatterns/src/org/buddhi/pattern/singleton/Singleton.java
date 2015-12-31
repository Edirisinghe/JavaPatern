package org.buddhi.pattern.singleton;

  class Singleton {

	private static Singleton instance;



	public static Singleton getInstance() {
		if (instance == null) {
			synchronized (Singleton.class) {
				if (instance == null)
					instance = new Singleton();
			}
		}
		return instance;
	}

	public void doSomthing(){
		
		System.out.println("yes machng im doing !");
		
		
	}
	
}
