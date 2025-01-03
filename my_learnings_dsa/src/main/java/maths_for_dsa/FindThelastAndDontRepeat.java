package maths_for_dsa;

/***
 * Question
 * 1) If there is a sequence of numbers n = 123456789, we should remove the last digit
 * add an extranumber and then continue to the sequence.
 * 
 * I/p 1)
 * 		a = 123456789,
 * 		o/p = 1234567810;
 * 
 * 
 * 		2) 
 * 			a = 12345678;
 * 			b = 12345679;
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * ***/

public class FindThelastAndDontRepeat {
	
	/**
	 * First step, we remove the last digit of the sequence.
	 * Second step, we then take the sequence and the take the last digit and add it by 1.
	 * Third step, we use powerofTen function to determine the amount of times we need to multiply
	 * to get the sequence.
	 * 
	 * Fourth step we use this result (lastDigitremoval variable * powerofTen function + sum)
	 * 
	 * 
	 * 1) Now what is powerofTen?
	 * 		-> If we have the sum as two digits then we need to multiply that with 100,
	 * because if the sequence of input is this "123456789" we need to multiply by 100 to get the output
	 * as 1234567810.
	 * 		-> If we have the sum as single digit, then we can multiply with 10, because if the sequence is
	 * "12345678" then the output should be "12345679" right.
	 * 
	 * 2) How does power of ten works?
	 * 		-> If the sum is 10, then we remove the digits one by one and then multiply it with
	 * 10 to get the output.
	 * 
	 * 		-> while removing the sum, digit by digit, we need to multiply the powerofTen variable by 10,
	 * so that we could use this powerOfTen to multiply with the lastDigit to get the answer.
	 * 
	 * 
	 * 3)
	 * 
	 * */
	
	static void findLastOperation(int n) {
		
		int lastDigitRemoval = n/10;
		int sum = n%10 + 1;
		int powerofTen = 1;
		
		int temp = sum;
		while(temp>0) {
			powerofTen = powerofTen *10;
			temp = temp/10;
		}
		
		int result = lastDigitRemoval * powerofTen + sum;
		System.out.println(result);
		
	}
	
	public static void main(String[] args) {
		int n = 1234567;
		findLastOperation(n);
	}

}
