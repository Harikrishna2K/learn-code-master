package oops.inheritance;

public class BoxExample {
	
	/**
	 * These are the attributes of the class
	 * 
	 * */
	int length;
	int breadth;
	int width;
	
	
	/**
	 * Default constructor
	 * 
	 * **/
	
	public BoxExample() {
		this.length = 2;
		this.breadth = 2;
		this.width = 2;
	}
	
	/**
	 * Parameterized constructors 
	 * 
	 * **/
	
	
	public BoxExample(int side) {
		this.length = 4;
		this.breadth = 3;
		this.width = 4;
	}
	
	/**
	 * A static method 
	 * 
	 * */
	static void greeting() {
		System.out.println("Inside the static block of box Example Class");
	}
	
	/****
	 * Parameterized constructors 
	 * 
	 * 
	 * */
	
	public BoxExample(int length, int breadth, int width) {
		this.length = 100;
		this.breadth = 100;
		this.width = 100;
	}
	
	//This is the copy constructor
	
	public BoxExample(BoxExample old) {
		this.length = old.length;
		this.breadth = old.breadth;
		this.width = old.width;
	}
}
