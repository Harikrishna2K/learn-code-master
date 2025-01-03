package conditionalStatements.Loops;

public class ReverseTheNumber {
	public static void main(String[] args) {
		System.out.println(reverseTheNumber(4567));
	}
	
	static int reverseTheNumber(int n) {
		int answer = 0;
		
		while(n>0) {
			int lastElement = n%10;
			answer = answer * 10 + lastElement;
			n = n/10;
		}
		
		return answer;
	}

}
