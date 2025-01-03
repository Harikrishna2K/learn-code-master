package oops.polymorphism;

public class Numbers {
	
	static int addition(int a, int b) {
		return a+b;
	}
	
	static int addition(int a, int b, int c) {
		return a+b+c;
	}
	
	
	static int addition(int a, int b, int c, int d) {
		return a+b+c+d;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Numbers num = new Numbers();
		System.out.println(num.addition(5, 7, 8, 9));
		
	}

}
