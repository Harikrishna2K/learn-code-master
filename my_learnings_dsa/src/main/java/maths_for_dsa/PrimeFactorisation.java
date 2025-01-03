package maths_for_dsa;

import java.util.ArrayList;

public class PrimeFactorisation {
	
	public static void main(String[] args) {
		int n = 36;
		optimisedsolution(n);
	}
	
	static void primeFactorisationBruteForce(int n) {
		ArrayList<Integer> primeFactors = new ArrayList<Integer>();
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				if(isPrime(i)) {
					primeFactors.add(i);
				}
				if(isPrime(n/i)) {
					primeFactors.add(n/i);
				}
				
			}
		}
		System.out.println(primeFactors);
	}

	private static boolean isPrime(int n) {
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
	
	
	private static void optimisedsolution(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n%i == 0) {
				al.add(i);
				while(n%i == 0) {
					n = n/i;
				}
			}
		}
		if(n>1) {
			al.add(n);
		}
		
		System.out.println("The arraylist is: " + al);
	}

}
