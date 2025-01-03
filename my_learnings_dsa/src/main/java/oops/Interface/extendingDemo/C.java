package oops.Interface.extendingDemo;


/*
 * Now here it is an amguity error because both interface A and B has 
 * the same method name.
 * It was display method name in both A and B
 * 
 * 
 * */

public class C implements A,B{

	@Override
	public void hey() {
		
	}
	public static void main(String[] args) {
		C c = new C();
		c.display();
	}
	
}
