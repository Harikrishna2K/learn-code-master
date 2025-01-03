package recursion_basics;

public class FactorialBasics {
	public static void main(String[] args) {
		int answer = fact(5);
		System.out.println(answer);
	}
	
	static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		
		return n * fact(n-1);
	}

}
