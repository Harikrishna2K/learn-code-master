package oops.staticandnonstatic;

public class Human {
	int age;
	String name;
	int salary;
	
	/*Static variables belong to the class and not to the instances of the class
	 * This can be accessed even before the object is created
	 * They belong to the object and not to the class */
	
	static int population;
//	int population;
	
	static void message() {
		System.out.println("Hello World!!!");
	}
	
	public Human(int age, String name, int salary) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		Human.population += 1;
//		Human.message();
	}
	
	

}
