package patterns;

public class Pattern19 {
	public static void main(String[] args) {
		pattern19(5);
	}
	static void pattern19(int n) {
		for(int i = 1; i<=n;i++) {
			for(char ch = (char) ('A'+n-i) ;ch <= (char)('A'+n-1); ch++) {
				System.out.print(ch);
			}
			System.out.println();
		}
	}

}
