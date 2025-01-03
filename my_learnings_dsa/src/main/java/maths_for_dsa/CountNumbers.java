package maths_for_dsa;


/**
 * Given sum we need to count the given numbers.
 * 
 * 
 * **/

public class CountNumbers {
	
	static int getNumbers(int n) {
		int count = 0;
		
//		for(int i = 0; i<n+1 ;i++) {
//			count ++;
//			n = n/10;
//		}
		
		while(n!=0) {
			count++;
			n=n/10;
		}
		
		
		return count;
	}
	
	public static void main(String[] args) {
		int n = 123456789;
//		getNumbers(n);
		
		System.out.println("The numbers we got is this: " + getNumbers(n));
	}

}
