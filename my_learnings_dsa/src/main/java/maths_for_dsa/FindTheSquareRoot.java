package maths_for_dsa;

/*****
 * Here we need to find the square root of the given number
 * 
 * 
 * Steps :
 *  1) Since we are going to find the square root, we can do binary search.
 *  2) After that if the given number is not a perfect square like 40, we need to handle
 *  that in decimal, so we do some calculation for that.
 *  
 *  
 *  3) We do binary search, so we first find start and then end and then middle.
 *  4) we take the variable root, because we need to find the answer in decimal.
 *  5) First we find the integer digit using binary search(i.e if the answer is 6.32, we 
 *  first find the number.
 *  6) Later on we find the decimal part.
 *  7) To find the decimal part we take the precision, and then we add 0.1 for 
 *  first precisions, later on we divide the precisions by 10 for every other other precisons.
 *  8) Why we do that, because we get 6.1 from first loop then we need 6.11 and then
 *  6.111 right so we do this 
 *  
 *  
 * 
 * ***/

public class FindTheSquareRoot {

	public static void main(String[] args) {
		int n = 40;
		int p = 3;
		
		System.out.println(sqrt(n, p));
		
	}
	
	static double sqrt(int n, int p) {
		int start = 0;
		int end = n;
		
		double root = 0.0;
		
		while(start<end) {
			int mid = start + (end - start )/2;
			
			if(mid * mid == n) {
				return mid;
			}
			
			if(mid * mid > n) {
				end = mid - 1;
			}else {
				start = mid + 1;
				root = mid;
			}
		}
		
		double incr = 0.1;
		
		for(int i = 1; i<=p; i++) {
			while(root* root <=n) {
				root = root + incr;
			}
			/**
			 * Here why do we subtract the root with incr,
			 * Because we are in while loop and in the case 6.33 is larger than n,
			 * it is wrong right and we want it to be 6.32(i.e previous step),
			 * so we are subtracting.
			 * 
			 * **/
			root -= incr;
			incr/=10;
		}
		
		return root;
	}
}
