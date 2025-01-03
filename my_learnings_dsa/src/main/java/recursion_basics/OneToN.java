package recursion_basics;

public class OneToN {
	public static void main(String[] args) {
		OneToN(0);
	}
	static void OneToN(int n) {
		if(n == 5) {
			return;
		}
		
		System.out.println(n);
		OneToN(n+1);
	}

}
