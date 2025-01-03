package oops.staticandnonstatic;

import oops.accessmodifiers.Person;

/**
 * 
 * The subclass extends Person, we can access the protected attributes here.
 * 
 * Protected attributes could be access in same package, and the subclass of different packages
 * as well.
 * 
 * 
 * */

public class SubClass extends Person {
	
	protected double salary;

	public SubClass(int age, String Name,double salary) {
		super(age, Name);
		this.salary = salary;
	}

}

static class Animal{
	
}
