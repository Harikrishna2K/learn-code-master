package recursion_basics;

public class SumOFNNaturalNumbers {
	public static void main(String[] args) {
		int answer = sumOfNNumbers(5);
		System.out.println(answer);
	}
	
	static int sumOfNNumbers(int n) {
		if(n == 0) {
			return 0;
		}
		return n + sumOfNNumbers(n-1);
	}

}
