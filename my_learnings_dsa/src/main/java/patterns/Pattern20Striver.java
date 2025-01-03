package patterns;

public class Pattern20Striver {
	
	/*
	 
*        *
**      **
***    ***
****  ****
**********
****  ****
***    ***
**      **
*        *
	 
	 
	 
	 
	 
	 Follow the start space star pattern.
	 [star,space,star]
	 [1,8,1]
	 [2,6,2]
	 [3,4,3]
	 [4,2,4]
	 [5,0,5]
	 [4,2,4]
	 [3,4,3]
	 [2,6,2]
	 [1,8,1]
	 
	 
	 
	 
	 
	 
	 
	 

	 * */
	public static void main(String[] args) {
		pattern20(5);
	}
	
	static void pattern20(int n) {
		int initialSpace = 2*n-2;
		for(int i = 1; i<=n;i++) {
			//star
			for(int j = 1; j <=i ;j++) {
				System.out.print("*");
			}
			//space
			for(int j = 1; j<=initialSpace; j++ ) {
				System.out.print(" ");
			}
			
			//star
			for(int j = 1; j <=i ;j++) {
				System.out.print("*");
			}
			System.out.println();
			initialSpace = initialSpace - 2;
		}
		
		initialSpace = 2*n-8;
		for(int i = 1; i<n;i++) {
			//star
			for(int j = 1; j<=n-i;j++) {
				System.out.print("*");
			}
			//space
			for(int j = 1; j<=initialSpace;j++) {
				System.out.print(" ");
			}
			
			
			//star
			for(int j = 1; j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
			initialSpace = initialSpace+2;
			
		}
		
	}

}
