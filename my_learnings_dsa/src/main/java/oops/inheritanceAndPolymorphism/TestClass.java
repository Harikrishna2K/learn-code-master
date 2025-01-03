package oops.inheritanceAndPolymorphism;



/***
 * 
 * so the flow works in such a way that, since it has a parent class reference 
 * it goes and checks the parent reference, and if it is a method and it 
 * is overriden it goes to the child class and calls the child class methods, 
 * and if incase it is a attribute and we cannot override an attribute so it 
 * gives the attribute in parent class right ?
 * 
 * 
 * 
 * 
 * ****/

public class TestClass {
	public static void main(String[] args) {
		A obj = new B();
		obj.display();
		System.out.println(obj.num);
	}

}

class A {
	int num = 10;
	void display() {
		System.out.println("It is the number in class A");
	}
}

class B extends A{
	int num = 20;
	@Override
	void display() {
		System.out.println("It is the number in class B");
	}
}
