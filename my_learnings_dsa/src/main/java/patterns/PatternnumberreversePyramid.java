package patterns;

public class PatternnumberreversePyramid {
	public static void main(String[] args) {
		patternnumber(4);
		lowerpatternTriangle(4);
	}
	
	static void patternnumber(int n) {
		for(int i = 1; i<=n;i++) {
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			int number = i*(i+1)/2;
			//sequence
			
			for(int j = 1; j<=i;j++ ) {
				System.out.print(number -- + " ");
			}
			
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	static void lowerpatternTriangle(int n) {
		for(int i = n; i>=1 ; i--) {
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			int number = i*(i+1)/2;
			//sequence
			
			for(int j = 1; j<=i;j++ ) {
				System.out.print(number -- + " ");
			}
			
			//space
			for(int j = 1; j<=n-i;j++) {
				System.out.print(" ");
			}
			System.out.println();
		}
		
	}

}
