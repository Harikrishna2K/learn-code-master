package oops.staticandnonstatic;

public class StaticVsNonstatic {
	/*Here we are going to see the difference between static and non static */
	public static void main(String[] args) {
		
		StaticVsNonstatic scv = new StaticVsNonstatic();
		scv.fun2();
//		fun();
	}
	
	/*
	 
	 In a static member, we cannot call the non static referenced function directly.
	 A non static referenced function, cannot be accessed without an object,
	 whereas a static member doesn't need object to be accessed.
	 
	 * */
	
	
	static void fun() {
//		StaticVsNonstatic scv = new StaticVsNonstatic();
//		scv.greeting();
		System.out.println("This is a static function");
	}
	
	void fun2() {
		fun();
//		greeting();
	}
	
	/*
	 This is a non static data member and it can access static member function
	 * */
	void greeting() {
		System.out.println("Hey this is in a greeting method! Hello Browskie!");
	}
	
	

}
