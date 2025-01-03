package maths_for_dsa;


/**
 *To find the last number we use the "%" operator.
 *To remove the last element we use this "/" operator.
 * 
 * 
 ***/

public class PalindromeorNot {
	public static void main(String[] args) {
		int number = 1221;
		int palindromeNumber = reverseNumber(number);
		if(number == palindromeNumber) {
			System.out.println("It is a palindrome");
		}else {
			System.out.println("Not a Palindrome");
		}
	}
	
	
	static int reverseNumber(int n) {
		int answer = 0;
		while(n>0) {
			 int lastDigit = n%10;
			 answer = (answer * 10) + lastDigit;
			 n = n/10;
		}
		return answer;
	}

}
