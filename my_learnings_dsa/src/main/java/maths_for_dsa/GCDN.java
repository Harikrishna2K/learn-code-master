package revision.basicmaths;

/**
 * GCD In a normal way(brute force)
 * 
 * **/

public class GCDN {
	public static void main(String[] args) {
		findingTheGcd(4, 9);
	}
	
	static void findingTheGcd(int a, int b) {
		int gcd = 0;
		for(int i = 1; i<=a && i<=b; i++) {
			if(a%i == 0 && b%i == 0) {
				gcd = i;
			}
		}
		
		System.out.println("The GCD Is this: " + gcd);
	}

}
