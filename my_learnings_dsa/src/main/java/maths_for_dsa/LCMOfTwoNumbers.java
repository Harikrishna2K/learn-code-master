package revision.basicmaths;

/***
 * What is LCm?
 * 		- Least common multiple, it is a way to find the maximum number which is 
 * divisible by these two numbers.
 * 		- Approach:-
 * 			*) We first take the two numbers and find the maximum number.
 * 			*) Then divide the maximum number of these two, with the two numbers given in input until
 * we get zero.
 * 			*) If we get the zero then we got the answer.
 * 			*) If we did not get zero, then we need to increment the answer by 1.
 * 			*) Repeat the process until we get the remainder zero.
 * 
 * 
 * ***/

public class LCMOfTwoNumbers {
	public static void main(String[] args) {
		LCM(15,25);
	}
	
	static void LCM(int a, int b) {
		int ans = Math.max(a, b);
		while(true) {
			if(ans%a == 0 && ans%b == 0) {
				System.out.println("The lcm of the two numbers is: " + ans);
				break;
			}
			
			ans = ans + 1;
		}
	}

}
