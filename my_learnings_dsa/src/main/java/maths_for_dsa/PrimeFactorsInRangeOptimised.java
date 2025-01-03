package maths_for_dsa;

/**
 * Here we are using the optimised method to find the range of prime numbers 
 * in the given number
 * 
 * Algo: (Sieve of Erastrhoses Algo)
 * 
 *  How this algo works :
 *  	1) First we need to take an array with the size of given N.
 *  	2) Now we have to make every element in the array as true, so create a boolean array.
 *  	3) array[i] = 4; (If we use this, it will bring the element of the file.)
 *  	4) Then go to the index, and then if it is a prime number for example number 2, 
 *  then go to its multiples and make it false, repeat the same for every multiples of the number
 * 
 * **/

public class PrimeFactorsInRangeOptimised {
	
	static void primeRange(int n) {
		boolean[] factors = new boolean[n+1];
		
		for(int i = 0; i<=n; i++) {
			factors[i] = true;
		}
		for(int i = 2; i<=n; i++) {
			if(factors[i]) {
				for(int multiples = i*2; multiples<=n; multiples += i) {
					factors[multiples] = false;
				}
			}
		
		}
			
		
		//to find the prime range now with the computed values
		
		for(int i = 2; i<=n; i++) {
			if(factors[i]) {
				System.out.println(i + " ");
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n = 7;
		primeRange(n);
	}

}
