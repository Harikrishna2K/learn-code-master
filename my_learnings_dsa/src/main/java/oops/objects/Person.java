package oops.objects;

import java.util.Objects;

public class Person {
	
	int number;
	String name;
	
	
	public Person(int number, String name) {
		super();
		this.number = number;
		this.name = name;
	}
	
	


	@Override
	public int hashCode() {
		return Objects.hash(name, number);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name) && number == other.number;
	}
	
	
	
	/**
	 * Hashcode -> The unique numerical value of the object.
	 * Stores the object in a numerical way.
	 * */




	public static void main(String[] args) {
		Person person = new Person(34, "Hari krishna S");
		System.out.println(person.hashCode());
		
		Person person2 = new Person(45, "NewName");
		System.out.println(person2.hashCode());
		
		/**
		 * Instance of operator
		 * */
		
		System.out.println(person2 instanceof Person);
		System.out.println(person2.getClass().getName());
		
	}

}
