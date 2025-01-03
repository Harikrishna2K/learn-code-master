package oops;

public class VariablesinOOPS {
	
	String name; //instance variables. 
	
	int number;  // instance variables.

	public VariablesinOOPS(String name, int number) {
		super();
		this.name = name; //local variables
		this.number = number; // local variables.
	}
	
	
	final int count = 3; //final variables
	
	static int staticVariable; //static variables.
	
	
	
	public static void main(String[] args) {
		VariablesinOOPS obj = new VariablesinOOPS("Hari krishna", 56);
		System.out.println(obj.count);
		System.out.println(obj.name);
		System.out.println(obj.number);
		
		System.out.println(VariablesinOOPS.staticVariable);
	}
	
	
	
	

}
