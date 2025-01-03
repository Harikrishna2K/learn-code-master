package oops.staticandnonstatic;

import singleton.Singleton;

public class Main {

	public static void main(String[] args) {
		Human obj = new Human(27, "Donald Trump", 56000);
		Human obj2 = new Human(34, "Rana", 34000);
//		Human defaultObj = new Human();
		
		System.out.println(obj2.population);
		
//		SubClass c = new SubClass(34.5);
//		System.out.println(c.salary);
		
		
		
	}
}
