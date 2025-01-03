package oops.finalkeyword;

/**
 * Final Keyword.
 * We can use final keyword in class, attributes and then methods.
 * 
 * 
 * */
class AdvanceCal extends Calculator{
	void show() {
		System.out.println("John show method");
	}
	
}
/**
 * I dont want the class to be extended so I use this final keyword
 * 
 * */
final public class Calculator {
	
	/**
	 * Here it is final  method because I don't want the final method
	 * to be modified.
	 * 
	 * 
	 * */
	
	final void show() {
		System.out.println("HK show method");
	}
	
	
	
	public static void main(String[] args) {
		/**
		 * Final keyword we use it to make sure the field is not changed.
		 * Used to make Constants.  
		 **/
//		final int num = 20;
//		num = 45;
//		System.out.println(num);
		Calculator calc = new Calculator();
		calc.show();
		AdvanceCal calciAdv = new AdvanceCal();
		calciAdv.show();
	}
	
	
	
	

}
