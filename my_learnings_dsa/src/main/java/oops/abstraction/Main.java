package oops.abstraction;

public class Main {
	public static void main(String[] args) {
		Children children = new Children(45,"Cycling");
		children.career("Doctor");
		
		children.partner(" Mrunal Thakur ", 23);
		
		/**
		 * We can't create object in abstract class.
		 * But we can create constructors in abstract class.
		 * To use this constructors in abstract class, we can inherit the class
		 * and use it.
		 * 
		 * We can create constructors in abstract class and why we cant create objects in it?
		 * We cant create objects in abstract class?
		 * 	Abstract classes have abstract methods, in abstract methods there is no 
		 * method implementation right.
		 * 	An object will be a complete object only if the class has proper method
		 * implementation.
		 *  Hence we can't create objects for abstract methods.
		 * 
		 * 
		 * 
		 * */
		
//		Parent parent = new Parent();
		
		/**
		 * We can have static methods in abstract class.
		 * We cannot have static constructors in abstract class.
		 * 
		 * We cannot have abstract static methods - We cant override a static method
		 * and abstract methods should be overriden. So we cant have both.
		 * 
		 * 
		 * 
		 * */
		Parent.methodCheck();
		
		System.out.println(children.value);
		
		
		
		
		
		
		
	}

}
