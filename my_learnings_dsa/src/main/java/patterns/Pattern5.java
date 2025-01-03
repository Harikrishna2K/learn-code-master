package patterns;

public class Pattern5 {
	public static void main(String[] args) {
//		pattern5(5);
		pattern5method2(5);
	}
	static void pattern5(int n) {
		for(int i = 1;i <= n;i++) {
			for(int j = i;j<=n;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void pattern5method2(int n) {
		for(int i = 1; i<=n;i++) {
			for(int j = 0; j<=n-i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
