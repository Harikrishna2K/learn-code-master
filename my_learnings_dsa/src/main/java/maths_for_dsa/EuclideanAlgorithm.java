package revision.basicmaths;
/***
 * Here we are going to find the GCD Using Eucldean Algorithm
 * what is the algo?
 * 	-> The forumale is this - rem((b,a), a);
 *  -> By doing this we can get the answer.
 *  -> Stop when the a is 0, so that we could return the b.
 * 
 * 
 * **/

public class EuclideanAlgorithm {
	public static void main(String[] args) {
		int a = 4;
		int b = 9;
		int answer = gcd(a, b);
		System.out.println(answer);
	}
	
	static int gcd(int a, int b) {
		if(a == 0) {
			return b;
		}
		
		return gcd(b%a, a);
	}

}
