package maths_for_dsa;

public class ReverseNumbers {
	
	static int reverseNumbers(int n) {
		int answer = 0;
		while(n>0) {
			int lastDigit = n%10;
			answer = (answer)*10 + lastDigit;
			n=n/10;
		}
		
		return answer;
	}
	
	
	
	public static void main(String[] args) {
		int n = 789;
		int reversedNumber = reverseNumbers(n);
		System.out.println(reversedNumber);
	}

}
