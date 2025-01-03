package patterns;

public class PatternX {
	public static void main(String[] args) {
		patternx(5);
	}
	
	static void patternx(int n) {
		for(int i = 1; i<=n; i++) {
			for(int j = 1; j <=n;j++) {
				if(j == i || j == n-i+1) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}

}
