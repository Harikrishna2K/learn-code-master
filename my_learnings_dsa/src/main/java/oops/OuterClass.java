package oops;

/***
 * This is the example of inner class.
 * 
 * We have an outerclass which uses the innerclass to call the innerclass method
 * using outerclass methods
 * 
 * */


/***
 * 1) Why do we need innerclass?
 * 		-> It is used to hide the implementation and protect it (Security Reasons).
 * 		-> For callbacks and event handling.
 * 
 * 
 * **/

public class OuterClass {
	
	private String outfield = "I am the outfield";
	
	public void outermethod() {
		InnerClass innerclass = new InnerClass();
		innerclass.display();
		
	}
	
	class InnerClass{
			void display() {
				System.out.println("Accessing outerclass fields: " + outfield);
			}
	}
	
	public static void main(String[] args) {
		OuterClass outer = new OuterClass();
		outer.outermethod();
	}

}
