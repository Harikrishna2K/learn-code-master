package oops.polymorphism;
import oops.accessmodifiers.*;


/*****
 * Polymorphism means a single method can act on different ways.
 * 
 * 
 * 
 * **/

public class Main {
	public static void main(String[] args) {
//		Shapes shape = new Shapes();
//		shape.area();
		
		Shapes circle = new Circle();
//		Circle newCirlce = new Circle();
		
		/**
		 * Here what happens is, when we create an object, the object goes to the
		 * reference to check whether it could access the method of the reference type
		 * If there is no method, then the object could not access it.
		 * 
		 * So in the line (Shapes circle = new Circle()), since the shape reference has no area method
		 * The circle object could not access the methods.
		 * 
		 * 
		 * 
		 * If the Circle newCircle = new Circle(), This works fine, because the reference
		 * has the method and the object could use it.
		 * */
//		circle.area();
		circle.message();
		
		
		
		
		/**
		 * What is dynamic method dispatch?
		 * It is a mechanism used by java, to determine which method implementation
		 * of the object should be called is defined at the runtime.
		 * 
		 * 
		 * Dynamic method dispatch only occurs for methods and not for attributes.
		 * 
		 * 
		 * */
		
//		Person p = new Person(34, "Harikrishna");
//		p.Name;
		
//		Overloading over = new Overloading();
//		over.addition(7, 8);
		
		
	}

}
