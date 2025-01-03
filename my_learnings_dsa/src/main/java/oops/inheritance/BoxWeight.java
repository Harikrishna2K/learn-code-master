package oops.inheritance;

public class BoxWeight extends BoxExample{
	
	double weight;

	
	/**
	 * A constructor with only one attributes.
	 * 
	 * **/
	
	
	
	public BoxWeight(double weight) {
		super(); //In default when no arguments are specified, the super constructor calls the no argument constructor as default
		this.weight = 34;
	}
	
	static void greeting() {
		System.out.println("Inside the greeting box class");
	}
	
	/**
	 * A constructor with more than one attributes and calls the parent class attributes
	 * 
	 * 
	 ***/
	public BoxWeight(int length, int width, int breadth, double weight) {
		super(length, width, breadth);
		this.weight = weight;
	}
	
	
	/*
	 This copy constructor calls the copy constructor of the parent.
	 Passing the whole object as parameter 
	 * */
	
	public BoxWeight(BoxWeight other) {
		super(other);
		weight = other.weight;
	}
	
	

}
