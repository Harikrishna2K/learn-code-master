package oops.inheritance;



/***
 * Here in inheritance i could call the child class methods using parent class
 * because the methods in java oops are in late binding. It is because of polymorphism
 * the methods are overriden. so the parent class could access the child class methods.
 * 
 * 
 * 
 * ***/
public class InhteritanceCheck {

	
	public static void main(String[] args) {
		ParentClass obj = new childClass();
		obj.method();
	}
	

}

class ParentClass{
	void method() {
		System.out.println("The parent class method is called");
	}
}

class childClass extends ParentClass{
	void method() {
		System.out.println("The child class method is called");
	}
}
