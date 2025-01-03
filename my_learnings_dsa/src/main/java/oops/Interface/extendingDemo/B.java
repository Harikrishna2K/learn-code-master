package oops.Interface.extendingDemo;

public interface B {
	void hey();
	
	default void displayj() {
		System.out.println("We are in default methods");
	}

}
