package conditionalStatements.Loops;

/*
 * The syntax of loops is this:
 * Let use see for loop syntax first:
 * 
 * for(initialisation, condition, increment/decrement){
 * 		//body of the loop
 * }
 * 
 * while(condition){
 * 		//body of the loop
 * }
 * 
 * do {
 * 	//body of the loop
 * }while(condition)
 * 
 * 
 * 
 * */

public class Loops {
	public static void main(String[] args) {
		numbers(5);
	}
	
	static void numbers(int n) {
		for(int num = 0; num <=n ; num++) {
			System.out.println("Hari Krishna S");
		}
		
		while(n>=1) {
			System.out.println("Hari krishna in while loop");
			n = n- 1;
		}
		do {
			System.out.println("Hari krishna in do while loop");
			n = n+1;
		}
		while(n<=5);
	}

}
