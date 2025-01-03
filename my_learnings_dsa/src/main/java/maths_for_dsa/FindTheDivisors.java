package maths_for_dsa;

public class FindTheDivisors {
	
	static void findTheDivisors(int n) {
		for(int i = 1; i<=n;i++) {
			if(n%i == 0) {
				System.out.println("The divisors are: " + i);
			}
		}
	}
	
	
	public static void main(String[] args) {
		int n = 6;
		findTheDivisors(n);
	}

}
