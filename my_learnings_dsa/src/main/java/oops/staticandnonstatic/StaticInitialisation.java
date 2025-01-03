package oops.staticandnonstatic;

import oops.accessmodifiers.Person;

/*
 
 We can use static blocks to initialize the static variables
  
 * */
public class StaticInitialisation {
	static int a = 5;
	static int b;
	
	
//	static {
//		System.out.println("Here we are in the static block ");
//		b = a*7;
//		System.out.println(StaticInitialisation.b);
//		System.exit(0);
//	}
	
	
	// We could not access the protected attributes here
	
	public static void main(String[] args) {
//		StaticInitialisation staticIn = new StaticInitialisation();
//		staticIn.greeting();
		
		SuperClass obj = new anotherclass();
		obj.print();
		
	}
	
}
class SuperClass {
    static void print() {
        System.out.println("SuperClass print");
    }
}

class anotherclass extends SuperClass {
    static void print() {
        System.out.println("SubClass print");
    }
}

