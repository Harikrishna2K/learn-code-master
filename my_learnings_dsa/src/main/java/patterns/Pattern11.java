package patterns;

/*
 
 
*
**
***
****
*****
****
***
**
*

 

 
 
 * */

public class Pattern11 {

	public static void main(String[] args) {
		pattern11(5);
	}
	static void pattern11(int n) {
		for(int i = 1; i<=(2*n)-1;i++) {
			int stars = i;
			if(i>n) {
				stars = 2*n-i;
			}
			for(int j = 1; j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	// have to try in zero based indexing
	
	static void pattern11zerobasedindexing(int n) {
		for(int i = 0; i<(2*n)-1; i++) {
			int stars = i;
			if(i>n-1) {
				stars = 2*n-i-2; //Since it is zero based indexing we did this.
			}
			for(int j = 0; j<=stars;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
}
