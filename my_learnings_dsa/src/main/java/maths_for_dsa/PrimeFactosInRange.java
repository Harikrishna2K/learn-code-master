package maths_for_dsa;

import java.util.ArrayList;

public class PrimeFactosInRange {
	public static void main(String[] args) {
		int n = 36;
		factorsInRange(n);
	}
	
	static void factorsInRange(int n) {
		ArrayList<Integer> primeNumbers = new ArrayList<Integer>();
		for(int i = 1; i<=n; i++) {
			if(isPrime(i)) {
				primeNumbers.add(i);
			}
		}
		
		System.out.println("The prime numbers are : " + primeNumbers);
	}
	
	 private static boolean isPrime(int n) {
		 if(n<1) {
			 return false;
		 }
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}

}
