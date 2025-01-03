package patterns;

public class ZohoPattern2 {
	public static void main(String[] args) {
		zohoPattern1(4);
		zohoPatternbottom(4);
		
	}

	private static void zohoPattern1(int n) {
		for(int i = 1; i<=n;i++) {
			for(int j = 0; j<n-i;j++) {
				System.out.print(" ");
			}
			int num = i*(i+1)/2;
			for(int k = 0; k < i;k++) {
				System.out.print(num-- + " ");
			}
			for(int j = 0; j<n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}
	private static void zohoPatternbottom(int n) {
		for(int i = n; i>=1;i--) {
			for(int j = 0; j<n-i;j++) {
				System.out.print(" ");
			}
			int num = i*(i+1)/2;
			for(int k = 0; k < i;k++) {
				System.out.print(num-- + " ");
			}
			for(int j = 0; j<n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}
	
	

}
