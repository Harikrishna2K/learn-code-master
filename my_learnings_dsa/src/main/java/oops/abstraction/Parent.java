package oops.abstraction;

abstract class Parent{
	
	int age;
	
	final int value = 35;
	
	public Parent(int age) {
		super();
		this.age = age;
	}
	
	void concreteMethod() {
		System.out.println("Concrete method invocation");
	}
	
	static void methodCheck() {
		System.out.println("Static method check");
	}
	
	
	abstract void career(String name);
	abstract void partner(String name, int age);
	

}
