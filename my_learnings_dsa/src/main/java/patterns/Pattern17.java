package patterns;

/*
 
A
BB
CCC
DDDD
EEEEE
 
 */

public class Pattern17 {
	public static void main(String[] args) {
		pattern17(5);
	}
	static void pattern17(int n) {
		
		for(int i = 1; i<=n;i++) {
			
			for(int j = 1; j<=i; j++) {
			//We put the -1 because we need to start the pattern from 1.
				System.out.print((char)('A' + i -1));
			}
			System.out.println();
			
		}
		
	}

}
