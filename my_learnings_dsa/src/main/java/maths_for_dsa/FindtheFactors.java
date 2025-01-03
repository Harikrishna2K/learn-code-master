package maths_for_dsa;

public class FindtheFactors {
	public static void main(String[] args) {
		int n = 36;
		divisors(n);
	}
	
	
	/***
	 * To avoid math sqrt function we could use i*i <=n
	 * 
	 * **/
	
	static void divisors(int n) {
		for (int i = 1; i< Math.sqrt(n); i++) {
			if(n%i == 0) {
				System.out.println(i + " ");
			}
//			if(i*i == n) {
//				continue;
//			}
			System.out.println(n/i + " ");
		}
	}

}
