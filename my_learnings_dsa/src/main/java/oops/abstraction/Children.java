package oops.abstraction;

public class Children extends Parent{
	
	String hobby;

	
	@Override
	void concreteMethod() {
		// TODO Auto-generated method stub
		super.concreteMethod();
	}

	
	/**
	 * 
	 * Here this.value is the final keyword.
	 * Since we have the final keyword in the abstract class, we cant call that final keyword.
	 * So we are inherting the final keyword in the child class and calling it.
	 * 
	 * */
	public Children(int age, String hobby) {
		super(age);
		this.hobby = hobby;
		System.out.println("The final value is this: " + this.value);
	}

	

	@Override
	void career(String name) {
		System.out.println("The name of the career is: " + name);
		
	}

	@Override
	void partner(String name, int age) {
		System.out.println("The name of the partner is: "+ name + "The age of the partner is: "+ age);
		
	}
	

}
