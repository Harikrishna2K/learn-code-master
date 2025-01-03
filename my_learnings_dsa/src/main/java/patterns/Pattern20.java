package patterns;

public class Pattern20 {

	/*
	 
**********
****  ****
***    ***
**      **
*        *
*        *
**      **
***    ***
****  ****
**********
  
	 * */
	public static void main(String[] args) {
		pattern20(5);
//		pattern22(5);
	}
	
	static void pattern20(int n) {
		int initialSpace = 0;
		for(int i = 1; i<=n;i++) {
			//star
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			
			//space 
			for(int j = 1; j<=initialSpace;j++) {
				System.out.print(" ");
			}
			
			
			//star
			for(int j = 1; j<=n-i+1; j++) {
				System.out.print("*");
			}
			System.out.println();
			initialSpace = initialSpace+2;
			
			
		}
		initialSpace = 8;
		for(int i = 1; i<=n;i++) {
			//star
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			//space 
			for(int j = 1; j<=initialSpace;j++) {
				System.out.print(" ");
			}
			
			//star
			for(int j = 1 ; j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
			initialSpace = initialSpace-2;
		}
	}
//	static void pattern22(int n) {
//		int initialSpace = 8;
//		for(int i = 1; i<=n;i++) {
//			//star
//			for(int j = 1 ; j<=i;j++) {
//				System.out.print("*");
//			}
//			//space 
//			for(int j = 1; j<=initialSpace;j++) {
//				System.out.print(" ");
//			}
//			
//			//star
//			for(int j = 1 ; j<=i;j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//			initialSpace = initialSpace-2;
//		}
//	}

}
