package revision.basicmaths;

/**
 * To check the prime number basics
 * 
 * */
public class PrimeNumber {
	public static void main(String[] args) {
		int n = 7;
		optimisedprime(n);
	}
	
	static void primeNumber(int n) {
		int count = 0;
		for(int i = 1; i<=n;i++) {
			if(n%i == 0) {
				count++;
			}
		}
		if(count == 2) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
	}
	
	static void optimisedprime(int n) {
		if(n <1) {
			System.out.println("It is not a prime number");
		}
		
		boolean isPrime = true;
		
		for(int i=2; i<=Math.sqrt(n); i++) {
			if(n % i == 0) {
				isPrime = false;
				break;
			}
		}
		
		if(isPrime) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It is not a prime number");
		}
		
	}

}
