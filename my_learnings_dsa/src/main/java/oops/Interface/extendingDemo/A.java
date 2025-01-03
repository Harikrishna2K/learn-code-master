package oops.Interface.extendingDemo;

public interface A {
	
	/**
	 * Default methods In Interface.
	 * 
	 * We use this because, if there is interface A and there is Class B
	 * and the class implements an interface, then we should override the methods of the 
	 * interface right.
	 * 
	 * If there is another method in the interface in which the class is implementing,
	 * then we need to override that method as well which is okay but it is a problem right.
	 * It disturbs the nature of the interface code. 
	 * 
	 * So to solve this problem we have default methods.
	 * Default methods gives us the method implementation and if some classes which 
	 * implements the interface of the default methods, wants the default methods , it could
	 * override it and use its own implementation in the class.
	 * 
	 * */
	
	default void display() {
		System.out.println("We are in default methods");
	}

}
