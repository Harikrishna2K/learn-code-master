package oops;

/*
 
 Inner Class:-
 
 When we have a class within a class is called inner class.
 Here the statement defines, If we have a non static class
 we can't access the methods or constructors using the object we create for a non
 static class, so to over come this, we need to create the main class object first
 and then we use that main class object to call the non static call object. 
 And the code below stands as the example.
 
 
 * */
public class InnerClass {
	class Test{
		String name;
		
		Test(){
			System.out.println("This is a default constructor in test class");
		}
	}
	
	public static void main(String[] args) {
		InnerClass cl = new InnerClass();
		InnerClass.Test t = cl.new Test();
		
//		Test t = new Test();
		
		AnotherTest anoTest = new AnotherTest("Hari krishna");
		System.out.println(anoTest.firstName);
		
	}
	
	/*
	 
	 The another method is -> making the non static inner class as static, and then
	 we can create the object and start working.
	 It means to run this static class, we dont need the object of main class to access it
	 
	 Question ?
	 	1) Static class does not depend on the objects right and how come here the static class
	 	Another test works on the objects.
	 		ANSWER: The static class doesn't depend on the Main class objects only.
	 				It can depend on its own class objects.
	 * */
	
	static class AnotherTest{
		static String firstName;
		
		public AnotherTest() {
			System.out.println("This is a default constructor in Another test class");
		}
		public AnotherTest(String firstName) {
			AnotherTest.firstName = firstName;
			System.out.println("This is a default constructor in Another test class");
		}
	}

}
