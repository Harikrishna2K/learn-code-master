package oops;

/*
 
 Named group of properties and Functions are called class.
 To access the properties and methods we use objects.
 Objects are the instance of the class.
 
 
 * */

public class ClassAndObjects {
	public static void main(String[] args) {
		/*
		 This method is called default initialization.
		 * */
		Person person = new Person(35,"Hari krishna S");
		
		/*
		 Person person = new Person();
		 * */
	
//		person.age = 9597;
//		person.PersonName = "Hari krishna S";
//		System.out.println("Person Name:  "+ person.PersonName);
//		System.out.println("Phone Number: "+ person.age);
		person.display();
		
		Person random = new Person(person);
		random.show();
		
		Person randome = new Person();
		System.out.println("Calling one constructor from another constructor: "+randome.age);
		
		
		
	}

}

/*
  This keyword:
  		It referes to the current instance or the current object which uses the class data attributes and methods.
 * */

class Person{
	
	/***
	 * These are called attributes in java class.
	 * 
	 * **/
	int age;
	String PersonName;
	
	//Let us use the default constructor
//	Person(){
//		this.age = 45;
//		this.PersonName = "Hari Krishna S";
//		
//	}
	
	/*
	 This concept of calling one constructor from another constructor is called 
	 constructor chaining.
	 * */
	
	Person(){
		this(67, "Browskie");
	}
	void display() {
		System.out.println("The age is: " + this.age);
		System.out.println("The person  name is: " + this.PersonName);
	}
	
	void show() {
		
		System.out.println("The age is of copy constructor:  " + this.age);
		System.out.println("The person name is of copy constructor : " + this.PersonName);
		
	}
	
	// Let us use argument constructor
	
	Person(int age, String PersonName){
		this.age = age;
		this.PersonName = PersonName;
	}
	
	// This is copy constructor
	Person(Person other){
		this.age = other.age;
		this.PersonName = other.PersonName;
	}
}
