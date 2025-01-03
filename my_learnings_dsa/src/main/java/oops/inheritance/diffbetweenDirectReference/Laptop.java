package oops.inheritance.diffbetweenDirectReference;

import java.util.ArrayList;

public class Laptop {
	void displayName() {
		System.out.println("Name of the Laptops are");
	}
	
	public static void main(String[] args) {
		
		/**
		 * Here we use the direct child reference to call the inheritance.
		 * 
		 * 
		 * */
//		Lenovo lenovo = new Lenovo();
//		lenovo.displayName();
//		
//		Acer acer = new Acer();
//		acer.displayName();
		

		/**
		 * Here we use the Parent reference to call the inheritance(Upcasting)
		 * 
		 * */
		
		Laptop laptop1 = new Lenovo();
		laptop1.displayName();
		
		Laptop laptop2 = new Acer();
		laptop2.displayName();
		
		/**
		 * The difference between direct reference and upcasting?
		 * 	-> In upcasting we can use one method to call all the child classes which are inherting the
		 * same parent.
		 * 	-> In Direct reference we need to handle that by calling the classes individually.
		 * */
		
		ArrayList<Laptop> laptops = new ArrayList<Laptop>();
		laptops.add(laptop1);
		laptops.add(laptop2);
		
		for(Laptop lap : laptops) {
			lap.displayName();
		}
		
		
	}
}

class Lenovo extends Laptop{
	@Override
	void displayName() {
		System.out.println("The Name of the Laptop is Lenovo");
	}
}


class Acer extends Laptop{
	@Override
	void displayName() {
		System.out.println("The Name of the Laptop is Acer");
	}
}
