package recursion_basics;

public class PrintNTimes {
	public static void main(String[] args) {
		printNTimes(0);
	}
	
	static void printNTimes(int n) {
		if(n == 3) {
			return;
		}
		System.out.println(n);
		
		printNTimes(n+1);
	}

}
