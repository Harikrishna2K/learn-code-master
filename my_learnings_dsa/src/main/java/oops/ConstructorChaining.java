package oops;

public class ConstructorChaining {
	public static void main(String[] args) {
//		A a = new A(45);
//		System.out.println(a.age);
//		A aa = new A();
//		System.out.println("The age of aa is: " + aa.age );
		A aaa = new A(91,"Bujuks");
		System.out.println(aaa.name);
	}

}

class A {
	int age;
	String name;
	
	//Using default constructor
	/**
	 *Using the Default constructor we are using
	 *constructor chaining to call the parameterized constructor. 
	 * 
	 * 
	 **/
	A(){
		
//		this(89, "");
		System.out.println("This is default constructor");
	}
	
	//Using parameterized constructor.
	A(int age, String name){
			this();
		
	}
	
	//Using one argument constructor.
//	A(int age){
//		this.age = age;
//	}
}
