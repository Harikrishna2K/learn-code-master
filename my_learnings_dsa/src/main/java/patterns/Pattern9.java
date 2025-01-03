package patterns;

public class Pattern9 {
	public static void main(String[] args) {
		pattern9(5);
	}
	static void pattern9(int n) {
		for(int i = 0; i<n;i++) {
			for(int j = 0; j<i;j++) {
				System.out.print(" ");
			}
			for(int k = 0; k<(2*n) - ((2*i)+1); k++) {
				System.out.print("*");
			}
			for(int j = 0; j<i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
