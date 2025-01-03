package oops.inheritance;

/**
 * Example of why interfaces are better than inheritance.
 * -> In Inheritance now we had an issue, For every child class method to access
 * if it has similar methods it has to inherit from the parent class right.
 * And if we want new methods we need to create that in both child class and in parent class.
 * 
 * -> This makes the interfaces easy to maintain and inheritance tough to use./
 * -> The child class and parent class must be present in the runtime while compiling.
 * -> So the child class pushes its methods to parent class above and above which makes it tough to maintain.
 * -> This is where interfaces comes, as it disconnects the method signature from the parent class.
 * And allows the child class to have its own implementation.
 * 
 * https://chatgpt.com/c/3366385b-a59e-4a28-9490-7bd1e269cd0a
 * 
 * 
 * 
 * 
 * */

public class Employee {
	 void work() {
		 System.out.println("He works as normal employee..");
	 }
	 
	 public static void main(String[] args) {
		Employee em = new HardworkingEmployee();
		em.work();
		
		/**
		 * Here in this example, to call the reward method of hard working class
		 * we need to create object of that class and then call the method.
		 * 
		 * In interface we can avoid this method
		 * 
		 * */
		
	}

}

class HardworkingEmployee extends Employee{
	@Override
	void work() {
		System.out.println("He works as hardworking employee..");
	}
	
	void reward() {
		System.out.println("He gets more money");
	}
}


class lazyEmployee extends Employee{
	
	@Override
	void work() {
		System.out.println("He works as Lazy Employeee....");
	}
}
