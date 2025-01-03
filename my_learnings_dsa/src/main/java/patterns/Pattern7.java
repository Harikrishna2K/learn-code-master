package patterns;

/*
 
12345
2345
345
45
5 
  
  
  
 * */

public class Pattern7 {
	public static void main(String[] args) {
		pattern7method1(5);
	}
	static void pattern7method1(int n) {
		for(int i = 1; i<=n;i++) {
			for(int j = i; j<=n;j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
