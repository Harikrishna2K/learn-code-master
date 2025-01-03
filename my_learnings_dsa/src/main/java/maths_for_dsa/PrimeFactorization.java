package maths_for_dsa;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactorization {
	
	
	static void primeFactorization(int n) {
		List<Integer> checklist = new ArrayList<Integer>();
		for(int i = 2; i<Math.sqrt(n); i++) {
			if(n%i == 0) {
				checklist.add(i);
				if(isPrime(n)) {
					checklist.add(i);
				}
				if(isPrime(n/i)) {
					checklist.add(i);
				}
			}
		}
		
		System.out.println(checklist);
	}
	
	
	static boolean isPrime(int n) {
		for(int i = 2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) return false;
		}
		
		return true;
		
	}
	
	
	public static void main(String[] args) {
		int n =36;
		primeFactorization(n);
	}

}
