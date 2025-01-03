package maths_for_dsa;

public class SumOfNNaturalNumbers {
	
	static int sumOfNaturalNumbers(int n) {
		int sum = 0;
//		while(n>0) {
//			int lastDigit = n%10;
//			sum = sum + lastDigit;
//			n = n/10;
//		}
		
		
//		for(int i = 1; i<=n;i++) {
//			sum = sum + i;
//		}
//		
//		return sum;
		
		/**
		 * Using formula to find the n natural numbers
		 * */
		sum = (n * (n+1))/2;
		return sum;
		
	}
	
	
	public static void main(String[] args) {
		int n = 5;
		int sumofNaturalNumbers = sumOfNaturalNumbers(n);
		System.out.println(sumofNaturalNumbers);
	}

}
