package oops.polymorphism;

public class Overloading {
	
	void addition() {
		System.out.println("We are Trying to ADD");
	}
	
	void addition(int a, int b) {
		System.out.println("We are Trying to ADD in step 2");
	}
	
	
//	public static void main(String[] args) {
//		Overloading over = new Overloading();
//		over.addition(3, 4);
//	}
	
	
	/**
	 * 
	 * We can overload a static method and final methods
	 * 
	 * */
	
	static int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	static int addition(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	final void addition(int a, int b, int c, int d, int e) {
		System.out.println("Overloading in a final method");
	}


}
